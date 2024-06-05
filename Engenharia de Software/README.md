# Atividade 1:

Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming.

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Engenharia de software é uma área da programação que atua no desenvolvimento, manutenção e modificação de sistemas computacionais. Tal área se difere do desenvolvimento clássico por 3 pontos: tempo, escala e trade-offs

- Tempo: Na engenharia de software, o tempo é crítico para cumprir prazos, atender às expectativas do cliente e garantir a competitividade. A metodologia ágil auxilia no melhor desenvolvimento.

- Escala: Escala refere-se ao tamanho que sistema a ser desenvolvido pode atender. Gerenciar a escala envolve escolher arquiteturas apropriadas para garantir que o sistema possa crescer e se adaptar às demandas futuras.
  
- Trade-offs: A engenharia de software envolve trade-offs, onde otimizar um aspecto pode resultar em compromissos em outros. Decisões são tomadas visando desempenho versus consumo de recursos ou velocidade de desenvolvimento versus qualidade do código exigem equilíbrio e compreensão das prioridades do projeto.

----------------------------------------------------

# Atividade 2:

3 Exemplos de Trade-offs de Software:

Premiere / After Effects

Premiere: 
  - Menor consumo de hardware
  - Ferramentas mais convencionais de edição.
  - Fluxo de trabalho mais flúido.

Aftec Effects
  - Maior consumo de Hardware
  - Maior liberdade de manipulação.
  - Edição de vídeos mais truncada.

-----------------------------------------------------

Photoshop / Canva

Photoshop

  - Maior liberdade de ferramentas e manipulação.
  - Banco de imagens pago.
  - Manipula somente imagens.
  - Assinatura com elevado preço.

Canva
  - Menor liberdade de manipulação.
  - Banco de imagens/vídeos gratuito.
  - Manipula imagens e vídeos.
  - Grátis ou com assinatura de baixo custo.

-------------------------------------------------------

Reaper / Pro Tools

Reaper
  - Licença Gratuita
  - Plugins nativos de menor qualidade
  - Baixo consumo de hardware

Pro Tools
  - Licença paga
  - Plugins Nativos de maior qualidade
  - Alto consumo de hardware

------------------------------------------------------

# Atividade 3:

https://docs.google.com/presentation/d/1Lmad2CS1pM1UycQpYn6FiDm2NsEO6CVSchym65tuk4U/edit?pli=1#slide=id.g1f2b4e971a0_0_179

Slide:

### 24 - Estilo de Arquitetura em Camadas:

 - Positivo: Custo.
   
     A simplicidade inerente ao estilo de arquitetura em camadas reduz significativamente o custo de construção do projeto.
A clara separação de responsabilidades entre as diferentes camadas facilita tanto o desenvolvimento quanto a                manutenção do sistema. Essa divisão modular permite que desenvolvedores trabalhem em componentes específicos sem            interferir nos outros, acelerando o processo de desenvolvimento e diminuindo a complexidade.

     Além disso, essa arquitetura facilita a construção de testes, pois cada camada pode ser testada de maneira             independente. Isso resulta em uma detecção mais rápida de bugs e problemas, contribuindo para uma manutenção mais           eficiente e menos onerosa ao longo do ciclo de vida do software.

 - Negativo: Escalabilidade
   
     Apesar das vantagens de custo, a simplicidade do estilo de arquitetura em camadas pode ser prejudicial em termos de escalabilidade. Cada camada adiciona uma quantidade significativa de processamento e comunicação de dados, o que pode       sobrecarregar o sistema e impactar a performance, especialmente em sistemas de grande escala.

     Quando um sistema cresce e precisa processar um volume maior de dados, a arquitetura em camadas pode se tornar um gargalo. A necessidade de maior desempenho pode levar ao aumento dos recursos de hardware, o que contraria a vantagem       de custo inicialmente mencionada. Esse aumento na necessidade de hardware e processamento pode tornar a escalabilidade      vertical (aumento de capacidade do servidor) limitada e cara.

 - Aplicação:

     A arquitetura em camadas é adequada para sistemas de pequeno porte, como os de um pequeno comércio. Nesses casos, o número de itens e transações é limitado, não exigindo uma grande capacidade de processamento e permitindo que a             simplicidade e a facilidade de manutenção superem os desafios de escalabilidade.


