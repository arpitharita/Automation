package automationtest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Q5 {
    public static void main(String[] args) {

        String[] names = {};
        ArrayList<String> list = new ArrayList(Arrays.asList());
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Rest Assured");

        for(int i=0; i < list.size(); i++){
            System.out.println( list.get(i) );
    }

}
}
