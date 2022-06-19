package Lectures.DesingPatterns.CreationalDP.Builder.Implementation1;

public class Client {
    public static void main(String[] args) {
        Parameter p = new Parameter();
        p.scienceMarks = 80;
        p.name = "Sumit";
        UserExam userExam;
        try {
            userExam = new UserExam(p);
            System.out.println("Object created Successfully!!");
        } catch (Exception exception) {
            System.out.println("Some parameters are Wrong");
        }
    }
}
