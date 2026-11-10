

class Student{
    private int ID=202406;
    void getter(){
        System.out.println(ID);
    }

    void setter(int num){
        ID=num;
    }

}


public class Main {
    public static void main(String[] args) {
        Student us=new Student();
        us.setter(202456);
        us.getter();
    }
}
