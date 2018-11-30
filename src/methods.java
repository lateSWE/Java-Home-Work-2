import java.math.*;

public class methods {
    /**
    public static double kelvinToCelsius(double kelvin) {
        double out = kelvin - 217.15;
        return out;
    }
    public static double cubicCmToCubicM(double radius) {
        double out = radius / 1000000;
        return out;
    }
    public  static String greetingPlusAge(String name1, String name2, int age1, int age2){
        int numout = age1 + age2;
        String out = "greetingPlusAge('" + name1 + "', '" + name2 + "', " + age1 + "' " + age2 + ") => " + numout;
        return out;
    }
    public static double delta(double first, double last){
        double out = first - last;
        return out;
    }
     **/

    private static double volume(double radius){
        double out = 4 / 3 * Math.PI * Math.pow(radius, 3);
        return out;
    }
    private static String reverse(String str){
        String out = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            out += str.charAt(i);
        }
        return out;
    }
    private static int count(String str, char c){
        int out = 0;
        for (int i = str.length() - 1; i >= 0; i--){
            if( str.charAt(i) == '$' ) {
                out++;
            }
        }
        return out;
    }
    private static String sjorovare(String str){
        String out = "";

        return  out;
    }


    public static void main(String[] args) {
        System.out.println(volume(10));
        System.out.println(reverse("test"));
        System.out.println(volume(10));
        System.out.println(volume(10));

    }
}
