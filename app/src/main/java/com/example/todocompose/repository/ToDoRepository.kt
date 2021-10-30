package com.example.todocompose.repository

import com.example.todocompose.data.ToDoDao
import com.example.todocompose.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTask: Flow<List<ToDoTask>> = toDoDao.getAllTask()

    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)

    }

    suspend fun addTask(toDoTask: ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask)
    {
        toDoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTasks()
    {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery : String) : Flow<List<ToDoTask>>
    {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }


}