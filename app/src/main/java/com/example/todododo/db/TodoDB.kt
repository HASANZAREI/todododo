package com.example.todododo.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TodoEntity::class], version = 1)
abstract class TodoDB: RoomDatabase() {
    abstract fun todoDao(): TodoDao
}