package entities;

import java.time.LocalDate;
import java.util.Date;

public class Summary {
    private Date LocalDate;
    private int activeProjects;
    private LocalDate date;


    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
