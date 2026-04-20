package org.lira.javacourses.ui;

import org.lira.javacourses.service.DataService;

public interface UI {
    void setDataService(DataService dataService);
    void show();
}
