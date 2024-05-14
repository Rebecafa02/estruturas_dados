<h1 align="center"> Repositório de Estrutura de dados </h1>  

<h2>Descrição</h2>
Repositório dedicado a divulgação dos códigos-fonte desenvolvidos durante as aulas de Estrutura de Dados no curso de Sistemas de Informação no Instituto Federal da Bahia utilizando a linguagem de programação <strong>Kotlin</strong> com o objetivo de praticar e aprimorar o 
aprendizado dos assuntos ensinados pelo professor Cláudio Rodolfo.
<p>A disciplina visa o armazenamento e organização de dados levando em consideração maior eficiência para buscas, volume de dados trabalhados, padrões específicos de acesso,
forma que os dados se relacionam que resultam em um programa mais simplificado na implementação e no seu uso.

<h2>Conteúdos</h2>
<h3>Pilhas</h3>
As pilhas são estruturas que armazenam os dados em um formato seqeuncial empilhando um em cima do outro, utilizam o padrão LIFO (Last In First Out) o último a entrar será o primeiro a sair. Aqui temos a interface base de uma pilha e algumas implementações.
<h3>Filas</h3>
As filas são estruturas de dados muito comuns na programação em que os elementos são inseridos no final e removidos no inicio, dessa forma, seguem o padrão FIFO (First In First Out) o primeiro a entrar é o primeiro a sair. Como exemplo da vida real nós temos as filas de banco que seguem essa lógica de funcionamento, já em sistemas é possivel identifica-la no controle de documentos para impressão, onde as páginas são impressas na ordem em que são enviadas.
<h3>Listas</h3>
<h3>Bingo</h3>
Implementação do projeto da segunda unidade da disciplina de estrutura de dados com os seguintes requisitos:
 <p> Neste projeto, propõe-se gerenciar bingos, que tratam-se de um jogo de azar bastante popular no qual bolas numeradas são
colocadas dentro de um globo e sorteadas uma a uma. Manipulação das listas de cartelas é obrigatório. Inicialmente, deverá se
proceder com o cadastro das cartelas de jogos, indicando-se, para cada uma delas, o nome do jogador e seu respectivo conjunto de
24 números entre 1 e 99, a serem gerados de forma aleatória. Após conclusão do cadastro das cartelas, o sorteio deverá ser
iniciado, de modo a ser finalizado no momento em que, após a geração aleatória do próximo número sorteado, forem identificadas
uma ou mais cartelas para as quais todos os números nelas incluídas já estejam sorteadas. A aplicação desenvolvida deve dispor
das seguintes funcionalidades e/ou restrições: </p>
   Inclusão, alteração e exclusão das cartelas de bingo até que ocorra inicialização do sorteio, admitindo-se, em caso de alteração,
apenas atualização de nome do jogador; <br>
   Impedimento da existência de duas ou mais cartelas com o mesmo nome de jogador e/ou o mesmo conjunto de números;
   Reinicialização de bingo, pela remoção de todas as cartelas e dos números sorteados; <br>
   Indicação dos nomes dos jogadores cujas cartelas contém número sorteado, quando da geração aleatória do próximo número
sorteado (não se admite geração de todos os números do sorteio de uma só vez); <br>
   Impedimento do processamento do mesmo número mais de uma vez, quando da geração aleatória do próximo número de
sorteio (apenas a primeira ocorrência deva ser considerada para fins de pontuação das cartelas, havendo necessidade, neste
caso, de geração aleatória de novo número até que seja gerado um número distinto daqueles sorteados anteriormente); <br>
   Indicação do nome do jogador no momento em que, após o próximo número sorteado, esteja munido de cartela de bingo com
com todos os números sorteados, seguindo-se, a isso, reinicialização do bingo (em havendo mais de um jogador, deverá ser
decretado empate com a indicação dos nomes dos mesmos); <br>
   Consultas sobre os dados das cartelas e dos números sorteados: a) nome de jogador e números de sua respectiva cartela em
ordem crescente, a partir da indicação da ordem de inclusão da cartela (1o, 2o, 3o, etc...); b) relação de números sorteados, por
ordem de sorteio; c) relação de números sorteados em ordem crescente; d) quantidade de números sorteados por jogador (em
ordem decrescente); e) relação de números não sorteados por jogador (em ordem decrescente daqueles com maior quantidade
de números sorteados para aqueles com menor quantidade de números sorteados).
