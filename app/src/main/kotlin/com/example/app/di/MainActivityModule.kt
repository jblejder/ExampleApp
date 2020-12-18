package com.example.app.di

import android.app.Application
import com.example.app.App
import com.example.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @Binds
    abstract fun application(app: App): Application
}