### 25 - Estilo de Arquitetura de Pipeline

 - Positivo: Simplicidade
   
     A arquitetura de pipeline é conhecida por sua simplicidade e clareza na organização do fluxo de dados. Cada etapa do pipeline tem uma função específica e bem definida, o que facilita o desenvolvimento e a manutenção do sistema. Essa         modularidade permite que cada componente do pipeline seja desenvolvido, testado e depurado de maneira independente,         simplificando o gerenciamento e a integração do sistema como um todo.

      Além disso, a natureza sequencial do pipeline torna mais fácil entender e seguir o fluxo de processamento dos dados.  Novos desenvolvedores podem rapidamente se familiarizar com o sistema, pois cada etapa é um bloco de construção             lógico e isolado. Isso resulta em um ciclo de desenvolvimento mais ágil e uma curva de aprendizado menor.
    
 - Negativo: Elasticidade

     Por outro lado, a arquitetura de pipeline pode enfrentar desafios em termos de elasticidade, especialmente quando há variações significativas na carga de trabalho. Cada estágio do pipeline pode se tornar um ponto de gargalo, e a             necessidade de balancear a carga entre as etapas pode complicar a escalabilidade.

     A elasticidade refere-se à capacidade do sistema de se ajustar dinamicamente à carga de trabalho. Em um pipeline, se
uma etapa específica enfrenta uma sobrecarga, ela pode atrasar o processamento de todo o fluxo, pois as etapas são          dependentes umas das outras. Gerenciar essa elasticidade requer uma coordenação cuidadosa e, muitas vezes, soluções         adicionais de balanceamento de carga e paralelização, o que pode aumentar a complexidade e o custo operacional.

   - Aplicação:

     A arquitetura de pipeline é adequada para sistemas que realizam operações sequenciais de processamento de dados, como um sistema de cadastro de usuários. Neste exemplo, as etapas podem incluir a validação dos dados de entrada, a formatação das informações, a verificação de duplicatas, e a inserção dos dados no banco de dados. Cada etapa processa os dados e os passa para a próxima, garantindo um fluxo organizado e eficiente.


### 26 - Microkernel Architecture Style

 - Positivo: Simplicidade.
 - Negativo: Tolerância a falhas.

  Poderia ser utilizado em um software de gravação de áudio, onde o sistema faria o tratamento de audio simples e efeitos seriam adicionados via plug-in,
  como já acontece em varias daw's

### 27 - Service-Based Architecture Style

 - Positivo: Tolerância a falhas
 - Negativo: Elasticidade

  Ideal para site de vendas, pois se uma parte do sistema falha, o restante continua funcionando.

### 28 - Event-Driven Architecture Style

 - Positivo: Escalabilidade
 - Negativo: Simplicidade

  Poderia ser usado em um sistema de logística e vendas, visando integração de vários sistemas.

### 29  Microservices Architecture

 - Positivo: Escalabilidade  
 - Negativo: Simplicidade

  Pode ser usado em uma plataforma de streaming

  

# Atividade 4

### Defina sua arquitetura debatendo tradeoffs com os requisitos não funcionais comentados em aula

Sistema escolhido: "Layered Architecture Style"

  Sistema escolhido devivo a simplicidade e ao baixo custo. Sistema será usado em uma pequena mercearia.

# Atividade 5

### Inicie seu diagrama de classes de uma das partes da arquitetura (escolha uma parte de backend por favor)

# <p align = "center"> ![Diagrama de Classes](https://github.com/cesarpelogia/bertoti/blob/455139aac249c40588d7e8e716aabe28b50ed32a/Engenharia%20de%20Software/Classe%20UML.jpeg)

