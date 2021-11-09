package eu.seijindemon.triviaquiz.domain

import eu.seijindemon.triviaquiz.framework.model.QuizModel
import retrofit2.Response

interface QuizRepository {

    suspend fun getQuizRandom(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>>

    suspend fun getQuizAll(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>>

    suspend fun getQuizExceptCategory(amount: Int, difficulty: String, type: String): Response<List<QuizModel>>

    suspend fun getQuizExceptDifficulty(amount: Int, category: String, type: String): Response<List<QuizModel>>

    suspend fun getQuizExceptType(amount: Int, category: String, difficulty: String): Response<List<QuizModel>>

    suspend fun getQuizOnlyCategory(amount: Int, category: String): Response<List<QuizModel>>

    suspend fun getQuizOnlyDifficulty(amount: Int, difficulty: String): Response<List<QuizModel>>

    suspend fun getQuizOnlyType(amount: Int, type: String): Response<List<QuizModel>>

}