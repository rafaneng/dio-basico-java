# Trabalhando com datas

## java.util.Date

Antes de qualquer coisa, vamos definir aqui o ponto
que estamos.

A implementação do java.util.Date está na JDK desde
sua versão 1.0

Ou seja... É de se esperar que algumas coisas não se mostrem tão interessantes nos dias atuais, dado a sua
idade.

Nesse primeiro momento, vamos ver como podemos trabalhar com a manipulação de datas a Classe java.util.Date do Java.

E o nosso primeiro passo é dar uma olhada na documentação oficial.

Vamos usar como referência o Java 8

[https://docs.oracle.com/javase/8/docs/api/java/util/Date.html](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

### Construtores

E para começar a falar sobre o Java Date, vamos falar
sobre seus construtores. São eles:

```java
Date()

// depreciado
Date(int year, int month, int date)

// depreciado
Date(int year, int month, int date, int hrs, int min)

// depreciado
Date(int year, int month, int date, int hrs, int min, int sec)

Date(long date)

// depreciado
Date(String s)
```

### Date()

Este construtor vai alocar um objeto da classe Date e o
**inicializará com o milissegundo mais próximo** do período da sua execução.

```java
import java.util.Date;

public class Exemplo001 {

    public static void main(String[] args) {

        Date novaData = new Date();

        System.out.println(novaData);
				// Thu Jul 08 09:55:08 BRT 2020

    }

}
```

### Date(long date)

Diferente do construtor anterior, esse construtor espera
que você passe os milissegundos com base padrão de
tempo (epoch) que usa como referência **1 de janeiro
de 1970 00:00:00.**

### Epoch

“O epoch timestamp é um padrão largamente aceito
para representar uma data como um inteiro 32-bits a
partir do início do **Unix Epoch..**.”
*Tradução feita por Marco Paulo Ollivier do Livro “Software Development: Na Open Source Approach” escrito por Allen Tucker, Ralph Morelli e Chamindra de Silva. Página 163. Editora CRC Press*

Vamos testar com base no **System.currentTimeMillis()**
Esse método estático vai nos retornar o milissegundo
mais próximo de sua execução com base no Sistema
Operacional.

```java
import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019

    }
}
```

## Métodos úteis

Alguns métodos da classe Date são muito úteis e serão
usados com frequência durante a manipulação de datas.

[Tabela](Trabalhando%20com%20datas%2032998b598ecf410884cd27405b3e1de2/Untitled%20Database%20e967ce38e8db4a6f8b46f1846e32e1f8.csv)

### after e before

```java
import java.util.Date;

/**
 *  Exemplo de utilização dos metodos after e before
 */
public class Exemplo003 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true

    }
}
```

### compareTo e equals

```java
import java.util.Date;

/**
 *  Exemplo de utilização dos metodos compareTo e equals
 */
public class Exemplo004 {
    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1

        System.out.println(compareCase2); // 1

        System.out.println(compareCase3); // 0

    }
}
```

### from e toInstant

**Classe Instant**

- Surgiu na JDK 1.8;
- Imutável e Thread safe;
- Modela um ponto instantâneo de uma linha do tempo;
- Indicado para gravar marcações temporais em eventos da sua aplicação.

```java
import java.time.Instant;
import java.util.Date;

/**
 *  Exemplo de conversão entre Date e Instant
 */
public class Exemplo005 {
    public static void main(String[] args) {

        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
    }
}
```