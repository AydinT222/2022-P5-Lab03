// Lab03v100.java

public class Lab03v100 {
    public static void main(String[] args) {
        // 2 46 40 123
        final int startingValue = 10000123;
        final int startingSeconds = startingValue / 1000;
        System.out.println("Lab03, 100 Point Version");
        System.out.println();
        System.out.println("Starting milli-seconds:\t" + startingValue);
        int hours = startingSeconds / 3600;
        System.out.println("Hours:\t\t\t" + hours);
        int minutes = (startingSeconds % 3600) / 60;
        System.out.println("Minutes:\t\t" + minutes);
        int seconds = (startingSeconds % 3600) % 60;
        System.out.println("Seconds:\t\t" + seconds);
        int milliseconds = startingValue % 1000; // not documented on the lab
        System.out.println("Milliseconds:\t\t" + milliseconds);
    }
}
