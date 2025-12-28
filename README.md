# Projeto desenvolvido na matéria de Estrutura de dados
 
Este relatório visa analisar a eficiência de vários algoritmos de ordenação e busca, considerando o tempo de execução, a complexidade de tempo e espaço, bem como a adequação a diferentes tipos de entrada. Para garantir uma comparação abrangente, os algoritmos foram testados em arrays com diferentes tamanhos e distribuições. As métricas de desempenho incluem o tempo médio de execução e o número de comparações. 

1.1 Algoritmos Avaliados 

Algoritmos de Ordenação: 
1. Insertion Sort 
2. Quick Sort 
3. Merge Sort 
4. Counting Sort
   
Algoritmos de Busca: 
1. Busca Linear Iterativa 
2. Busca Linear Recursiva 
3. Busca Linear Iterativa de Duas Pontas 
4. Busca Binária Iterativa 
5. Busca Binária Recursiva

2. Metodologia 
Os testes de performance dos algoritmos de ordenação e busca foram realizados executando cada algoritmo várias vezes com entradas de tamanhos diferentes. O foco foi analisar o tempo de execução e o número de comparações em cenários práticos. 
2.1 Tamanhos dos Vetores de Entrada 
Os algoritmos foram testados com vetores de diferentes tamanhos, para verificar como o desempenho se altera com o aumento da entrada. Os tamanhos dos vetores utilizados foram: 
● 22.000 elementos 
● 120.000 elementos 
● 450.000 elementos 
● 750.000 elementos 
● 1.000.000 elementos

2.2 Execuções 
Cada algoritmo foi executado dez vezes para garantir a consistência dos resultados. O tempo de execução médio foi registrado para cada tamanho de vetor. 

2.3 Ferramentas Utilizadas 
Os algoritmos foram implementados em Java, e o tempo de execução foi medido usando a função System.nanoTime(), garantindo uma medida precisa do tempo em nanosegundos que foram convertidos em segundos nesta análise. 

2.4 Métricas de Avaliação 
As principais métricas avaliadas foram: 
● Tempo de execução (em segundos): Medido com base no tempo médio das execuções. 
● Número de comparações: Quantidade de vezes que os elementos do vetor foram comparados durante o processo de ordenação ou busca. 

2.5 Ambiente de Teste 
PC Desktop com sistema operacional Windows 10, processador AMD Ryzen 2 2200G que opera em um clock de 3.5GHz, com espaço de 16 GB RAM; placa de vídeo GTX 1650 com 8GB de VRAM. Código funcionando na IDE Eclipse.

4. Análise dos algoritmos de ordenação

3.1 InsertionSort 
Complexidade: 
● Melhor caso: O(n) (array quase ou totalmente ordenado). ● Pior e médio caso: O(n²). (array inversamente ordenado). 

Observações: 
● É um algoritmo estável, in-place e muito eficiente em arrays pequenos ou quase ordenados. O número de comparações e trocas é geralmente menor que o Bubble Sort para o mesmo tamanho de array. 

3.2.1 Quicksort (com pivô aleatório e fixo) 
Complexidade: 
● Melhor e médio caso: O(n log n). 
● Pior caso: O(n²) (quando o pivô é consistentemente o menor ou maior elemento).

3.2.2 QuickSort Random 

Observações: 
● O Quicksort é um algoritmo in-place e sua versão com pivô aleatório é um dos algoritmos mais eficientes para grandes conjuntos de dados. No entanto, ele não é estável e a escolha do pivô é crítica para o desempenho.
 
3.3 MergeSort 
Complexidade: 
● Todos os casos: O(n log n). 
 
Observações: 
● Merge Sort é estável e garante uma boa performance para grandes volumes de dados. No entanto, o Merge não é in-place, sendo sua desvantagem o consumo extra de memória, pois o método requer espaço adicional para armazenar as sub listas. 

3.4 CountingSort 
Complexidade: 
● Todos os casos: O(n + k), onde k é o valor máximo no array. 


Observações: 
● Excelente para arrays com faixas de valores pequenas, mas não é um algoritmo in-place, ou seja, precisa de vetores auxiliares, Além disso, não é aplicável para todos os tipos de dados. 

Analisando os algoritmos de busca em três cenários: vetor de entrada aleatório, ordenado de forma crescente e ordenado de forma decrescente, obtivemos os seguintes resultados: 


4. Análise dos Algoritmos de Busca 
Cada um destes algoritmos buscava um elemento Filme dentro do vetor, previamente ordenado, que tivesse uma nota igual a 4. As tabelas abaixo mostram o tempo de processamento desse algoritmo em cada execução e a média de tempo das execuções (em segundos).

