/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;
import java.net.*;
/**
 *
 * @author SouvikPRAT
 */
public class OtpSeeding {
    
    static final int LENGTH=4;
     
   
    public String send(String phone)
    {
        Otp otp=new Otp();
        String number=null;
     try {
          char[] data=otp.OTPgen(LENGTH);
          number = new String(data);
                String recipient = phone;
                String message = "Your OTP is "+number;
                String username = "admin";
                String password = "Java.me@1996";
                String originator = "+918759365924";

                String requestUrl  = "http://127.0.0.1:9501/api?action=sendmessage&" +
                					 "username=" + URLEncoder.encode(username, "UTF-8") +
                					 "&password=" + URLEncoder.encode(password, "UTF-8") +
                					 "&recipient=" + URLEncoder.encode(recipient, "UTF-8") +
                					 "&messagetype=SMS:TEXT" +
                					 "&messagedata=" + URLEncoder.encode(message, "UTF-8") +
                					 "&originator=" + URLEncoder.encode(originator, "UTF-8") +
                					 "&serviceprovider=GSMModem1" +
                					 "&responseformat=html";



                URL url = new URL(requestUrl);
                HttpURLConnection uc = (HttpURLConnection)url.openConnection();

                System.out.println(uc.getResponseMessage());

                uc.disconnect();
               

        } catch(Exception ex) {
                System.out.println(ex.getMessage());
               }
        return number;
   
    }
}
     

