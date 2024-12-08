package controller;

import model.estrutura.grafoLista.GrafoLista;

public class Controller {
	
	String[] adicionar = {"julia", "joao", "maria", "carla", "nicolas", "juci", "marcos"};
	GrafoLista grafo = new GrafoLista(adicionar);

	public void links() {
		
	    grafo.getVertices().get("julia").add("joao");
	    grafo.getVertices().get("julia").add("maria");
	    grafo.getVertices().get("julia").add("carla");
	    grafo.getVertices().get("julia").add("nicolas");
	    grafo.getVertices().get("julia").add("juci");
	    grafo.getVertices().get("julia").add("marcos");

	    grafo.getVertices().get("joao").add("julia");
	    grafo.getVertices().get("joao").add("nicolas");
	    grafo.getVertices().get("joao").add("juci");
	    grafo.getVertices().get("joao").add("marcos");

	    grafo.getVertices().get("nicolas").add("julia");
	    grafo.getVertices().get("nicolas").add("joao");
	    grafo.getVertices().get("nicolas").add("maria");

	    grafo.getVertices().get("marcos").add("julia");
	    grafo.getVertices().get("marcos").add("joao");
	    grafo.getVertices().get("marcos").add("juci");

	    grafo.getVertices().get("juci").add("julia");
	    grafo.getVertices().get("juci").add("joao");
	    grafo.getVertices().get("juci").add("marcos");

	    grafo.getVertices().get("maria").add("julia");
	    grafo.getVertices().get("maria").add("nicolas");
	    grafo.getVertices().get("maria").add("carla");

	    grafo.getVertices().get("carla").add("julia");
	    grafo.getVertices().get("carla").add("maria");
	    
	    grafo.visualizar();
	}
}
