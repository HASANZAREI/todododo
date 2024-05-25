package com.example.todododo.repo

import com.example.todododo.db.TodoDB
import com.example.todododo.db.TodoEntity
import kotlinx.coroutines.flow.Flow

class TodoRepoImpl(
    private val db: TodoDB
) : TodoRepo {
    private val dao = db.todoDao()
    override suspend fun getTodos(): Flow<List<TodoEntity>> {
        return dao.getTodos()
    }

    override suspend fun addTodo(todo: TodoEntity) {
        dao.addTodo(todo = todo)
    }

    override suspend fun updateTodo(todo: TodoEntity) {
        dao.updateTodo(todo = todo)
    }

    override suspend fun deleteTodo(todo: TodoEntity) {
        dao.deleteTodo(todo = todo)
    }
}