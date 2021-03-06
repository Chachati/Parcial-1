package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private int id;
    private LocalDate createdAt;
    private String area;
    private Student leader;
    private ArrayList <Student> members;
    private List<Project> projects;






    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    public int countActiveProjects(){
        for (int i = 0; i< projects.size() ;i++){
            if ()

    }
        return 0;
}
