package com.mwaisaka.Heather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        String str = "<html><body><font color=\"green\">"
                + "<h1>WELCOME To Mwaisaka's Cult</h1>"
                + "</font></body></html>";
        return str;
    }

    //Another syntax to implement a GET method
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/gfg"}
    )
    public String info(){
        String str2 =  "<html><body><font color=\"green\">"
                + "<p> I don't even have to try :) "
                + "In my Bag!!"
                + "</p></font></body></html>";
        return str2;
    }
}
