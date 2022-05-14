
class a{
     void home(){};
}
class b extends a{
    private int doStuff(int a, double b){
        return 4;
    }
}
public class test {
    static int si = 10;
    int j;
    final boolean bool;

    {
        si = 5;j = bool?1000:2000;
    }

    public test(boolean bool) {
        this.bool = bool;
    }
}
