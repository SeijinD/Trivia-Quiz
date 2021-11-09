package eu.seijindemon.triviaquiz.data

import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import retrofit2.Response
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(
    private val dataSource: QuizDataSource
) : QuizRepository {

    override suspend fun getQuizRandom(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>> {
        return dataSource.getQuizRandom(amount, category, difficulty, type)
    }

    override suspend fun getQuizAll(amount: Int, category: String, difficulty: String, type: String): Response<List<QuizModel>> {
        return dataSource.getQuizAll(amount, category, difficulty, type)
    }

    override suspend fun getQuizExceptCategory(amount: Int, difficulty: String, type: String): Response<List<QuizModel>> {
        return dataSource.getQuizExceptCategory(amount, difficulty, type)
    }

    override suspend fun getQuizExceptDifficulty(amount: Int, category: String, type: String): Response<List<QuizModel>> {
        return dataSource.getQuizExceptDifficulty(amount, category, type)
    }

    override suspend fun getQuizExceptType(amount: Int, category: String, difficulty: String): Response<List<QuizModel>> {
        return dataSource.getQuizExceptType(amount, category, difficulty)
    }

    override suspend fun getQuizOnlyCategory(amount: Int, category: String): Response<List<QuizModel>> {
        return dataSource.getQuizOnlyCategory(amount, category)
    }

    override suspend fun getQuizOnlyDifficulty(amount: Int, difficulty: String): Response<List<QuizModel>> {
        return dataSource.getQuizOnlyDifficulty(amount, difficulty)
    }

    override suspend fun getQuizOnlyType(amount: Int, type: String): Response<List<QuizModel>> {
        return dataSource.getQuizOnlyType(amount, type)
    }

}