package com.lxi.QuestionManagement.entity;

import java.util.List;
import jakarta.persistence.*;
@Entity
@Table(name = "physical_dimension")
public class PhysicalDimension {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String yesNoQuestion; // e.g., "Have you finished that task?"
    
    @ElementCollection
    private List<ExerciseTask> exerciseTasks; // List of exercise tasks

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYesNoQuestion() {
        return yesNoQuestion;
    }

    public void setYesNoQuestion(String yesNoQuestion) {
        this.yesNoQuestion = yesNoQuestion;
    }

    public List<ExerciseTask> getExerciseTasks() {
        return exerciseTasks;
    }

    public void setExerciseTasks(List<ExerciseTask> exerciseTasks) {
        this.exerciseTasks = exerciseTasks;
    }
    
    @Embeddable
    public static class ExerciseTask {
        private String name;
        private String level; // e.g., "beginner", "intermediate", "advanced"
        
        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }
    }
}
