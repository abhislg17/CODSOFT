import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
        int n;
        double sum=0;
        double averagepercentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();
        float[] array=new float[7];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value for"+ i +"th Element ");
            array[i]=sc.nextFloat();
            sum=sum+array[i];
        }
        averagepercentage=sum/n;
        System.out.println("-----------------------------------");
        if(averagepercentage>=90){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = O");
        }
        else if(averagepercentage<90 && averagepercentage>=80){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = E");
        }
        else if(averagepercentage<80 && averagepercentage>=70){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = A");
        }
        else if(averagepercentage<70 && averagepercentage>=60){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = B");
        }
        else if(averagepercentage<60 && averagepercentage>=50){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = C");
        }
        else if(averagepercentage<50 && averagepercentage>=40){
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = D");
        }
        else{
            System.out.println("Total marks  of "+ n +"subjects:"+ sum);
            System.out.println("Averege percentage   of "+ n +"subjects:"+ averagepercentage);
            System.out.println("Grade = E");
        }
        System.out.println("-----------------------------------");

    }
}
