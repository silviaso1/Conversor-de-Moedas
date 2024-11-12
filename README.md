# Aplicativo de Conversor de Moedas

Este é um aplicativo de terminal em Java que permite aos usuários converter moedas em tempo real. A aplicação utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio atuais e exibir um gráfico com as taxas de câmbio históricas.

## Funcionalidades

- **Conversão de Moedas em Tempo Real**: Converta moedas como USD, EUR, BRL, ARS e COP.
- **Menu Amigável no Terminal**: Navegue por um menu intuitivo no terminal para selecionar pares de moedas.
- **Design Orientado a Objetos**: O aplicativo segue princípios de design orientado a objetos com uma estrutura modular.
- **Arquitetura Extensível**: Expanda facilmente a aplicação para adicionar novos pares de moedas ou funcionalidades de conversão.

## Tecnologias Utilizadas

- **Java 21**: Linguagem principal usada para o desenvolvimento.
- **Maven**: Ferramenta de gerenciamento de dependências e construção de projeto.
- **Gson**: Usado para analisar as respostas JSON da API.
- **ExchangeRate-API**: API utilizada para recuperar taxas de câmbio em tempo real e dados históricos.

## Estrutura do Projeto

- ┌── ConversorMoedas/
- │├── src/
- ││├── Main.java <span style="color:yellow;"># Ponto de entrada principal</span>
- ││├── Menu.java <span style="color:yellow;"># Gerencia a lógica do menu</span>
- ││├── ApiIntegration.java <span style="color:yellow;"># Gerencia as requisições para a API</span> 
- ││├── DollarConverter.java <span style="color:yellow;"># Gerencia conversões de USD</span> 
- │ ├── EuroConverter.java <span style="color:yellow;"># Gerencia conversões de EUR</span>
- ├── .gitignore <span style="color:yellow;"># Arquivo para ignorar arquivos e diretórios no Git</span>
- ├── pom.xml <span style="color:yellow;"># Configuração do projeto Maven</span>
- └── README.md <span style="color:yellow;"># Documentação do projeto</span>

## Instalação e Configuração

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/silviaso1/Conversor-de-Moedas.git
    cd ConversorMoedas
    ```

2. **Instale as Dependências do Maven**:
   Certifique-se de ter o Maven instalado. Se não tiver, faça o download seguindo o [Guia de Instalação do Maven](https://maven.apache.org/install.html). Execute o seguinte comando para instalar as dependências do projeto:
    ```bash
    mvn clean install
    ```

3. **Obtenha Sua Chave da API**:
    - Acesse [ExchangeRate-API](https://www.exchangerate-api.com/) e registre-se para obter uma chave de API gratuita.
    - Abra o arquivo `ApiIntegration.java` e substitua `YOUR_API_KEY` pela sua chave de API.

4. **Execute a Aplicação**

## Uso

1. **Menu Principal**:
    - A aplicação exibirá o menu principal, onde você pode selecionar as moedas para conversão (por exemplo, USD, EUR).

2. **Conversão de Moedas**:
    - Após selecionar uma moeda, insira o valor a ser convertido, e o aplicativo buscará as taxas de câmbio em tempo real usando a ExchangeRate-API.

## Exemplo de Uso

1. No terminal, selecione a moeda que deseja converter (por exemplo, `Dólar $`).
2. Escolha o tipo de conversão (por exemplo, `Dólar $ => Real R$`).
3. Insira o valor que deseja converter, e o resultado será exibido.

## Dependências

- **Java 21**: Certifique-se de que o Java 21 esteja instalado em sua máquina.
- **Maven**: Para construção do projeto e gerenciamento de dependências.
- **Gson**: Para analisar dados JSON da API.

Adicione as seguintes dependências Maven no seu `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```