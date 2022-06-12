package Lectures.IntroToOOP;

public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "Paused";
    }
}
