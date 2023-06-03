package election;

public class MixeilSaakashvili extends Candidate{

    public MixeilSaakashvili(int pId, String name, String surname, Gender gender) {
        super(pId, name, surname, gender);
    }

    @Override
    String saySpeech() {
        return "Dagixvritavt kochebs!!!";
    }
}
