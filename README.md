# 📮 Buscador de CEP

Aplicação em Java para consultar endereços a partir de um CEP, consumindo a API ViaCEP e salvando os dados em um arquivo JSON.

## O que o sistema faz

- Solicita um CEP ao usuário
- Consulta a API ViaCEP e retorna o endereço completo
- Salva os dados do endereço em um arquivo `.json` com o nome do CEP
- Trata erros caso o CEP não seja encontrado

## Tecnologias utilizadas

- **HttpClient** — requisições HTTP para a API
- **Gson** — desserialização do JSON retornado pela API e geração do arquivo JSON
- **FileWriter** — gravação do arquivo `.json` no computador
- **Exceptions** — tratamento de CEP inválido ou não encontrado

## Como executar

1. Clone o repositório
2. Execute a classe `Main.java`
3. Digite o CEP quando solicitado
4. O arquivo `{cep}.json` será gerado na pasta raiz do projeto

## Exemplo de uso
```
Digite o CEP que deseja consultar:
04101300

Endereço encontrado:
CEP: 04101-300
Logradouro: Rua Domingos de Morais
Bairro: Vila Mariana
Cidade: São Paulo
UF: SP

Arquivo 04101300.json gerado com sucesso!
```

## Exemplo do arquivo gerado
```json
{
  "cep": "04101-300",
  "logradouro": "Rua Domingos de Morais",
  "bairro": "Vila Mariana",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

## Aprendizados

- Consumo de API REST com `HttpClient`
- Conversão de JSON para objetos Java com `Gson`
- Gravação de arquivos com `FileWriter`
- Criação de exceptions personalizadas
- Tratamento de erros com `try/catch`
