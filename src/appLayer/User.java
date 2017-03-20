package appLayer;/*
 * Created by Caja on 20-03-2017.
 */

public class User {

    public boolean isValidUserCredentials(String sUserName, String sUserPassword)
    {
        if (sUserName.equals("jonb") && sUserPassword.equals("test123"))
        {
            return true;
        }
        return false;
    }


}
