package com.example.app.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/app/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/example/app/App;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.example.app.App> {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/app/di/AppComponent$Factory;", "Ldagger/android/AndroidInjector$Factory;", "Lcom/example/app/App;", "create", "Ldagger/android/AndroidInjector;", "instance", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory extends dagger.android.AndroidInjector.Factory<com.example.app.App> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public abstract dagger.android.AndroidInjector<com.example.app.App> create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.example.app.App instance);
    }
}