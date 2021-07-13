# SOLID Examples
Learn TDD and SOLID hands-on

###S - Single Responsiblity Principle: 
- Uma classe deve ter somente um único motivo para mudar, 
  a nossa classe Order está com a responsabilidade do cálculo dos impostos.
- Imagine que mudou o imposto do Cigarro, teremos que MUDAR a classe Order, com isso estamos ferindo
  o princípio de Responsabilidade Única.
  
<i>Evite God Class, isto é, na orientação objeto é aquela classe que sabe ou faz demais.</i>


###O - Open-Closed Principle:
- Objetos ou entidades devem estar abertos para extensão, 
  mas fechados para modificação, ou seja, 
  quando novos comportamentos e recursos precisam ser adicionados no software, 
  devemos estender e não alterar o código fonte original.

###L - Liskov Substitution Principle:
- Uma classe derivada deve ser substituível por sua classe base.
O princípio da substituição de Liskov foi introduzido por Barbara Liskov em sua conferência 
“Data abstraction” em 1987. 
######A definição formal de Liskov diz que:
- Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P definidos em termos de T, o comportamento de P é inalterado quando o1 é substituído por o2 então S é um subtipo de T
######Simplificando:
- se S é um subtipo de T, então os objetos do tipo T, em um programa, podem ser substituídos pelos objetos de tipo S sem que seja necessário alterar as propriedades deste programa.
###I - Interface Segregation Principle:
  - Princípio da Segregação da Interface, Uma classe não deve ser forçada a implementar interfaces e métodos que não irão 
  utilizar.
  - Esse princípio basicamente diz que é melhor criar interfaces 
    mais específicas ao invés de termos uma única interface genérica.

###D - Dependency Inversion Principle:
- Princípio da Inversão de Dependência, Dependa de abstrações e não de implementações.
- De acordo com Uncle Bob, esse princípio pode ser definido da seguinte forma:
  1. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
  2. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
  
<hr><br>
<i>Referência textual: https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530 </i> 