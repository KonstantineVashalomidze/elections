import election.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static election.Gender.FEMALE;
import static election.Gender.MALE;
import static election.Status.ALIVE;

public class Main {
    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<>();
        Candidate mixeilSaakashvili = new MixeilSaakashvili(Generate.pId(), "Misha", "Saakashvili", MALE);
        Candidate davitTarxanMouravi = new DavitTarxanMouravi(Generate.pId(), "Davit", "TarxanMouravi", MALE);
        Candidate nikaMelia = new NikaMelia(Generate.pId(), "Nika", "Melia", MALE);

        candidates.add(mixeilSaakashvili);
        candidates.add(davitTarxanMouravi);
        candidates.add(nikaMelia);

        Vote.getInstance().registerCandidate(mixeilSaakashvili);
        Vote.getInstance().registerCandidate(davitTarxanMouravi);
        Vote.getInstance().registerCandidate(nikaMelia);

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            var voter = new Voter(Generate.pId(), "name" + i, "surname" + i, FEMALE, ALIVE, i + 18);
            Vote.getInstance().registerVoter(voter);
            Vote.getInstance().vote(voter, candidates.get(random.nextInt(candidates.size())));
        }




        // Call the method from the inner class
        Candidate winner = Vote.Calculator.revealWinner();

        System.out.println("Winner: " + winner.toString());

    }
}