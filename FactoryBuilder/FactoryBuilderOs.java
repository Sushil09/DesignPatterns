package LLD.DesignPatterns.FactoryDesgn.FactoryBuilder;

public class FactoryBuilderOs {
    public Os provideOs(String type){
        if(type.equals("Open"))
            return new Android();
        else if(type.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
