package com.solia.quizapp.data

data class QuizData(val name: String, val age: Array<QuestionData>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as QuizData

        if (name != other.name) return false
        if (!age.contentEquals(other.age)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age.contentHashCode()
        return result
    }
}
