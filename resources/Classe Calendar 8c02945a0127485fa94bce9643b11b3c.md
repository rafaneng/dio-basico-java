# Classe Calendar

Já na JDK 1.1 foi observada a necessidade de facilitar alguns recursos que a class Date oferecia.

Sendo assim, a classe **Calendar** foi criada.

Com isso uma série de métodos e construtores da classe Date foi depreciada. Por exemplo o construtor **Date(int year, int month, int date).**

**Calendar** é uma classe abstrata que provê métodos para converter data entre um instante específico.

O Calendar possui alguns campos específicos para manipulação como MONTH, YEAR, HOUR etc.

Capturando o instante atual com Calendar:

```java
import java.util.Calendar;

/**
 *  Exemplo de utilização da classe Calendar
 */
public class Exemplo005 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println(agora);
        /*  java.util.GregorianCalendar[
                time=1563147161361,
                areFieldsSet=true,
                areAllFieldsSet=true,
                lenient=true,
                zone=sun.util.calendar.ZoneInfo[
                    id="America/Sao_Paulo",
                    offset=-10800000,
                    dstSavings=3600000,
                    useDaylight=true,
                    transitions=129,
                    lastRule=java.util.SimpleTimeZone[
                        id=America/Sao_Paulo,
                        offset=-10800000,
                        dstSavings=3600000,
                        useDaylight=true,
                        startYear=0,
                        startMode=3,
                        startMonth=10,
                        startDay=1,
                        startDayOfWeek=1,
                        startTime=0,
                        startTimeMode=0,
                        endMode=3,
                        endMonth=1,
                        endDay=15,
                        endDayOfWeek=1,
                        endTime=0,
                        endTimeMode=0
                    ]
                ],
                firstDayOfWeek=1,
                minimalDaysInFirstWeek=1,
                ERA=1,
                YEAR=2019,
                MONTH=6,
                WEEK_OF_YEAR=29,
                WEEK_OF_MONTH=3,
                DAY_OF_MONTH=14,
                DAY_OF_YEAR=195,
                DAY_OF_WEEK=1,
                DAY_OF_WEEK_IN_MONTH=2,
                AM_PM=1,
                HOUR=8,
                HOUR_OF_DAY=20,
                MINUTE=32,
                SECOND=41,
                MILLISECOND=361,
                ZONE_OFFSET=-10800000,
                DST_OFFSET=0
             ]
        */
    }
}
```

### Manipulando datas

```java
import java.util.Calendar;

/**
 *  Exemplo de utilização da classe Calendar
 */
public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Sun Jul 14 20:50:31 BRT 2019

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Tue Oct 29 20:50:31 BRT 2019

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Fri Oct 29 20:50:31 BRT 2021

    }
}
```

### Imprimindo datas e horas

Aqui vão algumas maneiras de se converter o resultado de um objeto Calendar

```java
import java.util.Calendar;

/**
 *  Algumas conversões de data
 */
public class Exemplo007 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2019

        System.out.printf("%tF\n", agora);
        //2019-07-14

        System.out.printf("%tD\n", agora);
        //07/14/19

        System.out.printf("%tr\n", agora);
        //08:58:11 PM

        System.out.printf("%tT\n", agora);
        //20:58:11

    }
}
```