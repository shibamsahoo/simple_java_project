class A
{
    int a;
    int b;
    void getdata(int val1,int val2)
    {
        a=val1;
        b=val2;
    }
}
class B
{
    public static void main(String[] args)
    {
        int c;
        A obj=new A();
        obj.getdata(20,30);
        c=obj.a+obj.b;
        System.out.println("add:" +c);
    }
}