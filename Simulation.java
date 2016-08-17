import java.util.*;
public class Simulation {
ArrayList<ProblemSet> problemSetList = new ArrayList();
private int numOfQuestions = 0;//keeps track of number of questions

public void prompt(){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the number of Questions: ");
	numOfQuestions = keyboard.nextInt(); 
	keyboard.nextLine();//consumes nextline
	for(int i = 0; i<numOfQuestions; i++){
		ProblemSet problem = new ProblemSet();
		
		System.out.print("Enter a Question: ");
		String question = keyboard.nextLine();
		System.out.println();
		problem.setQuestion(question);
		
		//Marks correct answer and adds it to answers array
		System.out.print("Enter the correct answer: ");
		String answer; 
		answer= keyboard.nextLine();
		System.out.println();
		
		problem.markCorrect(answer);
		problem.setAnswers(answer, 0);//always starts at initial index
		
		
		//sets the rest of the other 3 answers
		for(int j = 1; j<4; j++){
			System.out.print("Enter an incorrect answer: ");
			answer = keyboard.nextLine();
			System.out.println();
			problem.setAnswers(answer, j);
		}// end of inner for loop
		
		//data is complete, now add object
		problemSetList.add(problem);
		
	}//end of outer for loop
	//Collections.shuffle(problemSetList);
}
	public void displayQuestion(String newQuestion, int questionNumb){
		String question = newQuestion;
		System.out.print("Question "+questionNumb+": ");
		System.out.println(question);
	}
	
	public void displayMultipleChoice(String[] newAnswers){
		String tempAnswers[] = new String[4];
		System.arraycopy(newAnswers, 0, tempAnswers, 0, tempAnswers.length);
		for (int i= 0; i<tempAnswers.length; i++ ){
			System.out.println((i+1)+". "+ tempAnswers[i]);
		}
		System.out.println();
	}
	
	
	
	public void selector(String[] newAnswers){
		
		String tempAnswers[] = new String[4];
		System.arraycopy(newAnswers, 0, tempAnswers, 0, tempAnswers.length);	
	}
	
	
	public void display(){
		System.out.println("Processing..");
		int i = 0;
		ProblemSet tempProblem = new ProblemSet();
		String quit = "null";//user indicates if he/she wants to quit
		Grade marker = new Grade();//Create a marker object
		while(i<problemSetList.size()&& !(quit.equals("q"))){// while still in the array and user doesn't type q
			tempProblem = problemSetList.get(i);
			
			//pass in question, and number of question to be displayed
		    displayQuestion(tempProblem.getQuestion(), (i+1));
			
		    //lists answer choice
		    displayMultipleChoice(tempProblem.getAnswers());
		    
		    System.out.println();
		    System.out.println("Select the number associated with the correct answer");
		    System.out.print("Select: ");
		    Scanner keyboard = new Scanner(System.in);
		    int userInput = keyboard.nextInt();
		    keyboard.nextLine();
		    System.out.println();	    
		    //uses selector to determine if the answer was right
		    if(tempProblem.Selector(userInput-1).equals(tempProblem.getCorrect())){
		    	System.out.println("Correct!");
		    	marker.markCorrect();
		    	System.out.println();
		    }
		    else{
		    	System.out.println("Incorrect!");
		    	System.out.println();
		    }
		    
		    
		    System.out.println("Type anything to proceed");
		    System.out.println("Or, type q to quit");
		    quit = keyboard.nextLine();
		    System.out.println();
		    
		i++;	
		}//end of loop		
		
		marker.setPercentGrade(numOfQuestions);
		System.out.println("Score:"+marker.getPercentGrade()+"%" );
		System.out.println();
		System.out.println("Calculating..");
		System.out.println();
		marker.calculate();
		System.out.println();
		System.out.println("Goodbye!");
	}
}

