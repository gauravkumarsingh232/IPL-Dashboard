package com.xiffox.ipl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Match {

    @Id
    private long id;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
    private String eliminator;
    private String method;
    private String umpire1;
    private String umpire2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlayerOfMatch() {
        return playerOfMatch;
    }

    public void setPlayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    public String getTossDecision() {
        return tossDecision;
    }

    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    public String getMatchWinner() {
        return matchWinner;
    }

    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultMargin() {
        return resultMargin;
    }

    public void setResultMargin(String resultMargin) {
        this.resultMargin = resultMargin;
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
        final StringBuilder sb = new StringBuilder("Match{");
        sb.append("id=").append(id);
        sb.append(", city='").append(city).append('\'');
        sb.append(", date=").append(date);
        sb.append(", playerOfMatch='").append(playerOfMatch).append('\'');
        sb.append(", venue='").append(venue).append('\'');
        sb.append(", team1='").append(team1).append('\'');
        sb.append(", team2='").append(team2).append('\'');
        sb.append(", tossWinner='").append(tossWinner).append('\'');
        sb.append(", tossDecision='").append(tossDecision).append('\'');
        sb.append(", matchWinner='").append(matchWinner).append('\'');
        sb.append(", result='").append(result).append('\'');
        sb.append(", resultMargin='").append(resultMargin).append('\'');
        sb.append(", eliminator='").append(eliminator).append('\'');
        sb.append(", method='").append(method).append('\'');
        sb.append(", umpire1='").append(umpire1).append('\'');
        sb.append(", umpire2='").append(umpire2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
