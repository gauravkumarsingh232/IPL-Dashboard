package com.xiffox.ipl.data;

import com.xiffox.ipl.model.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class MatchItemProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchItemProcessor.class);

    @Override
    public Match process(final MatchInput matchInput) throws Exception {

        Match match = new Match();
        match.setId(Long.parseLong(matchInput.getId()));
        match.setCity(matchInput.getCity());
        match.setDate(LocalDate.parse(matchInput.getDate()));
        match.setPlayerOfMatch(matchInput.getPlayer_of_match());
        match.setVenue(matchInput.getVenue());

        String firstInnningTeam;
        String secondInningTeam;

        if ("bat".equals(matchInput.getToss_decision())) {
            firstInnningTeam = matchInput.getToss_winner();
            secondInningTeam = matchInput.getToss_winner().equals(matchInput.getTeam1())
                    ? matchInput.getTeam2() : matchInput.getTeam1();
        } else {
            secondInningTeam = matchInput.getToss_winner();
            firstInnningTeam = matchInput.getToss_winner().equals(matchInput.getTeam1())
                    ? matchInput.getTeam2() : matchInput.getTeam1();
        }

        match.setTeam1(firstInnningTeam);
        match.setTeam2(secondInningTeam);
        match.setTossWinner(matchInput.getToss_winner());
        match.setTossDecision(matchInput.getToss_decision());
        match.setMatchWinner(matchInput.getWinner());
        match.setResult(matchInput.getResult());
        match.setResultMargin(matchInput.getResult_margin());
        match.setEliminator(matchInput.getEliminator());
        match.setMethod(matchInput.getMethod());
        match.setUmpire1(matchInput.getUmpire1());
        match.setUmpire2(matchInput.getUmpire2());



        return match;
    }
}

