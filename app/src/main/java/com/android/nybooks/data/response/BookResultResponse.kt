package com.android.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class BookResultResponse (

    @Json(name = "book_details")
    val bookDetailsReponses: List<BookDetailsResponse>
)