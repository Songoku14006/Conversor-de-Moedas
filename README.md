Conversor de Moedas - Java
Este é um projeto simples de conversor de moedas, desenvolvido em Java, que utiliza a API ExchangeRate-API para obter as taxas de câmbio entre diferentes moedas. O usuário pode escolher a moeda de origem, a moeda de destino e o valor a ser convertido.

Funcionalidades
Conversão de valores entre diferentes moedas com base nas taxas de câmbio atualizadas.
Suporte a uma ampla gama de moedas internacionais.
Interface simples baseada em console para interações rápidas.
Requisitos
Java 11 ou superior
Biblioteca Gson para manipulação de JSON.
Como usar
Clone este repositório:
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java

Adicione a biblioteca Gson ao seu projeto. Se você estiver usando Maven, adicione a seguinte dependência ao seu pom.xml:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>

Ou baixe manualmente a biblioteca Gson aqui e adicione ao seu projeto.

Compile e execute o programa:

Siga as instruções no console:

Digite o ID da moeda de origem.
Digite o ID da moeda de destino.
Digite o valor a ser convertido.
O programa fará a requisição à API e exibirá o valor convertido para a moeda desejada.

Exemplo de Execução
Digite a moeda de origem: USD
Digite a moeda de destino: BRL
Digite o valor a ser convertido: 100

Valor convertido: 560.77 BRL (Valor obtido no dia 15/10/2024)

API Utilizada:
Este projeto utiliza a ExchangeRate-API para obter as taxas de câmbio. Certifique-se de se inscrever e gerar uma chave de API para uso pessoal.

A URL base para buscar as taxas de uma moeda específica é a seguinte:
https://v6.exchangerate-api.com/v6/SUA-CHAVE-API/latest/USD
Substitua "SUA-CHAVE-API" pela sua chave fornecida pela ExchangeRate-API e "USD" pelo ID da moeda de origem.
