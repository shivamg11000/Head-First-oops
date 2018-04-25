package app;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings; // no of strings in guitar

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType(){
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
    public int getNumStrings() {
        return numStrings;
    }
    public boolean matches(GuitarSpec otherSpec) {

        if (otherSpec.builder != builder) 
            return false;    
        if ((model != null) && (!model.equals("")) && 
            (!model.equals(otherSpec.model)))
            return false;
        if (otherSpec.type != type)
            return false;
        if (otherSpec.backWood != backWood)
            return false;
        if (otherSpec.topWood != topWood)
            return false;
        if (otherSpec.numStrings != numStrings)
            return false;
        return true;
    }
}
