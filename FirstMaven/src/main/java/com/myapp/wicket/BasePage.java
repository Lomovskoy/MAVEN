/*
 * WicketExamplePage.java
 *
 * Created on 11 марта 2018 г., 9:45
 */
 
package com.myapp.wicket;           

import org.apache.wicket.markup.html.WebPage;

/** 
 *
 * @author lomov
 * @version 
 */

public abstract class BasePage extends WebPage {

    public BasePage() { 
        super(); 
        add(new HeaderPanel("headerpanel", "Welcome To Wicket")); 
        add(new FooterPanel("footerpanel", "Powered by Wicket and the NetBeans Wicket Plugin"));
    } 

}
