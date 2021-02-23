/*
 * Copyright (c) 2020 CoreLogic, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CoreLogic, Inc.
 * It is furnished under license and may only be used or copied in accordance
 * with the terms of such license.
 * This software is subject to change without notice and no information
 * contained in it should be construed as commitment by CoreLogic, Inc.
 * CoreLogic, Inc. cannot accept any responsibility, financial or otherwise, for any
 * consequences arising from the use of this software except as otherwise stated in
 * the terms of the license.
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {


        int i =4;
        String test;
        String help;
        int jer;
        int her;

        String value=System.getProperty("name");

        System.out.println("Proprerty "+ value);

        System.out.println("controlled");
        System.out.println("flag");

        System.out.println();

        i++;
        System.out.println("testt");
        System.out.println("nbnbnbdsdssdbggfgfnb");




        //TODO:
        String values = null;
        //  values.split("(?<=\\G.{" + getMaxCharAmount() + "})");


        try {
            System.out.println(InetAddress.getLocalHost()
                    .getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        if (values != null)
            System.out.println("tehjst");

        if (values != null)
            System.out.println("test");

        System.out.println("teststr1231212");
        System.out.println("teststr");
        System.out.println("teststr2121");
        System.out.println("teststr1212");
        System.out.println("teststr1212");
        System.out.println("teststr");


    }

    private static String getMaxCharAmount() {

        return "tesfdfasasadftjhhghghg";
    }

    public void test() {
        int i =4;
        String test="test";
        String help="help";
        int jer=5;
        int her=6;


        AA aa = new AA();

        AA.callMet(i,test,help,jer,her);



        System.out.println("test");
    }
}
