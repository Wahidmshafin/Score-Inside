package com.example.footballscore;

import android.content.Intent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PlaceHolderApi
{
    @GET("matches")
    Call<matchList>getAllMatchesTo(@Query("apikey") String key, @Query("season_id") Integer seasonID, @Query("date_to") String date, @Query("status_code")Integer code);

    @GET("matches")
    Call<matchList>getAllMatchesFrom(@Query("apikey") String key,@Query("season_id") Integer seasonID, @Query("date_from") String date);

    @GET("seasons")
    Call<SeasonLIst>getAllSeasons(@Query("apikey") String key,@Query("league_id")Integer league_id );

    @GET("standings")
    Call<standing_list>getAllStanding(@Query("apikey")String key,@Query("season_id") Integer seasonID);

    @GET("teams")
    Call<Team>getTeam(@Query("apikey") String key, @Query("country_id") Integer countryID);

    @GET("matches/{matchID}")
    Call<matchstatus>getMatchInfo(@Path("matchID") Integer matchID, @Query("apikey") String key);

}
