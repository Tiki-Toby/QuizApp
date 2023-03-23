package com.solia.quizapp.domain.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.solia.quizapp.data.entities.QuestionDataEntity
import com.solia.quizapp.data.savedata.SaveQuestionData

@Dao
interface IQuestionRepository {

    @Query("SELECT * FROM ${QuestionDataEntity.TABLE_NAME}")
    fun loadAllQuestions(): List<QuestionDataEntity>

    @Insert(entity = SaveQuestionData::class, onConflict = OnConflictStrategy.REPLACE)
    fun addQuestion(questionData: SaveQuestionData)

    @Query("DELETE FROM ${QuestionDataEntity.TABLE_NAME} WHERE :questionId like questionId")
    fun deleteQuestion(questionId: Int)
}