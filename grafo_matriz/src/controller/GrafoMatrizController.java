package controller;

import model.estrutura.grafo.GrafoMatriz;

public class GrafoMatrizController {

	public GrafoMatrizController(){
		super();
	}
	
	public String teste() throws Exception {
		String[] routers = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
		GrafoMatriz g = new GrafoMatriz(routers);
		
		g.link("B","A");
		g.link("B","C");
		g.link("A","D");
		g.link("A","F");
		g.link("C","I");
		g.link("C","J");
		g.link("D","G");
		g.link("D","H");
		g.link("D","I");
		g.link("F","H");
		g.link("F","K");
		g.link("E","J");
		g.link("J","N");
		g.link("J","I");
		g.link("G","L");
		g.link("H","O");
		g.link("H","E");
		g.link("L","M");
		g.link("L","K");
		g.link("M","N");
		g.link("N","O");
		
		return g.toString();
	}
	

}
