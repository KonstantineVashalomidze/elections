package election;

public class DavitTarxanMouravi extends Candidate{
    public DavitTarxanMouravi(int pId, String name, String surname, Gender gender) {
        super(pId, name, surname, gender);
    }

    @Override
    String saySpeech() {
        return "Me var momavali mefe";
    }
}
