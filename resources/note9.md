# Introdução a condicionais

## If

```java
public class IF {

  public static void main(String[] args) {

    final var condicao = false;

    if (condicao) {
      System.out.println("A condição é verdadeira");
    } else {
      System.out.println("A condição é falsa");
    }
		// A condição é falsa

    if (condicao)
      System.out.println("Uma única linha...");

    final var ternario = condicao ? "é verdadeira" : "é falsa";

    System.out.println(ternario);
		// é falsa
  }
}
```

## Operadores

### Igualdade

```java
public class Igualdade {

  public static void main(String[] args) {

    final var numero = 11;

    if (numero == 10) {
      System.out.println("O número é 10");
    } else {
      System.out.println("O número  não é 10");
    }
		// O número  não é 10

    if (numero != 10) {
      System.out.println("O número não é 10");
    } else {
      System.out.println("O número é 10");
    }
		// O número não é 10

    final var letra = "B";

    if ("A".equals(letra)) {
      System.out.println("É a letra A");
    }

    if (!letra.equals("A")) {
      System.out.println("Não é a letra A");
    }
		// Não é a letra A
  }
}
```

### Matemáticos

```java
public class Matematicos {

  public static void main(String[] args) {

    System.out.println(0 + 1);
		// 1

    System.out.println(3 - 1);
		// 2

    System.out.println(3 * 1);
		// 3

    System.out.println(8 / 2);
		// 4

    System.out.println(8 % 2); //módulo - resto da divisão
		// 0

    var numero = 10;
    numero *= 2;
    System.out.println(numero);
		// 20

  }
}
```

### Relacionais

```java
public class Relacionais {

  public static void main(String[] args) {

    final var numero = 6;

    if (numero > 20) {
      System.out.println("O número é maior que 20");
    } else if (numero >= 10) {
      System.out.println("O número é maior ou igual a 10");
    } else if (numero <= 5) {
      System.out.println("O número é menor ou igual que 5");
    } else {
      System.out.println("nenhuma da anteriores");
    }
		// nenhuma da anteriores
  }
}
```

### Lógicos

```java
public class Logicos {

  public static void main(String[] args) {

    final var numero = 2;
    final var letra = "A";

    // Sort Circuit (ou seja, se a primeira condição for falsa, ele nem verifica as seguintes)
    if (numero < 5 && letra.equals("A")) {
      System.out.println("Atendeu a condição");
    }
		// Atendeu a condição

    if (numero < 5 || letra.equals("A")) {
      System.out.println("Atendeu a outracondição");
    }
		// Atendeu a outracondição

    if ((10 - 5) > 1 && (5 - 3) > 1) {
      System.out.println("Lógica maluca...");
    }
		// Lógica maluca...

    // Non Sort Circuit
    /*if (verifica(15) | verifica("A")) {
        System.out.println("OK");
    } else {
        System.out.println("Não OK");
    }*/

  }

  private static boolean verifica(String letra) {
    System.out.println("Verificando letra...");
    return letra.equals("A");
  }

  private static boolean verifica(Integer numero) {
    System.out.println("verificando numero...");
    return numero > 10;
  }
}
```

### Incremento

```java
public class Incremento {

  public static void main(String[] args) {

    var numero = 1;

    System.out.println(++numero);
		// 2

    var variavel = 10;

    System.out.println(variavel--);
		// 10
    System.out.println(variavel);
		// 9
  }
}
```