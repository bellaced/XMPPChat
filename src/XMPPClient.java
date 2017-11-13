import java.io.*;
import java.net.*;

import org.jivesoftware.smack.*;
//import org.jivesoftware.smack.Chat;
//import org.jivesoftware.smack.Roster;
//import org.jivesoftware.smack.RosterEntry;
//import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smack.ConnectionConfiguration;

public class XMPPClient {
    public static void main(String argv[]) throws Exception{

        //for XMPP the standard TCP port for the server is 5222
        XMPPTCPConnectionConfiguration.Builder configBuilder = XMPPTCPConnectionConfiguration.builder();
        configBuilder.setUsernameAndPassword("username", "password");
        //will create resource name such as "work" for user@jabber.org/work
        //not necessary
        //configBuilder.setResource("SomeResource");
        //domain will be set later to create XMPP user address i.e. user@jabber.org
        //configBuilder.setXmppDomain("jabber.org");

        AbstractXMPPConnection connection = new XMPPTCPConnection(configBuilder.build());

        //connect to server
        try{

            connection.connect();

        } catch (XMPPException e) {

            System.out.println("Failed to open connection");
            System.exit(0);

        }

    }

}
