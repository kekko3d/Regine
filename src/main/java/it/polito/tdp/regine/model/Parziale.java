package it.polito.tdp.regine.model;
import java.util.*;

public class Parziale {
	List <Integer> parziale;
	public Parziale() {
		this.parziale = new LinkedList <Integer> ();
	}


	public boolean diagonaleAvanti(int colonna, int riga) {

		for(int i = 0 ; i < riga; i++) {
			if(colonna + i == parziale.get(i) + riga) {
				return true;
			}
		}

		return false;
	}

	public boolean contains (int colonna) {
		if(parziale.contains(colonna))
			return true;
		return false;
	}
	
	public boolean diagonaleIndietro(int colonna, int riga) {

		for(int i = 0 ; i < riga; i++) {
			if(colonna == parziale.get(i) - riga + i) {
				return true;
			}
		}

		return false;
	}
	
	
	public void aggiungi(int sol) {
		parziale.add(sol);
	}
	@Override
	public String toString() {
		return "Parziale [parziale=" + parziale.toString() + "]";
	}
	
	public void remove() {
		parziale.remove(parziale.size()-1);
	}


	public int size() {
		// TODO Auto-generated method stub
		return parziale.size();
	}
	
}
