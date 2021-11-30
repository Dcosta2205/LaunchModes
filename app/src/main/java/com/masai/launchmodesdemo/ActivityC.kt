package com.masai.launchmodesdemo

import android.app.ActivityManager
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mngr = getSystemService(ACTIVITY_SERVICE) as ActivityManager

        val taskList = mngr.getRunningTasks(10)
        tvNoOfTasks.text = "There are ${taskList.size} number of tasks"
        tvNoOfActivities.text = "There are ${taskList[0].numActivities} activities"
        tvCurrentActivityName.text = "The current activity is ${taskList[0].topActivity?.className}"

        btnLaunchA.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityA::class.java)
            startActivity(intent)
        }

        btnLaunchB.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityB::class.java)
            startActivity(intent)
        }

        btnLaunchC.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityC::class.java)
            startActivity(intent)
        }

        btnLaunchD.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityD::class.java)
            startActivity(intent)
        }

        btnLaunchE.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityE::class.java)
            startActivity(intent)
        }
        btnLaunchF.setOnClickListener {
            val intent = Intent(this@ActivityC, ActivityF::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}

/*
A -> B -> C -> D -> E -> F

F -> D -> E -> C -> B -> A
 */