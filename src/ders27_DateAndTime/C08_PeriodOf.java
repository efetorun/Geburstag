package ders27_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C08_PeriodOf {
    public static void main(String[] args) {


    //dogumdan bugüne nekadar zaman gecti

    LocalDate bugun= LocalDate.now();
    LocalDate dogumgunu=LocalDate.of(1990,12,26);

    Period gecenSure= Period.between(dogumgunu,bugun);
        System.out.println(gecenSure);

}
}
