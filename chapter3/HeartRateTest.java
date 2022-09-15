package chapter3;

public class HeartRateTest {
    public static void main(String[] args) {
        HeartRate hr = new HeartRate("Nenman", "Jonathan", 12, 28, 2000);

        System.out.printf("FirstName is %s%n",hr.getFirstName());
        System.out.printf("LastName is %s%n", hr.getLastName());
        System.out.printf("Maximum heart rate is %d%n", hr.getMaximumHeartRate());
        System.out.printf("Date of birth is %s%n", hr.getDateOfBirth());
        System.out.printf("Age is %d%n", hr.getAge());
        System.out.printf("Target heart rate %d%n", hr.getTargetHeartRate1());
        System.out.printf("Target heart rate %d%n", hr.getTargetHeartRate2());
    }



}
