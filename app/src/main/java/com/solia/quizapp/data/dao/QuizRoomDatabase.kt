package com.solia.quizapp.data.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.solia.quizapp.data.entities.QuizDataEntity

@Database(entities = arrayOf(QuizDataEntity::class), version = 1, exportSchema = false)
abstract class QuizRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): QuizRepositoryDao

    companion object {
        @Volatile
        private var INSTANCE: QuizRoomDatabase? = null

        fun getDatabase(context: Context): QuizRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizRoomDatabase::class.java,
                    "quiz_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}