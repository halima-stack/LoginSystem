# LoginSystem
This Application is a system that processes login creditials and verifies it by comparing it to login key pairs stored. Once your logins are verified the application launches the welcome page. 

IDandPasswords class - this contains a hash map of all the user ID and Password combinations.
LoginPage class - this is where individuals sign in.
WelcomePage class - this page appears after individuals login. 

In the main class, create an instance of the ID and Passwords class in the main method. 
In IDandPasswords class a hash map is created. A hash map is perfect for this project because they store key value pairs. 

In order to create a hash map we need to instantiate a hash map and then list the data types of what were storing within the hash map.
I am storing two strings, an ID and a password. 

The key pair for the username and password I am storing are: 

"Bro", “pizza"
"IronMan", "Endgame1234!"
"Hulkcode", "ThorismyBuddy1@"


In the LoginPage I created the frames, buttons, textfields, and labels. Also, I used an action listener here with the ActionPerformed method. 

In the ActionPeformed method there are loops that check whether a password was entered in correctly or incorrectly. Depending on those parameters you will either get a message that says, “Login Successful” or “Incorrect Password”. 

Similarly, the application will check whether the username matches the username key pair I have created. If it doesn’t match any username I have stored than you will get the message, “ username not found.” 
There is a reset button also included which clears the login information entered in. 

Once a login credentials are verified then the application will take you to the welcome page. 

The Welcome Page is a simple page that says “Hello” (+ username). 
For example, If your username is Bro then Welcome Page will say, “Hello Bro”. 
