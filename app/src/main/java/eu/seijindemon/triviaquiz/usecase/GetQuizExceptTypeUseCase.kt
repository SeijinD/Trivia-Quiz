package eu.seijindemon.triviaquiz.usecase

import dagger.hilt.android.scopes.ActivityScoped
import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class GetQuizExceptTypeUseCase @Inject constructor(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(amount: Int, category: String, difficulty: String) : List<QuizModel> {
        return try {
            repository.getQuizExceptType(amount, category, difficulty)
        } catch (ex: Exception) {
            Timber.tag(GetQuizExceptTypeUseCase::class.simpleName!!).e(ex)
            emptyList()
        }
    }
}