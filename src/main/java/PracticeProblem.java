public class PracticeProblem {

	public static void main(String args[]) {}

	public static void bubbleSortString(String[] strings) {
		
		boolean swapped = true;

		for (int j=0; j<strings.length-1 && swapped; j++) {
			
			swapped = false;

			for (int i=0; i<strings.length-1-j; i++) {
				if (strings[i].compareToIgnoreCase(strings[i+1])>0) {
					String temp = strings[i];
					strings[i] = strings[i+1];
					strings[i+1]=temp;
					swapped=true;
				}
			}
		}
	}

}
