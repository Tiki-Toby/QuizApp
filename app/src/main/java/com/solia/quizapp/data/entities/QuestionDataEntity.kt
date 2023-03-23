package com.solia.quizapp.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = QuestionDataEntity.TABLE_NAME)
data class QuestionDataEntity(
    @PrimaryKey
    @ColumnInfo(name = "questionId")
    val quizId: Int,

    @ColumnInfo(name = "questionName")
    val name: String,

    @ColumnInfo(name = "questionAnswers")
    val answers: List<String>,

    @ColumnInfo(name = "questionRightAnswerIndex")
    val rightAnswerIndex: Int
) {
    companion object{
        const val TABLE_NAME = "question_list_entities_table"
    }
}