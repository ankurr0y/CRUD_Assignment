/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ankur
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {
    public void send(String email) {
        final String username = "foranemailapp@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, "12345----a");
                    }
                });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("foranemailapp@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));
            message.setSubject("Registered");
            message.setText("Hello,"
                    + "\n\n You have been registered on our app.");
            Transport.send(message);
            System.out.println("Your email has been sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}