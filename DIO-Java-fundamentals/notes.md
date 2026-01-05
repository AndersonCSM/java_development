# Historia do Java
- Em 1991, a Sun Microsystems criou o Green Team para desenvolver projetos pensando em um futuro IoT.
- Objetivo: criar uma linguagem de programacao que funcionasse em diferentes sistemas operacionais.

## O que é "build"?
- Processo de transformar o código-fonte em algo executavel ou distribuivel.
- Normalmente inclui: compilar arquivos .java em .class, gerenciar dependencias, executar testes automatizados, empacotar em .jar ou .war e preparar a distribuicao.
- Fazer tudo manualmente é demorado e propenso a erros, por isso usamos ferramentas que automatizam o fluxo: os gerenciadores de build.

## O que é um gerenciador de build?
- Ferramenta que automatiza e organiza o processo de build de um projeto Java (ou outros): você define o que precisa e a ferramenta executa.
- Principais no ecossistema Java: Maven e Gradle.

## Maven
- Ferramenta tradicional e muito usada no mercado corporativo.
- Segue o principio de convencao sobre configuracao, com estrutura de pastas padrao e configuracao em XML.

## Gradle
- Ferramenta moderna e flexivel.
- Usa scripts em Groovy ou Kotlin (build.gradle), permitindo configuracao mais personalizada e expressiva.

## Instalacao do Maven e do Gradle
- Instale e configure as variaveis de ambiente para que os comandos mvn e gradle funcionem em qualquer terminal.
- Variaveis de ambiente ajudam o sistema operacional a localizar arquivos e executar ferramentas.

**Tipos de variaveis de ambiente**
- **Variavel de ambiente do usuario:** afeta apenas o usuario atual; ideal para uso pessoal.
- **Variavel de ambiente do sistema**: afeta todos os usuarios do computador; indicada para configuracoes globais ou corporativas.

# Padrões da Linguagem de programação de Java
## Identação
No Java a identação é feita utilizando as chaves {}

## Nomenclatura de projetos
No Java as variáveis e nome de estruturas compostar é feita no modelo UpperCase, onde ao invés de separar um nome utilizando underline(_) este é separado Com uma letra maiúscula.
Ex.: VariavelComposta

## Comentários
- Para comentário de uma linha usa-se: //
- Para comentários de várias linhas, usa-se: /**/

## Entrada e Saída
### Entrada
A entrada no Java é feito por meio de objetos chamados scanners, eles são responsáveis por escanear a entrada e repassar a uma variável. Para usá-las, é preciso realizar a importação e instanciar um nova estrutura

```
import java.util.Scanner; // importação da biblioteca

public class Main {
    public static void main(String[] args) {

        // instanciação de uma nova estrutura scanner
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Informe o seu nome");
        
        // criação de uma variável String e recebimento do conteúdo atráves do scanner
        String nome = scanner.next(); 

        System.out.println("Informe sua idade");
        // Usando o mesmo scanner para ler outra informação do usuário
        int age = scanner.nextInt();

        System.out.printf("Olá, %s, sua idade é %s \n", nome, age);
    }
}
```

### Saída
A Saída é feito através de prints, em que variam conforme a necessidade, em que usando da bibliote de saida do sistema como padrão de saída. Os formatos de saída para os prints são:
1. println: saída com a quebra de linha no final
2. print: saída sem quebra de linha
3. printf: saída formatada, usada para quando se deseja referenciar uma variável e formatar a saída

#### Formatando a saída
A formataçã das variavéis segue o formato clássico, de chamá-la no texto, e passa-la em sequência.
## Tipagem de variáveis
 O Java é uma linguagem de tipagem forte e estática, ou seja, depois que definir um tipo de uma variável, não é possível modificá-lo, além de que para usar uma variável é preciso definir o tipo.
 O Java possui os tipos primitivos e trabalhando com estruturas de dados em objeto.
