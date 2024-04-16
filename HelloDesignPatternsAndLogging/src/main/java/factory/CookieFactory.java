package factory;

//Factories are one of the most common ways to abstract away object-creational code
//Imagine having 500 cookies to choose from. That would be a VERY long switch statement (etc.)
//Better to hide that ugly, long code in a Factory, so that our main code is clean and easy to read

public class CookieFactory {


    //this getCookie method will be used to abstract away the cookie creation code
    //it'll be ugly here, and ONLY here (not in main())
    public Cookie getCookie(String cookieType){

        //control flow to determine what kind of cookie will be returned
        if(cookieType.equals("Chocolate Chip")){
            return new ChocolateChip();
        }

        if(cookieType.equals("Oatmeal Raisin")) {
            return new OatmealRaisin();
        }

        if(cookieType.equals("Ginger Snap")){
            return new GingerSnap();
        }

        //if there is no match, return null
        return null;

    }

}
