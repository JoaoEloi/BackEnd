DROP TABLE IF EXISTS filiais;

CREATE TABLE IF NOT EXISTS filiais (
  id INT auto_increment PRIMARY KEY,
  nomeFilial VARCHAR(64),
  rua VARCHAR(64),
  numero VARCHAR(10),
  cidade VARCHAR(32),
  estado VARCHAR(32),
);