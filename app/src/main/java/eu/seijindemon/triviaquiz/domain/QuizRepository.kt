package eu.seijindemon.triviaquiz.domain

import eu.seijindemon.triviaquiz.framework.model.QuizModel

interface QuizRepository {

    suspend fun getQuizRandom(amount: Int, category: String, difficulty: String, type: String): List<QuizModel>

    suspend fun getQuizAll(amount: Int, category: String, difficulty: String, type: String): List<QuizModel>

    suspend fun getQuizExceptCategory(amount: Int, difficulty: String, type: String): List<QuizModel>

    suspend fun getQuizExceptDifficulty(amount: Int, category: String, type: String): List<QuizModel>

    suspend fun getQuizExceptType(amount: Int, category: String, difficulty: String): List<QuizModel>

    suspend fun getQuizOnlyCategory(amount: Int, category: String): List<QuizModel>

    suspend fun getQuizOnlyDifficulty(amount: Int, difficulty: String): List<QuizModel>

    suspend fun getQuizOnlyType(amount: Int, type: String): List<QuizModel>

}