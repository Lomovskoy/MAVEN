/*
 * HomePage.java
 *
 * Created on 11 марта 2018 г., 9:45
 */

package com.myapp.wicket;           

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {

    public HomePage() {
        add(new Label("message", "Hello, World!"));
    }

}
