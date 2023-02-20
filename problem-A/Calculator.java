

public class Calculator  {
    private int n ;
    private int m;
    public Calculator(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public Calculator(Object o1 , Object o2){
        if(o1 instanceof Integer)
            throw new NumberFormatException("This is not Integer");
    }
    public  void Add(){
        if(this.n < 0 || this.m < 0) throw new ArithmeticException(String.format("One of these numbers is negative : %d ,%d ",this.n , this.m));
        System.out.println(this.n + this.m);
    }
    public void Subtract(){
        if(this.n < 0 || this.m < 0)
            throw new ArithmeticException(String.format("One of these numbers is negative: %d , %d " ,this.n,this.m ));
        System.out.println(this.n - this.m);
    }
    public void Multiplication(){
        if(this.n == 0 || this.m == 0)
            throw new ArithmeticException(String.format("One of these numbers is zero : %d , %d" , this.n , this.m));
        System.out.println(this. n * this.m);
    }
    public void Division(){
        if(this.n == 0 || this.m == 0)
            throw new ArithmeticException(String.format("One of these numbers is zero : %d , %d" , this.n , this.m));
        System.out.println(this.n / this.m);
    }
}
