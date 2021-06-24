package com.example.footballscore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class matchstatus
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
    public class Country__2 {

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
    public class Data {

        @SerializedName("match_id")
        @Expose
        private Integer matchId;
        @SerializedName("league_id")
        @Expose
        private Integer leagueId;
        @SerializedName("round")
        @Expose
        private Round round;
        @SerializedName("referee_id")
        @Expose
        private Integer refereeId;
        @SerializedName("season_id")
        @Expose
        private Integer seasonId;
        @SerializedName("stage")
        @Expose
        private Stage stage;
        @SerializedName("group")
        @Expose
        private Group group;
        @SerializedName("status_code")
        @Expose
        private Integer statusCode;
        @SerializedName("match_start")
        @Expose
        private String matchStart;
        @SerializedName("match_start_iso")
        @Expose
        private String matchStartIso;
        @SerializedName("minute")
        @Expose
        private Object minute;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("stats")
        @Expose
        private Stats stats;
        @SerializedName("home_team")
        @Expose
        private HomeTeam homeTeam;
        @SerializedName("away_team")
        @Expose
        private AwayTeam awayTeam;
        @SerializedName("match_events")
        @Expose
        private ArrayList<MatchEvent> matchEvents = null;
        @SerializedName("match_statistics")
        @Expose
        private ArrayList<MatchStatistic> matchStatistics = null;
        @SerializedName("lineups")
        @Expose
        private ArrayList<Lineup> lineups = null;
        @SerializedName("venue")
        @Expose
        private Venue venue;

        public Integer getMatchId() {
            return matchId;
        }

        public void setMatchId(Integer matchId) {
            this.matchId = matchId;
        }

        public Integer getLeagueId() {
            return leagueId;
        }

        public void setLeagueId(Integer leagueId) {
            this.leagueId = leagueId;
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

        public Integer getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Stats getStats() {
            return stats;
        }

        public void setStats(Stats stats) {
            this.stats = stats;
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

        public ArrayList<MatchEvent> getMatchEvents() {
            return matchEvents;
        }

        public void setMatchEvents(ArrayList<MatchEvent> matchEvents) {
            this.matchEvents = matchEvents;
        }

        public ArrayList<MatchStatistic> getMatchStatistics() {
            return matchStatistics;
        }

        public void setMatchStatistics(ArrayList<MatchStatistic> matchStatistics) {
            this.matchStatistics = matchStatistics;
        }

        public ArrayList<Lineup> getLineups() {
            return lineups;
        }

        public void setLineups(ArrayList<Lineup> lineups) {
            this.lineups = lineups;
        }

        public Venue getVenue() {
            return venue;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

    }
    public class Detailed {

        @SerializedName("number")
        @Expose
        private Integer number;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("order")
        @Expose
        private Integer order;

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
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
    public class Lineup {

        @SerializedName("team_id")
        @Expose
        private Integer teamId;
        @SerializedName("formation")
        @Expose
        private String formation;
        @SerializedName("formation_confirmed")
        @Expose
        private Integer formationConfirmed;
        @SerializedName("players")
        @Expose
        private ArrayList<Player> players = null;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public String getFormation() {
            return formation;
        }

        public void setFormation(String formation) {
            this.formation = formation;
        }

        public Integer getFormationConfirmed() {
            return formationConfirmed;
        }

        public void setFormationConfirmed(Integer formationConfirmed) {
            this.formationConfirmed = formationConfirmed;
        }

        public ArrayList<Player> getPlayers() {
            return players;
        }

        public void setPlayers(ArrayList<Player> players) {
            this.players = players;
        }

    }
    public class MatchEvent {

        @SerializedName("team_id")
        @Expose
        private Integer teamId;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("player_id")
        @Expose
        private Integer playerId;
        @SerializedName("player_name")
        @Expose
        private String playerName;
        @SerializedName("related_player_id")
        @Expose
        private Integer relatedPlayerId;
        @SerializedName("related_player_name")
        @Expose
        private String relatedPlayerName;
        @SerializedName("minute")
        @Expose
        private Integer minute;
        @SerializedName("extra_minute")
        @Expose
        private Object extraMinute;
        @SerializedName("reason")
        @Expose
        private Object reason;
        @SerializedName("injured")
        @Expose
        private Object injured;
        @SerializedName("own_goal")
        @Expose
        private Boolean ownGoal;
        @SerializedName("penalty")
        @Expose
        private Boolean penalty;
        @SerializedName("result")
        @Expose
        private Object result;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public Integer getRelatedPlayerId() {
            return relatedPlayerId;
        }

        public void setRelatedPlayerId(Integer relatedPlayerId) {
            this.relatedPlayerId = relatedPlayerId;
        }

        public String getRelatedPlayerName() {
            return relatedPlayerName;
        }

        public void setRelatedPlayerName(String relatedPlayerName) {
            this.relatedPlayerName = relatedPlayerName;
        }

        public Integer getMinute() {
            return minute;
        }

        public void setMinute(Integer minute) {
            this.minute = minute;
        }

        public Object getExtraMinute() {
            return extraMinute;
        }

        public void setExtraMinute(Object extraMinute) {
            this.extraMinute = extraMinute;
        }

        public Object getReason() {
            return reason;
        }

        public void setReason(Object reason) {
            this.reason = reason;
        }

        public Object getInjured() {
            return injured;
        }

        public void setInjured(Object injured) {
            this.injured = injured;
        }

        public Boolean getOwnGoal() {
            return ownGoal;
        }

        public void setOwnGoal(Boolean ownGoal) {
            this.ownGoal = ownGoal;
        }

        public Boolean getPenalty() {
            return penalty;
        }

        public void setPenalty(Boolean penalty) {
            this.penalty = penalty;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

    }
    public class MatchStatistic {

        @SerializedName("team_id")
        @Expose
        private Integer teamId;
        @SerializedName("team_name")
        @Expose
        private String teamName;
        @SerializedName("fouls")
        @Expose
        private Integer fouls;
        @SerializedName("injuries")
        @Expose
        private Integer injuries;
        @SerializedName("corners")
        @Expose
        private Integer corners;
        @SerializedName("offsides")
        @Expose
        private Integer offsides;
        @SerializedName("shots_total")
        @Expose
        private Integer shotsTotal;
        @SerializedName("shots_on_target")
        @Expose
        private Object shotsOnTarget;
        @SerializedName("shots_off_target")
        @Expose
        private Integer shotsOffTarget;
        @SerializedName("shots_blocked")
        @Expose
        private Integer shotsBlocked;
        @SerializedName("possessiontime")
        @Expose
        private Object possessiontime;
        @SerializedName("possessionpercent")
        @Expose
        private Object possessionpercent;
        @SerializedName("yellowcards")
        @Expose
        private Integer yellowcards;
        @SerializedName("yellowredcards")
        @Expose
        private Integer yellowredcards;
        @SerializedName("redcards")
        @Expose
        private Integer redcards;
        @SerializedName("substitutions")
        @Expose
        private Integer substitutions;
        @SerializedName("goal_kick")
        @Expose
        private Integer goalKick;
        @SerializedName("goal_attempts")
        @Expose
        private Integer goalAttempts;
        @SerializedName("free_kick")
        @Expose
        private Integer freeKick;
        @SerializedName("throw_in")
        @Expose
        private Integer throwIn;
        @SerializedName("ball_safe")
        @Expose
        private Integer ballSafe;
        @SerializedName("goals")
        @Expose
        private Integer goals;
        @SerializedName("penalties")
        @Expose
        private Integer penalties;
        @SerializedName("attacks")
        @Expose
        private Integer attacks;
        @SerializedName("dangerous_attacks")
        @Expose
        private Integer dangerousAttacks;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public Integer getFouls() {
            return fouls;
        }

        public void setFouls(Integer fouls) {
            this.fouls = fouls;
        }

        public Integer getInjuries() {
            return injuries;
        }

        public void setInjuries(Integer injuries) {
            this.injuries = injuries;
        }

        public Integer getCorners() {
            return corners;
        }

        public void setCorners(Integer corners) {
            this.corners = corners;
        }

        public Integer getOffsides() {
            return offsides;
        }

        public void setOffsides(Integer offsides) {
            this.offsides = offsides;
        }

        public Integer getShotsTotal() {
            return shotsTotal;
        }

        public void setShotsTotal(Integer shotsTotal) {
            this.shotsTotal = shotsTotal;
        }

        public Object getShotsOnTarget() {
            return shotsOnTarget;
        }

        public void setShotsOnTarget(Object shotsOnTarget) {
            this.shotsOnTarget = shotsOnTarget;
        }

        public Integer getShotsOffTarget() {
            return shotsOffTarget;
        }

        public void setShotsOffTarget(Integer shotsOffTarget) {
            this.shotsOffTarget = shotsOffTarget;
        }

        public Integer getShotsBlocked() {
            return shotsBlocked;
        }

        public void setShotsBlocked(Integer shotsBlocked) {
            this.shotsBlocked = shotsBlocked;
        }

        public Object getPossessiontime() {
            return possessiontime;
        }

        public void setPossessiontime(Object possessiontime) {
            this.possessiontime = possessiontime;
        }

        public Object getPossessionpercent() {
            return possessionpercent;
        }

        public void setPossessionpercent(Object possessionpercent) {
            this.possessionpercent = possessionpercent;
        }

        public Integer getYellowcards() {
            return yellowcards;
        }

        public void setYellowcards(Integer yellowcards) {
            this.yellowcards = yellowcards;
        }

        public Integer getYellowredcards() {
            return yellowredcards;
        }

        public void setYellowredcards(Integer yellowredcards) {
            this.yellowredcards = yellowredcards;
        }

        public Integer getRedcards() {
            return redcards;
        }

        public void setRedcards(Integer redcards) {
            this.redcards = redcards;
        }

        public Integer getSubstitutions() {
            return substitutions;
        }

        public void setSubstitutions(Integer substitutions) {
            this.substitutions = substitutions;
        }

        public Integer getGoalKick() {
            return goalKick;
        }

        public void setGoalKick(Integer goalKick) {
            this.goalKick = goalKick;
        }

        public Integer getGoalAttempts() {
            return goalAttempts;
        }

        public void setGoalAttempts(Integer goalAttempts) {
            this.goalAttempts = goalAttempts;
        }

        public Integer getFreeKick() {
            return freeKick;
        }

        public void setFreeKick(Integer freeKick) {
            this.freeKick = freeKick;
        }

        public Integer getThrowIn() {
            return throwIn;
        }

        public void setThrowIn(Integer throwIn) {
            this.throwIn = throwIn;
        }

        public Integer getBallSafe() {
            return ballSafe;
        }

        public void setBallSafe(Integer ballSafe) {
            this.ballSafe = ballSafe;
        }

        public Integer getGoals() {
            return goals;
        }

        public void setGoals(Integer goals) {
            this.goals = goals;
        }

        public Integer getPenalties() {
            return penalties;
        }

        public void setPenalties(Integer penalties) {
            this.penalties = penalties;
        }

        public Integer getAttacks() {
            return attacks;
        }

        public void setAttacks(Integer attacks) {
            this.attacks = attacks;
        }

        public Integer getDangerousAttacks() {
            return dangerousAttacks;
        }

        public void setDangerousAttacks(Integer dangerousAttacks) {
            this.dangerousAttacks = dangerousAttacks;
        }

    }
    public class Player {

        @SerializedName("player_id")
        @Expose
        private Integer playerId;
        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("lastname")
        @Expose
        private String lastname;
        @SerializedName("birthday")
        @Expose
        private String birthday;
        @SerializedName("age")
        @Expose
        private Integer age;
        @SerializedName("weight")
        @Expose
        private Object weight;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("img")
        @Expose
        private String img;
        @SerializedName("country")
        @Expose
        private Country__2 country;
        @SerializedName("detailed")
        @Expose
        private Detailed detailed;

        public Integer getPlayerId() {
            return playerId;
        }

        public void setPlayerId(Integer playerId) {
            this.playerId = playerId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public Country__2 getCountry() {
            return country;
        }

        public void setCountry(Country__2 country) {
            this.country = country;
        }

        public Detailed getDetailed() {
            return detailed;
        }

        public void setDetailed(Detailed detailed) {
            this.detailed = detailed;
        }

    }
    public class Query {

        @SerializedName("apikey")
        @Expose
        private String apikey;

        public String getApikey() {
            return apikey;
        }

        public void setApikey(String apikey) {
            this.apikey = apikey;
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
