package edu.wctc;

public class Hobby {
    private Activity activity;
    private int hoursPerWeek;
    private static final long serialVersionUID = 1L;

    private Priority priority;

    public Hobby(Activity activity, int hoursPerWeek, Priority priority) {
        this.activity = activity;
        this.hoursPerWeek = hoursPerWeek;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("%s\n\tHours/Week: %d\n\tPriority: %s", activity, hoursPerWeek, priority);
    }
}
