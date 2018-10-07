package test.test1;

public class Car {

    private String color;

    public String getColor() {
        return color;
    }


    private  Car(Builder builder){
        this.color = builder.color;
    }

    public static class Builder {
        private String color;


        public Builder color(String color){
            this.color = color;
            return this;
        }


        public Car build(){
            return new Car(this );
        }
    }

    @Override
    public String toString() {
        return "Car " + "color = " + color ;
    }
}
