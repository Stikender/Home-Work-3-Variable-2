import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");

        int a = 1;
        System.out.println("Значение переменной а с типом int равно " + a);
        byte b = 2;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 3;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 4;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6;
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Exercise 2");
        float a2 = 27.12f;
        System.out.println(a2);
        long b2 = 987678965549L;
        System.out.println(b2);
        double c2 = 2.786;
        System.out.println(c2);
        boolean d2 = 5<2;
        System.out.println(d2);
        short e2 = 569;
        System.out.println(e2);
        int f2 = -159;
        System.out.println(f2);
        short g2 = 27897;
        System.out.println(g2);
        byte h2 = 67;
        System.out.println(h2);

        System.out.println("Exercise 3");
        byte pupilsLudmilaPavlovna = 23;
        byte pupilsAnnaSergeevna = 27;
        byte pupilsEkaterinaAndreevna = 30;
        short paper = 480;
        int totalPupils = pupilsLudmilaPavlovna + pupilsAnnaSergeevna + pupilsEkaterinaAndreevna;
        System.out.println( "На каждого ученика рассчитано " + paper / totalPupils + " листов бумаги");

        System.out.println("Exercise 4");
        byte bottleMakingMachinePerformanceMin = 16;
        bottleMakingMachinePerformanceMin /= 2;
        System.out.println("За 1 минуту работы машина произвела бутылок " + bottleMakingMachinePerformanceMin + " штук.");
        int bottleMakingMachinePerformance20Min = bottleMakingMachinePerformanceMin * 20;
        System.out.println( "За 20 минут работы машина произвела бутылок " + bottleMakingMachinePerformance20Min + " штук." );
        int minutesPerDay = 24 * 60;
        int bottleMakingMachinePerformance1Day = minutesPerDay * bottleMakingMachinePerformanceMin;
        System.out.println( "За 1 сутки работы машина произвела бутылок " + bottleMakingMachinePerformance1Day + " штук." );
        int bottleMakingMachinePerformance3Day = bottleMakingMachinePerformance1Day * 3;
        System.out.println( "За 3 суток работы машина произвела бутылок " + bottleMakingMachinePerformance3Day + " штук." );
        int bottleMakingMachinePerformance30Day = bottleMakingMachinePerformance3Day * 10;
        System.out.println( "За 1 месяц работы машина произвела бутылок " + bottleMakingMachinePerformance30Day + " штук." );

        System.out.println("Exercise 5");



    }
}