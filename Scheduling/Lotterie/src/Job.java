public class Job {
    private static int count = 0;
    private int id = 0;

    public Job() {
        id = count++;
    }

    public int getId() {
        return id;
    }
}
