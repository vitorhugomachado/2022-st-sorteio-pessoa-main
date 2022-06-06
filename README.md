# Instruções

## Instale

- JDK 11 ou superior
- Maven

## Compilando o Projeto pela linha de comando.

A primeira opção para compilar o projeto é pelo terminal. Para isso abra o terminal 
do IntelliJ (Alt + F12 ou Menu View -> Tool Windows -> Terminal) e execute o comando abaixo:

    mvn clean install

## Compilando o Projeto com o Maven embutido no Intellij.

Todo Intellij possui um maven embutido nele, você acessa ele pelo menu na lateral direita com o nome e simbolo do maven.

Ao clicar neste menu você verá o projeto e mais tres sub-pacotes, neste sub-pacotes expanda o sub-pacote de
nome "Lifecyle", nele existirá diversas opções de comando maven, mas as que importam para gente no momento são
as opções "clean" e "install". Para executa-las selecione-a e clique no botão de play verde logo acima dela que esta dentro 
do menu maven. Náo é o botão de play verde ao lado do inseto, é o botão de play verde ao lado da letra M de maven.

- sis-sorteiro-pessoa
    - Lifecycle
      - clean: Deleta a pasta target limpando tudo que foi gerado antes. 
      - install: Executa a compilação e gera o executável do sistema. ("E otras cocitas mas")
    - Plugins
    - Dependencies

## Executando o Projeto pela linha de comando

A primeira opção para executar o projeto é pelo terminal. Para isso abra o terminal
do IntelliJ (Alt + F12 ou Menu View -> Tool Windows -> Terminal) e execute o comando abaixo:

    java -jar target/sorteio-pessoa-api.jar

## Executando o Projeto com o Maven embutido no Intellij.

Encontre a classe Main.kt no projeto e clique no botão de play verde que aparece ao lado da função main.
Isto é necessário apenas na primeira vez, após isto o intellij apresentará no canto superior direito da tela a classe que foi executada, 
ai você pode parar a aplicação e rodar novamente através desta opção.


Nota.: Rodando usando os recursos da IDE realmente fica mais fácil lembrar o que deve executar e afins, mas é imporante
criar o hábito de executar a aplicação da forma mais próxima que ela será executada em ambiente de produção para mitigar erros.
As IDEs fazem magia as vezes, coisas que não acontecem no ambiente produtivo. Sabendo disso, a opção por terminal é a que 
mais se aproxima do ambiente produtivo. 