package eu.seijindemon.triviaquiz.framework.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuizModel(
    val id: Int?,
    val category: String,
    val type: String,
    val difficulty: String,
    val question: String,
    val correct_answer: String,
    val incorrect_answers: List<String>
)
