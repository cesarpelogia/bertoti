package mercearia;

import java.util.LinkedList;
import java.util.List;

public class Mercearia {

    private List<Comida> comidas = new LinkedList<Comida>();
    private List<Bebida> bebidas = new LinkedList<Bebida>();

    // Cadastrando Itens
    public void cadastrarComida(Comida novaComida) {
        comidas.add(novaComida);
    }

    public void cadastrarBebida(Bebida novaBebida) {
        bebidas.add(novaBebida);
    }

    // Buscando Itens
    public List<Comida> buscaComidaPorTipo(String tipoComida) {
        List<Comida> comidaEncontrada = new LinkedList<Comida>();
        for (Comida comida : comidas) {
            if (comida.getTipoComida().equals(tipoComida))
                comidaEncontrada.add(comida);
        }
        return comidaEncontrada;
    }

    public List<Bebida> buscaBebidaPorTipo(String tipoBebida) {
        List<Bebida> bebidaEncontrada = new LinkedList<Bebida>();
        for (Bebida bebida : bebidas) {
            if (bebida.getTipoBebida().equals(tipoBebida))
                bebidaEncontrada.add(bebida);
        }
        return bebidaEncontrada;
    }

    public List<Comida> getTipoComida() {
        return comidas;
    }

    public List<Bebida> getTipoBebida() {
        return bebidas;
    }

}