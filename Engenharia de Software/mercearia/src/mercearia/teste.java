package mercearia;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

    Mercearia mercadinho = new Mercearia();
    
    @Test
    public void testeCadastrarComida(){
        mercadinho.cadastrarComida("Macarrão", "Massa", "Renata", 3000);
        mercadinho.cadastrarComida("Lasanha", "Massa", "Perdigão", 1000);

        assertTrue(mercadinho.comidas.getLast().getnomeComida().equals("Lasanha"));
    }

    @Test
    public void testeCadastrarBebida(){
        mercadinho.cadastrarBebida("Vinho", "Merlot", "Danny", 3500);
        mercadinho.cadastrarBebida("Cerveja", "Pilsen", "Brahma", 350);
        
        assertFalse(mercadinho.bebidas.getFirst().getnomeBebida().equals("Vinho"));
    }

    @Test
    public void testeBuscarComida(){
        mercadinho.cadastrarComida("Macarrão", "Massa", "Renata", 3000);
        mercadinho.cadastrarComida("Lasanha", "Massa", "Perdigão", 1000);
        mercadinho.buscarComida("Lasanha");
        
        assertEquals("Lasanha", mercadinho.buscarComida("Lasanha").getnomeComida());

    }

    @Test
    public void testeBuscarBebida(){
        mercadinho.cadastrarBebida("Vinho", "Merlot", "Danny", 3500);
        mercadinho.cadastrarBebida("Cerveja", "Pilsen", "Brahma", 350);
        mercadinho.buscarBebida("Cerveja");
        
        assertEquals("Cerveja", mercadinho.buscarBebida("Cerveja").getnomeBebida());
    }
}
