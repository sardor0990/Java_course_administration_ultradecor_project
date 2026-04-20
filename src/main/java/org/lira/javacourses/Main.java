package org.lira.javacourses;

import org.lira.javacourses.app.App;

public class Main {
    public static void main(String[] args){
        App app = App.getInstance();
        app.execute(args);
    }
}
