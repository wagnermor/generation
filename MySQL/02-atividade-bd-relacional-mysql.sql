CREATE DATABASE zeDelivery;
USE zeDelivery;

CREATE TABLE funcionarios(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(50),
telefone VARCHAR(11),
cargo VARCHAR(20),
dataEntrada DATE,
salario DECIMAL(6,2),
PRIMARY KEY(id)
);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Gabriela", "11985247412", "atendente", '2022-12-08', 1899.99);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Guerreiro", "11978874554", "instrutor", '2022-12-08', 9999.99);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Matheus", "11965982545", "estudante", '2022-12-08', 600);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Aimée", "11912365489", "instrutor", '2022-12-08', 9999.99);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Marcelo", "11985247412", "estudante", '2022-12-08', 600);

INSERT INTO funcionarios(nome, telefone, cargo, dataEntrada, salario)
VALUE ("Leonardo", "11945698712", "estudante", '2022-12-08', 600);

SELECT * FROM funcionarios;
SELECT * FROM funcionarios WHERE salario > 2000;
SELECT * FROM funcionarios WHERE salario < 2000;
DELETE FROM funcionarios WHERE id=2;
