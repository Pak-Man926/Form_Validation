package form.validation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

public class PersonForm
{
    @NotNull
    @Size(min=2,max=30)
    private String Name;

    @NotNull
    @Min(18)
    private int Age;


    //Respective Getters
    public @NotNull @Size(min = 2,max= 30) String getName()
    {
        return Name;
    }

    @NotNull
    @Min(18)
    public int getAge()
    {
        return Age;
    }


    //Respective Setters
    public void setName(@NotNull @Size(min = 2, max = 30) String name)
    {
        Name = name;
    }

    public void setAge(@NotNull @Min(18) int age)
    {
        Age = age;
    }

    public String toString()
    {
        String s = "Peron(Name: " + this.Name + ", Age: " + this.Age + ")";

        return s;
    }
}
