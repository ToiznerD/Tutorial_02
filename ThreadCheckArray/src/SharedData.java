import java.util.ArrayList;

/**
 * @author Dor and Raz
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructor for SharedData
	 * @param array			ArrayList of Integer
	 * @param b				number of elements	
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Setting WinArray by given a boolean array
	 * @param winArray				boolean array that represents the combination of the fitting elements
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Setting flag as a given boolean parameter
	 * @param flag				boolean variable to synchronize the threads
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
