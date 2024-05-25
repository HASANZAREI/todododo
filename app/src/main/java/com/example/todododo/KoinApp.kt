package com.example.todododo

import android.app.Application
import androidx.room.Room
import com.example.todododo.db.TodoDB
import com.example.todododo.repo.TodoRepo
import com.example.todododo.repo.TodoRepoImpl
import org.koin.core.context.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class KoinApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                module {
                    single {
                        Room.databaseBuilder(this@KoinApp, TodoDB::class.java, "db").build()
                    }
                    single {
                        TodoRepoImpl(db = get())
                    } bind TodoRepo::class
                }
            )
        }
    }
}