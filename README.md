# Resolução exercício Beecrowd1115

## Descrição do problema
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

## Como Funciona
1. O programa inicia com uma variável `controle = 1` e utiliza um laço `for` dinâmico que incrementa seu limite (`controle++`) a cada iteração para permitir novas leituras.
2. Dentro do laço, o algoritmo captura os valores inteiros das coordenadas nas variáveis `x` e `y`.
3. Uma estrutura condicional encadeada (`if / else if / else`) classifica a posição espacial do ponto:
   - `x > 0` e `y > 0`: Imprime `"primeiro"`.
   - `x < 0` e `y > 0`: Imprime `"segundo"`.
   - `x < 0` e `y < 0`: Imprime `"terceiro"`.
   - `x > 0` e `y < 0`: Imprime `"quarto"`.
   - `else`: Captura os casos onde `x` ou `y` é zero, definindo `controle = 0` para quebrar a execução do loop.