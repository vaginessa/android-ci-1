package com.app.telerik.common.http;

import com.app.telerik.common.http.model.Person;

import org.junit.Test;
import retrofit2.Retrofit;

import static org.junit.Assert.assertSame;

public class RetrofitUnitTest {
    @Test
    public void get_dni_valid() throws Exception {
        PeruConsult service = this.getService();
//        Person person = service.getPerson("48004836")
//                            .execute()
//                            .body();
//
//        assertSame("JUAN", person.nombres);
    }

    private PeruConsult getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://peru-consult.herokuapp.com/api/v1/")
                .build();

        return retrofit.create(PeruConsult.class);
    }
}
