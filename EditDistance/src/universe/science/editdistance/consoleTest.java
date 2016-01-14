package universe.science.editdistance;

public class consoleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dist = DamerauLevenshteinDistance.computeLevensteinDistance("drivere", "diver");
		System.out.println(dist);
	}

}
