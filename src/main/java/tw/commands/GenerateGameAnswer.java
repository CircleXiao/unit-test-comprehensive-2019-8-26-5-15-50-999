package tw.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateGameAnswer {
	
	public List<Integer> getRandomGameAnswer (int nums, int start, int end) {
		List<Integer> gameAnswer = new ArrayList<Integer>();
		Random random = new Random();
		
		while (gameAnswer.size() != nums) {
			int num = random.nextInt(end - start) + start;
			if (!gameAnswer.contains(num)) {
				gameAnswer.add(num);
			}
		}		
		
		return gameAnswer;
	}
}
