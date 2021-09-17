class Acquaintince {
    private String name;

    Acquaintince(String friendName){
        name = friendName;
    }
    public void saySomething(){
        System.out.println(name + " is my acquaintince.");
    }
}

public class Solution {
    public static void main(String[] args){
        Acquaintince a = new Acquaintince("Addison");
        a.saySomething();
    }
}