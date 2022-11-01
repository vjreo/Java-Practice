public class WorkSchedule {
    public static void main(String[] args) {
        int day = 2;  
        boolean holiday = false;
        
        if (holiday) {
            System.out.println("Woohoo! No Work!");
        } else if (day == 6 || day == 7) {
            System.out.println("It's the weekend! No work!!");
        } else {
            System.out.println("Wake up at 7:00 a.m. :(");
        }
        }

    }
