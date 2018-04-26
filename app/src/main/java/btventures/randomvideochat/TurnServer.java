package btventures.randomvideochat;

import retrofit2.Call;
import retrofit2.http.GET;



public interface TurnServer {
    @GET("ice?ident=fake")
    Call<TurnServerPojo> getIceCandidates();
}
