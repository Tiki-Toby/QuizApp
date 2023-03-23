package com.solia.quizapp.data.repository

import com.solia.quizapp.data.entities.QuizDataEntity
import com.solia.quizapp.data.savedata.SaveQuizData
import com.solia.quizapp.domain.repository.IQuizRepository

class QuizDatabaseRepository : IQuizRepository {
    override fun loadAllQuizes(): List<QuizDataEntity> {
        TODO("Not yet implemented")
    }

    override fun addQuiz(quizData: SaveQuizData) {
        TODO("Not yet implemented")
    }

    override fun deleteQuiz(quizId: Int) {
        TODO("Not yet implemented")
    }
}