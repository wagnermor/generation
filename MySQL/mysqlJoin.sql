/*CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias(
id INT AUTO_INCREMENT,
nome_categoria VARCHAR(30),
nivel VARCHAR(30),

PRIMARY KEY (id)
);

CREATE TABLE tb_cursos(
id INT AUTO_INCREMENT,
nome VARCHAR(30),
valor BIGINT,
carga_horaria INT,
nome_professor VARCHAR(30),
data_inicio DATE,
categoria_id int,

PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(nome_categoria, nivel)
VALUES("POO", "BÁSICO");
INSERT INTO tb_categorias(nome_categoria, nivel)
VALUES("POO", "INTERMEDIÁRIO");

INSERT INTO tb_categorias(nome_categoria, nivel)
VALUES("BANCO DE DADOS", "BÁSICO");
INSERT INTO tb_categorias(nome_categoria, nivel)
VALUES("BANCO DE DADOS", "INTERMEDIÁRIO");

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("JAVA", 3499, 300, "Uncle Bob", "2023-01-08", 2);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("Python", 2500.99, 300, "Uncle Bob", "2023-01-08", 2);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("JAVA", 3500.99, 300, "Loiane Groner", "2023-01-08", 1);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("Python", 2000, 300, "Loiane Groner", "2023-01-08", 1);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("MySQL", 350.99, 250, "Jessica", "2023-02-08", 3);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("PostegreSQL", 499, 250, "Jessica", "2023-02-08", 3);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("SQL", 450.99, 250, "Aimée", "2023-02-08", 4);

INSERT INTO tb_cursos(nome, valor, carga_horaria, nome_professor, data_inicio, categoria_id)
VALUES("PostegreSQL", 400.99, 250, "Aimée", "2023-02-08", 4);*/

-- SELECT * FROM tb_categorias;
-- SELECT * FROM tb_cursos;
-- SELECT * FROM tb_cursos WHERE valor > 500;
-- SELECT * FROM tb_cursos WHERE valor BETWEEN 600 AND 1000;
-- SELECT * FROM tb_cursos WHERE nome LIKE "%j%";
/*SELECT *
FROM tb_cursos
INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id;*/

SELECT *
FROM tb_cursos
INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id
WHERE nivel LIKE "%BaSiCo%";

-- DROP DATABASE db_curso_da_minha_vida;
-- UPDATE tb_cursos SET valor = 800 WHERE id = 8;
