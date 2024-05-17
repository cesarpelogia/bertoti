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
    public void cadastrarBebida(String nomeBebida, String tipoBebida, String marcaBebida, int qntdBebida) {
        Bebida bebida = new Bebida(nomeBebida, tipoBebida, marcaBebida, qntdBebida);
        bebidas.add(bebida);
    }

        // Metodo Buscar Comida
    public void buscarComida(String nomeComida) {
        for(Comida comida : comidas){
            if (comida.getnomeComida().equalsIgnoreCase(nomeComida)){
                return ;
            }
        }
    }
    
        // Metodo Buscar Bebida
    public void buscarBebida(String nomeBebida){
        for(Bebida bebida : bebidas){
            if (bebida.getnomeBebida().equalsIgnoreCase(nomeBebida)) {
                return ;
            }
        }

    }
}
