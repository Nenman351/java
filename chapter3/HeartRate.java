package chapter3;

import java.time.LocalDate;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    public HeartRate(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
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

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge(){
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public int getMaximumHeartRate(){
        return 220 - (LocalDate.now().getYear() - yearOfBirth);
    }

    public String getDateOfBirth(){
        return (yearOfBirth+ ":" + monthOfBirth + ":" + dayOfBirth);
    }

    public int getTargetHeartRate1(){
        return (int) (0.5 * getMaximumHeartRate());
    }

    public int getTargetHeartRate2(){
        return (int) (0.8 * getMaximumHeartRate());
    }

}
