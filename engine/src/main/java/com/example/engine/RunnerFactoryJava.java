package com.example.engine;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
public class RunnerFactoryJava {
    HeadlessView create()  {
        return new HeadlessView();
    }
}
