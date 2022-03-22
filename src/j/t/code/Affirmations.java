package j.t.code;

import java.util.ArrayList;
import java.util.List;

public class Affirmations {

    //Instance Variables
    private List<String> affirmationsList = new ArrayList<>();

    //Getters
    public List<String> getAffirmationsList() {
        affirmationsList.add("You are intellectual");
        return affirmationsList;
    }

    //Setters
    public void setAffirmationsList(List<String> affirmationsList) {
        this.affirmationsList = affirmationsList;
    }

    //Method
    public List<String> listCreator(String personsAffirmation) {
        affirmationsList.add(personsAffirmation);
        return affirmationsList;
    }


}
