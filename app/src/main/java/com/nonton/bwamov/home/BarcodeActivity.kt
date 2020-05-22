package com.nonton.bwamov.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nonton.bwamov.R
import kotlinx.android.synthetic.main.activity_barcode.*

class BarcodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode)

        btn_tutup.setOnClickListener {
            val intent = Intent(
                this@BarcodeActivity,
                TiketActivity::class.java
            )
            startActivity(intent)
        }
    }
}
