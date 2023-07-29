package com.can.todolist

import android.app.Application
import timber.log.Timber

//@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        /* Enable logging in debug */
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}