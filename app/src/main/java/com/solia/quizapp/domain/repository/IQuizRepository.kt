package com.solia.quizapp.domain.repository

import com.solia.quizapp.data.entities.QuizDataEntity
import com.solia.quizapp.data.savedata.SaveQuizData

interface IQuizRepository {

    fun loadAllQuizes(): List<QuizDataEntity>

    fun addQuiz(quizData: SaveQuizData)

    fun deleteQuiz(quizId: Int)
}