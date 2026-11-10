

class add{
    add(int a,int b){
        int res=a+b;
        System.out.println(res);

    }
}

class sub{
    sub(int a,int b){
        int res=a-b;
        System.out.println(res);

    }
}
class mul{
    mul(int a,int b){
        int res=a*b;
        System.out.println(res);

    }
}
class Div{
    div(int a,int b){
        int res=a/b;
        System.out.println(res);

    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int c=sc.nextInt();
        int d=sc.nextInt();


        add ad=new add(c,d);
        sub s=new sub(c,d);
        mul m=new mul(c,d);
        divs d=new divs(c,d);

    }
}
