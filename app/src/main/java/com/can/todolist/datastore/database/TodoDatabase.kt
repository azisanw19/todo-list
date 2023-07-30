package com.can.todolist.datastore.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.can.todolist.data.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase : RoomDatabase() {

    abstract val dao: TodoDao

}