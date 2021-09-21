public class FitnessTracker {
    private int minutes;
    private String activity;
    private String date;

    FitnessTracker() {
        activity = "running";
        minutes = 0;
        date = "01/01/2021";
    }
    FitnessTracker(String activity) {
        this.activity = activity;
        this.minutes = 0;
        this.date = "";
    }
    FitnessTracker(String activity, int minutes, String date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getActivity() {
        return activity;
    }

    public String getDate() {
        return date;
    }
}
