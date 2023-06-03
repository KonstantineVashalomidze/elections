package election;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vote {
    private static Vote instance;

    private static List<Voter> voters;

    private static Map<Candidate, Integer> candidatesWithVotes;

    private static Map<Voter, Candidate> whoVotedWho;

    private Vote(){
        whoVotedWho = new HashMap<>();
        voters = new ArrayList<>();
        candidatesWithVotes = new HashMap<>();
    }

    public void registerVoter(Voter voter){
        if(!voters.contains(voter)){
            voters.add(voter);
            System.out.println("REGISTERED: " + voter.toString());
        } else {
            System.err.println("Already registered voter: " + voter.toString());
        }
    }

    public void registerCandidate(Candidate candidate){
        if(!candidatesWithVotes.containsKey(candidate)){
            candidatesWithVotes.put(candidate, 0);
            System.out.println("REGISTERED: " + candidate.toString());
        } else {
            System.err.println("Already registered candidate: " + candidate.toString());
        }
    }

    public void vote(Voter voter, Candidate candidate){
        whoVotedWho.put(voter, candidate);
    }

    // Inner class for revealing leader
    public static class Calculator {
        public static Candidate revealWinner(){
            for (Voter voter : whoVotedWho.keySet()) {
                var candidate = whoVotedWho.get(voter);
                if(candidatesWithVotes.containsKey(candidate)){

                    // Increase the vote of the elected candidate by 1
                    candidatesWithVotes.put(candidate, candidatesWithVotes.get(candidate) + 1);
                } else {
                    System.err.println("No candidate: " + candidate.toString());
                }
            }

            Candidate electedCandidate = null;
            int maxVotes = 0;
            for (Candidate candidate : candidatesWithVotes.keySet()){
                var candidateVoteCount = candidatesWithVotes.get(candidate);
                if (maxVotes < candidateVoteCount){
                    electedCandidate = candidate;
                    maxVotes = candidateVoteCount;
                }
            }
            return electedCandidate;
        }
    }



    public static Vote getInstance() {
        if(instance == null){
            instance = new Vote();
        }
        return instance;
    }

}
