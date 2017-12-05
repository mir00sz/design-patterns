package factory;

import java.util.List;

public abstract class Pizza {

    private String name;
    private String dough;
    private String souce;
    private List<String> addons;

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("making a dough " + dough);
        System.out.println("Adding a souce " + souce);
        System.out.println("Addons: ");
        for (String add : addons){
            System.out.println(add);
        }
    }


}
