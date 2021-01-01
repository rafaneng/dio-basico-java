# O que precisamos saber sobre Java

## Java

Java é uma linguagem de programação e plataforma computacional
lançada em 1995 pela Sun Microsystems, por um time comandado por
James Gosling. Anos depois foi adquirida pela Oracle.

Diferente de outras linguagens de programação, que são compiladas
para **código nativo**, o Java é compilado para um **bytecode** que é
interpretado por uma máquina virtual.

## Compilador

Um compilador é um programa que, a partir de um código fonte, cria um programa semanticamente equivalente, porém escrito em outra linguagem, código objeto. Um compilador traduz um programa de uma linguagem textual para uma linguagem de máquina, específica para um processador e sistema operacional.

O nome compilador é usado principalmente para os programas que traduzem o código fonte de uma linguagem de programação de alto nível para uma linguagem de programação de baixo nível (por exemplo, Assembly ou código de máquina).

## Bytecode

É o código originado da compilação de programas Java. O bytecode é o programa interpretado e executado pela Máquina Virtual Java, JVM.

## Virtual Machine

Primeiramente explicar o que é uma VM.

Uma Máquina Virtual, ou Virtual machine, é um software que simula uma máquina física e consegue executar vários programas, gerenciar processos, memória e arquivos.Tudo isso faz parte de uma plataforma com memória, processador e outros recursos totalmente virtuais, sem dependência do hardware.

## Java Virtual Machine (JVM)

A JVM é uma máquina virtual que executa programas Java, executando os
bytecodes em linguagem de máquina para cada sistema operacional.

Em linguagens compiladas diretamente para um sistema operacional (SO) específico, esse programa não irá executar em outro SO, havendo a necessidade de compilar uma versão do software para cada SO.

Com o Java, compilamos para a JVM, o bytecode será executado pela máquina virtual, e não diretamente pelo SO, assim, o software escrito em Java possui portabilidade para qualquer sistema operacional, porém, cada JVM deve ser construída para um SO especiífico.

## Resumindo

![O%20que%20precisamos%20saber%20sobre%20Java%20f5c51658d0b047778f381f307a892918/Untitled.png](O%20que%20precisamos%20saber%20sobre%20Java%20f5c51658d0b047778f381f307a892918/Untitled.png)

## Java Runtime Environment (JRE)

JRE significa Java Runtime Environment, ou Ambiente de Execução do Java, é composto pela Java Virtual Machine (JVM), bibliotecas e APIs da linguagem Java e outros componentes para suporte da plataforma Java. Ele representa a parte responsável pela execução do software Java.

## Java Development Kit (JDK)

Java Development Kit (JDK), Kit de Desenvolvimento Java, é um conjunto de utilitários que permitem criar software para a plataforma Java. É composto pelo compilador Java, bibliotecas da linguagem, ferramentas e a JRE.

## Java Standard Edition (JSE)

Java Standard Edition (SE), é a distribuição mínima da plataforma de desenvolvimento de aplicações Java.

OpenJDK é a implementação de referência open source da Plataforma Java, Java SE, que ainda é mantida pela Oracle.

## Java Enterprise Edition (JEE)

Java Enterprise Edition, é uma extensão da Java SE que possui suporte a desenvolvimento de sistemas corporativos.

Além do mínimo da plataforma, o Java EE possui diversas especificações de partes da infra estrutura de aplicações, como acesso a banco de dados, mensageria, serviços web, parser de
arquivos e outras.

Servidores de Aplicações Java EE, sabem seguir essas especificações e implementar os recursos
para os usuários.

Ex.: JBoss (RedHat), Weblogic (Oracle), WebSphere (IBM) e Glassfish = Implementação de Referência Opensource: [https://javaee.github.io/glassfish](https://javaee.github.io/glassfish)

## Jakarta EE

Coma falta de investimentoda Oracle no Java, ela cedevu todo o código, implementações e especificações do Java EE para a Eclipse Foundation, mas como o nome Java EE é uma marca registrada, foi escolhido o nome Jakarta EE.

Agora a evolução da especificações e padrões do Java será feito sob o nome Jakarta EE, com compatibilidade com o Java EE.

## Compilando um código

```bash
vim Hello.java
```

```java
public class Hello{
        public static void main(String[] args){
                System.out.println("Hello!");
        }
}
```

```bash
javac Hello.java
java Hello
# > Hello!
```