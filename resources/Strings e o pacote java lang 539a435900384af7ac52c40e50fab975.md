# Strings e o pacote java.lang

## String

É uma sequencia de caracteres do pacote java.lang

```java
public class Strings {

  public static void main(String[] args) {

    var nome = "Rafael";
    var sobreNome = "Santos";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
		// Rafael
    System.out.println("Nome do cliente : " + nome);
		// Nome do cliente : Rafael
    System.out.println("Nome completo do cliente : " + nomeCompleto);
		// Nome completo do cliente : RafaelSantos
    var string = new String(" Minha  String ");

    System.out.println("Char na posição : " + string.charAt(5));
		// Char na posição : a
    System.out.println("Quantidade=" + string.length());
		// Quantidade=15
    System.out.println("Sem Trim [" + string + "]");
		// Sem Trim [ Minha  String ]
    System.out.println("Com Trim [" + string.trim() + "]");
		// Com Trim [Minha  String]
    System.out.println("Lower " + string.toLowerCase());
		// Lower  minha  string 
    System.out.println("Upper " + string.toUpperCase());
		// Upper  MINHA  STRING 
    System.out.println("Contém M? " + string.contains("M"));
		// Contém M? true
    System.out.println("Contém X? " + string.contains("X"));
		// Contém X? false
    System.out.println("Replace " + string.replace("n", "$"));
		// Replace  Mi$ha  Stri$g 
    System.out.println("Equals? " + string.equals(" Minha String "));
		// Equals? false
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
		// EqualsIgnoreCase? false
    System.out.println("Substring(1,6)=" + string.substring(1, 6));
		// Substring(1,6)=Minha

  }
}
```

### StringFormat

```java
public class StringFormat {

  public static void main(String[] args) {

    var nome = "Rafael";
    var sobreNome = "Santos";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
		// Rafael
    System.out.println("Nome do cliente : " + nome);
		// Nome do cliente : Rafael
    System.out.println("Nome completo do cliente : " + nomeCompleto);
		// Nome completo do cliente : RafaelSantos
    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);

    System.out.println(mensagem);
		// O cliente Rafael possui sobre nome Santos
    System.out.println(String.format("Numero %.2f ", 1.2375d));
		// Numero 1.24
  }
}
```

### StringBuilder

```java
public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Rafael";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append("Santos"));
		// RafaelSantos

    final var reverse = builder.reverse();

    System.out.println(reverse);
		// sotnaSleafaR

    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);
		// #sotnaSleafaR#

  }

}
```