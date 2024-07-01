public class House {
    private String walls;
    private String doors;
    private String windows;

    //Getters
    public String getWalls(){
        return walls;
    }

    public String getDoors(){
        return doors;
    }
    public String getWindows(){
        return windows;
    }

    public static class Builder {
        private String walls;
        private String doors;
        private String windows;

        public Builder setWalls(String walls){
            this.walls = walls;
            return this;
        }
        public Builder setDoors(String doors){
            this.doors = doors;
            return this;
        }
        public Builder setWindows(String windows){
            this.windows = windows;
            return this;
        }

        public House build(){
            House house = new House();
            house.walls = this.walls;
            house.doors = this.doors;
            house.windows = this.windows;
            return house;
        }
    }
}
