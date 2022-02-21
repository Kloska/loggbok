import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LogEntry implements Serializable{
    private Date createdAt;
    private Date updatedAt;
    private String message;
    // Optional ArrayList<LogEntry> history;

    public LogEntry(String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    //gör till arraylist och spara till fil
    public ArrayList input(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Skriv in ditt namn, tryck enter och skriv sedan din log för idag");
        String name = myObj.nextLine();
        String log = myObj.nextLine();
        // test
        System.out.println("Datum" + );
        System.out.println("Namn: " + name);
        System.out.println("Log: " + log);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LogEntry{" + "createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", message='" + message + '\'' + '}';
    }

    // Optional: add old version to history
    public void update(String newMessage) {

    }
}