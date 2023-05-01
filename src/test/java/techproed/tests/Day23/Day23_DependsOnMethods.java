package techproed.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Day23_DependsOnMethods {
    @Test
    public void homePageTest (){
        assertEquals(1,2);
        System.out.println("Anasayfa gidildi ");
    }

    @Test (dependsOnMethods = "homePageTest")
    public void seachTest(){
        System.out.println("Arama yapildi");
    }

    @Test (dependsOnMethods = "homePageTest")
    public void signInTest(){
        System.out.println("giris yapildi");
    }
}
