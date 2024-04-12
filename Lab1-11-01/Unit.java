public class Unit
{
    public static void main(String[] args)
    {
        double meter = 1000.0;
        double feet = meter * 3.28084;
        System.out.println("Meter: " + meter);
        System.out.println("Feet: " + feet);
        double km = meter / 1000.0;
        double mile = km / 1.60934;
        System.out.println("Kilometer: " + km);
        System.out.println("Mile: " + mile);
        double cm = meter * 100;
        double inch = cm / 2.54;
        System.out.println("Centimeter: " + cm);
        System.out.println("Inch: " + inch);
    }
}