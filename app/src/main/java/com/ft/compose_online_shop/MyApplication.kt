package com.ft.compose_online_shop


import android.app.Application
import com.airbnb.lottie.compose.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import kotlin.text.Typography.dagger

@HiltAndroidApp
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}