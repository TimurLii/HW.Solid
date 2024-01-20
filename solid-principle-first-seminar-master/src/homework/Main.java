package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        SaveUser userSave = new SaveUser(user);
        userSave.save();

        ReportUser report = new ReportUser(user);
        report.report();

    }
}