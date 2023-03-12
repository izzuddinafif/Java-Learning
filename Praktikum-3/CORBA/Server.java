import EchoApp.Echo;
import EchoApp.EchoHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class Server {
    public static void main(String args[]) {
        try{
        // create and initialize the ORB
        ORB orb = ORB.init(args, null);
        // get reference to rootpoa & activate the POAManager
        POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        rootpoa.the_POAManager().activate();
        
        // create servant and register it with the ORB
        EchoServer echoServer = new EchoServer();

        // get object reference from the servant
        org.omg.CORBA.Object ref = rootpoa.servant_to_reference(echoServer);
        Echo href = EchoHelper.narrow(ref);
        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
        NameComponent path[] = ncRef.to_name("Echo");
        ncRef.rebind(path, href);
        System.out.println("EchoServer ready and waiting ...");
        // wait for invocations from clients
        orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
        System.out.println("EchoServer Exiting ...");
    }
}