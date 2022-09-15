package chapter3;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private double heightInInches;
    private double weightInPounds;

    public HealthRecords(String firstName, String lastName, String gender, int year, int month, int day, double heightInInches, double weightInPounds ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.day = day;
        this.heightInInches = heightInInches;
        this. weightInPounds = weightInPounds;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public int getAge(){
        return LocalDate.now().getYear() - year;
    }
    public int getMaximumHeartRate(){
        return 220 - (LocalDate.now().getYear() - year);
    }
    public String getDateOfBirth(){
        return (year+ ":" + month + ":" + day);
    }
    public int getTargetHeartRate1(){
        return (int) (0.5 * getMaximumHeartRate());
    }
    public int getTargetHeartRate2(){
        return (int) (0.8 * getMaximumHeartRate());
    }


    public int getBodyMassIndex(){
        return (int) ((weightInPounds * 703)/ (heightInInches * heightInInches));
    }
}
