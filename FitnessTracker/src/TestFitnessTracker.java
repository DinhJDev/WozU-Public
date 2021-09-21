public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker fitness1 = new FitnessTracker();
        FitnessTracker fitness2 = new FitnessTracker("push-ups");
        FitnessTracker fitness3 = new FitnessTracker("running", 10, "09-20-2021");
        System.out.println("Activity: " + fitness1.getActivity() + " Minutes: " + fitness1.getMinutes() + " Date: " + fitness1.getDate());
        System.out.println("Activity: " + fitness2.getActivity() + " Minutes: " + fitness2.getMinutes() + " Date: " + fitness2.getDate());
        System.out.println("Activity: " + fitness3.getActivity() + " Minutes: " + fitness3.getMinutes() + " Date: " + fitness3.getDate());
    }
}
