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
        byte totalTinOfPaint = 120;
        byte whitePaintPerClassroom = 2;
        byte brownPaintPerClassroom = 4;
        int totalNumberPaintPerClassroom = whitePaintPerClassroom + brownPaintPerClassroom;
        int totalNumberClassroom = totalTinOfPaint / totalNumberPaintPerClassroom;
        int totalNumberWhitePaint = totalNumberClassroom * whitePaintPerClassroom;
        int totalNumberBrownPaint = totalNumberClassroom * brownPaintPerClassroom;

        System.out.println("В школе, где " + totalNumberClassroom + " классов, нужно " + totalNumberWhitePaint + " банок белой краски и " + totalNumberBrownPaint + " банок коричневой краски.");

        System.out.println("Exercise 6");
        byte weightOneBanana = 80;
        byte banana = 5;
        int totalWeightBanana = weightOneBanana * banana;
        int milkMl = 200;
        byte weight100MlMilk = 105;
        int totalWeightMilk = milkMl / 2 * weight100MlMilk;
        byte iceCream = 2;
        byte weightIceCream = 100;
        int totalWeightIceCream = iceCream * weightIceCream;
        byte eggs = 4;
        byte weightEggs = 70;
        int totalWeightEggs = eggs * weightEggs;
        int totalWeightAllProductGramm = totalWeightBanana + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес спорт-завтрака составляет " + totalWeightAllProductGramm + " грамм.");
        float totalWeightAllProductKg = totalWeightAllProductGramm / 1000f;
        System.out.println("Вес спорт-завтрака составляет " + totalWeightAllProductKg + " килограмм.");

        System.out.println("Exercise 7");
        byte loseWeightAthleteKg = 7;
        long loseWeightAthleteGramm = loseWeightAthleteKg * 1000l;
        System.out.println("Спорсмену необходимо сбросить " + loseWeightAthleteGramm + " грамм.");
        short weightLossGramm = 250;
        long daysWeightLossGramm = loseWeightAthleteGramm / weightLossGramm;
        System.out.println("Если спортсмен будет терять по " + weightLossGramm + " в день, то он похудеет на " + loseWeightAthleteKg + " кг. за " + daysWeightLossGramm + " дней.");
        short weightLossGramm2 = 500;
        long daysWeightLossGramm2 = loseWeightAthleteGramm / weightLossGramm2;
        System.out.println("Если спортсмен будет терять по " + weightLossGramm2 + " в день, то он похудеет на " + loseWeightAthleteKg + " кг. за " + daysWeightLossGramm2 + " дней.");
        long averageDaysWeightLossGramm = (daysWeightLossGramm + daysWeightLossGramm2) / 2;
        System.out.println("В среднем спорстмен сбросит " + loseWeightAthleteKg + " кг. за " + averageDaysWeightLossGramm + " дней.");

        System.out.println("Exercise 8");
        int salaryMasha = 67760;
        int salaryIncreasePercentage = 10;
        int salaryIncreaseAmountMasha = salaryMasha * salaryIncreasePercentage / 100;
        int salaryMashaAfterRaise = salaryMasha + salaryIncreaseAmountMasha;
        byte monthYear = 12;
        int salaryMashaYear = salaryMasha * monthYear;
        int salaryMashaYearAfterRaise = salaryMashaAfterRaise * monthYear;
        int salaryDifferenceMashaAfterRaise = salaryMashaYearAfterRaise % salaryMashaYear;
        System.out.println("Маша теперь получает " + salaryMashaAfterRaise + " рублей. Годовой доход вырос на " + salaryDifferenceMashaAfterRaise + " рублей.");

        int salaryDenic = 83690;
        int salaryIncreaseAmountDenic = salaryDenic * salaryIncreasePercentage / 100;
        int salaryDenicAfterRaise = salaryDenic + salaryIncreaseAmountDenic;
        int salaryDenicYear = salaryDenic * monthYear;
        int salaryDenicYearAfterRaise = salaryDenicAfterRaise * monthYear;
        int salaryDifferenceDenicAfterRaise = salaryDenicYearAfterRaise % salaryDenicYear;
        System.out.println("Денис теперь получает " + salaryDenicAfterRaise + " рублей. Годовой доход вырос на " + salaryDifferenceDenicAfterRaise + " рублей.");

        int salaryKris = 76230;
        int salaryIncreaseAmountKris = salaryKris * salaryIncreasePercentage / 100;
        int salaryKrisAfterRaise = salaryKris + salaryIncreaseAmountKris;
        int salaryKrisYear = salaryKris * monthYear;
        int salaryKrisYearAfterRaise = salaryKrisAfterRaise * monthYear;
        int salaryDifferenceKrisAfterRaise = salaryKrisYearAfterRaise % salaryKrisYear;
        System.out.println("Кристина теперь получает " + salaryKrisAfterRaise + " рублей. Годовой доход вырос на " + salaryDifferenceKrisAfterRaise + " рублей.");

    }
}