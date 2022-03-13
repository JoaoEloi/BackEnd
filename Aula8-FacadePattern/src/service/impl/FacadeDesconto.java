package service.impl;

import model.Cartao;
import model.Produto;
import service.iFacadeDesconto;

import java.time.Period;

public class FacadeDesconto implements iFacadeDesconto {

    //Armazenar as variáveis para as instâncias
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //Utilização das APIs para os cálculos dos descontos
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int desconto = 0;
        desconto += apiQuantidade.desconto(quantidade);
        desconto += apiProduto.desconto(produto);
        desconto += apiCartao.desconto(cartao);
        return desconto;
    }
}
