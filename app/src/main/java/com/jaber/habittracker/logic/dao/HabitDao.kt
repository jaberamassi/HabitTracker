package com.jaber.habittracker.logic.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.jaber.habittracker.data.models.Habit


@Dao
interface HabitDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addHabit(habit:Habit)

    @Update
    suspend fun updateHabit(habit: Habit)

    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query("select * from habits_table order by id desc")
    fun getAllHabits():LiveData<List<Habit>>

    @Query("delete from habits_table")
    suspend fun deleteAll()

}