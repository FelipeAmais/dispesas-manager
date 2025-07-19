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


📌 Autor
Desenvolvido por Felipe de Oliveira Romeiro Amais
Acadêmico de Ciência da Computação - UNIPAR
https://github.com/FelipeAmais

📈 Futuras melhorias
🔐 Autenticação com Spring Security + JWT

📊 Filtros por data e categoria

🌐 Integração com frontend (React)

📄 Documentação Swagger/OpenAPI

