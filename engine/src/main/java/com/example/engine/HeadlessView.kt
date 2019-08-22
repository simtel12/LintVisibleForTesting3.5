package com.example.engine

import androidx.annotation.AnyThread
import androidx.annotation.UiThread
import androidx.annotation.VisibleForTesting

class HeadlessView @AnyThread constructor() {

    @UiThread
    @VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
    fun evaluate(line: String) {
    }
}