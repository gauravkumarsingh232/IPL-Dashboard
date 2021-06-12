package com.xiffox.ipl.data;

public class MatchInput {
    private String id;
    private String city;
    private String date;
    private String player_of_match;
    private String venue;
    private String neutral_venue;
    private String team1;
    private String team2;
    private String toss_winner;
    private String toss_decision;
    private String winner;
    private String result;
    private String result_margin;
    private String eliminator;
    private String method;
    private String umpire1;
    private String umpire2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlayer_of_match() {
        return player_of_match;
    }

    public void setPlayer_of_match(String player_of_match) {
        this.player_of_match = player_of_match;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getNeutral_venue() {
        return neutral_venue;
    }

    public void setNeutral_venue(String neutral_venue) {
        this.neutral_venue = neutral_venue;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getToss_winner() {
        return toss_winner;
    }

    public void setToss_winner(String toss_winner) {
        this.toss_winner = toss_winner;
    }

    public String getToss_decision() {
        return toss_decision;
    }

    public void setToss_decision(String toss_decision) {
        this.toss_decision = toss_decision;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult_margin() {
        return result_margin;
    }

    public void setResult_margin(String result_margin) {
        this.result_margin = result_margin;
    }

    public String getEliminator() {
        return eliminator;
    }

    public void setEliminator(String eliminator) {
        this.eliminator = eliminator;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }

    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchInput{");
        sb.append("id='").append(id).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", player_of_match='").append(player_of_match).append('\'');
        sb.append(", venue='").append(venue).append('\'');
        sb.append(", neutral_venue='").append(neutral_venue).append('\'');
        sb.append(", team1='").append(team1).append('\'');
        sb.append(", team2='").append(team2).append('\'');
        sb.append(", toss_winner='").append(toss_winner).append('\'');
        sb.append(", toss_decision='").append(toss_decision).append('\'');
        sb.append(", winner='").append(winner).append('\'');
        sb.append(", result='").append(result).append('\'');
        sb.append(", result_margin='").append(result_margin).append('\'');
        sb.append(", eliminator='").append(eliminator).append('\'');
        sb.append(", method='").append(method).append('\'');
        sb.append(", umpire1='").append(umpire1).append('\'');
        sb.append(", umpire2='").append(umpire2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
