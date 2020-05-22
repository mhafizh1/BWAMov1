package com.nonton.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nonton.bwamov.R
import kotlinx.android.synthetic.main.activity_onboarding_one.*
import kotlinx.android.synthetic.main.activity_onboarding_two.*
import kotlinx.android.synthetic.main.activity_onboarding_two.btn_home as btn_home1

class OnboardingTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        btn_home.setOnClickListener {
            val intent = Intent(
                this@OnboardingTwoActivity,
                OnboardingThreeActivity::class.java
            )
            startActivity(intent)
        }
    }

}
