# zipcode
A API consiste basicamente em cadastrar e pesquisar CEPs, expondo duas rotas devidamente autenticadas de [GET] e [POST]. A principal regra da API é no momento da busca de um determinado CEP, onde há uma validação caso não encontre nenhum registro. A validação percorre toda a cadeia de caracteres do CEP e substitui o último caractere por 0, não encontrando registro do mesmo, a substituição é realizada no penúltimo caractere e assim sucessivamente até terminar a cadeia ou encontrar um registro.
Exemplo de todo fluxo: Busca inicial com o registro 14403205 > 14403205 > 14403200 > 14403200 > 14403000 > 14400000 > 14400000 > 14000000 > 10000000 > 00000000
Detalhe importante: Ao cadastrar um novo CEP, uma validação é realizada em uma api exposta dos Correios e somente CEPs válidos serão permitidos.


### Health Check: ###
```
http://localhost:8080/actuator/health
```

### Documentação: ###
```
http://localhost:8080/swagger-ui.html
```
