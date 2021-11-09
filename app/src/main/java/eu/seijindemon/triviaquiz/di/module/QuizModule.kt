package eu.seijindemon.triviaquiz.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.seijindemon.triviaquiz.data.QuizDataSource
import eu.seijindemon.triviaquiz.data.QuizRepositoryImpl
import eu.seijindemon.triviaquiz.domain.QuizRepository
import eu.seijindemon.triviaquiz.framework.QuizDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
interface QuizBindsModule {

    @Binds
    fun bindQuizDataSource(dataSource: QuizDataSourceImpl): QuizDataSource

    @Binds
    fun bindQuizRepository(repository: QuizRepositoryImpl): QuizRepository

}