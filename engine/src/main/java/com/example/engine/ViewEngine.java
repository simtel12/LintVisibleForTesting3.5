package com.example.engine;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.WorkerThread;

import com.example.engine.data.EngineMetadata;

@SuppressWarnings("WeakerAccess")
class ViewEngine implements NotWorkingEngineJava {

    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    private HeadlessView runner;

    public ViewEngine() {
    }

    @WorkerThread
    @Override
    public synchronized String eval(final String script, final boolean logInvocation) {
        mainThreadHandler.post(() -> {
            runner.evaluate("blah");
        });

        return null;
    }

    @WorkerThread
    @Override
    public synchronized void eval(final Uri file, EngineMetadata metadata) {
        mainThreadHandler.post(() -> {
            runner.evaluate("");
        });
    }
}