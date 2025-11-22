o PROPOSITO DO PROJETO É PARA EXTEERNALIZAR E CENTRALIZZAR AS CONFIGURAÇÕES BANCÁRIAS DE MICROSERVIÇOS PODENDO SER UTILIZADAS CADA UM COM SUA CONFIGURAÇÃO, DEV, QA, ETC. 
Em fez de cada seviço ter configurações padrozinas e acessiveis para todos, elas ficam num repositorio Git e são fornecidas por um config server. 

Ele é importante em cenário de Banco porque, como existem varios microserviços cada um precisa de uma configuração especifica, de forma a dar segurança e consistencia a aplicação e aos envolvidos.

Justifica-se porque é necessário no cenáriode banco digital pelos proprios fundamentos expostos.

Configuração externalizada é quando parametros do sistema ficam fora do codigo, e centralizada ficam num lugar oficial tipo git ou config server. 

É importante porquecada banco tem seu proprio ambiente, cada setor do banco.

Uma forma de proteger é você colocar no codigo cirptografia, no config server exemplo: 
spring:
  datasource:
    password: "{cipher}AQB3...xyz"
