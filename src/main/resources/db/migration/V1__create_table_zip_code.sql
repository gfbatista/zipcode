CREATE TABLE zip_code(
    id int auto_increment primary key,
    cep int not null,
    rua varchar(255) not null,
    bairro varchar(120) not null,
    cidade varchar(120) not null,
    uf char(2) not null,
    created_at DATETIME not null,
    updated_at DATETIME not null
);