# Sprint2_Quote_Levelling_BackEnd
Repositório para as entregas da Sprint 2 da Challenge - Disciplinas Enterprise Application Development &amp; Digital Business Enablement


Nome da Aplicação: Quote Levelling


![image](https://github.com/HebertLins/Sprint-1-JAVA/assets/111543334/cfad3699-e26c-4688-ba36-528b5e970c8a)

GUIA PARA RODAR A APLICAÇÃO:

1 - Deve-se conferir o application.properties e alterar para suas credenciais do seu banco de dados, como url, senha, usuario, tipo de banco e etc;

2 - Rodar a classe principal da aplicação, classe "QuoteLevellingApplication";

3 - O application.properties está configurado como create-drop, portanto Inserts e tabelas serão deletados quando a aplicação for reiniciada, caso queira manter-los altera essa propriedade.

4 - Após a aplicação ter subido, realize os testes das requisições a partir do script do Insomnia. Recomendável seguir a ordem das seguintes Entidades quando for realizar suas requisições:
Endereco -> Cliente/Fornecedor -> Material/Responsavel -> Cotacao;

Vale lembrar que existem validações em nosso sistema, por exemplo em "tipo_empresa", onde só aceita determinados valores.

5 - Deve-se tomar cuidado com os IDs das Entidades quando for realizar requisições que necessitam de um em sua URL. Se atentando para utilizar um já criado;





# DIAGRAMA DE CLASSES

![DiagramaClasse](https://github.com/HebertLins/Sprint2_Quote_Levelling_BackEnd/assets/111543334/f20510fd-6cf8-49fb-94db-62bc3439cfe6)



# DER

![DER](https://github.com/HebertLins/Sprint-1-JAVA/assets/111543334/ee7e01aa-d829-4410-866a-5633f3a88832)


# PITCH

https://youtu.be/Q22Nc1Y658I


# Descrição dos endpoints

Cotação

- 'GET'     /cotacao: lista todas as cortações do sistema
- 'GET'     /cotacao/{id}: lista uma cortaçãp por ID especifico
- 'POST'    /cotacao: cadastro de cotação
- 'PUT'     /cotacao/{id}: alterar dados de uma cotação
- 'DELETE'  /cotacao/{id}: deletar uma cotação específica do sistema

Responsavel

- 'GET'     /responsavel: lista todos os responsáveis do sistema
- 'GET'     /responsavel/{id}: lista um responsavel por ID especifico
- 'POST'    /responsavel: cadastro de responsavel
- 'PUT'     /responsavel/{id}: alterar dados de um responsavel
- 'DELETE'  /responsavel/{id}: deletar um responsavel específico do sistema

Endereco

- 'GET'     /endereco: lista todos os endereços do sistema
- 'GET'     /endereco/{id}: lista um endereço por ID especifico
- 'POST'    /endereco: cadastro de endereço
- 'PUT'     /endereco/{id}: alterar dados de um endereço
- 'DELETE'  /endereco/{id}: deletar um endereço específico do sistema

Fornecedor

- 'GET'     /fornecedor: lista todos os fornecedores do sistema
- 'GET'     /fornecedor/{id}: lista um fornecedor por ID especifico
- 'POST'    /fornecedor: cadastro de fornecedor
- 'PUT'     /fornecedor/{id}: alterar dados de um fornecedor
- 'DELETE'  /fornecedor/{id}: deletar um fornecedor específico do sistema

Cliente

- 'GET'     /cliente: lista todos os clientes do sistema
- 'GET'     /cliente/{id}: lista um cliente por ID especifico
- 'POST'    /cliente: cadastro de cliente
- 'PUT'     /cliente/{id}: alterar dados de um cliente
- 'DELETE'  /cliente/{id}: deletar um cliente específico do sistema

Material

- 'GET'     /material: lista todos os materiais do sistema
- 'GET'     /material/{id}: lista um material por ID especifico
- 'POST'    /material: cadastro de material
- 'PUT'     /material/{id}: alterar dados de um material
- 'DELETE'  /material/{id}: deletar um material específico do sistema

# EXEMPLOS DE JSON

Para este arquivo não ser muito extenso optamos por manter os exemplos de JSON dentro do arquivo INSOMNIA que pode ser encontrado dentro da pasta "documentacao" do projeto.
