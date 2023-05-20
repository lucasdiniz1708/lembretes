# Lembretes - Backend

Este é o diretório do backend da aplicação Lembretes. Ele contém o código fonte e os arquivos de configuração necessários para o servidor.

## Descrição

O backend é responsável por processar as requisições do frontend e fornecer os dados e serviços necessários para a aplicação de lembretes. Aqui estão alguns detalhes sobre o backend:

- IDE utilizada: Spring Tools Suite 4
- Dependências utilizadas: Spring Boot Starter Web, Lombok, DevTools, Spring Data JPA, MySQL Driver, Flyway DB e Flyway MySQL.

## Configuração e Execução

Para configurar e executar o backend, siga as etapas abaixo:

### Pré-requisitos

- JDK (Java Development Kit) instalado na máquina. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle.
- MySQL Server instalado e configurado corretamente. Certifique-se de ter as credenciais de acesso ao banco de dados.

### Instalação da IDE

1. Baixe e instale o Spring Tools Suite 4 em sua máquina a partir do site oficial da Spring: https://spring.io/tools.

### Importando o projeto

1. Faça o clone do projeto a partir do repositório: https://github.com/lucasdiniz1708/lembretes-api.
2. Abra a IDE Spring Tools Suite 4.
3. No menu superior, selecione `File` > `Import...`.
4. Na janela de importação, escolha `Existing Maven Projects` e clique em `Next`.
5. Navegue até o diretório onde você clonou o projeto e selecione a pasta raiz.
6. Certifique-se de que o arquivo `pom.xml` esteja selecionado e clique em `Finish`.
7. Aguarde até que a IDE importe o projeto e resolva as dependências.

### Configuração do banco de dados

1. Certifique-se de ter o MySQL Server instalado e configurado corretamente.
2. Abra o arquivo `application.properties` localizado no diretório `src/main/resources`.
3. Configure as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password` de acordo com as configurações do seu banco de dados MySQL. Por exemplo:
  spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
4. A tabela utilizada pela aplicação é `lembrete`. Certifique-se de que ela exista no banco de dados.

### Executando o servidor

Existem duas maneiras de executar o servidor backend:

#### Opção 1: Executando o servidor pela IDE

1. Certifique-se de ter o JDK e o MySQL Server instalados em sua máquina.
2. Na IDE Spring Tools Suite, navegue até o arquivo `LembretesApplication.java` localizado no pacote `com.example.lembretes`.
3. Clique com o botão direito do mouse no arquivo e selecione `Run As` > `Java Application`.
4. Aguarde até que o servidor seja inicializado. Você verá a mensagem "Tomcat started on port(s): 8080" no console da IDE.

#### Opção 2: Executando o servidor por linha de comando

1. Certifique-se de ter o JDK e o MySQL Server instalados em sua máquina.
2. No terminal, navegue até o diretório raiz do projeto backend.
3. Execute o seguinte comando para compilar e criar o arquivo JAR do projeto:

