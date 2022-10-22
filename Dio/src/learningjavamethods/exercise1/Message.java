package learningjavamethods.exercise1;

import java.time.LocalTime;

public class Message {

    public static void message() {
        final LocalTime now = LocalTime.now();
        final LocalTime noon = LocalTime.of(11,59);
        final LocalTime afternoon = LocalTime.of(17,59);
        final LocalTime night = LocalTime.of(5,59);

        if (now.isAfter(night) && now.isBefore(noon)) {
            System.out.println("Bom dia!");
        } else if(now.isAfter(noon) && now.isBefore(afternoon)) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite");
        }
    }
}
