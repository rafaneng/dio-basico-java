# Laços de repetição

## For

```java
public class For {

  public static void main(String[] args) {

    for (int i = 0; i <= 10; i = i + 1) {
      System.out.println("I=" + i);
    }
		/*
		I=0
		I=1
		I=2
		I=3
		I=4
		I=5
		I=6
		I=7
		I=8
		I=9
		I=10
		*/

    for (int x = 0; x <= 5; x++)
      System.out.println("X=" + x);
		/*
		X=0
		X=1
		X=2
		X=3
		X=4
		X=5
		*/
    
  }
}
```

## While

```java
public class While {

  public static void main(String[] args) {

    var x = 0;

    //Testa a condição antes
    while (x < 1) {
      System.out.println("Dentro do while...");
      x++;
    }
		// Dentro do while...

    var y = 0;

    //Testa a condição depois
    do {
      System.out.println("Dentro do do/while...");
    } while (y++ < 1);
  }
	// Dentro do do/while...
	// Dentro do do/while...

}
```