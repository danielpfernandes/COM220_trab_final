COM220_trab_final
=================

COM220 — Computação Orientada a Objetos 
Trabalho em Grupo: Sistema de Controle de Biblioteca 
Apresentação: 11/07 

Neste trabalho cada grupo deverá implementar um sistema para controle de biblioteca utilizando a linguagem Java e a API Swing. O sistema deverá ser utilizado por funcionários da biblioteca e deve prover facilidades para o gerenciamento de associados, publicações e empréstimos. 
O funcionário poderá executar as seguintes operações:

1. Cadastrar associado: disponibiliza formulário com os seguintes campos: código, nome, endereço, email e status. O código do associado deve ser um número inteiro. O período de empréstimo é variável de acordo com o status do associado. Os valores possíveis para o campo status e os respectivos prazos para empréstimo são os seguintes: 
Grad (aluno de graduação): 7 dias 
Posgrad (aluno de pós-graduação) 10 dias 
Prof (professor) 14 dias 

2. Cadastrar publicação: disponibiliza fomulário com os seguintes campos: ISBN, título, autor, editora. Cada publicação é identificada pelo seu ISBN, o qual, para efeito de simplificação, pode ser representado por um valor inteiro. 

3. Cadastrar exemplar: disponibiliza formulário com os seguintes campos: número, ISBN, preço. Cada exemplar é identificado por um número de sequência (iniciando por 1) e pelo ISBN da publicação.  

4. Consultar publicação: dado o ISBN de uma publicação ou seu título, verifica o status de todos os exemplares da referida publicação, mostrando os emprestados e os não emprestados 

5. Realizar empréstimo: os empréstimos são feitos através da criação de um registro contendo o número do exemplar, seu ISBN, a data do empréstimo e o código do associado que está realizando o empréstimo. Deve ser possível digitar a data de empréstimo a mesma não deve ser gerada automaticamente com a data atual. O sistema não pode permitir o empréstimo de um exemplar que já esteja emprestado. 

6. Realizar devolução: as devoluções ocorrem mediante a entrega do exemplar retirado pelo associado. No ato da entrega, o sistema deve verificar se a devolução está ocorrendo dentro do prazo. Se ocorrer fora do prazo, o sistema deve informar o valor da multa a ser pago (para cada dia de atraso, deve-se pagar R$ 1,00 de multa). 
Ao final do processo o registro de empréstimo deve ser removido. 

7. Gerar relatórios de associados em atraso, listando o código do associado, seu nome e a(s) publicação(ões) que está(ão) em atraso. 

Todas as informações devem ser persistidas em arquivo, de forma a evitar a perda dos dados. O projeto deve ser implementado utilizando o modelo MVC. 

ATENÇÃO: 
Os grupos devem ser formados por, no máximo, 3 alunos. No dia da apresentação, cada grupo deve apresentar uma monografia contendo os diagramas de caso de uso, o modelo de domínio da aplicação e pelo menos 2 diagramas de sequência correspondentes a 2 casos de uso. 

Se o grupo preferir, é permitido utilizar o Swing GUI Builder. Ver tutorial em: 
https://netbeans.olg/kb/docs/java/quickstafi-gui_pt BR.html 

A implementação em Java deverá ser apresentada para o professor na aula do dia 11/07. 
Todos os componentes do grupo devem estar presentes na apresentação. O grupo deverá explicar o código e o professor fará perguntas direcionadas para cada aluno (o aluno x não pode responder a pergunta feita para o aluno y) Anota final de cada aluno será uma composição entre a nota coletiva dada ao sistema e a nota da arguição individual. 


