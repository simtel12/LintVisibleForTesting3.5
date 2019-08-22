package com.example.engine

import android.net.Uri
import androidx.annotation.WorkerThread
import com.example.engine.data.EngineMetadata

// This one does not work
interface NotWorkingEngineKotlin {
    fun eval(script: String, logInvocation: Boolean): String

    fun eval(scriptUri: Uri, metadata: EngineMetadata)

    class Builder {

        @WorkerThread
        fun build(): NotWorkingEngineJava {
            val runnerFactory = RunnerFactoryKotlin()
            return ViewEngine()
        }

    }
}