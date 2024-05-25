package com.example.todododo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date

@Entity("todo_entity")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("title")
    val title: String,
    @ColumnInfo("desc")
    val description: String,
    @ColumnInfo("done")
    val done: Boolean = false,
    @ColumnInfo("added")
    val added: Long = System.currentTimeMillis()
)
val TodoEntity.addedDate: String get() = SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date(added))
