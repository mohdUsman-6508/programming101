import java.util.LinkedList;
import java.util.Queue;

public class TODO {
    private int numberOfTask;
    private Queue<String> tasks=new LinkedList<>();

    public TODO(){
        numberOfTask=0;
        tasks.clear();
    }
    public TODO(String task){
        this.tasks.add(task);
        this.numberOfTask=1;
    }

    void addTask(String task){
        this.tasks.add(task);
        this.numberOfTask++;
    }
    String markAsComplete(){
        if(numberOfTask==0){
            System.out.println("List is Empty!");
            return "";
        }
        String completedTask=this.tasks.poll();
        this.numberOfTask--;
        System.out.println("Well done, "+completedTask+" is completed ✅");
        return completedTask;
    }
    void showList(){
        if(numberOfTask==0){
            System.out.println("List is Empty!");
        }
        int counter=0;
        System.out.println("List of remaining tasks 📃 : ");
        System.out.println("_______________________");
        while (counter<numberOfTask){
            String listItem=tasks.poll();
            System.out.println(listItem+" ");
            tasks.add(listItem);
            counter++;
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
    }
    int getNumberOfTask(){
        System.out.println("Tasks remaining in the list:📃 "+ numberOfTask);
        return numberOfTask;
    }

}
