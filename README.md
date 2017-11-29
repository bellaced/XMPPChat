
XMPP CHAT Client


Netbeans is required to run GUI 

- Download here: https://netbeans.org/downloads/

*JAVA EE is fine *


Clone XMPPChat into desktop


Open Netbeans IDE, Click "Open Project", and select "ClientGui"


Code for our XMPP Client will be found under Client --> Source Packages --> Client

-ChatGuiClient.java opens Gui to NewLogin.java

-Gui.java is the soon-to-be chat platform

-NewLogin.java is the page in which the connection to the Server is made. 

*There is no code for the server. The Server is hosted on Isabella's Laptop, and was designed using Openfire, an open source xmpp 
server. 



Under client, expand the libraries tab. If is is empty, you will need to add our files from the "Smack API" folder and the "xpp3-1.1.4c" folder. 

-Right click on Client Project

-Select Properties

-On the left-hand side click properties

-Under the Compile tab, click "Add Jar/Folder" button

-Navigate to the Smack API folder, and highlight all the jar files located inside

-Repeat all the steps, and highlight the jar files in the "xpp3-1.1.4c" folder

After this, all necessary jar files should be located in the Libraries section





At the top, press the Green Triangle Button to Run the Project. 

-There are two users that can be used to log in:

1) user1

password: user1password

2) user2

password: user2password


Login button to connect to server

*Troubles with establishment are caused by incorrect import of jar files
