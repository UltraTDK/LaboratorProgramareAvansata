package org.SmartCity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reports {
    @Id
    @GeneratedValue
    private int id;
    private String dataRetrieved;


    public Reports(String dataRetrieved) {
        this.dataRetrieved = dataRetrieved;
    }

    public Reports() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDataRetrieved() {
        return dataRetrieved;
    }

    public void setDataRetrieved(String dataRetrieved) {
        this.dataRetrieved = dataRetrieved;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "id=" + id +
                ", dataRetrieved='" + dataRetrieved + '\'' +
                '}';
    }
}
