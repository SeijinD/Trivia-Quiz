package eu.seijindemon.triviaquiz.framework

import eu.seijindemon.triviaquiz.data.QuizDataSource
import eu.seijindemon.triviaquiz.framework.api.QuizApi
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import eu.seijindemon.triviaquiz.util.ext.requireNotNull
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuizDataSourceImpl @Inject constructor(
    private val quizApi: QuizApi
) : QuizDataSource {

    override suspend fun getQuizRandom(amount: Int, category: String, difficulty: String, type: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizRandom(amount, category, difficulty, type).requireNotNull()
        }
    }

    override suspend fun getQuizAll(amount: Int, category: String, difficulty: String, type: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizAll(amount, category, difficulty, type).requireNotNull()
        }
    }

    override suspend fun getQuizExceptCategory(amount: Int, difficulty: String, type: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizExceptCategory(amount, difficulty, type).requireNotNull()
        }
    }

    override suspend fun getQuizExceptDifficulty(amount: Int, category: String, type: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizExceptDifficulty(amount, category, type).requireNotNull()
        }
    }

    override suspend fun getQuizExceptType(amount: Int, category: String, difficulty: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizExceptType(amount, category, difficulty).requireNotNull()
        }
    }

    override suspend fun getQuizOnlyCategory(amount: Int, category: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizOnlyCategory(amount, category).requireNotNull()
        }
    }

    override suspend fun getQuizOnlyDifficulty(amount: Int, difficulty: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizOnlyDifficulty(amount, difficulty).requireNotNull()
        }
    }

    override suspend fun getQuizOnlyType(amount: Int, type: String): List<QuizModel> {
        return withContext(Dispatchers.IO) {
            quizApi.getQuizOnlyType(amount, type).requireNotNull()
        }
    }

}