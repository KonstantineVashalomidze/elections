package election;

public class NikaMelia extends Candidate{
    public NikaMelia(int pId, String name, String surname, Gender gender) {
        super(pId, name, surname, gender);
    }

    @Override
    String saySpeech() {
        return "Misha gaaajvi ra :/";
    }
}
