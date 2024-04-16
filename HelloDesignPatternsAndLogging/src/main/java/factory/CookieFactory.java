package factory;

//Factories are one of the most common ways to abstract away object-creational code
//Imagine having 500 cookies to choose from. That would be a VERY long switch statement (etc.)
//Better to hide that ugly, long code in a Factory, so that our main code is clean and easy to read


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookieFactory {

    //Instantiating a Logger object so that we can log the CookieFactory processes
    private static final Logger LOGGER = LoggerFactory.getLogger(CookieFactory.class);


    //this getCookie method will be used to abstract away the cookie creation code
    //it'll be ugly here, and ONLY here (not in main())
    public Cookie getCookie(String cookieType){

        //log that a cookie is about to be made
        LOGGER.info("Baking a Cookie!!");

        //control flow to determine what kind of cookie will be returned
        if(cookieType.equals("Chocolate Chip")){
            LOGGER.info("Chocolate Chip was chosen by the user");
            return new ChocolateChip();
        }

        if(cookieType.equals("Oatmeal Raisin")) {
            //I don't like Oatmeal Raisin cookies, so I'll make this a WARN level, because it may be harmful
            LOGGER.warn("Oatmeal Raisin was chosen by the user... yuck");
            return new OatmealRaisin();
        }

        if(cookieType.equals("Ginger Snap")){
            LOGGER.info("Ginger Snap was chosen by the user");
            return new GingerSnap();
        }

        LOGGER.warn("The user inserted an invalid type");

        //if there is no match, return null
        return null;

    }

}
