import java.io.*;
import java.net.*;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class XMPPClient{

	public static void main(String argv[]) throws Exception{

		//for XMPP the standard TCP port for the server is 5222
		ConnectionConfiguration config = new ConnectionConfiguration("localhost", 5222);
		XMPPConnection connection = new XMPPConnection(config);

		//connect to server
		try{

			connection.connect();

		} catch (XMPPException e) {

			System.out.println("Failed to open connection");
			System.exit(0);

		}
		


	}





}