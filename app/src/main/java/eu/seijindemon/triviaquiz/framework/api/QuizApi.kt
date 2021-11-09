package eu.seijindemon.triviaquiz.framework.api

import eu.seijindemon.triviaquiz.framework.model.QuizModel
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Path

interface QuizApi {

    @POST("amount={amount}&category={category}&difficulty={difficulty}&type{type}")
    suspend fun getQuizRandom(
        @Path("amount") amount: Int,
        @Path("category") category: String,
        @Path("difficulty") difficulty: String,
        @Path("type") type: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&category={category}&difficulty={difficulty}&type{type}")
    suspend fun getQuizAll(
        @Path("amount") amount: Int,
        @Path("category") category: String,
        @Path("difficulty") difficulty: String,
        @Path("type") type: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&difficulty={difficulty}&type{type}")
    suspend fun getQuizExceptCategory(
        @Path("amount") amount: Int,
        @Path("difficulty") difficulty: String,
        @Path("type") type: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&category={category}&type{type}")
    suspend fun getQuizExceptDifficulty(
        @Path("amount") amount: Int,
        @Path("category") category: String,
        @Path("type") type: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&category={category}&difficulty={difficulty}")
    suspend fun getQuizExceptType(
        @Path("amount") amount: Int,
        @Path("category") category: String,
        @Path("difficulty") difficulty: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&category={category}")
    suspend fun getQuizOnlyCategory(
        @Path("amount") amount: Int,
        @Path("category") category: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&difficulty={difficulty}")
    suspend fun getQuizOnlyDifficulty(
        @Path("amount") amount: Int,
        @Path("difficulty") difficulty: String
    ): Response<List<QuizModel>>

    @POST("amount={amount}&type{type}")
    suspend fun getQuizOnlyType(
        @Path("amount") amount: Int,
        @Path("type") type: String
    ): Response<List<QuizModel>>

}