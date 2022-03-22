package j.t.code;

public class Person {

    //Instance Variables
    private String name;
    private String dateOfBirth;
    private String mood;

    //Getter
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMood() {
        return mood;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    //Default Constructor
    public Person() {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    //Constructor
    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

}
