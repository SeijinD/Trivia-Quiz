package eu.seijindemon.triviaquiz.framework

import eu.seijindemon.triviaquiz.data.QuizDataSource
import eu.seijindemon.triviaquiz.framework.api.QuizApi
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import retrofit2.Response
import javax.inject.Inject

class QuizDataSourceImpl @Inject constructor(
    private val quizApi: QuizApi
) : QuizDataSource {

    override suspend fun getQuizRandom(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>> {
        return quizApi.getQuizRandom(amount, category, difficulty, type)
    }

    override suspend fun getQuizAll(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>> {
        return quizApi.getQuizAll(amount, category, difficulty, type)
    }

    override suspend fun getQuizExceptCategory(amount: Int, difficulty: String, type: String): Response<List<QuizModel>> {
        return quizApi.getQuizExceptCategory(amount, difficulty, type)
    }

    override suspend fun getQuizExceptDifficulty(amount: Int, category: String, type: String): Response<List<QuizModel>> {
        return quizApi.getQuizExceptDifficulty(amount, category, type)
    }

    override suspend fun getQuizExceptType(amount: Int, category: String, difficulty: String): Response<List<QuizModel>> {
        return quizApi.getQuizExceptType(amount, category, difficulty)
    }

    override suspend fun getQuizOnlyCategory(amount: Int, category: String): Response<List<QuizModel>> {
        return quizApi.getQuizOnlyCategory(amount, category)
    }

    override suspend fun getQuizOnlyDifficulty(amount: Int, difficulty: String): Response<List<QuizModel>> {
        return quizApi.getQuizOnlyDifficulty(amount, difficulty)
    }

    override suspend fun getQuizOnlyType(amount: Int, type: String): Response<List<QuizModel>> {
        return quizApi.getQuizOnlyType(amount, type)
    }

}