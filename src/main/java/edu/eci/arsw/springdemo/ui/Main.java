/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.eci.arsw.springdemo.GrammarChecker;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext sc = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = sc.getBean(GrammarChecker.class);
        System.out.println(gc.check("la la la "));
    }

}
