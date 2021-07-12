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


