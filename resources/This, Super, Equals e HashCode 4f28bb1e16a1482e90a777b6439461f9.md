# This, Super, Equals e HashCode

## This

Quando estamos trabalhando com o termo this, no Java, estamos, na verdade, fazendo uma auto
referência.

Esse conceito faz mais sentido quando estamos falando de construtores e métodos, exemplo:

```java
public class Veiculo {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
  
}
```

## Super

Analogamente ao This, quando falamos no Super também estamos fazendo uma referência, mas dessa vez estamos fazendo referência a superclasse em um cenário de herança.

Atenção!
Como em Java, todas as nossas classes herdam de Object, se usamos o super em uma classe que não tem um extends explícito, estamos fazendo referência ao Object.

Vamos mudar um pouco o nosso exemplo.

Primeiro vamos transformar a nossa classe veículo.

Ela vai passar a ser uma classe abstrata e, portanto, não poderá mais ser instanciada.

E também vamos definir que o construtor dessa classe sempre irá esperar o modelo, a marca e o valor venal.

```java
public abstract class Veiculo {

    private String modelo;
    private String marca;

    private double valorVenal;

    public Veiculo(String modelo, String marca, double valorVenal) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    ...
}
```

```java
public class Carro extends Veiculo {

    public Carro(String modelo, String marca, double valorVenal) {
        super(modelo, marca, valorVenal);
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    ...
}
```

## Equals

Como sabemos, todas as classes em Java herdam de Object. E, portanto, tem por padrão alguns métodos.

Um deles é o equals que serve para fazer comparações entre objetos.

Entretanto esse método possui algumas peculiaridades.

Por padrão, quando estamos comparando dois objetos, estamos comparando a referência deles.

Então se instanciarmos dois carros, por mais que eles tenham exatamente as mesmas informações, o Java não é capaz de identificar.

```java
public class Exemplo001 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1.equals(carro2)); //false
    }

}
```

Mas poderíamos sobrescrever o método **equals()** para que nossa lógica funcione do jeito que gostaríamos.
Tenha em mente que é uma boa prática sobrescrever este método.

```java
@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Veiculo comparavel;
        if (obj instanceof Veiculo) {
            comparavel = (Veiculo)obj;
        } else {
            return false;
        }

        if (comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.valorVenal == this.valorVenal) {
            return true;
        }

        return false;
    }
```

## HashCode

Quando falamos em hashCode, precisamos pensar em um código gerado que garanta um caráter único ao nosso objeto.

Essa pode ser uma forma muito interessante para que possamos comparar se realmente um objeto é igual ao outro.

Temos que garantir que a implementação da lógica de hashCode sempre respeite as mesmas regras, pois quando compararmos os nossos objetos, o nosso fator de comparação será ele

Exemplo:

Anteriormente utilizamos o método equals() para fazer a comparação entre dois objetos.
Entretanto, nós fizemos essa comparação utilizando explicitamente 3 atributos: modelo, marca e valor venal.

Exemplo:

Sendo que poderíamos transferir essa responsabilidade para nosso hashCode.

```java
@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Veiculo comparavel;
        if (obj instanceof Veiculo) {
            comparavel = (Veiculo)obj;
        } else {
            return false;
        }

        if (this.hashCode() == obj.hashCode()) {
            return true;
        }

        return false;
    }

@Override
    public int hashCode() {
        return Objects.hash(modelo, marca, valorVenal);
    }
```