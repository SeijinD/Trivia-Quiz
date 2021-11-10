package eu.seijindemon.triviaquiz.usecase

import dagger.hilt.android.scopes.ActivityScoped
import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class GetQuizExceptCategoryUseCase @Inject constructor(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(amount: Int, difficulty: String, type: String) : List<QuizModel> {
        return try {
            repository.getQuizExceptCategory(amount, difficulty, type)
        } catch (ex: Exception) {
            Timber.tag(GetQuizExceptCategoryUseCase::class.simpleName!!).e(ex)
            emptyList()
        }
    }
}