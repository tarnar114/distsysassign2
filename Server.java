import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args) throws Exception{
        CalcImpl obj = new CalcImpl();//implementation access when server is started
  
        // Binds the remote object by the name ADD
        Naming.rebind("ADD", obj);
  
        System.out.println("Server Started");
    }
}
