/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

import Exception.LerArquivoException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author webert
 */
public class LeitorArquivo {
    
	private List<PalavraModel> conteudoArquivo;

public List<PalavraModel> processar(String caminhoArquivo) throws LerArquivoException, MalformedURLException, IOException {
    conteudoArquivo = new ArrayList<>();

    try {
        URL url = new URL(caminhoArquivo);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(";");
            if (split.length >= 2) {
                conteudoArquivo.add(new PalavraModel(split[0], split[1]));
            } else {
                // Lidar com linhas que não estão no formato esperado (por exemplo, imprimir um aviso)
            }
        }
        
        reader.close();
        return conteudoArquivo;
    } catch (IOException e) {
        throw new LerArquivoException("Erro ao abrir arquivo: " + e.getMessage());
    }
}

}
