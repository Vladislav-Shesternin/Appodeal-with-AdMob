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
            Appodeal.BANNER
        )

        binding.btnShowBannerBottom.setOnClickListener {
            Appodeal.show(this, Appodeal.BANNER_VIEW)
        }

        binding.btnHideBannerBottom.setOnClickListener {
            Appodeal.hide(this, Appodeal.BANNER_VIEW)
        }

    }
}