package test;

import model.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.FlyweightFactory;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2() {

        Triangulo triangulo = FlyweightFactory.obterTriangulo("Vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("Vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("Azul");
        triangulo2.setTamanho(5);

        Triangulo triangulo3 = FlyweightFactory.obterTriangulo("Branco");
        triangulo3.setTamanho(7);

        Assertions.assertEquals(triangulo.getCor(),"Vermelho");
        Assertions.assertEquals(triangulo1.getTamanho(),4);
        Assertions.assertEquals(FlyweightFactory.trianguloMap.size() == 3, true);
    }
}