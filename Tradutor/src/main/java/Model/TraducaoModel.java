/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import Exception.LerArquivoException;
import java.io.IOException;
import java.net.MalformedURLException;
/**
 *
 * @author webert
 */
public class TraducaoModel {
	
	private final String ARQUIVO = "http://localhost:45125/Tradutor/traducoes.txt";
	
	private Map<String, String> dicionarioIngles = new HashMap<>();
	private Map<String, String> dicionarioPortugues = new HashMap<>();

	public TraducaoModel() throws IOException {
        try {
            LeitorArquivo leitor = new LeitorArquivo();
            List<PalavraModel> conteudoArquivo = leitor.processar(ARQUIVO);
            gerarDicionarios(conteudoArquivo);
        } catch (LerArquivoException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}

	
	public String traduzir(String palavra){
		if(isPalavraExistente(dicionarioIngles, palavra))
			return dicionarioIngles.get(palavra);
		if(isPalavraExistente(dicionarioPortugues, palavra))
			return dicionarioPortugues.get(palavra);
		
		return palavra;
	}
	
	private void gerarDicionarios(List<PalavraModel> conteudoArquivo){
		for (PalavraModel palavra : conteudoArquivo) {
			dicionarioIngles.put(palavra.getIngles(), palavra.getPortugues());
			dicionarioPortugues.put(palavra.getPortugues(), palavra.getIngles());
		}
	}
	
	private boolean isPalavraExistente(Map<String, String> dicionario, String palavra){
		return dicionario.containsKey(palavra);
	}

}