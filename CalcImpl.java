import java.rmi.*;
import java.rmi.server.*;
public class CalcImpl extends UnicastRemoteObject implements CalcInterface{
    public CalcImpl() throws Exception {super();}//generic constructor
    public int add(int x,int y){return x+y;};//generic calculator operations
    public int subtract(int x,int y){return x-y;};
    public int multiply(int x,int y) {return x*y;};
    public int divide(int x,int y) {return x/y;};

     //banking formulas for calculating certain formulas
    public Integer simpleInterest(int P,int R,int N) {
        int simpleInterest;
        simpleInterest=(int)P*R*N;
        return simpleInterest;
    };
    public Integer compoundInterest(int P,int R,int T) {
        int compound;
        compound=(int)(Math.pow((1+R), T)*P)-P;
        return compound;
    };
    public Integer loanEMI(int P,int R, int N) {
        int Top=(int)(Math.pow((1+R), N))*R;
        int bottom=(int)(Math.pow((1+R), N))-1;
        int EMI=P*(Top/bottom);
        return EMI;
    };
    public Double effecAnnualRate(int R,int N) {
        double annual=(Math.pow((R/N), N)+1)-(1*100);
        return annual;
    };
}
