class user{
    private int amount=0;

    void getter(){
        System.out.println(amount);
    }

    void setter(int num){
        amount=num;

    }
}


public class GetterAndSetter {

    public static void main(String[] args) {
        user us=new user();
        us.setter(1000);
        us.getter();
    }
}