package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before(order = 2)
    public void before (){
        System.out.println("setting up db connection");
    }

    @After
    public void after() {
        System.out.println("tear down");
    }

    @Before("@login")
    public void before1() {
        System.out.println("Setting up connection with Rest Assured");
    }
}
