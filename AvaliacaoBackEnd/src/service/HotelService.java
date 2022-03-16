package service;

import dao.iDao;
import model.Hotel;

public class HotelService {

    private iDao<Hotel> hoteliDao;

    public HotelService(iDao<Hotel> hoteliDao){
        this.hoteliDao = hoteliDao;
    }
    public Hotel salvar(Hotel hotel) {
        hoteliDao.salvar(hotel);
        return hotel;
    }
}
