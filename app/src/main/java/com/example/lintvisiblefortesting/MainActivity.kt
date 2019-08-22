package com.example.lintvisiblefortesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.WorkerThread
import com.example.engine.*

class MainActivity : AppCompatActivity() {

    private lateinit var engineBuilder: NotWorkingEngineJava.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @WorkerThread
    fun create() {
        val jsEngine = engineBuilder.build()
    }
}
