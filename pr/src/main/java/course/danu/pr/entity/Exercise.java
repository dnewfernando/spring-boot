package course.danu.pr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double targetMuscle; 
    private String description;
    private String equipment;

    public Exercise() {

    }

    public Exercise(String nama, double target, String desc, String tool) {
        this.name = nama;
        this.targetMuscle = target;
        this.description = desc;
        this.equipment = tool;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    public double getTarget() {
        return targetMuscle;
    }

    public void setTarget(double target) {
        this.targetMuscle = target;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getTool() {
        return equipment;
    }

    public void setTool(String tool) {
        this.equipment = tool;
    }
}
