# Lembretes - Backend

Este é o diretório do backend da aplicação Lembretes. Aqui você encontrará o código fonte e os arquivos de configuração necessários para o servidor.

## Descrição

O backend do Lembretes é um projeto de API RESTful desenvolvido em Java usando o framework Spring Boot. Ele fornece os serviços e funcionalidades necessários para a aplicação de lembretes. Aqui estão alguns detalhes sobre o projeto:

- Linguagem de programação: Java
- Framework: Spring Boot

## Configuração e Execução

Para configurar e executar o backend, serão necessárias algumas etapas de instalação e configuração.

### Pré-requisitos

- JDK (Java Development Kit) instalado na máquina. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle. Para verificar se foi instalado corretamente, digite o seguinte código no terminal:
 $ java -version
 $ javac -version
 
 ### Instalação da IDE

1. Baixe e instale o Spring Tools Suite 4 em sua máquina a partir do site oficial da Spring: https://spring.io/tools.
   Ou, se preferir, utilize o Visual Studio Code com a extensão Spring Boot Extension Pack.
   
### Configuração do Lombok

1. Faça o download do Lombok em https://projectlombok.org/download.
2. Após o download, execute o arquivo lombok.jar para iniciar o instalador da biblioteca.
3. Na lista de IDEs, selecione apenas as IDEs nas quais você deseja instalar o Lombok.
   Caso sua IDE não esteja na lista, clique no botão "Specify location" para especificar o diretório da sua IDE.
   Em seguida, clique no botão "Install / Update" para iniciar a instalação.
   Você receberá uma mensagem de sucesso após a conclusão da instalação.

   
#### Dependências utilizadas

Além do Lombok, o projeto do backend utiliza as seguintes dependências já instaladas no pom.xml:
- Spring Boot Starter Web: Fornece suporte para desenvolvimento de aplicações web com o Spring MVC.
- DevTools: Oferece ferramentas de desenvolvimento para melhorar a produtividade durante o ciclo de desenvolvimento.
- Spring Data JPA: Facilita o acesso a dados e a implementação de repositórios usando a tecnologia JPA (Java Persistence API).
- MySQL Driver: Driver de conexão JDBC para o MySQL.
- Flyway DB e Flyway MySQL: Utilizados para migração e versionamento do banco de dados.



### Importando o projeto

1. Faça o clone do projeto a partir do repositório: https://github.com/lucasdiniz1708/lembretes-api.
2. Abra a IDE Spring Tools Suite 4 ou o Visual Studio Code e importe o projeto como um projeto Maven existente.

### Configuração do banco de dados

1. Certifique-se de ter o MySQL Server instalado e configurado corretamente.
2. Abra o arquivo `application.properties` localizado no diretório `src/main/resources`.
3. Configure as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password` de acordo com as configurações do seu banco de dados MySQL. Por exemplo:
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
4. Certifique-se de que a tabela `lembrete` exista no banco de dados.

### Executando o servidor

Existem duas maneiras de executar o servidor backend:

#### Opção 1: Executando o servidor pela IDE

1. Certifique-se de ter o JDK, Lombok e MySQL Server instalados em sua máquina.
2. Na IDE Spring Tools Suite 4 ou no Visual Studio Code, navegue até o arquivo `LembretesApplication.java` localizado no pacote `com.example.lembretes`.
3. Clique com o botão direito do mouse no arquivo e selecione `Run As` > `Java Application`.
4. Aguarde até que o servidor seja inicializado. Você verá a mensagem "Tomcat started on port(s): 8080" no console da IDE ou do terminal.

#### Opção 2: Executando o servidor por linha de comando

1. Certifique-se de ter o JDK, Lombok e MySQL Server instalados em sua máquina.
2. No terminal, navegue até o diretório raiz do projeto backend.
3. Execute o seguinte comando para compilar e criar o arquivo JAR do projeto:
4. Após a conclusão do comando acima, execute o seguinte comando para iniciar o servidor:
5. Aguarde até que o servidor seja inicializado. Você verá a mensagem "Tomcat started on port(s): 8080" no console.

Após o servidor ser iniciado com sucesso, você pode acessar a aplicação de lembretes através do seu navegador ou de outra ferramenta de requisições HTTP, utilizando o endpoint `/lembretes` e a URL `http://localhost:8080`. Certifique-se de enviar as requisições HTTP corretamente para interagir com a API RESTful.

Espero que isso te ajude!
