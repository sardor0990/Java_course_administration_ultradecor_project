package org.lira.javacourses.model;

public enum CourseType {
    SNEAK_IN("Sneak In"),
    BEGINNER("Beginner"),
    EXPERIENCED("Experienced"),
    EXPERT("Expert");

    private final String displayName;

    CourseType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
