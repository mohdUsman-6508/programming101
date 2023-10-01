 public class car{
    int model;
    String name;
    String color;

}




 class moreOnOops {
    public static void main(String[] args) {

        car object1=new car();
        String c=object1.color="black";
        object1.model=2022;
        object1.name="maruti";
        System.out.println(c+object1.name + object1.model);


    }


}
