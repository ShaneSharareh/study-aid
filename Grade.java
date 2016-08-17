

/***
 *
 * @author Jaymes Byrne
 * 
 */
public class Grade {
    
    int numCorrect = 0;
    int totalPercent;
    int letterGrade;
    
    /*
    *
    *  Empty contructor
    */
    public Grade(){
        
    }
    /*
    *
    *  Increments the number of correct answers
    */
    public void markCorrect(){
        numCorrect++;
    }
    /*
    *
    *  Returns the letter grade
    * @return the lettergrade that a user would receive
    */
    public int getLetterGrade(){
        return letterGrade;
    }
     /*
    *
    * get the total percentage of a user's grade
    * @return The percentage of a user's grade
    */
    public int getPercentGrade(){
        return totalPercent;
    }
    /*
    *
    * Sets the letter Grade a User may reveive
    * @param nLGrade The Grade in number form (0-100)
    */
    public void setLetterGrade(int nLGrade){
        letterGrade = nLGrade;
    }
    /*
    *
    * Sets the letter grade based of number of correct answers
    * as over number of questions total
    * @param The number of questions the user had to answer
    */
    public void setPercentGrade(int numOfQuestions ){
        totalPercent = (numCorrect/numOfQuestions) * 100;
    }
    /*
    *
    * Calculates grade the user received and prints it out 
    * 
    */
    public void calculate(){
        
        if(totalPercent <= 50){
            System.out.println("F");
        }
        else if (totalPercent <= 69){
            System.out.println("D");
        }
         else if (totalPercent <= 79){
            System.out.println("C");
        }
         else if (totalPercent <= 89){
            System.out.println("B");
        }
         else if (totalPercent <= 99){
            System.out.println("A");
        }
        else{
            System.out.println("Perfect Score!");
        }
        
    }
}
