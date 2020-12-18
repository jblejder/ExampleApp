object Versions {
    const val kotlin = "1.4.0"
    const val support_lib = "26.1.0"
    const val retrofit = "2.3.0"
    const val rxjava = "2.1.9"
    const val min_sdk = 23
    const val target_sdk = 29
    const val compile_sdk = 29
    const val version_code = 1
    const val version_name = "1.0"
    const val android_gradle_plugin = "3.0.1"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val core = "androidx.core:core-ktx:1.2.0"

    const val cardView = "androidx.cardview:cardview:1.0.0"

    const val constraitLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"

    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:2.2.0"
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-alpha01"

    const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"

    const val fragment = "androidx.fragment:fragment-ktx:1.2.5"

    const val preference = "androidx.preference:preference:1.1.0"

    const val workManager = "androidx.work:work-runtime-ktx:2.3.4"

    const val activity = "androidx.activity:activity-ktx:1.2.0-alpha02"

    const val navigationRuntime = "androidx.navigation:navigation-runtime-ktx:2.3.0-alpha04"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.3.0-alpha04"
    const val navigationIu = "androidx.navigation:navigation-ui-ktx:2.3.0-alpha04"
    val navigationAll = arrayOf(
        navigationRuntime,
        navigationFragment,
        navigationIu
    )

    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"
    const val viewPager = "androidx.viewpager2:viewpager2:1.0.0"
}

object Deps {

    const val material = "com.google.android.material:material:1.2.0-alpha03"

    val rx = arrayOf(
        "io.reactivex.rxjava2:rxjava:2.2.19",
        "io.reactivex.rxjava2:rxkotlin:2.4.0"
    )
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutineVersion = "1.3.9"
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutineVersion}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${coroutineVersion}"

    const val lottie = "com.airbnb.android:lottie:3.4.0"

    const val datastore = "androidx.datastore:datastore-core:1.0.0-alpha02"

    const val room_version = "2.2.5"
    const val roomRuntime = "androidx.room:room-runtime:$room_version"
    const val roomRx = "androidx.room:room-rxjava2:$room_version"
    const val roomKtx = "androidx.room:room-ktx:$room_version"
    const val roomCompiler = "androidx.room:room-compiler:$room_version"
    const val roomTesting = "androidx.room:room-testing:$room_version"

    val groupie_version = "2.8.1"
    val groupieAll = arrayOf(
        "com.xwray:groupie:$groupie_version",
        "com.xwray:groupie-kotlin-android-extensions:$groupie_version",
        "com.xwray:groupie-databinding:$groupie_version",
        "com.xwray:groupie-viewbinding:$groupie_version"
    )

    const val stetho = "com.facebook.stetho:stetho:1.5.1"
    const val timber = "com.jakewharton.timber:timber:4.7.1"

    const val inject = "javax.inject:javax.inject:1"

    const val threeTen = "com.jakewharton.threetenabp:threetenabp:1.2.4"

    const val moshi = "com.squareup.moshi:moshi-kotlin:1.9.2"
    const val moshiKapt = "com.squareup.moshi:moshi-kotlin-codegen:1.9.2"

    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:2.9.0"
}

object Dagger {
    const val version = "2.27"
    const val dagger = "com.google.dagger:dagger:${version}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${version}"
    const val daggerSupport = "com.google.dagger:dagger-android-support:${version}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${version}"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:${version}"

    const val assistedInject = "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
    const val assistedInjectProcessor =
        "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"
}
