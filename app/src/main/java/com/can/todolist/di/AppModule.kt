package com.can.todolist.di

import android.content.Context
import androidx.room.Room
import com.can.todolist.datastore.database.TodoDatabase
import com.can.todolist.repository.TodoRepository
import com.can.todolist.repository.TodoRepositoryImpl
import com.can.todolist.utils.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(@ApplicationContext context: Context) : TodoDatabase =
        Room.databaseBuilder(
            context = context,
            klass = TodoDatabase::class.java,
            name = DATABASE_NAME
            ).build()

    @Provides
    @Singleton
    fun provideRepository(db: TodoDatabase) : TodoRepository = TodoRepositoryImpl(db.dao)

}