4.1 Busca Linear Iterativa 
Complexidade: 
● Melhor caso: O(1) (quando o elemento está na primeira posição). 
● Pior caso: O(n) (quando o elemento está na última posição ou não está presente). Desempenho: 

4.2 Busca Linear Recursiva 
Complexidade: 
● Melhor caso: O(1). 
● Pior caso: O(n). 

Observações: 
● Embora a lógica seja semelhante à busca linear iterativa, a versão recursiva é geralmente menos eficiente devido ao overhead da recursão. Deve ser evitada em grandes conjuntos de dados. 

4.3 Busca Linear Iterativa de Duas Pontas 
Complexidade: 
● Melhor caso: O(1) (se o elemento estiver nas extremidades do array). ● Pior caso: O(n/2), ou seja, assintoticamente O(n), mas a busca é feita em ambas as pontas simultaneamente. 

Observações: 
● Esse método é uma pequena otimização sobre a busca linear padrão, útil em alguns casos específicos, mas não muda a complexidade de tempo de maneira significativa. 

4.4 Busca Binária Iterativa 
● Melhor caso: O(1) (se o elemento está no meio do array). 
● Pior caso: O(log n) (dividindo o array pela metade a cada iteração). Desempenho: 

Observações: 
● Este método requer que o array esteja previamente ordenado. Para grandes arrays, a busca binária oferece uma performance muito melhor do que a busca linear, especialmente quando o array é grande. 

4.5 Busca Binária Recursiva 
● Melhor caso: O(1). 
● Pior caso: O(log n). 

Observações: 
● Embora a busca binária recursiva tenha a mesma complexidade de tempo da versão iterativa, a recursão pode aumentar o uso de memória em sistemas com limites restritos para chamadas recursivas. 

5. Conclusão: 
A análise detalhada de cada algoritmo revela que a escolha do algoritmo correto depende do tamanho do array e da distribuição dos dados:

Algoritmos de Ordenação: 
 ● O Insertion Sort é eficiente para vetores pequenos, como até 22.000 elementos, mas torna-se lento em vetores maiores. Ele é uma boa escolha para dados quase ordenados, mas não é ideal para grandes volumes devido à sua complexidade O(n²). 
 ● O Quick Sort, com complexidade média O(n log n), mostrou ser um dos algoritmos mais eficientes. Mesmo com grandes volumes de dados, como 1.000.000 de elementos, ele manteve um tempo de execução baixo, sendo ideal para vetores grandes. Se tratando do vetor de entrada previamente ordenado, o Quick sort sem o random cai em seu pior caso, se mostrando menos eficiente conforme aumentado o volume da entrada. Sendo assim, o Quick sort random se mostrou uma escolha mais eficiente para grandes entradas nos diversos casos. 
 ● O Merge sort, com complexidade garantida de O(n log n), também apresentou excelente desempenho, especialmente em grandes vetores. Embora tenha um overhead de memória devido ao uso de memória adicional para combinar as sublistas, seu tempo de execução foi consistente e eficiente, mesmo para os maiores conjuntos de dados. 
 ● O Counting Sort foi o mais rápido nos cenários testados, mas sua aplicação é limitada a quando os elementos do vetor são inteiros e pertencem a um intervalo de valores fixo e pequeno. Sua complexidade linear O(n + k) fez dele a opção mais eficiente quando aplicável, mas seu uso generalizado é restrito.
 
Algoritmos de Busca: 
 ● Para arrays não ordenados, a Busca Linear (iterativa ou recursiva) é a única opção viável, mas deve ser evitada em grandes conjuntos de dados. 
 ● Para arrays ordenados, a Busca Binária Iterativa é a mais eficiente, reduzindo o tempo de execução significativamente.

OBS: Durante os testes de performance dos algoritmos, constatamos que alguns métodos, como o Selection Sort e o Bubble Sort, apresentaram sérias limitações em termos de tempo de execução em vetores de grandes dimensões. 
 ● Selection Sort: devido à sua complexidade O(n²), não conseguiu ser executado dentro de um tempo aceitável para vetores grandes. O algoritmo se mostrou impraticável para conjuntos de dados maiores, não sendo possível coletar dados suficientes para incluir em nossa análise. 
 ● Bubble Sort:O Bubble Sort foi executado algumas poucas vezes, mas também se mostrou extremamente ineficiente em grandes volumes de dados. Em vetores a partir de 120.000 elementos, o tempo de execução cresceu drasticamente, limitando a quantidade de execuções que conseguimos realizar. 
 
