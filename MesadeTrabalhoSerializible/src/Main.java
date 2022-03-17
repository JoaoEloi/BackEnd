import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Contato;

public class Main {

    public static void main(String[] args){

        List<Contato> contatos = new ArrayList<>();

        //Usando o construtor padrão
        Contato contato1 = new Contato();
        contato1.setNome("Maria");
        contato1.setEmail("maria@gmail.com");
        contato1.setTelefone("1234567");

        //Usando o construtor parametrizado
        Contato contato2 = new Contato("Carlos", "carlos@yahoo.com", "2345334");

        //Adicionando na lista
        contatos.add(contato1);
        contatos.add(contato2);

        //Salvando a coleção de contatos em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutPutFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contatos);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());

        }

        //Recuperando a coleção de contatos em um arquivo

        List<Contato> recuperacontatos = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutPutFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperacontatos = (ArrayList) ois.readObject();


        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());

        }
        for(Contato c : recuperacontatos) {
            System.out.println(
                    c.getNome()
                            + " | " + c.getEmail()
                            + " | " + c.getTelefone()
            );

        }
    }


}


