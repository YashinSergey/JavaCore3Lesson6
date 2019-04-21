package homework6;

public class ThirdTask {

    public boolean lookingForNumbers(int... arr){
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 || arr[i] == 4){
                return true;
            }
        }
        return bool;
    }
}
