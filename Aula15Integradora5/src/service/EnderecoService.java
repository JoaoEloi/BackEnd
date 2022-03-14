package service;

import dao.iDao;
import model.Endereco;

public class EnderecoService {

    private iDao<Endereco> enderecoiDao;

    public  EnderecoService(iDao<Endereco> enderecoiDao) {
        this.enderecoiDao = enderecoiDao;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoiDao.salvar(endereco);
        return endereco;
    }

}
