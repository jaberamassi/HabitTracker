package com.jaber.habittracker.ui.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.jaber.habittracker.data.database.HabitDatabase
import com.jaber.habittracker.data.models.Habit
import com.jaber.habittracker.logic.repo.HabitRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HabitViewModel(application: Application) :AndroidViewModel(application){
    private val  repository: HabitRepo
    val readAllData: LiveData<List<Habit>>

    init {
        val habitDao = HabitDatabase.getInstance(application).habitDao()
        repository = HabitRepo(habitDao)
        readAllData = repository.getAllHabits
    }

    fun addHabit(habit:Habit){
        viewModelScope.launch (Dispatchers.IO){
            repository.addHabit(habit)
        }
    }

    fun updateHabit(habit: Habit){
        viewModelScope.launch (Dispatchers.IO){
            repository.updateHabit(habit)
        }
    }

    fun deleteHabit(habit: Habit){
        viewModelScope.launch (Dispatchers.IO){
            repository.deleteHabit(habit)
        }
    }

    fun deleteAllHabits(){
        viewModelScope.launch (Dispatchers.IO){
            repository.deleteAllHabit()
        }
    }
}