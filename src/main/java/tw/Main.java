package tw;

import java.util.List;

import tw.commands.FeedbackUserInput;
import tw.commands.GenerateGameAnswer;
import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        GenerateGameAnswer generateGameAnswer = new GenerateGameAnswer();
        List<Integer> gameAnswer = generateGameAnswer.getRandomGameAnswer(4, 0, 9);
        System.out.println(gameAnswer);
        
        for (int i = 0; i < RUN_TIMES; i++) {
        	FeedbackUserInput feedbackUserInput = new FeedbackUserInput();
        	String userInput = feedbackUserInput.getUserInput();
        	String checkInfo = feedbackUserInput.checkUserAnswer(userInput, gameAnswer);
        	System.out.println(checkInfo);
        	if (checkInfo == "胜利，一切正确") {
				break;
			} 
        }
        System.out.println("游戏结束。");
        	

    }
}
