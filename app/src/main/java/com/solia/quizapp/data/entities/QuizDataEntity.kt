package com.solia.quizapp.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = QuizDataEntity.TABLE_NAME)
data class QuizDataEntity(
    @PrimaryKey
    @ColumnInfo(name = "quizId")
    val quizId: Int,

    @ColumnInfo(name = "quizName")
    val name: String,

    @ColumnInfo(name = "quizQuestionIds")
    val questionIds: List<Int>
) {
    companion object{
        const val TABLE_NAME = "quiz_list_entities_table"
    }
}