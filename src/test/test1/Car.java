package test.test1;

public class Car {

    private String color;
    private int power;

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    private  Car(Builder builder){
        this.color = builder.color;
        this.power = builder.power;
    }



    public static class Builder {
        private String color;
        private int power;


        public Builder color(String color){
            this.color = color;
            return this;
        }


        public Builder power(int power){
            this.power = power;
            return this;
        }


        public Car build(){
            return new Car(this );
        }
    }

    @Override
    public String toString() {
        return "Car " + "color = " + color +  " power = "+power;
    }
}
