package Generics;

import java.util.Comparator;

public class Box<T> {
    private T content;
    public void setContent(T content){
        this.content=content;
    }
    public T getContent(){
        return content;
    }
    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.setContent("Hello, World!");
        System.out.println(stringBox.getContent());

        String[] str={"hello","world","how","are","you"};
        printArray(str);



        Box<Integer> integerBox=new Box<>();
        integerBox.setContent((123));
        System.out.println(integerBox.getContent());
    }
}

class BoxComparator<T extends Comparable<T>>  implements Comparator<Box<T>>{
    public int compare(Box<T> b1,Box<T> b2){
        return b1.getContent().compareTo(b2.getContent());
    }
}




