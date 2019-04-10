import java.util.Random;

public class Scheduler {
    public static void main(String[] args) {
        Lottery<Job> lottery = new Lottery<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            lottery.addJob(new Job(), random.nextInt(9) + 1);
        }

        while (!lottery.isEmpty()) {
            System.out.println(String.format("Prozess %s wurde ausgeführt.", lottery.next2Run().getId()));
        }
    }
}
