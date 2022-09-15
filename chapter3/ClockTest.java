package chapter3;

public class ClockTest {
        public static void main(String[] args){
            Clock clock1 = new Clock(23, 59, 59);


            System.out.printf("%d : %d : %d", Clock.getHour(), Clock.getMinute(), Clock.getSecond());
        }

    }
