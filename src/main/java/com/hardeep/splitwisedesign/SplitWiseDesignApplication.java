package com.hardeep.splitwisedesign;

import com.hardeep.splitwisedesign.commands.CommandManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitWiseDesignApplication implements CommandLineRunner {

//    public void run(String... args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello World");
//        while(true){
//            String input = sc.nextLine();
//            if(input.startsWith("RegisterUser")){
//                //Make a call to user controller
//            }
//            else if(input.startsWith("SettleGroup")){
//                //Make a call to group controller
//            }
//
//        }
//    }
    @Autowired
    CommandManager commandManager;
    public static void main(String[] args) {
        SpringApplication.run(SplitWiseDesignApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scn = new Scanner(System.in);
        while(true){
            String command = scn.nextLine();
            commandManager.execute(command);
        }
    }
}
