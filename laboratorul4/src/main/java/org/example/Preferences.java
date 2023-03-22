package org.example;

import java.util.ArrayList;
import java.util.List;

public class Preferences extends Student {
    List<Project> preferences = new ArrayList<>();
    public Preferences() {
    }


    public Preferences(String name) {
        super(name);
    }


    public Preferences(String name, List<Project> preferences) {
        super(name);
        this.preferences = preferences;
    }


    public List<Project> getPreferences() {
        return preferences;
    }


    public int getNumPreferences() {
        return preferences.size();
    }


    public void add(int indexOf, Project project) {
        this.preferences.add(indexOf, (Project) preferences);
    }
}
