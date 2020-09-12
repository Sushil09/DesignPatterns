package LLD.DesignPatterns.FactoryDesgn.MainOs;

import LLD.DesignPatterns.FactoryDesgn.FactoryBuilder.Android;
import LLD.DesignPatterns.FactoryDesgn.FactoryBuilder.FactoryBuilderOs;
import LLD.DesignPatterns.FactoryDesgn.FactoryBuilder.Os;

import java.util.Scanner;

public class OperatingSystem {
    public static void main(String[] args) {
//        Os operatingSystem=new Android();//Direct dependency
//        operatingSystem.showOs();
        Scanner sc=new Scanner(System.in);
        System.out.println("Which Os do you want?");
        String wanted=sc.nextLine();

        FactoryBuilderOs producedOs=new FactoryBuilderOs();

        Os produced=producedOs.provideOs(wanted);
        produced.showOs();

    }
}
