

## Sobre mim

Sou Graduada em Análise e Desenvolvimento de Sistemas pela PUCGO e pós graduada em Desenvolvimento Full-stack e MBA em segurança da informação. E Atualmente sou Aluna do programa ONE da Oracle, Turma 6
## Contato
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bruna-lorrane-caires-9139a685/)

## Conversor de Moedas

Este projeto Java é um conversor de moedas simples que utiliza uma API externa para obter taxas de câmbio atualizadas. Foi desenvolvido como parte da turma 6 do programa ONE da Alura, em colaboração com a Oracle.

### Componentes Principais

#### Main

O arquivo `Main.java` serve como o ponto de partida da aplicação. Ele instancia a classe `MenuPrincipal` para iniciar o programa.

#### MenuPrincipal

A classe `MenuPrincipal.java` é responsável por exibir o menu inicial ao usuário, onde ele pode inserir seu nome e escolher entre as opções de conversão de moeda disponíveis. Após a seleção, o controle é transferido para a classe `ExecutaMenuPrincipal`.

#### ExecutaMenuPrincipal

A classe `ExecutaMenuPrincipal.java` processa as escolhas do usuário no menu principal. Permite que o usuário defina a moeda de origem e destino para a conversão, além de inserir o valor a ser convertido. Em seguida, chama a classe `ConectaApi` para recuperar as taxas de câmbio e realizar a conversão. Após exibir o resultado, oferece a opção ao usuário de retornar ao menu anterior ou sair do programa.

#### ExecutaSubMenuPrincipal

Quando o usuário deseja voltar ao menu principal para realizar mais conversões ou outras operações, a classe `ExecutaSubMenuPrincipal.java` é ativada. Ela fornece opções adicionais, como visualizar mais opções de conversão, acessar o histórico de conversões ou logs, e permite ao usuário encerrar o programa.

#### ConectaApi

A classe `ConectaApi.java` gerencia a conexão com a API externa para obter as taxas de câmbio atualizadas. Utiliza a biblioteca Gson para analisar o JSON retornado pela API e executar a conversão de moeda conforme especificado pelo usuário.

#### MoedaRecebida

O arquivo `MoedaRecebida.java` define um registro (record) para representar os dados recebidos da API de conversão de moedas. Ele contém campos para o resultado da conversão, o código da moeda base e as taxas de câmbio para outras moedas.

### Funcionalidades

- **Conversão de Moedas:** O programa permite ao usuário escolher a moeda de origem e destino, e inserir o valor a ser convertido. Utiliza uma API externa para obter as taxas de câmbio atualizadas e realizar a conversão com base nessas taxas.

- **Menu Interativo:** Interface intuitiva que guia o usuário através das opções disponíveis de maneira clara e acessível.

- **Tratamento de Erros:** Implementação de tratamento de exceções para lidar com erros de conexão à API, entradas inválidas do usuário e outras situações inesperadas.

- **Formatação de Saída:** Os resultados da conversão são formatados para exibir duas casas decimais, garantindo uma apresentação clara e legível.



Feito por [bruna]

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.


## Documentação

[Documentação](https://docs.oracle.com/en/java/)

