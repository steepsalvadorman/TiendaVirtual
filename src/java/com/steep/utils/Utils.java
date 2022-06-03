/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steep.utils;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Steep Salvador
 */
public class Utils {
    public static String MESSAGE;
    public static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
    
    public static boolean isLogged(HttpSession session){
        List<String> atributos = Collections.list(session.getAttributeNames());
        if(atributos.contains("user")){
            return session.getAttribute("user") != null;
        }
        return false;
    }
}
