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
	/** The Front. */
	private boolean Front; //apabila ada jalan kedepan
	
	/** The Back. */
	private boolean Back; //apabila ada jalan kebelakang
	
	/** The Left. */
	private boolean Left; //apabila ada jalan kekiri
	
	/** The Right. */
	private boolean Right; //apabila ada jalan kekanan
	
	/** The Goal. */
	private boolean Goal; //apabila merupakan goal
	
	/** The Start. */
	private boolean Start; //apabila merupakan start
	
	/** The Facing. */
	private int Facing; //mengubah value facing yang merupakan sebuah permasalah pada FPS
	/* Konstruktor dan Konstruktor parameter */
	/**
	 * Instantiates a new path.
	 */
	public Path() { 
		Front = false;
		Back = false;
		Left = false;
		Right = false;
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
			case 1: Front = true; Back = true; Left = true; Right = true; break;
			case 2: Front = true; Back = true; Left = true; Right = false; break;
			case 3: Front = true; Back = true; Left = false; Right = true; break;
			case 4: Front = true; Back = true; Left = false; Right = false; break;
			case 5: Front = false; Back = true; Left = true; Right = true; break;
			case 6: Front = false; Back = true; Left = true; Right = false; break;
			case 7: Front = false; Back = true; Left = false; Right = true; break;
			case 8: Front = false; Back = true; Left = false; Right = false; break;
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
		Back = false;
		Start = a;
	}
	
	/**
	 * Sets the facing.
	 *
	 * @param a the new facing
	 */
	public void setFacing(int a) {
		Facing = a;
	}
	/* Getter */
	/**
	 * Gets the front.
	 *
	 * @return the front
	 */
	public boolean getFront() {
		return Front;
	}
	
	/**
	 * Gets the back.
	 *
	 * @return the back
	 */
	public boolean getBack() {
		return Back;
	}
	
	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public boolean getLeft() {
		return Left;
	}
	
	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	public boolean getRight() {
		return Right;
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
	
	/**
	 * Gets the facing.
	 *
	 * @return the facing
	 */
	public int getFacing() {
		return Facing;
	}
}