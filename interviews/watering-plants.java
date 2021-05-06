
public class WateringPlantsSession {

  // myCapInML && friendCapInML >= max(waterNeededPerPlantInML) 
  private int myCapInML; 
  private int friendCapInML;

  public WaterPlantsSession(int myCapInML, int friendCapInML, int[] waterNeededPerPlantInML) {
      // init
  }

  // [5, 7, 8, 2, 5]
  // myCapInML && friendCapInML >= max(waterNeededPerPlantInML) 
  // MyCap: 9
  // FriendsCap: 10 
  // first iteration 
  // i = 0, j = 3 
  // myCap = 9 - 5 = 4
  // friendsCurrentCap = 10 - 2 = 8
  // i = 1, j = 2
  // myCap = 4 - 7
  // myCap 9 - 7 = 2
  // friendsCap 10 - 8 = 2
  public int waterPlants() {
    int numberOfRefills = 0;
    int currentMyCapInML = myCapInML; 
    int currentFriendCapInML = friendCapInML; 

    for (int i = 0, j = waterNeededPerPlantInML.length - 1; i != j - 1 || i != j; i++, j--) {
      if (currentMyCapInML < waterNeededPerPlantInML[i] || currentFriendCapInML < waterNeededPerPlantInML[j]) {
        numberOfRefills++; 
        currentMyCapInML = myCapInML;
        currentFriendCapInML = friendCapInML; 
      }   

      if (currentMyCapInML >= waterNeededPerPlantInML[i]) {
        currentMyCapInML -= waterNeededPerPlantInML[i]; 
      }

      if (currentFriendCapInML >= waterNeededPerPlantInML[j]) {
         currentFriendCapInML -= waterNeededPerPlantInML[j]; 
      }
    } 

    if (i == j) {
      // refill 
      // 
    }

    return numberOfRefills; 
  }
}