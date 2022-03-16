import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Cachorro;

public class Programa {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        //Usando o construtor padrão
        Cachorro c1 = new Cachorro();
        c1.setNome("Pluto");
        c1.setRaca("Fila");
        c1.setIdade(3);
        c1.setEndereco("Av. Duque de Caxias,12345");

        //Usando o construtor parametrizado
        Cachorro c2 = new Cachorro("Bento", "Beagle", 4, "Casa da Mãe Joana");

        //Adicionando na lista
        cachorros.add(c1);
        cachorros.add(c2);

        //Salvando a coleção cachorros em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutPutFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(cachorros);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());

        }

        //Recuperando a coleção de cachorros de um arquivo

        List<Cachorro> recuperacachorros = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutPutFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperacachorros = (ArrayList) ois.readObject();


        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());

        }
        for(Cachorro c : recuperacachorros) {
            System.out.println(
                    c.getNome()
                            + " | " + c.getRaca()
                            + " | " + c.getIdade()
                            + " | " + c.getEndereco()
            );

        }

    }

}
