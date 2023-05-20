# Lembretes - Backend

Este é o diretório do backend da aplicação Lembretes. Aqui você encontrará o código fonte e os arquivos de configuração necessários para o servidor.<br>
               ![image](https://github.com/lucasdiniz1708/lembretes-api/blob/main/resposta-servidor.png)
<br> Na imagem acima podemos ver a resposta que o servidor está em execução ao acessar localhost:8080
## Descrição

O backend do Lembretes é um projeto de API RESTful desenvolvido em Java usando o framework Spring Boot. Ele fornece os serviços e funcionalidades necessários para a aplicação de lembretes. Aqui estão alguns detalhes sobre o projeto:

- Linguagem de programação: Java
- Framework: Spring Boot

# Configuração e Execução

Para configurar e executar o backend, serão necessárias algumas etapas de instalação e configuração.

## Pré-requisitos

- JDK (Java Development Kit) instalado na máquina. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle. Para verificar se foi instalado corretamente, digite o seguinte código no terminal:
<br> $ java -version
<br> $ javac -version


## Preparando o ambiente
 ### Instalação da IDE

1. Baixe e instale o Spring Tools Suite 4 em sua máquina a partir do site oficial da Spring: https://spring.io/tools.
  <br> Ou, se preferir, utilize o Visual Studio Code com a extensão Spring Boot Extension Pack.
 
#### Dependências utilizadas

Além do Lombok, o projeto do backend utiliza as seguintes dependências já instaladas no pom.xml:
- Spring Boot Starter Web: Fornece suporte para desenvolvimento de aplicações web com o Spring MVC.
- DevTools: Oferece ferramentas de desenvolvimento para melhorar a produtividade durante o ciclo de desenvolvimento.
- Spring Data JPA: Facilita o acesso a dados e a implementação de repositórios usando a tecnologia JPA (Java Persistence API).
- MySQL Driver: Driver de conexão JDBC para o MySQL.
- Flyway DB e Flyway MySQL: Utilizados para migração e versionamento do banco de dados.
   
### Configuração do Lombok

1. Faça o download do Lombok em https://projectlombok.org/download.
2. Após o download, execute o arquivo lombok.jar para iniciar o instalador da biblioteca.
3. Na lista de IDEs, selecione apenas as IDEs nas quais você deseja instalar o Lombok.
   Caso sua IDE não esteja na lista, clique no botão "Specify location" para especificar o diretório da sua IDE.
   Em seguida, clique no botão "Install / Update" para iniciar a instalação.
   Você receberá uma mensagem de sucesso após a conclusão da instalação.
   
### Instalação MySQL Server
1. Acesse https://dev.mysql.com/downloads/windows/installer/8.0.html e faça download do arquivo de instalação completo. (.msi)
2. Na etapa Choosing a Setup Type, selecione a opção Custom
3. Na etapa Select Products, encontre e mova os seguintes produtos do lado esquerdo para o lado direito:
• MySQL Server 8.0.x
• MySQL Workbench 8.0.x
Clique em Next logo em seguida.
4. Na etapa Check Requirements, clique no botão Execute.
5. Na etapa Installation, clique no botão Execute para iniciar a instalação do MySQL Server.
6. Na etapa Product Configuration, clique no botão Next.
7. A primeira tela de configuração é a Type and Networking, onde é possivel configurar a porta que o servidor 
MySQL ira usar para receber conexões. No codigo foi utilizado a porta 3306. Anote a porta que for utilizar para fazer
futuras conexões.
8. Na etapa Authentication Method, não altere nada e apenas clique no botão Next.
9. Nesta etapa (Accounts and Roles) você deve configurar uma senha para o usuário
root, que é o administrador do servidor de banco de dados. Digite uma senha no campo e anote ela, ela sera a senha
do seu root MySQL, caso tenha interesse em fazer consultas no MySQL WorkBench por exemplo.
10. Na etapa Windows Service não altere nada e apenas clique no botão Next.
11. Na etapa Apply Configuration, clique no botão Next para que todas as
configurações sejam aplicadas
Ainda em Apply Configuration, ao concluir a aplicação das
configurações, apenas clique em Finish.
12. Voltamos para Product Configuration, indicando que a configuração está
finalizada. Clique em Next
13. A instalação e configuração do MySQL Server e MySQL Workbench está concluída. Clique no botão Finish.

## Importando o projeto
1. Faça o clone do projeto a partir do repositório: https://github.com/lucasdiniz1708/lembretes-api.
2. Abra o workspace lembretes-api apartir do Spring Tools Suite 4 ou Visual Studio Code.

### Configuração do banco de dados

1. Certifique-se de ter o MySQL Server instalado e configurado corretamente.
2. Abra o arquivo `application.properties` localizado no diretório `src/main/resources`.
3. Configure as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password` de acordo com as configurações do seu banco de dados MySQL. Por exemplo:
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
4. Certifique-se de que a tabela `lembrete` exista no banco de dados.

### Executando o servidor

1. Certifique-se de ter o JDK, Lombok e MySQL Server instalados em sua máquina.
2. Na IDE Spring Tools Suite 4 ou no Visual Studio Code, navegue e clique até o botão "Run" do Boot DashBoard Spring Boot. 
3. Aguarde até que o servidor seja inicializado. Você verá a mensagem "Tomcat started on port(s): 8080".

Após o servidor ser iniciado com sucesso, você pode acessar a aplicação de lembretes através do seu navegador ou de outra ferramenta de requisições HTTP, utilizando o endpoint `/lembretes` e a URL `http://localhost:8080`. Certifique-se de enviar as requisições HTTP corretamente para interagir com a API RESTful de acordo com a classe controller do codigo.

## Necessidade do servidor para funcionamento completo da aplicação

Para testar a funcionalidade completa da aplicação, verifique se você possui o front em execução, através do Visual Studio Code com a extensão live server, seguindo as instruções no repositório. [https://github.com/lucasdiniz1708/lembretes-front](https://github.com/lucasdiniz1708/lembretes-front)
