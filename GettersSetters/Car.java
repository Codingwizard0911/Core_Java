package GettersSetters;

public class Car {
    private final String Model;//final makes not writable
    private String Color;
    private int year;

   /* Car(String Model,String Color,int year)
    {
        this.Model = Model;
        this.Color = Color;
        this.year = year;

    }*/

    //to access the private data outside we will use getter and setter

    String getModel()
    {
        return this.Model;
    }

    String getColor()
    {
        return this.Color;
    }



    void setColor(String Color)
    {
        this.Color = Color;
    }
    
}
