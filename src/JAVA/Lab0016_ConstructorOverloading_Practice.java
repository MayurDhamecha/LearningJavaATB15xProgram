package JAVA;

public class Lab0016_ConstructorOverloading_Practice {
    public static void main(String[] args) {
        loginPage callingLoginPage = new loginPage("Username","Password");
        System.out.println("For Login page");
        System.out.println(callingLoginPage.userName + " AND " + callingLoginPage.password);

        sinupPage callingSignupPage = new sinupPage("FirstName", "LastName", "emailAddress", "UserName", "Password");
        System.out.println();
        System.out.println("For Sign-Up Page");
        System.out.println(callingSignupPage.firstName + " AND " + callingSignupPage.lastName);
    }
}

class loginPage {
    String userName;
    String password;

    loginPage(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

class sinupPage {
    String firstName;
    String lastName;
    String emailAddress;
    String userName;
    String password;

    sinupPage(String firstName, String lastName, String emailAddress, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
    }
}