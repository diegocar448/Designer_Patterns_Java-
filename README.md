# Designer Patterns

SOLID, Criacional, Estrutural, Comportamental.



## Solid

### Sigle Responsibility Principle (Princípio da Responsabilidade Única 

* Nunca deve haver mais de um motivo para uma classe mudar.
* Nada de GOD Class que faz muitas coisas tornando o codigo fragil.
* Separe as classes cada uma com um unico objetivo.

### Open/Closed Principle (Princípio Aberto/Fechado)

* Aberto para Extensão e Fechado para modificação
* Uma classe pode ser herdáda, mas evite ficar fazendo modificações em sua classe, uma vez que ela podem ser afetada por já estar em uso.


### Liskov Substitution Principle (Princípio da Substituição de Liskov)

* Uma classe derivada pode ser substituível por sua classe base.
* Quando vc estrutura baseada em interfaces por exemplo, eu posso substituir uma por outra e ela continuará funcionando exemplo.

### Interface Segregation Principle (Princípio da Segregação de Interfaces)

* Classes não devem ser forçadas a depender de métodos que não usam.
* Por exemplo criando outras interfaces mais específicas, sem precisar ficar implementando com metodos que não são utilizados, deixando o código mais extensível.

### Dependency Inversion Principle (Princípio da Invensão de Dependência)

* Módulos de alto nível não devem depender de módulos de baixo nível.Ambos devem depender de abstrações
* Abstrações não devem depender de detalhes.


## Design Patterns Criacional

### Factory Method

* No Factory Method nos delegamos a instancia de objetos para as subclasses, não é a classe principal que vai instanciar o objeto, sendo delegado para as subclasses.
* Iremos programa dirigido a interfaces, de uma maneira que se precisar aumentar recursos para minha factory ele têm essa possibilidade de estender sem alterar o código .

### Abstract Factory

* O Abstract Factory define uma interface para criar todos os produtos distintos, mas deixa a criação real do produto para classes fábrica concretas. Cada tipo de fábrica corresponde a uma determinada variedade de produtos.
* O código cliente trabalha com fábricas e produtos somente através de suas interfaces abstratas. Ele permite que o mesmo código cliente funcione com produtos diferentes. Você apenas cria uma nova classe fábrica concreta e a passa para o código cliente

### Builder

* No padrão Builder iremos quebrar o processo de criação do objeto em etapas, e em vários métodos, como ferramentas e componentes, preciso de motor, ok a classe Motor estará disponível, preciso de uma caçamba que está a nossa disposição.
* Esses componentes serão chamados de builders, que são os itens para construir o objeto complexo.
*A sequência da construção, será guiada por um Diretor, que recebe quais os métodos ele precisa, e sempre que solicitado, dispara a sequencia para os builders, que irão construir o objeto.
* Assim, temos uma biblioteca de componentes e ferramentas, que são acessadas pelo diretor quando provocado a construir algum modelo pré-estabelecido por meio de uma interface.
* Sempre chamaremos os builder para resolver objeto complexos com muitos parâmetros.

## Design Patterns Estrutural

### Adapter

* Podemos utilizar o padrão ADAPTER para **converter a interface de um objeto** de maneira que **outro objeto possa compreender as informações**.
* Um adaptador encobre um dos objetos para esconder as regras de negócio e qualquer dificuldade de conversão, isso fica oculto. O objeto encoberto neste caso o PalPal new fica sabendo que existe um adapter, o adapter só consome a informação.
* Adapter Convert a interface de uma classe para outro interface que o código cliente espera retornar. A entidade adaptadora permite que classes com interfaces incompativeis trabalhem juntas.
* Vamos pensar nesse padrão de projeto como um Benjamin onde ele permite adaptador e fazer a comunicação, por exemplo um API pegar um padrão de comunicação pegando um XML e retornando um JSON.

### Bridge

* É a parte que vai ligar a ponte abstração da Implementação. Imagine que precisamos quebrar essa classe em várias classes, mas pense bem, Youtube Live, Facebook Live e Twitch TV, ou seja todas as plataformas utilizam o mesmo conceito.
* Então como podemos quebrar uma classe grande em varias? E ainda assim compartilhar os recursos da transmissão como configuração RMTP, autenticação e outros métodos necessários para fazer a Live?
* O Bridge é um padrão de projeto estrutural que permite que você dividir uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas.
* Abstração neste caso não é diretamente ligada com interface ou classe abstrata. **Abstração** é uma camada de controller de alto nível para alguma entidade. Neste caso será nossa Live. Essa camada não deve fazer nenhum tipo de trabalho por conta própria .Ela deve delegar o trabalho para a camada de implementação ( também chamada de plataforma ) - será Youtube, TwitchTV e Facebook.



## Design Patterns Comportamental


### Chain of Responsibility

* Se baseia na idéia de transformar comportamentos em objetos independentes denominados handlers.
* Assim as verificações são extraídas para sua própria classe com um único método que faz a checagem. O pedido, junto com seus dados, é passado para esse método como um argumento.
* O padrão sugere que os handlers sejam ligados como em um corrente.
* Cada Hadler ligado tem um campo para armazenar uma referência ao proximo handler da corrente. Além de processar o pedido , os handlers também o passam adiante na corrente.
* O pedido viaja através da corrente até que todos os handlers tiverram uma chance de processá-lo. E Aqui está a melhor parte: um handler pode decidir não passar o pedido adiante na corrente efetivamente interromper um proximo processamento.



