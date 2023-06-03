package election;

public abstract class Person {
    private int pId;
    private String name;
    private String surname;

    protected Gender gender;
    Person(int pId, String name, String surname, Gender gender){
        this.pId = pId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }


    @Override
    public String toString(){

        return "ID={" + this.pId + "} / NAME={" + this.name + "} / SURNAME={" + this.surname + "} / GENDER={" + this.gender + "}";
    }

}
