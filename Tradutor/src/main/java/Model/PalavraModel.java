/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author webert
 */
public class PalavraModel {
    private final String ingles;
    private final String portugues;

	public PalavraModel(String ingles, String portugues) {
		this.ingles = ingles;
		this.portugues = portugues;
	}
	
	public String getIngles() {
		return ingles;
	}
	public String getPortugues() {
		return portugues;
	}    

}
