import java.util.Scanner;
public class yeet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many scores would you like to enter?");
        int numScores = in.nextInt();
        int[] scores = new int[numScores];
        for (int i=0; i < numScores; i++){
            System.out.println("Enter a score: ");
            scores[i] = in.nextInt();
        }
        String[] letterGrades = gradesTranslator(scores);
        System.out.println("Score-----grade");
        for (int i =0; i < letterGrades.length; i++){
            System.out.println( scores[i]  + "---------" +letterGrades[i]);
        }

    }
    public  static  String[] gradesTranslator(int[] scores){
        String[] letterGrade = new  String[scores.length];
        for(int i= 0; i < scores.length; i++){
            if(scores[i] >= 89){
                letterGrade[i]= "A";
            }
            else if(scores[i] >= 79){
                letterGrade[i]= "B";
            }
            else if(scores[i] >= 69){
                letterGrade[i]= "C";
            }
            else if(scores[i] >= 59){
                letterGrade[i]= "D";
            }
            else{
                letterGrade[i]= "F";
            }

        }
        return letterGrade;
    }

}

