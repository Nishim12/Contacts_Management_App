# Contacts App with SQLite Database

Welcome to the Contacts App! This open-source Android application allows you to manage your contacts using a SQLite database. You can add, update, delete contacts, and even retrieve the total number of contacts.

## Usage

The Contacts App is designed to help you manage your contacts more efficiently. You can use SQLite Database Management System to perform following functions on contacts in the database:

- **Add Contacts:** Add new contacts by entering their names and phone numbers in the code.
- **Update Contacts:** Edit and update contact details as needed.
- **Delete Contacts:** Remove unwanted contacts from your list.
- **Retrieve Any Contacts:** Check or retrieve the total number of contacts in your database.
 ## How to Use the app

The Contacts App generates logs that provide a database of all contacts. You can access these logs through Android Studio's Logcat feature. 

### View the Database

Follow these steps to clone the repository, open the project, sync and build it, and then view the database-related logs:

1. **Clone the Repository**

   - Open Android Studio.
   - Go to `File` > `New` > `Project from Version Control` > `Git`.
   - Enter the GitHub repository URL: [https://github.com/Nishim12/Contacts_Management_App](https://github.com/Nishim12/Contacts_Management_App).
   - Choose the directory to save the cloned repository on your local machine.

2. **Open the Project**

   - Android Studio will automatically open the project after cloning.
   - If not, manually open it by going to `File` > `Open` and selecting the project's directory.

3. **Sync and Build**

   - Android Studio might prompt you to sync the project with Gradle files.
   - Click "Sync Now" to ensure the project's dependencies are correctly configured.

4. **Connect Device or Start Emulator**

   - Connect your Android device or start an emulator.

5. **Access Logs in LogCat**

   - In Android Studio, go to the bottom toolbar and click on "Logcat."

6. **Filter Logs**

   - In the LogCat panel, use the filter to narrow down the logs. Type "nishim" in the filter of Logcat.

7. **View Database Logs**

   - The LogCat will display logs generated by the Contacts App.
   - You can see information such as debug messages, warnings, errors, and more.

Please ensure that you follow these steps to access and view the database logs effectively.


### To perform CRUD operations on the contacts 
CRUD stands for Create, Read, Update and Delete the contacts in the database.
To perform the CRUD operations, you can utilize the following functions:

1. **addContact:** 
   To add a contact to the database.

2. **getAllContacts:** 
   To get all the existing contacts from the database.

3. **updateContact:** 
   To update any of the contacts in the database.

4. **deleteContactById:** 
   To delete a specific contact from the database by passing the ID of that contact to the function.

5. **GetCount:** 
   To get the count of the total number of contacts in the database.

Feel free to use these functions to interact with the database and manage your contacts effectively.


## Technologies Used

The Contacts App is developed using the following technologies:

- **Java:** Used for app logic.
- **XML:** Utilized for layout design.
- **SQLite Database:** Employed for managing contacts.

## Improvements in the App

In the future, you might consider implementing a more user-friendly way to access and display app logs within the app itself. This could provide users with insights into their interactions and help in debugging.

Your contributions in this area could make the Contacts App even more user-friendly and developer-friendly!

