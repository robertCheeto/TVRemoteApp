package com.pluralsight;

import java.util.Scanner;

public class TVRemoteApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        TVRemote lgTV = new TVRemote("LG");
        lgTV.setPowerState(true);
        lgTV.setCurrentVolume(50);
        lgTV.setChannelNumber(4);

        System.out.println(lgTV.getStatus());

    }
}
