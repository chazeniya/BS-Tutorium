import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Lottery<Job> {
    private Queue<AssessedJob> queue = new LinkedList<>(); // ausführbare Jobs
    private int currentTickets = 0; // Anzahl der aktuellen Lose
    private Random random = new Random();

    public synchronized void addJob(Job job, int tickets) {
        if (tickets <= 0) {
            throw new IllegalArgumentException("no tickets");
        }

        this.currentTickets += tickets;
        this.queue.add(new AssessedJob(job, tickets));
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public synchronized Job next2Run() {
        if (this.queue.size() == 0) {
            return null;
        }

        int ticket = random.nextInt(currentTickets);
        Iterator<AssessedJob> iter = this.queue.iterator();

        while (iter.hasNext()) {
            AssessedJob assessedJob = iter.next();
            if (assessedJob.tickets > ticket) {
                // Job hat gewonnen und wird ausgeführt
                iter.remove();
                this.currentTickets -= assessedJob.tickets;
                return assessedJob.job;
            }

            ticket -= assessedJob.tickets;
        }

        return null;
    }

    private class AssessedJob {
        private final int tickets;
        private final Job job;

        private AssessedJob(Job job, int tickets) {
            this.tickets = tickets;
            this.job = job;
        }
    }
}
