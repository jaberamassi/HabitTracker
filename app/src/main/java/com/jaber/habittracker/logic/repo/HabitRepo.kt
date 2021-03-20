package com.jaber.habittracker.logic.repo

import androidx.lifecycle.LiveData
import com.jaber.habittracker.data.models.Habit
import com.jaber.habittracker.logic.dao.HabitDao

class HabitRepo(private val habitDao: HabitDao) {

    val getAllHabits:LiveData<List<Habit>> = habitDao.getAllHabits()


    suspend fun addHabit(habit: Habit){
        habitDao.addHabit(habit)
    }

    suspend fun updateHabit(habit: Habit){
        habitDao.updateHabit(habit)
    }

    suspend fun deleteHabit(habit: Habit){
        habitDao.deleteHabit(habit)
    }

    suspend fun deleteAllHabit(){
        habitDao.deleteAll()
    }


}