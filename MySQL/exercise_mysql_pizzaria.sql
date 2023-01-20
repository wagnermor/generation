/*CREATE DATABASE db_pizzaDoZe;

USE db_pizzaDoZe;

CREATE TABLE tb_categoria(
id int AUTO_INCREMENT,
nome_categoria VARCHAR(30),
tamanho CHAR,

PRIMARY KEY (id)
);

CREATE TABLE tb_pizzas (
id INT AUTO_INCREMENT,
sabor VARCHAR(30),
valor BIGINT,
acompanhamento VARCHAR(30),
borda_recheada BOOLEAN,
categoria_id INT,

PRIMARY KEY (id),
FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Salgada","B");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Salgada","M");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Salgada","G");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Doce","B");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Doce","M");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Doce","G");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Vegetariana","B");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Vegetariana","M");
INSERT INTO tb_categoria(nome_categoria,tamanho) VALUES("Vegetariana","G");

INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Mussarela",70,"Refrigerante de Guaraná",false,1);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Calabresa",50,"Suco",true,2);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Toscana",45,"Vinho",true,3);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Gorgonzola",85,"Agua com Gás",false,3);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("MM's",50,"Refrigerante de Soda",true,4);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Prestígio",70,"Coca Cola 500",true,5);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Romeu e Julieta",75,"Coca Cola 2L",true,6);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Abobrinha",50,"Suco",true,7);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Brócolis com Queijo",80,"Fanta Uva",true,8);
INSERT INTO tb_pizzas(sabor, valor, acompanhamento, borda_recheada, categoria_id)
VALUES("Escarola",80,"Vinho",true,9);*/

-- SELECT id, nome_categoria FROM tb_categoria;
-- Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
-- SELECT * FROM tb_pizzas WHERE valor > 
-- Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00.
-- SELECT * FROM tb_pizzas WHERE valor BETWEEN 50 AND 100;
-- Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
-- SELECT * FROM tb_pizzas WHERE sabor LIKE "%M%";
-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias.
-- SELECT * FROM tb_pizzas INNER JOIN tb_categoria ON tb_categoria.id = tb_pizzas.categoria_id;
/*SELECT * FROM tb_pizzas
INNER JOIN tb_categoria
ON tb_pizzas.categoria_id = tb_categoria.id
WHERE nome_categoria LIKE "%doce%";*/
-- Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.
SELECT * FROM tb_pizzas
INNER JOIN tb_categoria
ON tb_pizzas.categoria_id = tb_categoria.id
WHERE tb_categoria.id = 3;