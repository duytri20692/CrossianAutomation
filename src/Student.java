import java.util.*;

public class Student {
    String name;
    Map<String, Double> scores;
    double average;

    public Student(String name) {
        this.name = name;
        this.scores = new LinkedHashMap<>();
    }

    public void calculateAverage() {
        double sum = 0;
        for (double score : scores.values()) {
            sum += score;
        }
        this.average = sum / scores.size();
    }
}