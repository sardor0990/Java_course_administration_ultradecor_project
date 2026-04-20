package org.lira.javacourses.app;

import org.lira.javacourses.service.DataService;
import org.lira.javacourses.service.DataServiceImpl;
import org.lira.javacourses.ui.ConsoleUI;
import org.lira.javacourses.ui.UI;

public class App {
    private static App instance;
    private DataService dataService;
    private UI ui;

    private App(){

    }

    public static App getInstance(){
        if(instance == null){
            instance = new App();
        }
        return instance;
    }

    public void execute(String[] args){
        this.dataService = new DataServiceImpl();

        this.ui = new ConsoleUI();

        this.ui.setDataService(this.dataService);

        this.ui.show();
    }
}
