package entities;

import java.time.LocalDate;
import java.util.Date;

public class Summary {
    private Date LocalDate;
    private int activeProjects;
    private LocalDate date;
    private Summary summaries;
    private Group groups;
    private Course courses;
    private int openActivities;
    private int closedActivities;
    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
