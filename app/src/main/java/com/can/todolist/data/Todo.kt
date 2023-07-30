package com.can.todolist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_CREATED_AT
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_DESCRIPTION
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_DUE_AT
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_IS_DONE
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_TITLE
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_UPDATED_AT
import com.can.todolist.utils.COLUMN_NAME_TABLE_TODO_UUID
import com.can.todolist.utils.NAME_TABLE_TODO
import java.util.UUID

@Entity (tableName = NAME_TABLE_TODO)
data class Todo(

    @PrimaryKey
    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_UUID)
    val id: Int? = null,

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_TITLE)
    val title: String,

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_DESCRIPTION)
    val description: String?,

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_DUE_AT)
    val dueDate: Long,

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_IS_DONE)
    val isDone: Boolean = false,

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_CREATED_AT)
    val createdAt: Long = System.currentTimeMillis(),

    @ColumnInfo(name = COLUMN_NAME_TABLE_TODO_UPDATED_AT)
    val updatedAt: Long = System.currentTimeMillis()

)
