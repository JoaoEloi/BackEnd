package dao.impl;

import dao.config.ConfigJDBC;
import dao.iDao;
import model.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelDaoH2 implements iDao<Hotel> {

    private ConfigJDBC configJDBC;

    public HotelDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {

        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String query = String.format(
                "INSERT INTO filiais" +
                        "(nomeFilial,rua, numero, cidade, estado)" +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                hotel.getRua(),
                hotel.getNumero(),
                hotel.getCidade(),
                hotel.getNomeFilial(),
                hotel.getEstado(),
                hotel.getId()
        );

        try{
            stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()){
                hotel.setId(keys.getInt(1));
                stmt.close();
                connection.close();
            }

        } catch(SQLException e) {
            e.printStackTrace();

        }

        return null;
    }

}
