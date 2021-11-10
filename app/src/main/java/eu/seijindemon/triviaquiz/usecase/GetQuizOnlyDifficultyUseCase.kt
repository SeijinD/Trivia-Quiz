package eu.seijindemon.triviaquiz.usecase

import dagger.hilt.android.scopes.ActivityScoped
import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.model.QuizModel
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class GetQuizOnlyDifficultyUseCase @Inject constructor(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(amount: Int, difficulty: String) : List<QuizModel> {
        return try {
            repository.getQuizOnlyDifficulty(amount, difficulty)
        } catch (ex: Exception) {
            Timber.tag(GetQuizOnlyDifficultyUseCase::class.simpleName!!).e(ex)
            emptyList()
        }
    }
}