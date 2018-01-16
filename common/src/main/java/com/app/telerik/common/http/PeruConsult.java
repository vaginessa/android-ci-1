package com.app.telerik.common.http;

import com.app.telerik.common.http.model.Person;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PeruConsult {
    @GET("dni/{dni}")
    Call<Person> getPerson(@Path("dni") String dni);
}
