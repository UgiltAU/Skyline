import java.util.ArrayList;
import java.util.Arrays;

public class testDriver {

    public static void main(String[] args) {
        Integer[] skyTest = {1 , 11 , 3, 13, 9, 0, 12, 7, 16};
        ArrayList<Integer> skyTestArr = new ArrayList<>(Arrays.asList(skyTest));
        Skyline test = new Skyline(skyTestArr);
        System.out.println(test);
        Integer[] box = {8,10,10,5,15,23,20};
        ArrayList<Integer> boxList = new ArrayList<>(Arrays.asList(box));
        test.mergeSkyThis(boxList);
        System.out.println(test);
    }
}
