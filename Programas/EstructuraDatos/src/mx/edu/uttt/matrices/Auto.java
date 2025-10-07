package matrices;

public class Auto {
    private String model;
    private int milesDrivgen;
    private double galonOfGas;

    public Auto() {
        this.model = "unknow";

    }

    public Auto(String model, int milesDrivgen, double galonOfGas) {
        this.model = model;
        setGalonOfGas(galonOfGas);
        setMilesDrivgen(milesDrivgen);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDrivgen() {
        return milesDrivgen;
    }

    public void setMilesDrivgen(int milesDrivgen) {
       if(milesDrivgen>=0.0) {
           this.milesDrivgen = milesDrivgen;
       }else{
           System.out.println("Miles driven can't be negative");
           System.out.println("Value not changed");
       }

    }


    public double getGalonOfGas() {
        return galonOfGas;
    }

    public void setGalonOfGas(double galonOfGas) {
        if (galonOfGas >= 0.0) {
            this.galonOfGas = galonOfGas;
        }else{
            System.out.println("Gallons of gas cannot be negative");
            System.out.println("Value not changed");
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDrivgen=" + milesDrivgen +
                ", galonOfGas=" + galonOfGas +
                '}';
    }
}
