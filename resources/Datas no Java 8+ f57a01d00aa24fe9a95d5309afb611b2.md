# Datas no Java 8+

O Java 8 veio com uma série de novidades para facilitar o trabalho com Datas.

E a grande melhoria está no pacote java.time que foi herdado do projeto Joda Time.

[https://www.joda.org/joda-time/](https://www.joda.org/joda-time/)

Trabalhar com datas nunca foi tão fácil com esse novo
pacote. Nele destacam-se três classes:

- LocalDate;
- LocalTime;
- LocalDateTime.

Basicamente, o que tínhamos até então eram as classes que vimos até agora: Date e Calendar.
Com o uso constante, elas se mostram confusas e trabalhosas. Além de serem mutáveis.

### LocalDate

LocalDate é uma classe imutável para representar uma data.
Seu formato padrão é yyyy-MM-dd

```java
import java.time.LocalDate;

/**
 * Exemplo de como utilizar LocalDate
 */
public class Exemplo010 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        // 2019-07-14

    }
}
```

```java
import java.time.LocalDate;

/**
 * Exemplo de como manipular LocalDate
 */
public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2019-07-14

        System.out.println(ontem);
        // 2019-07-13

    }
}
```

### LocalTime

**LocalTime** é uma classe imutável que representa um padrão de hora-minuto-segundo.
**LocalTime** pode ser representado até o nível de nanosegundos. Exemplo: 12:22:10:123212345
Sua utilização é similar ao LocalDate

```java
import java.time.LocalTime;

/**
 * Exemplo de como utilizar LocalTime
 */
public class Exemplo012 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

    }
}
```

```java
import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */
public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:55:37.421

    }
}
```

### LocalDateTime

LocalDateTime funciona como uma espécie de junção entre o LocalTime e o LocalDate.

Também é uma classe imutável e você consegue trabalhar com dia e hora de uma só vez.

Você pode manipular a data e hora com precisão de nano segundos.

Exemplo: 2nd October 2007 at 13:45.30.123456789

```java
import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2019-07-17T01:02:28.076

    }
}
```