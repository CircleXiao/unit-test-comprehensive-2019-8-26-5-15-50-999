package tw.commands;

import java.util.List;

public class FeedbackUserInput {
	
	public String getUserInput() throws Exception {
		String input = new GuessInputCommand().input();
		String userInput = input.replaceAll(" ", "");
		return userInput;
	}
	
	public String checkUserAnswer(String userInput, List<Integer> gameAnswer) {
		int[] userAnswer = new int [userInput.length()];
		int countA = 0;
		int countB = 0;
		String infoA = "";
		String infoB = "";
		String checkInfo = "";
		
		for (int i = 0; i < userAnswer.length; i++) {
			userAnswer[i] = Character.getNumericValue(userInput.charAt(i));
		}
		
		// 检查位置正确且数字正确的个数
		for (int i = 0; i < gameAnswer.size(); i++) {
			if (userAnswer[i] == gameAnswer.get(i)) {
				countA++;
			}
		}
		infoA += countA + "A";
		
		// 检查位置错误但数字正确的个数
		for (int i = 0; i < userAnswer.length; i++) {
			for (int j = 0; j < gameAnswer.size(); j++) {
				if (userAnswer[i] == gameAnswer.get(j) && i != j) {
					countB++;
				}
			}
		}
		infoB += countB + "B";
		checkInfo = infoA + infoB;
		
		// 游戏胜利的判断
		if (countA == gameAnswer.size()) {
			checkInfo = "胜利，一切正确";
		}
		
		return checkInfo;
	}
	
}
