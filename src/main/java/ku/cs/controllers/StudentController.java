package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;

public class StudentController {
    @FXML
    private Label nameLabel;
    @FXML
    private Label scoreLabel;


    @FXML
    public void initialize() {
        Student student = new Student("6710405133", "Pheeraphat Jumnong");
        student.addScore(60);
        showStudent(student);
    }

    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
        scoreLabel.setText(String.format("%.2f", student.getScore()));
    }
}