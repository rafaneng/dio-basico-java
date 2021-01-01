# Tipos primitivos, wrappers, não primitivos e tipagem forte e dinâmica

## Tipos primitivos

Um tipo primitivo não pode ser nulo

Possuem valores default

[Tabela](note5/Untitled%20Database%202845a010b8bf450ea6c9e102723d8f50.csv)

```java
byte b; // 8 bits
byte b1 = 127;
byte b2 = -128;
// byte b3 = 129; //to large

char c; // 16 bits
char c1 = 'A';
char c2 = 15;
// char c3 = 'AA'; //NOK
// char c4 = -100' //NOK

short s; // 16 bits
short s1 = 32767;
short s2 = -32768;

int i = 2147483647; // 32 bits
int i2 = -2147483648; 
// int i3 = -2147483649 // to large

long l = 9223372033854775087L; // 64 bits
long l2 = -9223372036854775808L;
// long l3 = 9223372036854775808L; // to large

// FLUTUANTES

float f = 65f // 32 bits 3.402,823,5 E+38
float f2 = 65.0f;
float f3 = -0.5f // 1.4 E-45

double d = 1024.99 // 64 bits 1.797,693,134,862,315,7 E+308
double d2 = 10.2456; // 4.9 E-324

// BOOLEANO

boolean bo = true;
boolean bo2 = false;
// boolean bo3 = "false" // NOK
// boolean bo4 = 'true'  // NOK
```

## Wrappers

São objetos que representam os primitivos

Antes do JDK 1.5, não era fácil para converter tipos de dados primitivos, por exemplo int, char, float, double em seu objeto equivalente (classes Wrapper) - Integer, Character, Float, Double. O JDK 5 veio com o recurso de conversão automática de tipos de dados primitivos em seu objeto equivalente. Esse recurso é conhecido como autoboxing. O contrário disto é conhecido como unboxing, ou seja, o processo de conversão de objetos em tipos primitivos de dados correspondentes é chamado de unboxing. Exemplo de código para ambos autoboxing e unboxing é mostrado como abaixo:

### **autoboxing**

```java
Integer integer = 9;
```

### **unboxing**

```java
int in = 0;
in = new Integer(9);
```

```java
Byte b1 = 127; // byte
Byte b2 = -128;
Byte nullByte= null;

Character c1 = 'A'; // char
Character c2 = 15;

Short s1 = 32767; // short
Short  s2 = -32768;

Integer i1 = 2147483647; // int
Integer  i2 = -2147483648; 

Long l1 = 9223372033854775087L; // long
Long l2 = -9223372036854775808L;

Float f1 = 65f; // float
Float f2 = 65.0f;
Float f3 = -0.5f;

Double d = 1024.99 // double
Double d2 = 10.2456;

Boolean bo1 = true; // boolean
Boolean bo2 = false;

Boolean bo3 = Boolean.getBoolean("false"); // OK
Boolean bo4 = Boolean.valueOf("true"); // OK
```

## Não Primitivos

```java
String texto = "Meu texto";

Void v; // Tipo válido

Object o = new Object();

Number numero = Integer.valueOf(100);

numero.toString();
```

## Tipagem forte e estática

Tipagem estática significa que os tipos das variáveis são verificados em tempo de compilação.

Linguagens com tipagem estática não permitem ao desenvolvedor alterar o tipo da variável depois de declarada. Geralmente a verificação de tipo é feita em tempo de compilação. Podemos ver o exemplo abaixo na linguagem Java:

```java
public class MyClass {
    public static void main(String args[]) {
      int variavel = 10;

      variavel = "Elton Fonseca"; //error: incompatible types: String cannot be converted to int
    }
}
```

Quando tentamos atribuir um valor de um tipo diferente do que foi declarado na variável temos um erro.

### **Inferência de tipo**

Algumas linguagens estáticas podem fazer a inferência de tipo na declaração de variáveis, mas não permite que o tipo seja alterado após a declaração. Veja esse exemplo na linguagem C#:

```java
using System;

public class Program
{
    public static void Main()
    {
        var variavel = "Treinaweb";

        Console.WriteLine(variavel.GetType()); //System.String

        variavel = 28; //Compilation error (line 11, col 14): Cannot implicitly convert type 'int' to 'string'
    }
}
```

Ele apresenta um erro quando tentamos atribuir um valor de tipo diferente a variável. Isso porque ele apenas realiza a inferência do tipo inicial da variável, depois disso como a linguagem possui características estáticas não permite alterar o tipo.

### **Tipagem Forte**

Linguagens fortemente tipadas não realizam conversões automaticamente:

```java
String texto = "meu texto";
texto = 1000; // NOK

Integer numero = Integer.valueOf("1024");
numero = 512 // OK
```