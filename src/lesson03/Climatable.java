package lesson03;

public interface Climatable {

    //int getCurrentTemp();

    default void climateControl(int temp) {
        System.out.println("AC works with temp: " + temp);
    }
    default void climateStop() {
        System.out.println("Climate control system is turned off");
    }
}
