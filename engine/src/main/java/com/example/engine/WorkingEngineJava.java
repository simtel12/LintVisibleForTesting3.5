package com.example.engine;

import android.net.Uri;

import androidx.annotation.WorkerThread;

import com.example.engine.data.EngineMetadata;

public interface WorkingEngineJava {
    String eval(String script, boolean logInvocation);

    void eval(Uri scriptUri, EngineMetadata metadata);

    class Builder {

        @WorkerThread
        public NotWorkingEngineJava build() {
            final RunnerFactoryJava runnerFactory = new RunnerFactoryJava();
            ViewEngine engine = new ViewEngine();
            return engine;
        }

    }
}
