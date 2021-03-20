package com.jaber.habittracker.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jaber.habittracker.data.models.Habit
import com.jaber.habittracker.logic.dao.HabitDao


@Database(entities = [Habit::class], version = 1, exportSchema = false)
abstract class HabitDatabase:RoomDatabase() {

    abstract fun habitDao():HabitDao

    companion object {
        @Volatile
        private var INSTANCE: HabitDatabase? = null

        //OR
        fun getInstance(context: Context): HabitDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instant = Room.databaseBuilder(
                    context.applicationContext,
                    HabitDatabase::class.java,
                    "habits_table"
                ).build()
                INSTANCE = instant
                return instant
            }
        }

    }
}