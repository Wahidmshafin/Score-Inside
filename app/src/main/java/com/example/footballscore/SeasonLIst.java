package com.example.footballscore;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class SeasonLIst
{
        @SerializedName("query")
        @Expose
        private Query query;
        @SerializedName("data")
        @Expose
        private ArrayList<Datum> data;

        public Query getQuery() {
            return query;
        }

        public void setQuery(Query query) {
            this.query = query;
        }

        public ArrayList<Datum> getData() {
            return data;
        }

        public void setData(ArrayList<Datum> data) {
            this.data = data;
        }
        public class Datum {

            @SerializedName("season_id")
            @Expose
            private Integer seasonId;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("is_current")
            @Expose
            private Integer isCurrent;
            @SerializedName("country_id")
            @Expose
            private Integer countryId;
            @SerializedName("league_id")
            @Expose
            private Integer leagueId;
            @SerializedName("start_date")
            @Expose
            private String startDate;
            @SerializedName("end_date")
            @Expose
            private String endDate;

            public Integer getSeasonId() {
                return seasonId;
            }

            public void setSeasonId(Integer seasonId) {
                this.seasonId = seasonId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getIsCurrent() {
                return isCurrent;
            }

            public void setIsCurrent(Integer isCurrent) {
                this.isCurrent = isCurrent;
            }

            public Integer getCountryId() {
                return countryId;
            }

            public void setCountryId(Integer countryId) {
                this.countryId = countryId;
            }

            public Integer getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(Integer leagueId) {
                this.leagueId = leagueId;
            }

            public String getStartDate() {
                return startDate;
            }

            public void setStartDate(String startDate) {
                this.startDate = startDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

        }

        public class Query {
            @Override
            public String toString()
            {
                return "Query{" +
                        "apikey='" + apikey + '\'' +
                        ", leagueId='" + leagueId + '\'' +
                        '}';
            }

            @SerializedName("apikey")
            @Expose
            private String apikey;
            @SerializedName("league_id")
            @Expose
            private String leagueId;

            public String getApikey() {
                return apikey;
            }

            public void setApikey(String apikey) {
                this.apikey = apikey;
            }

            public String getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(String leagueId) {
                this.leagueId = leagueId;
            }

        }

}
