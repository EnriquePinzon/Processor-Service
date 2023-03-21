package com.example.taller.procesador.archivo.Model;

public class Data {
    private String date;
    private String injuryLocation;
    private String gender;
    private String ageGroup;
    private String IncidentType;
    private String daysLost;
    private String plant;

    private String reportType;
    private String shift;
    private String department;
    private String incidentCost;
    private String wkDay;
    private String month;
    private String year;

    public Data(String date, String injuryLocation, String gender, String ageGroup, String incidentType, String daysLost, String plant, String reportType, String shift, String department, String incidentCost, String wkDay, String month, String year) {
        this.date = date;
        this.injuryLocation = injuryLocation;
        this.gender = gender;
        this.ageGroup = ageGroup;
        IncidentType = incidentType;
        this.daysLost = daysLost;
        this.plant = plant;
        this.reportType = reportType;
        this.shift = shift;
        this.department = department;
        this.incidentCost = incidentCost;
        this.wkDay = wkDay;
        this.month = month;
        this.year = year;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public String getReportType() {
        return reportType;
    }
}
