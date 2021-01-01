# Encapsulamento, Herança e Polimorfismo

## Encapsulamento

Mais uma vez vamos entender o termo que estamos trabalhando ao pé da letra.

Quando falamos de encapsulamento, estamos falando efetivamente em proteger alguma
informação de alguma forma, ou seja, com uma cápsula.

Vamos ver como podemos trabalhar com o encapsulamento nos nossos exemplo anterior da
**Classe Pessoa**.

Na nossa classe, vamos manipular basicamente 2 atributos:

- Nome;
- Data de nascimento.

```java
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int calculaIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

```java
public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Rafael", 31, 03, 1993);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Rafael Santos");

        System.out.println(eu.getNome());

    }
}
```

Mas afinal o que queremos?

Queremos **garantir a nossa implementação e que o acesso a determinados dados estão realmente protegidos** do acesso externo.

- Queremos que o nome possa seja alterado. Vamos pensar que uma pessoa pode casar e Mudar seu nome;
- Não queremos alterar a data de nascimento. A pessoa nasce com ela e não pode mudar;
- Queremos de alguma forma retornar a idade

Defino meu nome e minha data de nascimento no contrato;

- Consigo mudar meu nome posteriormente;
- Consigo ler meu nome a qualquer momento;
- Consigo apenas ler minha data de nascimento;
- Consigo calcular quantos anos eu tenho sem precisar conhecer a
implementação.

## Herança

Vamos agora falar de outro pilar importante da Orientação Objetos: **a Herança**
Como o próprio nome já diz, essa é a capacidade de uma Classe herdar o comportamento de outra.

Vamos pensar em um cenário onde queremos modelar um veículo.

```java
public class Veiculo {

    private String modelo;
    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
```

Vamos pensar em um cenário onde queremos informações de diversos tipos de veículos.
Por exemplo: quero colocar a quantidade de portas para o caso de carros e as cilindradas em casos de motocicletas.

```java
public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
}
```

```java
public class Motocicleta extends Veiculo {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
}
```

## Exemplo prático

```java
public class Exemplo001 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTER");
        moto.setCilindradas("850");

    }
```

### Comportamentos

Também aproveitamos comportamentos...
Nesse cenário, temos o método acelera() na classe veiculo.

```java
public class Veiculo {

    public void acelera() {
        System.out.println("Acelerando...");
    }

}
```

### Herança x Composição

Existe um vasto e antigo debate em relação a utilização de herança. Algumas bibliografias inclusive
defendem que ela nunca deve ser utilizada.
E o grande problema tem relação com o nosso tópico anterior: **o encapsulamento**.

A subclasse necessita conhecer, em muitos casos, a implementação da superclasse, o que cria um
acoplamento e quebra a nossa premissa básica do isolamento que vimos no encapsulamento.

## Polimorfismo

Quando falamos em herança, o verbo ***ser*** é mandatório na nossa forma de falar sobre a classe.
Entendemos, portanto, que um c**arro é um veículo** e uma **motocicleta** também **é um veículo**.

Quando falamos de Polimorfismo, estamos querendo entrar em um cenário onde um objeto pode ser referenciado de várias maneiras.
Vamos continuar no nosso exemplo de veículos...

Agora no nosso exemplo, nós queremos colocar mais uma característica e uma ação que podem ser comuns aos dois, mas com algumas peculiaridades.
Agora vamos querer calcular o valor aproximado do IPVA dos nossos diferentes tipos de veículos.

Tanto carros quanto motos pagam IPVA, certo? E o cálculo é baseado no valor venal do veículo.
Portanto a primeira conclusão que chegamos é que temos uma característica nova na nossa **Classe de Veículos**, agora temos o **valor venal**, portanto:

```java
public class Veiculo {

    private String modelo;
		private String marca;

		private double valorVenal;
}
```

Mas precisamos calcular a nossa precisão de imposto.
Vamos partir do princípio que (valores hipotéticos):

- Um veículo teria que pagar, no mínimo, 0,01% do valor venal de IPVA;
- Um carro teria que pagar, no mínimo, 0,07% do valor venal de IPVA;
- Uma moto teria que pagar, no mínimo, 0,03% do valor venal de IPVA.

Para isso precisaremos definir implementações diferentes de acordo com a classe que estamos
trabalhando. 

E é onde entraria o Polimorfismo.

Ele nos garantirá a capacidade de um objeto ser referenciado de múltiplas formas.

O Java será capaz de identificar qual objeto foi instanciado e, assim, escolher qual método será
utilizado.

Vamos ver como ficaria:

```java
public class Veiculo {

    private String modelo;
    private String marca;

    private double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }
}
```

```java
public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
```

```java
public class Motocicleta extends Veiculo {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}
```