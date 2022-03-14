package test;

import dao.config.ConfigJDBC;
import dao.impl.EnderecoDaoH2;
import model.Endereco;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import service.EnderecoService;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoServiceTest {

    //private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);

    //BasicConfigurator.configure();

    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfigJDBC()));

    @Disabled
    public void carregarEnderecos() {
        Endereco e1 = new Endereco(
          "Eldorado", "2154", "São Paulo", "Morumbi"
        );
    }

    @Test
    public void cadastarEnderecoNoH2() {
        //LOGGER.info("Teste Iniciado");
        Endereco endereco1 = enderecoService.salvar(new Endereco("Eldorado", "2154", "São Paulo", "Morumbi"));
    }

}