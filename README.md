# 💳 Sistema de Pagamentos em Java

Projeto desenvolvido durante meus estudos de **Programação Orientada a Objetos (POO)** utilizando Java, com foco na organização do código e na aplicação do padrão arquitetural MVC.

## 🚀 Sobre o projeto

O sistema simula diferentes formas de pagamento, aplicando conceitos fundamentais de POO e utilizando o padrão **MVC (Model-View-Controller)** para separar as responsabilidades da aplicação.

## 💰 Formas de pagamento

- 💳 **Cartão de Crédito**
- 📄 **Boleto Bancário**
- ⚡ **Pix**

Cada forma de pagamento possui suas próprias classes e fluxo de processamento, facilitando a organização e a manutenção do código.

## 🏗️ Arquitetura do projeto

O projeto utiliza o padrão MVC, dividindo a aplicação em três camadas:

- **Model:** contém as classes que representam as formas de pagamento e suas regras.
- **View:** responsável pela interação com o usuário e pela exibição das informações.
- **Controller:** responsável por coordenar as ações da aplicação e os fluxos de pagamento.

### 📂 Estrutura do projeto

```text
src/
├── Controller/
│   ├── BoletoBancarioController.java
│   ├── CartaoCreditoController.java
│   ├── PagamentosController.java
│   └── PixController.java
├── Model/
│   ├── BoletoBancario.java
│   ├── CartaoCredito.java
│   ├── Pagamentos.java
│   └── Pix.java
├── View/
│   ├── BoletoBancarioView.java
│   ├── CartaoCreditoView.java
│   ├── PagamentoView.java
│   └── PixView.java
└── Main.java
```

## 📚 Conceitos utilizados

- Programação Orientada a Objetos (POO)
- Herança
- Polimorfismo
- Encapsulamento
- Sobrescrita de métodos (`@Override`)
- Separação de responsabilidades
- Padrão arquitetural MVC

## 🛠️ Tecnologias

- Java
- Git e GitHub
- IntelliJ IDEA

## 🎯 Objetivo

Projeto desenvolvido para praticar Java, consolidar os conceitos de POO, aplicar o padrão MVC e acompanhar minha evolução como desenvolvedor.
````
