package com.example.engine

import androidx.annotation.VisibleForTesting

@VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
class RunnerFactoryKotlin {
    fun create(): HeadlessView {
        return HeadlessView()
    }
}