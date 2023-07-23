
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author webert
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto ("Tenis", 300));
        lista.add(new Produto ("camisa", 100));
        lista.add(new Produto ("Bermuda", 200));
        
        lista.forEach(p -> System.out.println(p));
    }
    
}
