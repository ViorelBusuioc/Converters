public class Challenge {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters (int heightInch) {

        return heightInch * 2.54;
    }


    public static double convertToCentimeters (int heightInFeet, int heightInch) {

        double conversionFeetToInch = (heightInFeet * 12);
        double conversionInchTotal = conversionFeetToInch + heightInch;

        return convertToCentimeters((int)conversionInchTotal);
    }
}
