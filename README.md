# fiscaltech - backend

Projeto backend Java desenvolvido para implementação de CRUD para teste na FiscalTech.

# Tecnologias utilizadas

  - Eclipse Oxygen
  - Spring
  - Banco de dados H2

# Configuração 

  - Importar o projeto via Maven (Existing Maven Projects).
  - Executar o "Update Project" para download das bibliotecas.
```sh
Botão direito no projeto -> Maven -> Update Project
```
  - Executar o Java Application no arquivo Application.java.
```sh
Botão direito no arquivo "Application.java" -> Run As -> Java Application
```
  - O servidor será iniciado na porta 8080.
```sh
http://localhost:8000
```

### Importante
  - O projeto foi desenvolvido utilizando webservice REST para comunicação com o frontend.
  - Existe um arquivo chamado schema.sql que é executado automaticamente na inicialização do projeto e contém o script de criação do banco de dados.
  - Existe um arquivo chamado data.sql que é executado automaticamente na inicializaçao do projeto e contem scrip para criação de registros na base.  Foram criadas 4 cores e 1 veículo para popular a base de dados.
  - O console do h2, que é um banco de dados em memória, pode ser acessado através do link abaixo:
```sh
http://localhost:8080/api/h2/
```

### Considerações Finais
  - Os commits foram dados a partir de outra conta minha no github que se chama "naodeixesobrar" que é uma conta utilizada para desenvolvimento de um projeto pessoal.  A minha máquina já estava com as credenciais do git configuradas para esse perfil e eu só percebi ao dar push nos arquivos.
