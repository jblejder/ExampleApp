// Generated by Dagger (https://dagger.dev).
package com.example.app;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider;

  public App_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    this.activityInjectorProvider = activityInjectorProvider;
    this.fragmentInjectorProvider = fragmentInjectorProvider;
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<App> create(
      Provider<DispatchingAndroidInjector<Activity>> activityInjectorProvider,
      Provider<DispatchingAndroidInjector<Fragment>> fragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    return new App_MembersInjector(activityInjectorProvider, fragmentInjectorProvider, dispatchingAndroidInjectorProvider);}

  @Override
  public void injectMembers(App instance) {
    injectActivityInjector(instance, activityInjectorProvider.get());
    injectFragmentInjector(instance, fragmentInjectorProvider.get());
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  @InjectedFieldSignature("com.example.app.App.activityInjector")
  public static void injectActivityInjector(App instance,
      DispatchingAndroidInjector<Activity> activityInjector) {
    instance.activityInjector = activityInjector;
  }

  @InjectedFieldSignature("com.example.app.App.fragmentInjector")
  public static void injectFragmentInjector(App instance,
      DispatchingAndroidInjector<Fragment> fragmentInjector) {
    instance.fragmentInjector = fragmentInjector;
  }

  @InjectedFieldSignature("com.example.app.App.dispatchingAndroidInjector")
  public static void injectDispatchingAndroidInjector(App instance,
      DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}
