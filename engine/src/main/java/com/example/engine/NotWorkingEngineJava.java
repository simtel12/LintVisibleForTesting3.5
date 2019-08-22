package com.example.engine;

import android.net.Uri;

import androidx.annotation.WorkerThread;

import com.example.engine.data.EngineMetadata;

// This one does not work
public interface NotWorkingEngineJava {

    String eval(String script, boolean logInvocation);

    void eval(Uri scriptUri, EngineMetadata metadata);

    class Builder {

        @WorkerThread
        public NotWorkingEngineJava build() {
            final RunnerFactoryKotlin runnerFactory = new RunnerFactoryKotlin();
            ViewEngine engine = new ViewEngine();
            return engine;
        }

    }

}
