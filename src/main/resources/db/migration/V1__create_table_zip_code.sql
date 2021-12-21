CREATE TABLE zip_code(
    id int auto_increment primary key,
    code varchar(8) not null,
    street varchar(255) not null,
    district varchar(120) not null,
    city varchar(120) not null,
    state char(2) not null,
    created_at DATETIME not null DEFAULT CURRENT_TIMESTAMP
);