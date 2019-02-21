package prakash.com.retrofit.api;

import prakash.com.retrofit.pojoresponse.Results;
import prakash.com.retrofit.request.Users;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApi {

    @GET("users/{name}/test")
    Call<Results> getCommitsByName(@Path("name") String name);

    @GET("users")
    Call<Results> getUserById(@Query("id") Integer id);

    @POST("users")
    Call<Results> postUser(@Body Users user);

    @GET("user")
    Call<Results> getUserDetails(@Header("Authorization") String credentials);

    @GET("todos/1")
    Call<Results> getTestResult();
}
