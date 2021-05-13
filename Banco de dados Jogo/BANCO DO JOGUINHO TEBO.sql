CREATE DATABASE dbJoguinho;
USE dbJoguinho;

CREATE TABLE tbJogador(
	id int auto_increment,
    nome varchar(30),
    seg int,
    min int,
    miliseg int,
    tipo varchar(2),
    posicao int,
    
    CONSTRAINT pk_tbJogador PRIMARY KEY (id)
);

