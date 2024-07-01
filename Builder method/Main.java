public class Main {
    public static void main(String[] args){
        House house = new House.Builder()
                .setDoors("Wooden doors")
                .setWalls("Brick walls")
                .setWindows("Glass windows")
                .build();

        System.out.println("House built with: ");
        System.out.println("Walls: " + house.getWalls());
        System.out.println("Doors: " + house.getDoors());
        System.out.println("Windows: " + house.getWindows());
    }
}
