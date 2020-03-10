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


        String values = null;
        //  values.split("(?<=\\G.{" + getMaxCharAmount() + "})");


        try {
            System.out.println(InetAddress.getLocalHost()
                                       .getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        System.out.println("taskA");


    }

    private static String getMaxCharAmount() {

        return "test";
    }
}
