object Versions {
    const val compileSdkVersion = 28
    const val minSdkVersion = 21
    const val targetSdkVersion = 28
    const val versionCode = 1
    const val versionName = "0.0"

    const val kotlin = "1.2.70"
    const val android_gradle_plugin = "3.2.1"
    const val rxJava = "2.0.2"
    const val rxKotlin = "2.1.0"
    const val rxAndroid = "2.0.1"
    const val javaxAnnotation = "1.0"
    const val javaxInject = "1"
    const val gson = "2.8.1"
    const val okHttp = "3.8.1"
    const val retrofit = "2.3.0"
    const val room = "1.0.0"
    const val supportLibrary = "27.1.1"
    const val timber = "4.5.1"
    const val glide = "4.0.0"
    const val exoplayer = "2.7.0"
    const val constraintLayout = "1.0.2"
    const val junit = "4.12"
    const val android_support_test_runner = "1.0.0"
    const val espresso_core = "3.0.1"
    const val dagger = "2.13"

    const val appCenterSdkVersion = "1.4.0"

    const val mockitoVersion = "2.22.0"
    const val mockitoKotlinVersion = "2.0.0-RC2"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"
    const val javaxInject = "javax.inject:javax.inject:${Versions.javaxInject}"
    const val support_annotations = "com.android.support:support-annotations:${Versions.supportLibrary}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val exoplayer = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"
    const val exoplayerCore = "com.google.android.exoplayer:exoplayer-core:${Versions.exoplayer}"
    const val exoplayerUi = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoplayer}"
    const val exoplayerHls = "com.google.android.exoplayer:exoplayer-hls:${Versions.exoplayer})"
    const val exoplayerDash = "com.google.android.exoplayer:exoplayer-dash:${Versions.exoplayer})"
    const val exoplayerMediaSession = "com.google.android.exoplayer:extension-mediasession:${Versions.exoplayer}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"

    const val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.supportLibrary}"
    const val animated_vector_drawable = "com.android.support:animated-vector-drawable:${Versions.supportLibrary}"
    const val support_media_compat = "com.android.support:support-media-compat:${Versions.supportLibrary}"

    const val appCenterAnalytics = "com.microsoft.appcenter:appcenter-analytics:${Versions.appCenterSdkVersion}"
    const val appCenterCrashes = "com.microsoft.appcenter:appcenter-crashes:${Versions.appCenterSdkVersion}"
}


object TestLibs {
    const val android_junit_runner = "android.support.test.runner.AndroidJUnitRunner"
    const val junit = "junit:junit:${Versions.junit}"
    const val android_runner = "com.android.support.test:runner:${Versions.android_support_test_runner}"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:${Versions.espresso_core}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockitoVersion}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinVersion}"
}
