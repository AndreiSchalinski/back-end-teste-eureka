create table usuario
(
    id               bigint       not null auto_increment,
    nome             varchar(255) not null,
    email            varchar(255) not null,
    telefone            varchar(255) not null,
    username            varchar(255) not null,
    password         varchar(255) not null,
    role       bigint       not null,
    primary key (id)
);