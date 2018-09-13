/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bkwitten.projekt.susautomarkt.messenger;

import java.util.Properties;


/**
 *
 * @author temmebhz
 */
public class EmailSender {
    public static void SendEmail(String Emailto, String Message, String Subject){
        final String username = "stahlknechtundsoehne.business@gmail.com";
        final String passwort = "DasisteingutesPasswort";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        
    }
}
