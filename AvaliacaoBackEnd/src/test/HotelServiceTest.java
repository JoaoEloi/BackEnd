package test;

import dao.config.ConfigJDBC;
import dao.impl.HotelDaoH2;
import model.Hotel;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.HotelService;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    private static final Logger LOGGER = Logger.getLogger(HotelServiceTest.class);

    private HotelService hotelService = new HotelService(new HotelDaoH2(new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarNovaFilial() {
        LOGGER.info("Cadastrando a filial no H2");

    Hotel hotelFilial= new Hotel("Filial de Teste", "Eldorado", "1234", "Belém", "Pará", true);
    Hotel hotel = hotelService.salvar(hotelFilial);

    LOGGER.info("Filial " + hotel.getId() + " cadastrada com sucesso");
    }

}