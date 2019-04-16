package homework6;

import java.util.stream.IntStream;

public class SecondTask {

    public int[] array(int... arr) throws RuntimeException{
        if(IntStream.of(arr).noneMatch(x -> x == 4)){
            throw new RuntimeException();
        }
        
        int[] result = null;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 4) {
                result = new int[arr.length - (i+1)];
                System.arraycopy(arr,i+1, result, 0, result.length);
                break;
            }
        }
        return result;
    }

    // Сначала написал такое решение, но но показалось слишком длинным. Оставил в качестве примера.
//    public int[] array1(int... arr) throws RuntimeException{
//        System.out.println(Arrays.toString(arr));
//        if(IntStream.of(arr).noneMatch(x -> x == 4)){
//            throw new RuntimeException();
//        }
//        int[] temporary = new int[arr.length];
//        int counter = 0;
//        for (int i = arr.length-1; i >= 0; i--) {
//            if(arr[i] != 4){
//                temporary[i] = arr[i];
//                counter++;
//            }else {
//                break;
//            }
//        }
//        int[] result = new int[counter];
//        for (int i = 0; i < temporary.length; i++) {
//            if(temporary[i] != 0){
//                System.arraycopy(temporary,i, result, 0, result.length);
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(temporary));
//        System.out.println(Arrays.toString(result));
//        return result;
//    }
}
