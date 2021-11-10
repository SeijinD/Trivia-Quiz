package eu.seijindemon.triviaquiz.usecase

import dagger.hilt.android.scopes.ActivityScoped
import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class GetQuizOnlyCategoryUseCase @Inject constructor(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(amount: Int, category: String) : List<QuizModel> {
        return try {
            repository.getQuizOnlyCategory(amount, category)
        } catch (ex: Exception) {
            Timber.tag(GetQuizOnlyCategoryUseCase::class.simpleName!!).e(ex)
            emptyList()
        }
    }
}