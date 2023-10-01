
//java programming language is used in this assignment

import java.util.Random;
public class POC_assignment {
    public static void main(String[] args) {
        Random rand=new Random();
        float N=6508;         ////////enrolment number gm6508 no.of tosses
        float L=(19);    ///////no.of faces
        float probability=0;
        int counter=0;

        for (int i=0;i<6508;i++){
            if (rand.nextInt(1,19)==2){
                counter++;
            }
        }

        probability=(counter/N);
        System.out.println(probability);

    }




}
