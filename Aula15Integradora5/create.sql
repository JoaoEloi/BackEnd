DROP TABLE IF EXISTS enderecos;
CREATE TABLE IF NOT EXISTS enderecos (
  id INT auto_increment PRIMARY KEY,
  rua VARCHAR(64),
  numero VARCHAR(8),
  cidade VARCHAR(32),
  bairro VARCHAR(32)
);