package com.can.todolist.repository

import com.can.todolist.data.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    suspend fun insertTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int): Todo?

    fun getTodos(): Flow<List<Todo>>

}