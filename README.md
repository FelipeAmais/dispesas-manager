# 💸 API de Gerenciamento de Despesas

API REST desenvolvida em **Spring Boot** para o controle de despesas pessoais, com categorização, persistência em banco de dados MySQL e estrutura baseada em boas práticas de desenvolvimento.

---

## 📌 Funcionalidades

- ✅ Cadastro de **categorias de despesas**
- ✅ Cadastro de **despesas**, vinculadas a uma categoria
- ✅ Edição, listagem e exclusão de categorias e despesas
- ✅ Relacionamento entre entidades (Despesas possuem uma Categoria)
- ✅ Tratamento básico de erros
- ✅ Separação entre Controller, Service e Repository (boas práticas)
- ✅ Testado com Postman

---

## 🧱 Tecnologias Utilizadas

- ✅ Java 21
- ✅ Spring Boot 3.5.3
- ✅ Spring Web
- ✅ Spring Data JPA
- ✅ MySQL 8
- ✅ Hibernate ORM
- ✅ Lombok (opcional)
- ✅ Postman (para testes)

---

## 🗂️ Estrutura do Projeto

src/
├── controller/ # Endpoints da API
├── model/ # Entidades JPA (Despesa, Categoria)
├── repository/ # Interfaces de acesso ao banco
├── service/ # Regras de negócio
└── DespesasApplication.java


---

## 🧪 Exemplo de JSON (POST de Despesa)

```json
{
  "descricao": "Conta de Luz",
  "valor": 210.50,
  "data": "2025-07-18",
  "categoria": {
    "id": 1
  }
}

```

⚙️ Como rodar o projeto localmente
Clone o repositório

bash
Copiar
Editar
git clone https://github.com/seu-usuario/despesas-api.git
cd despesas-api
Configure o banco MySQL

Crie um banco chamado despesas (ou outro nome e altere no application.properties)

Exemplo no MySQL:

sql
Copiar
Editar
CREATE DATABASE despesas;
Configure o application.properties

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/despesas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Execute com Maven

bash
Copiar
Editar
./mvnw spring-boot:run
Ou no Windows:

bash
Copiar
Editar
mvn spring-boot:run
Acesse a API:

bash
Copiar
Editar
http://localhost:8080/despesas
http://localhost:8080/categorias
📥 Endpoints principais
Método	Endpoint	Descrição
GET	/despesas	Lista todas as despesas
POST	/despesas	Cria uma nova despesa
PUT	/despesas	Atualiza uma despesa existente
DELETE	/despesas/{id}	Exclui uma despesa pelo ID
GET	/categorias	Lista todas as categorias
POST	/categorias	Cria uma nova categoria
PUT	/categorias	Atualiza uma categoria existente
DELETE	/categorias/{id}	Exclui uma categoria pelo ID

📌 Autor
Desenvolvido por Felipe de Oliveira Romeiro Amais
Acadêmico de Ciência da Computação - UNIPAR
LinkedIn
GitHub

📈 Futuras melhorias
🔐 Autenticação com Spring Security + JWT

📊 Filtros por data e categoria

🌐 Integração com frontend (React)

📄 Documentação Swagger/OpenAPI

