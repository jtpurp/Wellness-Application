package j.t.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Interaction {

    //Instance Variables
    private Menu menu;

    //Instantiations
    private static Person person = new Person();
    private static Affirmations affirmations = new Affirmations();
    private static Journal journal = new Journal("journal.txt"); //TODO: Figure out how to update files name to date created

    //Scanner
    public static Scanner personInput = new Scanner(System.in);

    //psvm
    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        Interaction interaction = new Interaction(menu);
        interaction.run();
    }

    //What Would You Like To Do Menu
    private static final String JOURNAL_MENU = "Journal";
    private static final String MANIFESTATION_MENU = "Manifest";
    private static final String AFFIRMATION_MENU = "Affirm";
    private static final String[] MAIN_MENU_OPTIONS = {JOURNAL_MENU, AFFIRMATION_MENU, MANIFESTATION_MENU};

    //Journal Submenu
    private static final String NEW_JOURNAL = "New Journal";
    private static final String READ_JOURNALS = "Read Journals";
    private static final String REMOVE_JOURNAL = "Remove Journal";
    private static final String[] JOURNAL_SUBMENU_OPTIONS = {NEW_JOURNAL, READ_JOURNALS, REMOVE_JOURNAL};

    //Manifestation Submenu
    private static final String NEW_MANIFESTATION = "New Manifestation";
    private static final String READ_MANIFESTATIONS = "Read Manifestations";
    private static final String REMOVE_MANIFESTATION = "Remove Manifestation";
    private static final String[] MANIFESTATION_SUBMENU_OPTIONS = {NEW_MANIFESTATION, READ_MANIFESTATIONS, REMOVE_MANIFESTATION};

    //Affirmation Submenu
    private static final String NEW_AFFIRMATION = "New Affirmation";
    private static final String LIST_AFFIRMATIONS = "List Affirmations";
    private static final String REMOVE_AFFIRMATION = "Remove Affirmation";
    private static final String[] AFFIRMATION_SUBMENU_OPTIONS = {NEW_AFFIRMATION, LIST_AFFIRMATIONS, REMOVE_AFFIRMATION};

    //Constructor
    public Interaction(Menu menu) {
        this.menu = menu;
    }

    //Run
    public void run() {
        //Greeting
        System.out.println("Hello :)");
        //Generate Random Affirmation
        //figure out random number generator
        System.out.println(affirmations.getAffirmationsList().get(0));

        Scanner personInput = new Scanner(System.in);

        //TODO: put in Person Class
        //Creation of Person
//        while(person.getName() == null && person.getDateOfBirth() == null) {
//            while (person.getName() == null) {
//                System.out.print("What is your name? >>> ");
//                String personName = personInput.nextLine();
//                System.out.print("You're name is " + personName + "? (Y/N) >>> ");
//                String correctName = personInput.nextLine();
//                if (correctName.equals("Y")) {
//                    person.setName(personName);
//                }
//            }
//
//            while (person.getDateOfBirth() == null) {
//                System.out.print("What is your date of birth? (YYYY/MM/DD) >>> ");
//                String personDOB = personInput.nextLine();
//                //Check DOB correct format
//
//                System.out.print("You're date of birth is " + personDOB + "? (Y/N) >>> ");
//                String correctDOB = personInput.nextLine();
//                if (correctDOB.equals("Y")) {
//                    person.setDateOfBirth(personDOB);
//                }
//            }
//        }

        //Menu
        boolean run = true;
        while (run) {
            System.out.println("What would you like to do?");
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            //Journal Menu
            if (choice.equals(JOURNAL_MENU)) {
                choice = (String) menu.getChoiceFromOptions(JOURNAL_SUBMENU_OPTIONS);
                //Journal Submenu
                if (choice.equals(NEW_JOURNAL)) {
                    journal.createNewJournal();
                } else if (choice.equals(READ_JOURNALS)) {

                } else if (choice.equals(REMOVE_JOURNAL)) {

                }
            //Manifestation Menu
            } else if (choice.equals(MANIFESTATION_MENU)) {
                choice = (String) menu.getChoiceFromOptions(MANIFESTATION_SUBMENU_OPTIONS);
                //Manifestation Submenu
                if (choice.equals(NEW_MANIFESTATION)) {

                } else if (choice.equals(READ_MANIFESTATIONS)) {

                } else if (choice.equals(REMOVE_MANIFESTATION)) {

                }
            //Affirmation Menu
            } else if (choice.equals(AFFIRMATION_MENU)) {
                choice = (String) menu.getChoiceFromOptions(AFFIRMATION_SUBMENU_OPTIONS);
                //Affirmation Submenu
                if (choice.equals(NEW_AFFIRMATION)) {

                } else if (choice.equals(LIST_AFFIRMATIONS)) {

                } else if (choice.equals(REMOVE_AFFIRMATION)) {

                }
            }
            run = false;
        }

    }
}
