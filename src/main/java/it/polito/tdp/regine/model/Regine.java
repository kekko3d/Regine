package it.polito.tdp.regine.model;

import java.util.ArrayList;
import java.util.List;

public class Regine {

	// N è il numero di righe e colonne della scacchiera
	//   (righe e colonne numerate da 0 a N-1)
	// ad ogni livello posizioniamo una regina in una nuova riga
	
	// soluzione parziale: lista delle colonne in cui mettere le regine (prime righe)
	// 		List<Integer>
	// livello = quante righe sono già piene
	// livello = 0 => nessuna riga piena (devo mettere la regina nella riga 0)
	// livello = 3 => 3 righe piene (0, 1, 2), devo mettere la regina nella riga 3
	// [0]
	//     [0, 2]
	//            [0, 2, 1]


	ArrayList <Integer> ArrayList = new ArrayList <Integer> ();

//		l.0  l.1  l.2  l.3																						
//	0	      x
//	1
//	2
//	N
//	
//	
	public void cerca(Parziale parziale, int livello, boolean isThisWay, int N) {
		System.out.println(parziale.toString());
		if(livello >= N ) {

		} else {
			for(int colonna = 0; colonna < N; colonna++){
				if(parziale.contains(colonna) || parziale.diagonaleAvanti(colonna, livello) || parziale.diagonaleIndietro(colonna, livello)){

				} else  {
					parziale.aggiungi(colonna);

					cerca(parziale, livello + 1, isThisWay,  N);
					
				}
			}
			if(parziale.size() == N) {
				return;
			}
			parziale.remove();
		}
	}

	}
	//fai schema su carta
		
	



