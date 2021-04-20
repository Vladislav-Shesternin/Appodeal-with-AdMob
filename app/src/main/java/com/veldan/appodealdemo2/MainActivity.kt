package com.veldan.appodealdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appodeal.ads.Appodeal
import com.veldan.appodealdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Appodeal.setBannerViewId(R.id.appodeal_banner_bottom)
        Appodeal.setTesting(true)
        Appodeal.disableLocationPermissionCheck()
        Appodeal.initialize(
            this,
            getString(R.string.appodeal_id),
            Appodeal.BANNER or Appodeal.INTERSTITIAL
        )

        binding.apply {

            btnShowBannerBottom.setOnClickListener {
                Appodeal.show(this@MainActivity, Appodeal.BANNER_VIEW)
            }
            btnHideBannerBottom.setOnClickListener {
                Appodeal.hide(this@MainActivity, Appodeal.BANNER_VIEW)
            }

            btnShowInterstitial.setOnClickListener {
                Appodeal.show(this@MainActivity, Appodeal.INTERSTITIAL)
            }

        }
    }
}