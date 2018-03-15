/*
 * Application.java
 *
 * Created on 11 марта 2018 г., 9:45
 */
 
package com.myapp.wicket;           

import org.apache.wicket.protocol.http.WebApplication;
/** 
 *
 * @author lomov
 * @version 
 */

public class Application extends WebApplication {

    public Application() {
    }

    public Class getHomePage() {
        return HomePage.class;
    }

}
