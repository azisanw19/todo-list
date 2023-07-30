package com.can.todolist.datastore.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.can.todolist.data.Todo
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_UUID
import com.can.todolist.utils.NAME_TABLE_TODO
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM $NAME_TABLE_TODO WHERE $COLUMN_NAME_TABLE_TODO_UUID = :id")
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM $NAME_TABLE_TODO")
    fun getTodos(): Flow<List<Todo>>

}