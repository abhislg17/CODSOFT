import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class QuizCompetition{
    private static final int Question_Duration=20;
    private static int score=0;
    private static int question_Index=0;
    private static Timer timer=new Timer();
    private static boolean timerExpired=false;
    private static final String[] questions={
        "What is the capital of India","How many planets are there in solar system?",
        "Who wrote the novel Pather Panchali","In which year Rabindranath Tagore got Nobel Prize",
        "Which city is known as The Orange City in India?"
    };
    private static final String[][] options={
        {"a)Mumbai","b)Chennai","c)Delhi","d)Hyderabad"},{"a)10","b)9","c)7","d)8"},
        {"a)SarathChandra Chattopadhyay","b)Bibhutibhusan Bandyopahyay","c)RabindraNath Tagore","d)William Shakespeare"},
        {"a)1914","b)1913","c)1945","d)1947"},{"a)Nagpur","b)Chennai","c)Bengaluru","d)Pune"}
    };
    private static final int[] correctAnswers={2,3,1,1,0};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to quiz competition");
        System.out.println("You have"+Question_Duration+"seconds to answer each question.\n");
    
        askQuestion();
        while(question_Index<questions.length){
            String userinput=sc.nextLine();
            if(timerExpired){
                System.out.println("Time's up! Next question...");
                question_Index++;
                timerExpired=false;
                if(question_Index<questions.length){
                    askQuestion();
                }
            }else{
                int selectedoption=Integer.parseInt(userinput);
                checkAnswer(selectedoption);
            }
        }
        System.out.println("Quiz Completed.");
        System.out.println("Your score:"+ score +" out of"+ questions.length);
        sc.close();
    }
    private static void askQuestion(){
        System.out.println("Question"+(question_Index+1)+":"+questions[question_Index]);
        for(int i=0;i<options[question_Index].length;i++){
            System.out.println(options[question_Index][i]);
        }
        startTimer();
    }
    private static void startTimer(){
        timer.schedule(new TimerTask(){
            public void run(){
                timerExpired=true;
                timer.cancel();
            }
        },Question_Duration *1000);
    }
    private static void checkAnswer(int selectedoption){
        if(selectedoption == correctAnswers[question_Index]){
            System.out.println("Correct.\n");
            score++;
        }
        else{
            System.out.println("Incorrect!\n");
        }
        question_Index++;
        if(question_Index<questions.length){
            askQuestion();
        }
    }
}