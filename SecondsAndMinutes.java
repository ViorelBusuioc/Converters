public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int seconds) {

        if (seconds >= 0) {

            int numberOfHours = seconds / 3600;
            int numberOfMinutes = (seconds % 3600) / 60;
            int numberOfSeconds = seconds % 60;
            return numberOfHours + "h " + numberOfMinutes + "m " + numberOfSeconds + "s";

        } return "Please insert valid minutes or second interval";
    }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            int minToSec = (minutes * 60) + seconds;
            return getDurationString(minToSec);

        }
        return "Please insert valid minutes or second interval";
    }
}
