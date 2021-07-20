# LISTA DE EXERCÍCIO Nº 5 :computer:

## 1) Crie uma classe chamada Faturar que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:

## • o número do item faturado,

## • a descrição do item,

## • a quantidade comprada do item e

## • o preço unitário do item.

## Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.

## Forneça um método set e um método get para cada variável de instância. Além disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double.

## Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.



## 2) A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:

## • um primeiro nome,

## • um sobrenome, e

## • um salário mensal.

## Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. Se o salário mensal não for positivo, configure-o como 0.

## Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância.



## 3) Escreva uma classe em Java que simule uma calculadora bem simples. 

## Essa classe deve ter como atributos duas variáveis double e um char. 

## Deve possuir um construtor que recebe como parâmetro dois números e um caracter, correspondente a uma das operações básicas (+, -, *, /). 

## Deve ter um método para calcular a operação desejada e um para imprimir o resultado. 

## O programa deve considerar divisões por zero como sendo erros, e imprimir uma mensagem adequada.



## 4) Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância:

## • mês (int),

## • dia (int)

## • e ano (int).

## A classe deve ter métodos get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano separados por barras normais ( / ).

## Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades da classe Data.



## 5) Crie uma classe Animal contendo os atributos tipo e cor. Adicione os métodos set, get, um construtor para classe que inicialize as variáveis de instância, e um método toString para retornar o tipo e a cor do animal.

## -  Construa uma classe Cachorro que estenda a classe Animal e tenha os atributos nome e raça do cachorro, construa para classe os métodos set, get, um construtor e um método toString para classe cachorro.

## - Construa uma classe Cocker que estenda a classe Cachorro e tenha os atributos tosa do tipo boolean (falso, verdadeiro), com um método setTosa e um método precisaTosa que deve retornar apenas se precisa ou não de tosa.

## - Escreva um programa de teste (classe CockerTeste) adequado para esta classe testando os métodos da classe e os métodos herdados. Utilize para entrada e saída de dados a classe JOptionPane.



## 6) Implemente a classe Pessoa possuindo nome, idade, altura e sexo como variáveis de instância. Construa os métodos set e get para cada variável de instância e um construtor para a classe para inicializar as variáveis de instância. Construa depois uma classe Empregado que deve ser uma subclasse da classe Pessoa (herança), adicionando um novo construtor e uma variável de instância salário e os métodos set e get para o novo atributo.

## Construa um método obterLucros que devolva o lucro (salário) do empregado. Escreva um programa de teste (classe EmpregadoTeste) adequado para esta classe testando os métodos da classe e os métodos herdados. Utilize para entrada e saída de dados a classe JOptionPane.

