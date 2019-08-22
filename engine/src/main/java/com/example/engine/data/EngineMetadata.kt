package com.example.engine.data

import java.io.Serializable

interface EngineMetadata {
    val metadata: Map<String, Serializable>
}