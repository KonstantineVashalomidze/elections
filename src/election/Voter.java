package election;

public class Voter extends Person {
    private Status status;
    private int age;

    public Voter(int pId, String name, String surname, Gender gender, Status status, int age){
        super(pId, name, surname, gender);
        this.status = status;
        this.age = age;

    }


    @Override
    public String toString(){
        return super.toString() + " / STATUS={" + this.status + "} / AGE={" + this.age + "}";
    }


}

