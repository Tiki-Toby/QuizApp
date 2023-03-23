package com.solia.quizapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.solia.quizapp.data.entities.QuizDataEntity

@Dao
interface QuizRepositoryDao{

    @Query("SELECT * FROM ${QuizDataEntity.TABLE_NAME}")
    fun loadAllQuizes(): List<QuizDataEntity>

    @Insert(entity = QuizDataEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun addQuiz(quizEntity: QuizDataEntity)

    @Query("DELETE FROM ${QuizDataEntity.TABLE_NAME} WHERE :quizId like quizId")
    fun deleteQuiz(quizId: Int)
}