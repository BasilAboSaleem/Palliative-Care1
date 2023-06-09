package com.example.finalcloudproject.Notification

import com.example.finalcloudproject.Constants.Constants.Companion.CONTENT_TYPE1
import com.example.finalcloudproject.Constants.Constants.Companion.SERVER_KEY
import com.example.finalcloudproject.Model.PushNotification
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationApi {
    @Headers("Authorization: key=$SERVER_KEY", "Content-type:$CONTENT_TYPE1")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification: PushNotification
    ): Response<ResponseBody>
}