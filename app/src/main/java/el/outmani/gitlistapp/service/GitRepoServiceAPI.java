package el.outmani.gitlistapp.service;

import el.outmani.gitlistapp.model.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);
}
