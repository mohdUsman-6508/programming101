package ExceptionHandling;

public class trycatch {
    public static void main(String[] args) {

//        try {
//            int[] numbers = {1, 2, 3};
//            System.out.println(numbers[3]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("An error occured:" + e.getMessage());
//        } finally {
//            System.out.println("The try catch block is finished");
//        }
        try{
            validateAge(15);
        }catch(CustomException e){
            System.out.println("Caught custom exception:"+e.getMessage());
        }
    }

    static void validateAge(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Age must be at least 18");
        }else{
            System.out.println("Age is valid");
        }
    }

}



class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}