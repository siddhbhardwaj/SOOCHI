package com.example.todoapp.data.repository

import androidx.lifecycle.LiveData
import com.example.todoapp.data.ToDoDao
import com.example.todoapp.data.models.ToDoData

class ToDoRepository(private  val toDoDao: ToDoDao){
    val getAllData : LiveData<List<ToDoData>> = toDoDao.getAllData()
    val sortByHighPriority : LiveData<List<ToDoData>> = toDoDao.sortByByHighPriority()

    val sortByLowPriority : LiveData<List<ToDoData>> = toDoDao.sortByByLowPriority()

    suspend fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }
    suspend fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData){
        toDoDao.deleteItem(toDoData)
    }
    suspend fun deletAll(){
        toDoDao.deleteAll()
    }

    fun searchDatabase(searchQuery: String) : LiveData<List<ToDoData>>{
        return toDoDao.searchDatabase(searchQuery)

    }
}