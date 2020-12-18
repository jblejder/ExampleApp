package com.example.app.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/app/di/MainActivityModule;", "", "()V", "application", "Landroid/app/Application;", "app", "Lcom/example/app/App;", "mainActivity", "Lcom/example/ui/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.example.ui.MainActivity mainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.app.Application application(@org.jetbrains.annotations.NotNull()
    com.example.app.App app);
    
    public MainActivityModule() {
        super();
    }
}