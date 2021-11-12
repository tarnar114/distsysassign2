import java.rmi.*;
public interface CalcInterface extends Remote{
    //add,multiply,divide,subtract
    public int add(int x,int y) throws RemoteException;
    public int subtract(int x,int y) throws RemoteException;
    public int multiply(int x,int y) throws RemoteException;
    public int divide(int x,int y) throws RemoteException;
    //simple interest formula
    public Integer simpleInterest(int P,int R,int N) throws RemoteException;
    public Integer compoundInterest(int P,int R,int t) throws RemoteException;
    public Integer loanEMI(int P,int R, int N) throws RemoteException;
    public Double effecAnnualRate(int r,int n) throws RemoteException;
    


}
