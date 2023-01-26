CREATE TABLE role (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO role(id, name) VALUES (1, 'ROLE_USER');
INSERT INTO role(id, name) VALUES (2, 'ROLE_ADMIN');
INSERT INTO role(id, name) VALUES (3, 'ROLE_SUPER_ADMIN');


CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT,
  first_name varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO user(id, first_name, last_name, email) VALUES (1, 'Admin', 'Admin', 'admin@vinod.com');
INSERT INTO user(id, first_name, last_name, email) VALUES (2, 'User', 'user', 'user@vinod.com');


CREATE TABLE user_roles (
  user_id bigint NOT NULL,
  roles_id bigint NOT NULL,
  KEY FKj9553ass9uctjrmh0gkqsmv0d (roles_id),
  KEY FK55itppkw3i07do3h7qoclqd4k (user_id),
  CONSTRAINT FK55itppkw3i07do3h7qoclqd4k FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT FKj9553ass9uctjrmh0gkqsmv0d FOREIGN KEY (roles_id) REFERENCES role (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO user_roles(user_id, roles_id) VALUES (1, 1);
INSERT INTO user_roles(user_id, roles_id) VALUES (1, 2);
INSERT INTO user_roles(user_id, roles_id) VALUES (1, 3);
INSERT INTO user_roles(user_id, roles_id) VALUES (2, 1);
