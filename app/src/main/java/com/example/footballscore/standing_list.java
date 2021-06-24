package com.example.footballscore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class standing_list
{
    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("data")
    @Expose
    private Data data;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Away {

        @SerializedName("games_played")
        @Expose
        private Integer gamesPlayed;
        @SerializedName("won")
        @Expose
        private Integer won;
        @SerializedName("draw")
        @Expose
        private Integer draw;
        @SerializedName("lost")
        @Expose
        private Integer lost;
        @SerializedName("goals_diff")
        @Expose
        private Integer goalsDiff;
        @SerializedName("goals_scored")
        @Expose
        private Integer goalsScored;
        @SerializedName("goals_against")
        @Expose
        private Integer goalsAgainst;

        public Integer getGamesPlayed() {
            return gamesPlayed;
        }

        public void setGamesPlayed(Integer gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
        }

        public Integer getWon() {
            return won;
        }

        public void setWon(Integer won) {
            this.won = won;
        }

        public Integer getDraw() {
            return draw;
        }

        public void setDraw(Integer draw) {
            this.draw = draw;
        }

        public Integer getLost() {
            return lost;
        }

        public void setLost(Integer lost) {
            this.lost = lost;
        }

        public Integer getGoalsDiff() {
            return goalsDiff;
        }

        public void setGoalsDiff(Integer goalsDiff) {
            this.goalsDiff = goalsDiff;
        }

        public Integer getGoalsScored() {
            return goalsScored;
        }

        public void setGoalsScored(Integer goalsScored) {
            this.goalsScored = goalsScored;
        }

        public Integer getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(Integer goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

    }
    public class Data {

        @SerializedName("season_id")
        @Expose
        private Integer seasonId;
        @SerializedName("league_id")
        @Expose
        private Integer leagueId;
        @SerializedName("has_groups")
        @Expose
        private Integer hasGroups;
        @SerializedName("standings")
        @Expose
        private ArrayList<Standing> standings = null;

        public Integer getSeasonId() {
            return seasonId;
        }

        public void setSeasonId(Integer seasonId) {
            this.seasonId = seasonId;
        }

        public Integer getLeagueId() {
            return leagueId;
        }

        public void setLeagueId(Integer leagueId) {
            this.leagueId = leagueId;
        }

        public Integer getHasGroups() {
            return hasGroups;
        }

        public void setHasGroups(Integer hasGroups) {
            this.hasGroups = hasGroups;
        }

        public ArrayList<Standing> getStandings() {
            return standings;
        }

        public void setStandings(ArrayList<Standing> standings) {
            this.standings = standings;
        }

    }
    public class Home {

        @SerializedName("games_played")
        @Expose
        private Integer gamesPlayed;
        @SerializedName("won")
        @Expose
        private Integer won;
        @SerializedName("draw")
        @Expose
        private Integer draw;
        @SerializedName("lost")
        @Expose
        private Integer lost;
        @SerializedName("goals_diff")
        @Expose
        private Integer goalsDiff;
        @SerializedName("goals_scored")
        @Expose
        private Integer goalsScored;
        @SerializedName("goals_against")
        @Expose
        private Integer goalsAgainst;

        public Integer getGamesPlayed() {
            return gamesPlayed;
        }

        public void setGamesPlayed(Integer gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
        }

        public Integer getWon() {
            return won;
        }

        public void setWon(Integer won) {
            this.won = won;
        }

        public Integer getDraw() {
            return draw;
        }

        public void setDraw(Integer draw) {
            this.draw = draw;
        }

        public Integer getLost() {
            return lost;
        }

        public void setLost(Integer lost) {
            this.lost = lost;
        }

        public Integer getGoalsDiff() {
            return goalsDiff;
        }

        public void setGoalsDiff(Integer goalsDiff) {
            this.goalsDiff = goalsDiff;
        }

        public Integer getGoalsScored() {
            return goalsScored;
        }

        public void setGoalsScored(Integer goalsScored) {
            this.goalsScored = goalsScored;
        }

        public Integer getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(Integer goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

    }
    public class Overall {

        @SerializedName("games_played")
        @Expose
        private Integer gamesPlayed;
        @SerializedName("won")
        @Expose
        private Integer won;
        @SerializedName("draw")
        @Expose
        private Integer draw;
        @SerializedName("lost")
        @Expose
        private Integer lost;
        @SerializedName("goals_diff")
        @Expose
        private Integer goalsDiff;
        @SerializedName("goals_scored")
        @Expose
        private Integer goalsScored;
        @SerializedName("goals_against")
        @Expose
        private Integer goalsAgainst;

        public Integer getGamesPlayed() {
            return gamesPlayed;
        }

        public void setGamesPlayed(Integer gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
        }

        public Integer getWon() {
            return won;
        }

        public void setWon(Integer won) {
            this.won = won;
        }

        public Integer getDraw() {
            return draw;
        }

        public void setDraw(Integer draw) {
            this.draw = draw;
        }

        public Integer getLost() {
            return lost;
        }

        public void setLost(Integer lost) {
            this.lost = lost;
        }

        public Integer getGoalsDiff() {
            return goalsDiff;
        }

        public void setGoalsDiff(Integer goalsDiff) {
            this.goalsDiff = goalsDiff;
        }

        public Integer getGoalsScored() {
            return goalsScored;
        }

        public void setGoalsScored(Integer goalsScored) {
            this.goalsScored = goalsScored;
        }

        public Integer getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(Integer goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

    }
    public class Query {

        @SerializedName("apikey")
        @Expose
        private String apikey;
        @SerializedName("season_id")
        @Expose
        private String seasonId;

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

    }
    public class Standing {

        @SerializedName("team_id")
        @Expose
        private Integer teamId;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("points")
        @Expose
        private Integer points;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("result")
        @Expose
        private String result;
        @SerializedName("overall")
        @Expose
        private Overall overall;
        @SerializedName("home")
        @Expose
        private Home home;
        @SerializedName("away")
        @Expose
        private Away away;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public Integer getPoints() {
            return points;
        }

        public void setPoints(Integer points) {
            this.points = points;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public Overall getOverall() {
            return overall;
        }

        public void setOverall(Overall overall) {
            this.overall = overall;
        }

        public Home getHome() {
            return home;
        }

        public void setHome(Home home) {
            this.home = home;
        }

        public Away getAway() {
            return away;
        }

        public void setAway(Away away) {
            this.away = away;
        }

    }
}
