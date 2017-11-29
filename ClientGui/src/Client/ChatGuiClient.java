/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Matt
 */
public class ChatGuiClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Gui().setVisible(true);
        new NewLogin().setVisible(true);
        
            /*public void Connect(){
        //for XMPP the standard TCP port for the server is 5222
        //"legacy" method of encryption port = 5223
        XMPPTCPConnectionConfiguration.Builder configBuilder = XMPPTCPConnectionConfiguration.builder();
  
        configBuilder.setUsernameAndPassword(username, password);
        configBuilder.setHost("192.168.91.1");
        configBuilder.setPort(5223);
        configBuilder.setSecurityMode(SecurityMode.required);
        //domain will be set later to create XMPP user address i.e. user@jabber.org
        //configBuilder.setXmppDomain("chapman.mail.edu");


        //will create resource name such as "work" for user@jabber.org/work
        //not necessary
        //configBuilder.setResource("SomeResource");

        connection = new XMPPTCPConnection(configBuilder.build());


        //connect to server
        try {
            
            connection.connect();
            connection.login(username, password);
            isConnected = true;

        } catch (XMPPException | SmackException | IOException | InterruptedException e) {
                          
            e.printStackTrace();
            System.out.println("Failed to open connection");
            isConnected = false; 
            System.exit(0);
            
        }
    }
    */
            
    }
}
