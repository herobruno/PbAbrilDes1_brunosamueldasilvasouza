***Documentação: Tabelas Pessoa e Gondola (Cenário 2)***
***Descrição
Este script SQL descreve a criação de duas tabelas: Pessoa e Gondola, que são usadas para modelar um sistema que gerencia pessoas e suas ocupações nas gôndolas de um parque ou atração. O cenário 2 se refere ao contexto onde as gôndolas são usadas para armazenar informações sobre ocupantes e seus assentos, com a relação entre a pessoa e a gôndola sendo gerenciada via chaves estrangeiras.***

***Tabelas e Relacionamentos***

1. Tabela Pessoa
A tabela Pessoa armazena informações sobre os indivíduos que podem ocupar os assentos nas gôndolas. Os campos presentes são:

   id (INT, AUTO_INCREMENT): Identificador único da pessoa (Chave Primária).

   nome (VARCHAR(100)): Nome da pessoa.

   idade (INT): Idade da pessoa.

   A chave primária é o campo id, que garante que cada pessoa tenha um identificador único na tabela.

2. Tabela Gondola
   A tabela Gondola armazena informações sobre cada gôndola e os ocupantes dos seus assentos. Os campos são:

   numero (INT): Número único da gôndola (Chave Primária).

   assento1 (INT): Identificador da pessoa ocupando o primeiro assento. Este campo é uma chave estrangeira que faz referência ao campo id da tabela Pessoa.

   assento2 (INT): Identificador da pessoa ocupando o segundo assento. Assim como o campo anterior, este é uma chave estrangeira que se refere ao campo id da tabela Pessoa.

   A tabela Gondola tem dois relacionamentos com a tabela Pessoa através das chaves estrangeiras assento1 e assento2. Isso significa que cada gôndola pode ter dois ocupantes, um para cada assento.

***Relacionamentos***

   Assento1 e Assento2 possuem uma chave estrangeira para o campo id da tabela Pessoa. Quando uma pessoa deixa de ser associada a uma gôndola, o comando ON DELETE SET NULL define que os campos assento1 e assento2 terão o valor NULL, mantendo a integridade dos dados.
