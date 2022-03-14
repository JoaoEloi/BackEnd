package model;

import org.apache.log4j.Logger;

public class Tigre {
    private static Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        Tigre.logger = logger;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void correr() {
        logger.info("O Leão " + nome + " está correndo");
    }

    public void eMaiorQue10() throws Exception{
        if (idade > 10) {
            logger.info("O tigre " + nome + " tem mais de 10 anos!");
        }
        if (idade < 0) {
            //Log do Log4J
            logger.error("Idade inválida!");
            //Exception do java
            throw new Exception();
            //São diferentes e independentes entre

        }

    }

}

