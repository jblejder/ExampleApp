package com.jakub

import Versions
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class BootstrapAndroidLibrary : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        pluginManager.apply("com.android.library")
        pluginManager.apply("kotlin-android")
        pluginManager.apply("kotlin-kapt")
        dependencies.add(
            "implementation",
            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        )

        extensions.configure(LibraryExtension::class.java) { ext: LibraryExtension ->
            ext.compileSdkVersion(bootstrapConfig.android.compileSdkVersion!!)

            ext.defaultConfig.minSdkVersion(bootstrapConfig.android.minSdkVersion!!)
            ext.defaultConfig.targetSdkVersion(bootstrapConfig.android.targetSdkVersion!!)
            ext.defaultConfig.testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

            ext.compileOptions {
                targetCompatibility = bootstrapConfig.javaVersion
                sourceCompatibility = bootstrapConfig.javaVersion
            }

            ext.sourceSets.all { set ->
                val withKotlin = set.java.srcDirs.map { it.path.replace("java", "kotlin") }
                set.java.setSrcDirs(set.java.srcDirs + withKotlin)
            }
        }

        tasks.withType(KotlinCompile::class.java).all {
            it.kotlinOptions.jvmTarget = bootstrapConfig.javaVersion.toString()
        }
    }
}
