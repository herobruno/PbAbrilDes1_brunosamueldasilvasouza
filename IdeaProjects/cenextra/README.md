***Projeto: Contador de Emojis***

***Descrição***

Este programa foi desenvolvido para analisar uma mensagem de texto fornecida pelo usuário e determinar o "sentimento" expresso com base na quantidade de emoticons ":-)" (divertido) e ":-(" (chateado). O programa realiza a contagem dessas expressões e classifica a mensagem como:

divertido: Quando o número de símbolos ":-)" é maior do que o número de símbolos ":-(".

chateado: Quando o número de símbolos ":-(" é maior do que o número de símbolos ":-)".

neutro: Quando o número de símbolos ":-)" é igual ao número de símbolos ":-(".

***Funcionalidade***

O programa solicita ao usuário que digite uma mensagem. A partir dessa entrada, ele conta quantas vezes os símbolos ":-)" e ":-(" aparecem na mensagem. Com base nos resultados dessa contagem, o programa exibe o sentimento relacionado à mensagem: divertido, chateado, ou neutro.

***Contagem de Emoticons***
O programa utiliza o método countOccurrences para contar quantas vezes os emoticons ":-)" (divertido) e ":-(" (chateado) aparecem na mensagem.

***Lógica de Classificação***

Depois de contar os emoticons, o programa compara as quantidades de cada tipo de emoticon:

Se o número de ":-)" for maior, o sentimento é classificado como divertido.
Se o número de ":-(" for maior, o sentimento é classificado como chateado.
Caso contrário, o sentimento é neutro.

***Função countOccurrences***

O método countOccurrences é responsável por contar as ocorrências de um emoticon específico na mensagem. Ele usa a função indexOf para localizar cada ocorrência e aumenta a contagem até que todas as ocorrências sejam encontradas:

---Saida Esperada---

![WhatsApp Image 2024-11-28 at 09 18 53](https://github.com/user-attachments/assets/b609c873-8bfb-49e1-b035-ff734fbe823c)
