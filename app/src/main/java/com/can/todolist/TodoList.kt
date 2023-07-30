package com.can.todolist

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class TodoList : Application() {

    override fun onCreate() {
        super.onCreate()

        /* Enable logging in debug */
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}