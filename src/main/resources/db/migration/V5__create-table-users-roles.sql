create table user_roles
(
    user_id bigint not null,
    role_id int not null,
    primary key (user_id, role_id),
    foreign key (user_id) references usuario (id),
    foreign key (role_id) references roles (id)
);