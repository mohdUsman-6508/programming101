package StaticRise;

public class Human {
    String name;
    int age;
    String country;
    static long population;

    public Human(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
        Human.population+=1;// population is a static variable so independent of object, common to all objects
    }
    public void greet(){
        System.out.println(this.name+" welcomes you:)");
        System.out.println(population);
    }

    public static class Single{

        private static Single instance;
        private Single(){

        }
        public static Single getInstance(){

            if(instance==null){
               instance=new Single();
            }

            return instance;
        }
    }
}



