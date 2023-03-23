package com.solia.quizapp.data.savedata

import com.solia.quizapp.data.entities.QuestionDataEntity

data class SaveQuizData(val name: String, val questions: List<QuestionDataEntity>)