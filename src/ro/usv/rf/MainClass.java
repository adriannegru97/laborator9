package ro.usv.rf;

public class MainClass {

	public static void main(String[] args) {
		String[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("in.txt");
			int numberOfFeatures = learningSet[0].length;
			String [] iclassNames = {"class-1", "class-2","class-3"};
			
			
			
		} catch (USVInputFileCustomException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finished learning set operations");
		}
	}

}
