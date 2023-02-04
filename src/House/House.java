package House;


import House.rooms.*;


public class House {
 public static final int MAX_BED_ROOMS=10;
 public static final int MAX_REST_ROOMS=10;

   static int  IndexBedRoom=0;
   static int IndexRestRoom=0;
   private Kitchen kitchen;
   private DiningRoom diningRoom;
   private LivingRoom livingRoom;
   private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
   private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
   private Yard yard;

   public void addRooms(BedRoom bedRoom){
      int length = bedRooms.length;
      if(IndexBedRoom<length){
         bedRooms[IndexBedRoom]=bedRoom;
         IndexBedRoom++;
      }else{
         System.out.println("Se alcanzo el tope.");
      }

   }

   public void addRooms(RestRoom restRoom){
      int length = restRooms.length;
      if(IndexRestRoom<length){
         restRooms[IndexRestRoom]=restRoom;
         IndexRestRoom++;
      }else{
         System.out.println("Se alcanzo el tope.");
      }
   }


   public Kitchen getKitchen() {
      return kitchen;
   }
   public void setKitchen(Kitchen kitchen) {
      this.kitchen = kitchen;
   }

   public DiningRoom getDiningRoom() {
      return diningRoom;
   }

   public void setDiningRoom(DiningRoom diningRoom) {
      this.diningRoom = diningRoom;
   }

   public LivingRoom getLivingRoom() {
      return livingRoom;
   }

   public void setLivingRoom(LivingRoom livingRoom) {
      this.livingRoom = livingRoom;
   }

   public void setYard(Yard yard) {
      this.yard = yard;
   }
   public Yard getYard() {
      return yard;
   }

   public BedRoom[] getBedRooms() {
      return bedRooms;
   }
   public void setBedRooms(BedRoom[] bedRooms) {
      this.bedRooms = bedRooms;
   }

   public RestRoom[] getRestRooms() {
      return restRooms;
   }
   public void setRestRooms(RestRoom[] restRooms) {
      this.restRooms = restRooms;
   }
}
