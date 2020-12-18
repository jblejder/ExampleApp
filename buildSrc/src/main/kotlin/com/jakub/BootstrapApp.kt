package com.jakub

import Versions
import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.CompileOptions
import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class BootstrapApp : Plugin<Project> {

    override fun apply(project: Project) = with(project) {
        pluginManager.apply("com.android.application")
        pluginManager.apply("com.google.firebase.appdistribution")
        pluginManager.apply("kotlin-android")
        pluginManager.apply("kotlin-kapt")
        dependencies.add(
            "implementation",
            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        )

        extensions.configure(AppExtension::class.java) { ext: AppExtension ->
            ext.compileSdkVersion(bootstrapConfig.android.compileSdkVersion!!)

            ext.defaultConfig.minSdkVersion(bootstrapConfig.android.minSdkVersion!!)
            ext.defaultConfig.targetSdkVersion(bootstrapConfig.android.targetSdkVersion!!)
            ext.defaultConfig.testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

            ext.compileOptions(Action<CompileOptions> { it ->
                it.targetCompatibility = bootstrapConfig.javaVersion
                it.sourceCompatibility = bootstrapConfig.javaVersion
            })

            ext.sourceSets.all { set ->
                val withKotlin = set.java.srcDirs.map { it.path.replace("java", "kotlin") }
                set.java.setSrcDirs(set.java.srcDirs + withKotlin)
            }

            val a =
                (ext as ExtensionAware).extensions.getByName("kotlinOptions") as KotlinJvmOptions
            a.jvmTarget = bootstrapConfig.javaVersion.toString()
        }

        tasks.withType(KotlinCompile::class.java).all {
            it.kotlinOptions.jvmTarget = bootstrapConfig.javaVersion.toString()
        }
    }
}
