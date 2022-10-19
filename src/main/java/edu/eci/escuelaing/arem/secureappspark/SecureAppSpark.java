/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edu.eci.escuelaing.arem.secureappspark;

/**
 *
 * @author cristian.castellanos
 */
import static spark.Spark.*;

public class SecureAppSpark {

    public static void main(String[] args) {
        secure("keystore/ecikeystore.p12", "123456", null, null);
        port(5000);
        get("/hello", (req, res) -> "Hello Heroku");
    }
}
