import model.Leao;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        //Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        //Uso do construtor parametrizado
        Leao leao = new Leao("Simba", -1, true);


        //Uso do construtor padrão
        //Leao leao1 = new Leao();
        //Métodos sendo setados
        //leao1.setNome("Mufasa");
        //leao1.setIdade(5);
        //leao1.seteAlfa(true);
        //leao1.correr();


        //Tudo dentro do bloco try tentará ser executado e caso dê algum erro ele lançará uma exception
        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do leão " + leao.getNome() + " é inválida", e);
        }




    }

}


