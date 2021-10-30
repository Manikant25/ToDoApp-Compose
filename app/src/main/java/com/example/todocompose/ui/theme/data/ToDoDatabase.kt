package com.example.todocompose.ui.theme.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todocompose.ui.theme.data.models.ToDoTask

@Database(entities = [ToDoTask::class],version = 1,exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun ToDoDao() : ToDoDao
}