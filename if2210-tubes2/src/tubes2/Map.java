/*
 * 
 */
package tubes2;

// TODO: Javadoc for Map class
/**
 * The Class Map.
 */
public class Map {
	/* Atribut kelas */
	/** The Level. */
	private int Level;
	
	/** The p. */
	private Path[][] P;
	/* Konstruktor */
	/**
	 * Instantiates a new map.
	 */
	public Map() {
		/* Deklarasi array 2 dimensi */
		P = new Path[8][];
		for (int i=0;i<8;i++) {
			P[i] = new Path[7];
			for (int j=0;j<7;j++) {
				P[i][j] = new Path();
			}
		}
		/* Inisialisasi level 1 */
		Level = 1;
		P[0][3].setGoal(true); P[6][2].setStart(true);
		randomMap();
	}
	/**
	 * Checks if is path valid.
	 *
	 * @param arah the arah
	 * @param i the row index
	 * @param j the column index
	 * @return true, if is path valid
	 */
	public boolean isPathValid(int arah, int i, int j) {
		/* Melakukan validasi terhadap arah yang dipencet player terhadap map */
		boolean x = false;
		switch(arah) {
			case 1: x = P[i][j].getAtas(); break;
			case 2: x = P[i][j].getBawah(); break;
			case 3: x = P[i][j].getKiri(); break;
			case 4: x = P[i][j].getKanan(); break;
		}
		return x;
	}
	
	/**
	 * Increase map level.
	 */
	public void increaseMapLevel() {
		/* Menambahkan level map dan melakuka random map */
		Level++;
		randomMap();
	}
	
	/**
	 * Gets the map level.
	 *
	 * @return the map level
	 */
	public int getMapLevel() {
		/* Mengembalikan level map */
		return Level;
	}
	/**
	 * Random map.
	 */
	public void randomMap() {
		/* Melakukan random map dengan 3 pattern
		 * Setiap pattern map memiliki perbedaan arah dan goal
		 */
		/* random map */
		int x = (int)(Math.random() * 2) + 1; //random 1-2
		switch (x) {
			case 1: P[0][3].setPath(7); P[0][4].setPath(11); P[0][6].setPath(9);
					P[1][4].setPath(2); P[1][5].setPath(9); P[1][6].setPath(2);
					P[2][3].setPath(14); P[2][4].setPath(8); P[2][5].setPath(5); P[2][6].setPath(6);
					P[3][3].setPath(9); P[3][5].setPath(2);
					P[4][2].setPath(14); P[4][3].setPath(5); P[4][4].setPath(15); P[4][5].setPath(8);
										P[4][6].setPath(11);
					P[5][3].setPath(2); P[5][5].setPath(10); P[5][6].setPath(6);
					P[6][0].setPath(14); P[6][1].setPath(15); P[6][2].setPath(15); P[6][3].setPath(6);
										P[6][5].setPath(1);
					break;
			case 2: P[0][2].setPath(9); P[0][3].setPath(2); P[0][6].setPath(9);
					P[1][0].setPath(9); P[1][2].setPath(2); P[1][3].setPath(2); P[1][4].setPath(9); 
										P[1][5].setPath(10); P[1][6].setPath(6);
					P[2][0].setPath(4); P[2][1].setPath(15); P[2][2].setPath(5); P[2][3].setPath(7); 
										P[2][4].setPath(3);	P[2][5].setPath(2);
					P[3][0].setPath(2); P[3][2].setPath(2); P[3][4].setPath(2); P[3][5].setPath(1);
					P[4][0].setPath(2); P[4][2].setPath(2); P[4][4].setPath(2); P[4][6].setPath(9);
					P[5][0].setPath(7); P[5][1].setPath(11); P[5][2].setPath(7); P[5][3].setPath(15); 
										P[5][4].setPath(5);	P[5][5].setPath(15); P[5][6].setPath(6);
					P[6][1].setPath(7); P[6][2].setPath(6); P[6][4].setPath(1);
					break;
		}
		
	}
	/**
	 * The main program.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Map M = new Map();
		M.randomMap();
	}
}