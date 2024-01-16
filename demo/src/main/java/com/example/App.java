package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {

            Socket s=new Socket("localhost", 3000);

            XmlMapper x = new XmlMapper();
            Aula aul = x.readValue(new File("test.xml"), Aula.class);

            aul.toString();

            s.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
