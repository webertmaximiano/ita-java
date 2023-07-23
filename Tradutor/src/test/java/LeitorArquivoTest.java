/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import Exception.LerArquivoException;
import java.io.IOException;
import java.net.MalformedURLException;
import Model.LeitorArquivo;
import Model.PalavraModel;
import Model.TraducaoModel;

/**
 *
 * @author webert
 */
public class LeitorArquivoTest {
    
 @Test
    public void testProcessar() throws IOException {
        String caminhoArquivo = "http://localhost:45125/Tradutor/traducoes.txt";
        LeitorArquivo leitor = new LeitorArquivo();

        try {
            List<PalavraModel> result = leitor.processar(caminhoArquivo);
            assertNotNull(result);  // Verifica se a lista não é nula
            assertFalse(result.isEmpty());  // Verifica se a lista não está vazia
            // Aqui você pode adicionar mais verificações específicas do seu arquivo de traduções
        } catch (LerArquivoException e) {
            fail("Ocorreu uma exceção ao processar o arquivo: " + e.getMessage());
        } catch (MalformedURLException e) {
            fail("URL do arquivo de traduções inválida: " + e.getMessage());
        } catch (IOException e) {
            fail("Erro de leitura do arquivo: " + e.getMessage());
        }
    }
}