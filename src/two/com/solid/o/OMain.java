package two.com.solid.o;


import two.com.solid.o.bad.AnotherBadClient;
import two.com.solid.o.bad.BadClient;
import two.com.solid.o.bad.BadServer;
import two.com.solid.o.good.AnotherGoodClient;
import two.com.solid.o.good.Client_I;
import two.com.solid.o.good.GoodClient;
import two.com.solid.o.good.GoodServer;


public class OMain {

    public static void main(String[] args) {
        testBadO();
        testGoodO();
    }

    private static void testBadO() {
        BadClient client = new BadClient();
        BadServer server = new BadServer();
        server.reactToClient(client);

        AnotherBadClient anotherBadClient = new AnotherBadClient();
       // server.reactToClient(anotherBadClient);
    }

    private static void testGoodO() {
        Client_I client = new GoodClient();
        GoodServer server = new GoodServer();
        server.reactToClient(client);

        AnotherGoodClient anotherGoodClient = new AnotherGoodClient();
        server.reactToClient(anotherGoodClient);
    }

}
