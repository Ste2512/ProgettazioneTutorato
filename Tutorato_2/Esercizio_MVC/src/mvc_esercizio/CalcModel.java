package mvc_esercizio;

import java.util.ArrayList;
import java.util.Observable;

/*
 *  Definiamo il modello come "Observable". Una classe model che estende
 *  "Observable" può essere gestita in modo molto più sempice, in quanto ogni
 *  modifica fatta al suo contenuto, genera in automatico una notifica
 *  per gli observer
 */
public class CalcModel extends Observable{
	// Campo privato, il valore iniziale della "memoria" del modello
	private static final String INITIAL_VALUE = "1";
	// Campo privato, la "memoria" vera e propria del modello 
	private boolean m_total; 
	// lista dei numeri inseriti
	private ArrayList<Integer> Lista;

	// Costruttore: chiama il reset per (re)impostare il valore inizale
	CalcModel() {
		reset();
	}

	// Reset del valore iniziale
	public void reset() {
		System.out.println("[MODEL] reset ");
		m_total = false;
		Lista=new ArrayList<Integer>();
		// Comunica un cambio dello stato
		setChanged();
		// Notifica gli observer (la view)
		notifyObservers();
		System.out.println("[MODEL] Observers notified (reset)");
	}


	// Moltiplica per il valore passato come stringa 
	// Attenzione: non dalla GUI ma dal controller
	public void multiplyBy(String operand) {
		Integer operand1=new Integer(operand);
		m_total=false;
		// Moltiplicazione vera e propria
		for(int i=0;i<Lista.size();i++) {
			if(Lista.get(i).equals(operand1)) {
				m_total=true;
				System.out.println("trovato");
				break;
			}
		}
		if(!m_total) {Lista.add(operand1); }

		System.out.println("[MODEL] Multiply "+ operand);
		// Comunica un cambio dello stato
		setChanged();
		// Notifica gli observer (la view)
		notifyObservers();
		System.out.println("[MODEL] Observers notified (mult)");
	}

	// Ritorna il valore della "memoria"
	public String getValue() {
		if(m_total) {
			return "valore gia utilizzato";
		}else {
			return "valore nuovo";
		}
	}
}
