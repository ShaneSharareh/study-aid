
public class ProblemSet {
	 private  String question;
	 private final int MAX = 4;
	 private String[] answers = new String[MAX];		 
	 private int answerCount;
	 private String correctAnswer;
	 public ProblemSet(){
		 question = "null";
		 answerCount = 0;
	 }
	 public ProblemSet(ProblemSet newProblem){
	  System.out.println("Copy Constructor");
	  question = newProblem.question;
	  System.arraycopy(newProblem.answers, 0, this.answers, 0, newProblem.answers.length);
	  answerCount = newProblem.answerCount;
	 }
	 public void setQuestion(String newQuestion)	{
		question = newQuestion;
				
	 }
	 public String getQuestion(){
		 return question;
	 }
	 public void markCorrect(String newCorrectAnswer){
		 correctAnswer = newCorrectAnswer;
	 }
	 public String getCorrect(){
		 return correctAnswer;
	 }
	public void setAnswers(String newAnswer, int i){
		
		answers[i] = newAnswer;
	}
	public String[] getAnswers(){
		return answers;
	}
	public String Selector(int i){
		return answers[i];
	}
	/**
	 * public void shuffle(){}
	 */
		

	 
};
