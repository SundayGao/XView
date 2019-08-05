package com.gyw.xview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @Author: gaoyuanwu
 * @Date: 2019-08-05 14:59
 * @Description:
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_switch_view.setOnClickListener {
            startActivity(Intent(this, SwitchActivity::class.java))
        }
    }
}
