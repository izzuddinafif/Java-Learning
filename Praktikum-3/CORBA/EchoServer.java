import EchoApp.EchoPOA;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class EchoServer extends EchoPOA {
    final AtomicInteger runningCount = new AtomicInteger(0);
    final Integer limit = 1;
    final String ErrorMessage = "limit exceeded";
    @Override
    public String EchoString(){
        if(runningCount.incrementAndGet() <= limit) { //increment number of clients and check
        doSomething();
        runningCount.decrementAndGet(); //decrement number of clients
        return "Hello World!";
        } else {
            runningCount.decrementAndGet(); //decrement number of clients
            return ErrorMessage;
        }
    }
    private void doSomething() {
        try{
            for(int i=1; i<5; i++){
                Thread.sleep(i*1000);
                System.out.println("sleep " + i);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}