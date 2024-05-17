package mercearia;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class teste {

    Mercearia cassio = new Mercearia();
    
    @Test
    public void testeCadastrarComida(){
        cassio.cadastrarComida("Macarrão", "Massa", "Renata", 3000);
        cassio.cadastrarComida("Lasanha", "Massa", "Perdigão", 1000);

        assertTrue(cassio.comidas.getLast().getnomeComida() == "Lasanha");
    }

    @Test
    public void testeCadastrarBebida(){
        cassio.cadastrarBebida("Vinho", "Merlot", "Danny", 3500);
        cassio.cadastrarBebida("Cerveja", "Pilsen", "Brahma", 350);
        
        assertFalse(cassio.bebidas.getFirst().gettipoBebida() == "Pilsen");
    }   
}
