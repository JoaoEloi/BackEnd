import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,3,23));

        p2 = new Pessoa("Ana", "Ganda");
        p2.setIdade(LocalDate.of(1966,1,23));

        p3 = new Pessoa("Rob", "Ganda");
        p3.setIdade(LocalDate.of(1976,10,25));

        p4 = new Pessoa("Joe", "Ganda");
        p4.setIdade(LocalDate.of(2010,12,4));

        p5 = new Pessoa("Ted", "Ganda");
        p5.setIdade(LocalDate.of(2014,5,25));

        p6 = new Pessoa("Robert", "Ganda");
        p6.setIdade(LocalDate.of(2000,3,30));

        p7 = new Pessoa("Renata", "Ganda");
        p7.setIdade(LocalDate.of(2010,1,18));

        p8 = new Pessoa("Murilo", "Ganda");
        p8.setIdade(LocalDate.of(2015,7,11));

        p9 = new Pessoa("Candido", "Ganda");
        p9.setIdade(LocalDate.of(1975,9,1));

        p10 = new Pessoa("Camila", "Ganda");
        p10.setIdade(LocalDate.of(2010,5,25));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        p1.adicionarNome(p1);
        p2.adicionarNome(p2);
        p3.adicionarNome(p3);
        p4.adicionarNome(p4);
        p5.adicionarNome(p5);
        p6.adicionarNome(p6);
        p7.adicionarNome(p7);
        p8.adicionarNome(p8);
        p9.adicionarNome(p9);
        p10.adicionarNome(p10);
    }

}