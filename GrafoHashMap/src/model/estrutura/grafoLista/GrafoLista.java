package model.estrutura.grafoLista;

import java.util.*;


public class GrafoLista {
	
    private String[] adicionar;
    private HashMap<String, ArrayList<String>> vertices = new HashMap<>();
    
    public GrafoLista(String[] adicionar) {
    	this.adicionar = adicionar;
        for (String pessoa : adicionar) {
            getVertices().put(pessoa, new ArrayList<>());
        }
    }
	
    public void visualizar() {
        for (String pessoa : getVertices().keySet()) {
            System.out.println(pessoa + " se relaciona com: " + getVertices().get(pessoa));
        }
    }

	public HashMap<String, ArrayList<String>> getVertices() {
		return vertices;
	}

	public void setVertices(HashMap<String, ArrayList<String>> vertices) {
		this.vertices = vertices;
	}
}

