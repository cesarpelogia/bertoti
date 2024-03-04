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

## 24 - Estilo de Arquitetura em Camadas:

  O estilo de Arquitetura em Camadas é um design de software que é organizado em camadas distintas, com cada uma sendo
responsável por funcionálidas específicas. Cada camada representa um nível de abstração, e a comunicação geralmente ocorre
apenas entre camadas adjacentes. A separação de preocupações simplifica o design geral do sistema, aprimora a modularidade
e facilita a manutenção e escalabilidade. Camadas comuns incluem apresentação, lógica de negócios e acesso a dados, sendo
que cada camada possui uma responsabilidade bem definida. 

  Alguns pontos negativos que podem ser observados nesse estilo de arquitetura é que podem apresentar problemas de desempenho,
como por exemplo na transferência dados entre camadas. Outro ponto negativo é que alterações em uma camada podem exigir que
alterações sejam feitas na demais, demandando maior tempo e complexidade nessas ações.

Exemplos de utilização do Estilo de Arquitetura em Camadas:
 -  SAP ERP (Sistemas de Planejamento de Recursos Empresariais)
 -  Microsoft ASP.NET:


## 25 - Estilo de Arquitetura de Pipeline

  O estilo de arquitetura de Pipeline, também conhecido como Pipeline Design Pattern, envolve a organização de sistemas
em uma sequência de processos (etapas) chamada de pipeline. Cada etapa representa uma unidade lógica e específica de 
processamento, e os dados fluem sequencialmente através dessas etapas. Cada etapa é responsável por realizar uma parte 
específica do trabalho, e a saída de uma etapa é a entrada para a próxima.

  Apesar da simplicidade, o Estilo de Arquitetura Pipeline apresenta dificuldade para lidar com crescimento da complexidade
no sistema, com fluxo de dados não lineares.

Exemplos de utilização do Estilo de Arquitetura de Pipeline:
 - Apache Airflow
 - GitLab CI/CD

26 -

27 -

28 -

29 -
