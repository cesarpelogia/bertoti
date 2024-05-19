package mercearia;

import java.util.LinkedList;
import java.util.List;

public class Mercearia {

    public List<Comida> comidas = new LinkedList<>();
    public List<Bebida> bebidas = new LinkedList<>();

        // Cadastrando Itens
    public void cadastrarComida(String nomeComida, String tipoComida, String marcaComida, int qntdComida) {
        Comida comida = new Comida(nomeComida, tipoComida, marcaComida, qntdComida);
        comidas.add(comida);
    }
    public boolean cadastrarBebida(String nomeBebida, String tipoBebida, String marcaBebida, int qntdBebida) {
        Bebida bebida = new Bebida(nomeBebida, tipoBebida, marcaBebida, qntdBebida);
        bebidas.add(bebida);
        System.out.println(nomeBebida + " adicionada!");
        return true;
    }

        // Metodo Buscar Comida
    public Comida buscarComida(String nomeComida) {
        for(Comida comida : comidas){
            if (comida.getnomeComida().equalsIgnoreCase(nomeComida)){
                System.out.println(comida + " encontrada!");
                return comida;
            }
        }
        System.out.println("Comida não encontrada!");
        return null;
    }
    
        // Metodo Buscar Bebida
    public Bebida buscarBebida(String nomeBebida){
        for(Bebida bebida : bebidas){
            if (bebida.getnomeBebida().equalsIgnoreCase(nomeBebida)) {
                System.out.println(bebida + " encontrada!");
                return bebida;
            }
        }
        System.out.println("Bebida não encontrada!");
        return null;
    }
}
