
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author webert
 */
public class Oraculo {
    
    public List<String> melhoresProdutos(String tipo){
        List<String> lista = new ArrayList<>();
        if (tipo.equals("doce de leite")){
            lista.add("Vicosa");
            lista.add("Boreal");
        }else if (tipo.equals("queijo mineiro")){ 
            lista.add("Candido Tosted");
            lista.add("Humaita");
            lista.add("Da vovo");
        }
        return lista;
    }
}
