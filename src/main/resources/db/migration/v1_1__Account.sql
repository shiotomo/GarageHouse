create table if not exists account (
    id int AUTO_INCREMENT,
    name text not null,
    password tect not null,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp on update current_timestamp,
    INDEX (id)
) ENGINE=InnoDB;