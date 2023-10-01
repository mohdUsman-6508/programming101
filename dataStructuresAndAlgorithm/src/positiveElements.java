public class positiveElements {

    public static void main(String[] args) {

        //question1

        int[] numbers={2,6,-5,-1,0,4,-9};

        for (int i=0;i<numbers.length;i++){

            if (numbers[i]>=0) {
                System.out.println(numbers[i]);
            }
        }

//question2
        System.out.println("question2");

        String[] ch={"ab","bc","cd","de","ef","fg","gh"};

        for (int i=1;i<(ch.length);i++) {

            if (i%2 != 0) {
                System.out.println(ch[i]);
            }
        }

//question3
        System.out.println("question3");

        int[] num={1,2,3,4,5,6,7,8};
        for (int i:num) {

            if (i%2==0){
                System.out.println(i);
           }
        }


//question5

        int[] num1={1,1,3,4,2,3,5,7,0};
        int ans=0;
        for (int i=0;i<(num1.length)-2;i++) {

            if (num1[i + 1] > num1[i] && num1[i + 1] > num1[i + 2]) {
                    ans=num1[i+1];
                System.out.println("peak element at index "+(i+1)+" is "+ans);
                //  break;

            }
        }

        //System.out.println("first peak element:"+ans);

 //question4
        System.out.println("question4");

        int[] num2={2,-3,5,8,1,0,-4};
        int result=num2[0];
        for (int i=0;i<num2.length;i++){
            if(num2[i]<result){
                result=num2[i];
            }
        }
        System.out.println("minimum :"+result);

        }}
