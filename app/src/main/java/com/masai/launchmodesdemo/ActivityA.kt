package com.masai.launchmodesdemo

import android.app.ActivityManager
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lloyd", "onCreate")
        setContentView(R.layout.activity_main)

        val mngr = getSystemService(ACTIVITY_SERVICE) as ActivityManager

        val taskList = mngr.getRunningTasks(10)
        tvNoOfTasks.text = "There are ${taskList.size} number of tasks"
        tvNoOfActivities.text = "There are ${taskList[0].numActivities} activities"
        tvCurrentActivityName.text = "The current activity is ${taskList[0].topActivity?.className}"

        btnLaunchA.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityA::class.java)
            startActivity(intent)
        }

        btnLaunchB.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(intent)
        }

        btnLaunchC.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityC::class.java)
            startActivity(intent)
        }

        btnLaunchD.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityD::class.java)
            startActivity(intent)
        }
        btnLaunchE.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityE::class.java)
            startActivity(intent)
        }
        btnLaunchF.setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityF::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lloyd", "onDestroy")
    }

}

/*

A
B
C
D
E
F

Launch F
A
B
C
D
E
F
F




 */