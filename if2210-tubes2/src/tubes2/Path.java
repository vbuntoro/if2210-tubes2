/*
 * 
 */
package tubes2;

// TODO: Javadoc for Path class
/**
 * The Class Path.
 */
public class Path {
	/* Atribut kelas */
	/** The Atas. */
	private boolean Atas; //apabila ada jalan kedepan
	
	/** The Bawah. */
	private boolean Bawah; //apabila ada jalan kebelakang
	
	/** The Kiri. */
	private boolean Kiri; //apabila ada jalan kekiri
	
	/** The Kanan. */
	private boolean Kanan; //apabila ada jalan kekanan
	
	/** The Goal. */
	private boolean Goal; //apabila merupakan goal
	
	/** The Start. */
	private boolean Start; //apabila merupakan start
	
	/* Konstruktor dan Konstruktor parameter */
	/**
	 * Instantiates a new path.
	 */
	public Path() { 
		Atas = false;
		Bawah = false;
		Kiri = false;
		Kanan = false;
		Goal = false;
		Start = false;
	}
	/* Setter */
	/**
	 * Sets the path.
	 *
	 * @param a the new path
	 */
	public void setPath (int a) {
		switch (a) {
			case 1: Atas = true; Bawah = false; Kiri = false; Kanan = false; break;
			case 2: Atas = true; Bawah = true; Kiri = false; Kanan = false; break;
			case 3: Atas = true; Bawah = true; Kiri = true; Kanan = false; break;
			case 4: Atas = true; Bawah = true; Kiri = false; Kanan = true; break;
			case 5: Atas = true; Bawah = true; Kiri = true; Kanan = true; break;
			case 6: Atas = true; Bawah = false; Kiri = true; Kanan = false; break;
			case 7: Atas = true; Bawah = false; Kiri = false; Kanan = true; break;
			case 8: Atas = true; Bawah = false; Kiri = true; Kanan = true; break;
			case 9: Atas = false; Bawah = true;	 Kiri = false; Kanan = false; break;
			case 10: Atas = false; Bawah = true; Kiri = false; Kanan = true; break;
			case 11: Atas = false; Bawah = true; Kiri = true; Kanan = false; break;
			case 12: Atas = false; Bawah = true; Kiri = true; Kanan = true; break;
			case 13: Atas = false; Bawah = false; Kiri = true; Kanan = false; break;
			case 14: Atas = false; Bawah = false; Kiri = false; Kanan = true; break;
			case 15: Atas = false; Bawah = false; Kiri = true; Kanan = true; break;
		}
	}
	
	/**
	 * Sets the goal.
	 *
	 * @param a the new goal
	 */
	public void setGoal(boolean a) {
		Goal = a;
	}
	
	/**
	 * Sets the start.
	 *
	 * @param a the new start
	 */
	public void setStart(boolean a) {
		Bawah = false;
		Start = a;
	}
	
	/* Getter */
	/**
	 * Gets the Atas.
	 *
	 * @return the Atas
	 */
	public boolean getAtas() {
		return Atas;
	}
	
	/**
	 * Gets the Bawah.
	 *
	 * @return the Bawah
	 */
	public boolean getBawah() {
		return Bawah;
	}
	
	/**
	 * Gets the Kiri.
	 *
	 * @return the Kiri
	 */
	public boolean getKiri() {
		return Kiri;
	}
	
	/**
	 * Gets the Kanan.
	 *
	 * @return the Kanan
	 */
	public boolean getKanan() {
		return Kanan;
	}
	
	/**
	 * Gets the goal.
	 *
	 * @return the goal
	 */
	public boolean getGoal() {
		return Goal;
	}
	
	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public boolean getStart() {
		return Start;
	}
}