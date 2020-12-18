package com.jakub

import org.gradle.api.*

class BootstrapConfig : Plugin<Project> {

    override fun apply(project: Project): Unit = with(project) {
        if (this != rootProject) {
            throw GradleException("$name must be applied to root project")
        }
        extensions.add("bootstrap", BootstrapConfigExt::class.java)
    }
}

val Project.bootstrapConfig: BootstrapConfigExt
    get() = rootProject.extensions.getByType(BootstrapConfigExt::class.java)

open class BootstrapConfigExt() {
    val android = AndroidConfig()

    val javaVersion: JavaVersion = JavaVersion.VERSION_1_8

    fun android(action: Action<AndroidConfig>) {
        action.execute(android)
    }
}

open class AndroidConfig {
    var compileSdkVersion: Int? = null
    var minSdkVersion: Int? = null
    var targetSdkVersion: Int? = null

    fun compileSdkVersion(value: Int) {
        compileSdkVersion = value
    }

    fun minSdkVersion(value: Int) {
        minSdkVersion = value
    }

    fun targetSdkVersion(value: Int) {
        targetSdkVersion = value
    }
}
