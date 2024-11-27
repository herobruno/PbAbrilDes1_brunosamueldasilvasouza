"# PbAbrilDes1_BrunoSamuelDaSilvaSouza" 
***Projeto: Árvore Genealógica***

***Descrição:***

***Este projeto simula uma árvore genealógica,o objetivo desse projeto é imprimir na tela a árvore genealógica de uma pessoa: cônjuge, filhos e seus respectivos cônjuges e filhos, recursivamente e sem limite para adicionar novas pessoas à árvore.***

***Funcionalidades:***

Criação de Pessoas: Você pode criar pessoas e relacioná-las como filhos de outros membros da família.

Adição de Cônjuges: Cada pessoa pode ter um cônjuge associado, e a relação é refletida de forma recíproca (quando você adiciona um cônjuge, ele também adiciona automaticamente a pessoa como seu cônjuge).

Visualização da Árvore Genealógica: É possível visualizar a árvore genealógica a partir de qualquer membro, mostrando o nome da pessoa, cônjuge, e filhos com a devida indentação.

***Stack***

Linguagem: Java

***Como Funciona:***
   
Person: A classe Person representa uma pessoa, com um nome, cônjuge e lista de filhos.



***Métodos Importantes:***

addSpouse(Person spouse): Adiciona um cônjuge à pessoa.

addChild(Person child): Adiciona um filho à pessoa.

printFamilyTree(int level): Imprime a árvore genealógica a partir dessa pessoa, utilizando recursão para exibir os filhos.

---Saida Esperada---
