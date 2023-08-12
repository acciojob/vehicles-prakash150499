package com.driver;

 class Boat implements WaterVehicle{
     public String name;
       public int capacity;

     public Boat() {
     }

     public Boat(String name, int capacity) {
         this.name = name;
         this.capacity = capacity;
     }

     @Override
     public String getVehicleName() {
         return name;
     }

     @Override
     public int getVehicleCapacity() {
         return capacity;
     }


     public void setName(String name) {
         this.name = name;
     }



     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }
 }