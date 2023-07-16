public class WeatherCheck {

    public static void main(String[] args) {

        int temperature = 25;
        boolean currentlyRaining = false;

        if (temperature > 18 && currentlyRaining == false) {
            System.out.println("You should wear a t-shirt and shorts and consider wearing sunscreen");
        } else if (temperature >= 10 && temperature <=17 && currentlyRaining == false) {
            System.out.println("You should consider wearing jeans or trousers with a thin long-sleeve top or t-shirt");
        } else if (temperature < 10 && currentlyRaining == true) {
            System.out.println("Consider wearing something warmer and definitely wear a raincoat");
        } else if (temperature < 5 && currentlyRaining == true) {
            System.out.println("Prepare for the cold wearing gloves and a hat and potentially snow boots");
        } else System.out.println("Wear anything");
    }
}
