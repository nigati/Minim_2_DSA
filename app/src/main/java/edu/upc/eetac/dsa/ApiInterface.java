package edu.upc.eetac.dsa;
import java.util.List;

import edu.upc.eetac.dsa.models.Issue;
import edu.upc.eetac.dsa.models.Item;
import edu.upc.eetac.dsa.models.LogInParams;
import edu.upc.eetac.dsa.models.Stats;
import edu.upc.eetac.dsa.models.User;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiInterface {

    @GET("users/catalogo")
    Call<List<Item>> getItems();

    @GET("stats/ranking")
    Call<List<Stats>> getRanking();

    @POST("users/login")
    Call<User> login(@Body LogInParams loginpar);

    @POST("users/register")
    Call<User> register(@Body User user);

    @GET("users")
    Call<List<User>> getUsers();

    @GET("catalogo")
    Call<List<Item>> getCatalogo();

    @GET("users/{username}")
    Call<User> profile (@Path("username") String username);

    @POST("users/issue")
    Call<Void> sendIssue(@Body Issue issue);

    @PUT ("users/{username}/updatelanguage")
    Call<Void> updateUserLanguage(@Path("username") String username,@Body String language);
}
