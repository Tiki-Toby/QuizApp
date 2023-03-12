package com.solia.quizapp.data

data class QuestionData(val name: String, val answer: Array<String>, val rightAnswerIndex: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as QuestionData

        if (name != other.name) return false
        if (!answer.contentEquals(other.answer)) return false
        if (rightAnswerIndex != other.rightAnswerIndex) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + answer.contentHashCode()
        result = 31 * result + rightAnswerIndex
        return result
    }
}