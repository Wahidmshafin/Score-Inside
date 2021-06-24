package com.example.footballscore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class matchList
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
    public class AwayTeam {

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
        private Country__1 country;

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

        public Country__1 getCountry() {
            return country;
        }

        public void setCountry(Country__1 country) {
            this.country = country;
        }

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
    public class Country__1 {

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

        @SerializedName("match_id")
        @Expose
        private Integer matchId;
        @SerializedName("status_code")
        @Expose
        private Integer statusCode;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("match_start")
        @Expose
        private String matchStart;
        @SerializedName("match_start_iso")
        @Expose
        private String matchStartIso;
        @SerializedName("minute")
        @Expose
        private Object minute;
        @SerializedName("league_id")
        @Expose
        private Integer leagueId;
        @SerializedName("season_id")
        @Expose
        private Integer seasonId;
        @SerializedName("stage")
        @Expose
        private Stage stage;
        @SerializedName("group")
        @Expose
        private Group group;
        @SerializedName("round")
        @Expose
        private Round round;
        @SerializedName("referee_id")
        @Expose
        private Integer refereeId;
        @SerializedName("home_team")
        @Expose
        private HomeTeam homeTeam;
        @SerializedName("away_team")
        @Expose
        private AwayTeam awayTeam;
        @SerializedName("stats")
        @Expose
        private Stats stats;
        @SerializedName("venue")
        @Expose
        private Venue venue;

        public Integer getMatchId() {
            return matchId;
        }

        public void setMatchId(Integer matchId) {
            this.matchId = matchId;
        }

        public Integer getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMatchStart() {
            return matchStart;
        }

        public void setMatchStart(String matchStart) {
            this.matchStart = matchStart;
        }

        public String getMatchStartIso() {
            return matchStartIso;
        }

        public void setMatchStartIso(String matchStartIso) {
            this.matchStartIso = matchStartIso;
        }

        public Object getMinute() {
            return minute;
        }

        public void setMinute(Object minute) {
            this.minute = minute;
        }

        public Integer getLeagueId() {
            return leagueId;
        }

        public void setLeagueId(Integer leagueId) {
            this.leagueId = leagueId;
        }

        public Integer getSeasonId() {
            return seasonId;
        }

        public void setSeasonId(Integer seasonId) {
            this.seasonId = seasonId;
        }

        public Stage getStage() {
            return stage;
        }

        public void setStage(Stage stage) {
            this.stage = stage;
        }

        public Group getGroup() {
            return group;
        }

        public void setGroup(Group group) {
            this.group = group;
        }

        public Round getRound() {
            return round;
        }

        public void setRound(Round round) {
            this.round = round;
        }

        public Integer getRefereeId() {
            return refereeId;
        }

        public void setRefereeId(Integer refereeId) {
            this.refereeId = refereeId;
        }

        public HomeTeam getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(HomeTeam homeTeam) {
            this.homeTeam = homeTeam;
        }

        public AwayTeam getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeam awayTeam) {
            this.awayTeam = awayTeam;
        }

        public Stats getStats() {
            return stats;
        }

        public void setStats(Stats stats) {
            this.stats = stats;
        }

        public Venue getVenue() {
            return venue;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

    }
    public class Group {

        @SerializedName("group_id")
        @Expose
        private Integer groupId;
        @SerializedName("group_name")
        @Expose
        private String groupName;

        public Integer getGroupId() {
            return groupId;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

    }
    public class HomeTeam {

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
        @SerializedName("season_id")
        @Expose
        private String seasonId;
        @SerializedName("date_from")
        @Expose
        private String dateFrom;

        public String getApikey() {
            return apikey;
        }

        public void setApikey(String apikey) {
            this.apikey = apikey;
        }

        public String getSeasonId() {
            return seasonId;
        }

        public void setSeasonId(String seasonId) {
            this.seasonId = seasonId;
        }

        public String getDateFrom() {
            return dateFrom;
        }

        public void setDateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
        }

    }
    public class Round {

        @SerializedName("round_id")
        @Expose
        private Integer roundId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("is_current")
        @Expose
        private Object isCurrent;

        public Integer getRoundId() {
            return roundId;
        }

        public void setRoundId(Integer roundId) {
            this.roundId = roundId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getIsCurrent() {
            return isCurrent;
        }

        public void setIsCurrent(Object isCurrent) {
            this.isCurrent = isCurrent;
        }

    }
    public class Stage {

        @SerializedName("stage_id")
        @Expose
        private Integer stageId;
        @SerializedName("name")
        @Expose
        private String name;

        public Integer getStageId() {
            return stageId;
        }

        public void setStageId(Integer stageId) {
            this.stageId = stageId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public class Stats {

        @SerializedName("home_score")
        @Expose
        private Integer homeScore;
        @SerializedName("away_score")
        @Expose
        private Integer awayScore;
        @SerializedName("ht_score")
        @Expose
        private String htScore;
        @SerializedName("ft_score")
        @Expose
        private String ftScore;
        @SerializedName("et_score")
        @Expose
        private Object etScore;
        @SerializedName("ps_score")
        @Expose
        private Object psScore;

        public Integer getHomeScore() {
            return homeScore;
        }

        public void setHomeScore(Integer homeScore) {
            this.homeScore = homeScore;
        }

        public Integer getAwayScore() {
            return awayScore;
        }

        public void setAwayScore(Integer awayScore) {
            this.awayScore = awayScore;
        }

        public String getHtScore() {
            return htScore;
        }

        public void setHtScore(String htScore) {
            this.htScore = htScore;
        }

        public String getFtScore() {
            return ftScore;
        }

        public void setFtScore(String ftScore) {
            this.ftScore = ftScore;
        }

        public Object getEtScore() {
            return etScore;
        }

        public void setEtScore(Object etScore) {
            this.etScore = etScore;
        }

        public Object getPsScore() {
            return psScore;
        }

        public void setPsScore(Object psScore) {
            this.psScore = psScore;
        }

    }
    public class Venue {

        @SerializedName("venue_id")
        @Expose
        private Integer venueId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("capacity")
        @Expose
        private Integer capacity;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("country_id")
        @Expose
        private Integer countryId;

        public Integer getVenueId() {
            return venueId;
        }

        public void setVenueId(Integer venueId) {
            this.venueId = venueId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCapacity() {
            return capacity;
        }

        public void setCapacity(Integer capacity) {
            this.capacity = capacity;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

    }

}
