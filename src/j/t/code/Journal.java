package j.t.code;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Journal {

    //TODO: allow user and program itself to access journal files by date or file name (refer to 17 File IO Writing lecture final).
    //      Print out all journal entries requested by user using for each loop

    //PrintWriter

    //Instance Variables
    private File journal;

    //Date Format
    DateTimeFormatter americanDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    String americanDate = LocalDate.now().format(americanDateFormat);

    //Time Format
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    String timeFormat = LocalTime.now().format(timeFormatter);

    //Constructor
    public Journal(String journalFile) {
        this.journal = new File(journalFile);
    }

    //Create Journal Entry
    public void createNewJournal() {


        //Create Journal File

        System.out.println();
        System.out.print("What is the title of your journal entry? >>> ");
        String journalFileName = Interaction.personInput.nextLine();
        String journalFilePath = "C:/Users/ruppj/IdeaProjects/Wellness/Journal Entries/";
        File newJournalFile = new File(journalFilePath + journalFileName);

        try {
            newJournalFile.createNewFile();
            System.out.println();
            System.out.println("Journal Title: " + newJournalFile.getName());
            System.out.println("Path: " + newJournalFile.getAbsolutePath());
        } catch(IOException iox) {
            System.out.println("Oops, " + iox.getMessage());
        }

        //Write to Created Journal File
        System.out.println();
        System.out.println("It is " + americanDate + " @ " + timeFormat + " ... ");
        System.out.print("What's on your mind >>> ");
        String journalEntry = Interaction.personInput.nextLine();

        try (PrintWriter journalWriter = new PrintWriter(newJournalFile)) {
            journalWriter.write(americanDate + " @ " + timeFormat + "\n" + journalEntry + "\n\n");
        } catch (FileNotFoundException fnf){
            System.out.println("Something Went Wrong:" + fnf.getMessage());
        }

    }

    //Write Journal
    /*private void writeJournalEntry(File journalFile) {
        System.out.println();
        System.out.println("It is " + americanDate + " @ " + timeFormat + " ... ");
        System.out.print("What's on your mind >>> ");
        String journalEntry = Interaction.personInput.nextLine();

        try (PrintWriter journalWriter = new PrintWriter(journalFile)) {
            journalWriter.write(americanDate + " @ " + timeFormat + "\n" + journalEntry + "\n\n");
        } catch (FileNotFoundException fnf){
            System.out.println("Something Went Wrong:" + fnf.getMessage());
        }
    }
    */

    //Log Journal
    /*public void logJournalEntry(String journalEntry) {

        try (PrintWriter journalWriter = new PrintWriter(new FileOutputStream(journal,true),true)) {

            journalWriter.write(americanDate + " @ " + timeFormat + "\n" + journalEntry + "\n\n");

        } catch (FileNotFoundException fnf){
            System.out.println("Something Went Wrong:" + fnf.getMessage());
        }
    }
    */

}
