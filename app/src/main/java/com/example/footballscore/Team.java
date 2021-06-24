package com.example.footballscore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Team
{
    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("data")
    @Expose
    private ArrayList<Datum> data = null;

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
    public class Country {

        @SerializedName("country_id")
        @Expose
        private Integer countryId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("country_code")
        @Expose
        private String countryCode;
        @SerializedName("continent")
        @Expose
        private String continent;

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

    }
    public class Datum {

        @SerializedName("team_id")
        @Expose
        private Integer teamId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("short_code")
        @Expose
        private String shortCode;
        @SerializedName("common_name")
        @Expose
        private String commonName;
        @SerializedName("logo")
        @Expose
        private String logo;
        @SerializedName("country")
        @Expose
        private Country country;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortCode() {
            return shortCode;
        }

        public void setShortCode(String shortCode) {
            this.shortCode = shortCode;
        }

        public String getCommonName() {
            return commonName;
        }

        public void setCommonName(String commonName) {
            this.commonName = commonName;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

    }
    public class Query {

        @SerializedName("apikey")
        @Expose
        private String apikey;
        @SerializedName("country_id")
        @Expose
        private String countryId;

        public String getApikey() {
            return apikey;
        }

        public void setApikey(String apikey) {
            this.apikey = apikey;
        }

        public String getCountryId() {
            return countryId;
        }

        public void setCountryId(String countryId) {
            this.countryId = countryId;
        }

    }

}
