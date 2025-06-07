# Conversor de Medidas em Java

Este projeto apresenta um conversor de unidades interativo, desenvolvido em Java, executado no terminal (CLI). Ele permite ao usuário transformar valores de temperatura, comprimento, massa e moeda de forma modular e robusta, aplicando princípios de Programação Orientada a Objetos (POO) e tratamento adequado de exceções.

📄 **Descrição**

O conversor oferece um menu simples para o usuário escolher o tipo de medida que deseja converter e inserir o valor, conduzindo-o por submenus até a conversão final. Suporta:

* Conversões de temperatura entre Celsius, Fahrenheit e Kelvin
* Conversões de comprimento entre metros, centímetros, milímetros, polegadas e pés
* Conversões de massa entre quilogramas, gramas e libras
* Conversões de moeda entre Real (BRL), Dólar (USD), Euro (EUR) e Libra Esterlina (GBP)

✅ **Requisitos Funcionais**

* Seleção de tipo de conversão (Temperatura | Comprimento | Massa | Moeda)
* Submenus específicos para cada unidade de origem e destino
* Cálculo preciso e formatação de saída
* Validação de entrada: detectar input não numérico e números inválidos

🚫 **Requisitos Não-Funcionais**

* Implementação em Java 17 seguindo POO
* Tratamento de exceções e mensagens de erro amigáveis
* Interface de linha de comando limpa e intuitiva

🧪 **Testes**

Os testes foram realizados manualmente com entradas válidas e inválidas para garantir:

* Saídas corretas para cada tipo de conversão
* Comportamento adequado em casos de erro (texto não numérico, valores negativos quando não aplicável)
* Precisão nos cálculos de ponto flutuante

🏛 **Arquitetura**

* **Classe `conversor`**: contém o método `main`, controla o fluxo de input do usuário e delega as conversões.
* Métodos de conversão organizados por categoria dentro da mesma classe para modularidade.

🔧 **Tecnologias**

* **Linguagem**: Java 17
* **IDE**: Visual Studio Code
* **Paradigma**: Programação Orientada a Objetos (POO)
* **Interface**: Linha de Comando (CLI)
* **Ambiente**: Windows
💻 **Exemplo de Uso**

```bash
$ javac conversor.java
$ java conversor
Bem-vindo ao conversor de medidas! O que deseja converter?
1- Temperatura
2- Comprimento
3- Massa
4- Moeda
> 1

Escolha a unidade de origem:
1- Celsius
2- Fahrenheit
3- Kelvin
> 1

Insira o valor que você deseja converter: 25

Para:
1- Fahrenheit
2- Kelvin
> 2

Resultado: 25.0°C = 298.15 K
```

---

> Desenvolvido por **Filipe Braga** • [GitHub](https://github.com/Flipebgr)
