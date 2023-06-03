package election;

public abstract class Candidate extends Person {


    public Candidate(int pId, String name, String surname, Gender gender){
        super(pId, name, surname, gender);
        this.gender = gender;
    }

    abstract String saySpeech();


    @Override
    public String toString(){

        return super.toString();
    }


}
