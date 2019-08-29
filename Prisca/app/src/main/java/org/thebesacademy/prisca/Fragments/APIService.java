package org.thebesacademy.prisca.Fragments;

import org.thebesacademy.prisca.FirebaseServices.MyResponse;
import org.thebesacademy.prisca.FirebaseServices.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {

            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
