import java.io.*;
public class ProblemSet{
		 private  String question;
		 private final int MAX = 4;
		 private String[] answers = new String[MAX];		 
		 private int answerCount;
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
};
