package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (ºF -32) x5/9 =ºC
        final int a = 32;
        final double b= 5/9.0;
        double f = 59;
        double c = (f-a) * b;

            System.out.println(" A temperatura convertida é "+ c  +"ºc");


    }
}