### Tipos primitivos:
#### Inteiros:
Cada variáveis possui um range de valores, cabendo o programador a escolher qual se adequa melhor
1. byte
2. short
3. int
4. long
#### Ponto flutuante
1. Float
2. Double
#### Caractere
1. char: usa-se aspas simples para char: 'a'
#### Booleano
1. boolean: Valor lógico: true/false
### Compostos
1. String: usa-se aspas duplas.
2. Scanner
3. Outras classes....
### ward var
 É possível utilizar a ward **var** para atribuição da variável conforme a instanciação. como no exemplo abaixo na instanciação de um scanner:
```
 Scanner scanner = new Scanner(System.in);
 ```
 - O tipo é uma classe Scanner
 - o nome é scanner (s minúsculo)
 - será uma nova instancia com o **new**
 - a classe Scanner.

 Como a atribuição se referencia a um Scanner, é possível utilizar a **ward**, que ficariam como:
 ```
 var scanner = new Scanner(System.in);
 ```

 Essa lógica se aplica a outros trechos de código, visto que estamos usando métodos que retornam um tipo padrão.
```
var age = scanner.nextInt();
```
A ward var não funciona para cenários em que não existe um tipo definido para que seja instanciado.

Podemos usar caractere de abreviatura ao lado de valores de atribuição para definir o tipo do **var**; como no exemplo abaixo:
```
var age = 1d;
// d = double
// f = float
// l = long

var nome = "txt";
// como aspas duplas são usados somente para Strings, o tipo será string
```

### Palavras reservadas
O Java é **Case Sensitive**, logo existe diferença entre escrever com letras maiúsculas e minúsculas. Além disso, como toda linguagem o Java possui palavras reservadas da linguagem, que **não devem ser utilizadas.**

### Constantes
Para definir constantes, basta escrever uma variável com letras maiúsculas com separador de underline, dessa forma a linguagem entende que se trata de uma constante

```
int PIN_CODE = scanner.nextInt();
```

## Operadores
### Operadores lógicos e de atribuição
- **Atribuição: (=);**
- **igualdade: (\=\=);**
- **Diferença: (!=);**
- **maior que e maior igual: (>, >=);**
- **menor que e menor igual: (<, <=);**
- **negação: (!);**
- **Ou lógico: (||)** além disso, o Java possui a operação (|), está por sua vez irá verificar obrigatoriamente as duas condições, antes de retornar o valor, sendo menos eficiente que utilizar as duas barras (||);
- **E lógico: (&&)** da mesma forma, existe a operação com apenas um (&), que irá verificar as duas condições antes de retornar o resultado da operação;
### Operadores aritméticos
- **Soma: (+);**
- **Subtração: (-);**
- **Multiplicação: (\*);**
- **Divisão: (/)**, quando se trabalha com divisão se os números forem inteiros, a divisão também será inteira, caso deseje um resultado exato é necessário trabalhar com pontos flutuantes;
- **Potenciação**: a operação de potenciação, retorna o resultado do tipo double, e para realizá-la, utiliza-se a Classe Math, com o método pow:
```
Math.pow(variavel, potencia);
```
- Raíz: a operação retorna um tipo double e para obté-lo, utilizamos:
```
Math.sqrt(variavel);
```
- **Resto de divisão: (%);**
- **Incremento:** adiciona uma unidade a variável usando o (++) . 
	- Se for adicionado a esquerda da variável, primeiro será realizado o incremento da variável, caso seja a direita, o incremento só ocorrerá na próxima linha.
```
var value = 50; // a ward sabe que será inteiro
System.out.println(value++); // Será impresso 50, depois o 50 será incrementado
System.out.println(value); // Será impresso 51
```
- **Decremento:**  diminui em uma unidade a variável usando o (--);

Lembre-se de utilizar parênteses para modificar a prioridade das operações aritméticas.


### Operadores byte a byte
Utilizados em conjunto aos tipos inteiros.
#### Shift
A operação shift "empurra os bits" de uma posição a outra.
- **shift esquerda (bits >> deslocamento)**
- **shift direita: (bits >>deslocamentos)**
