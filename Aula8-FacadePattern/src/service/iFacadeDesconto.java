package service;

import model.Cartao;
import model.Produto;

public interface iFacadeDesconto {

    //Método recebendo um objeto como parâmetro
    public  int desconto(Cartao cartao, Produto produto, int quantidade);

}
