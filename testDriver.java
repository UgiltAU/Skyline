import java.util.ArrayList;
import java.util.Arrays;

public class testDriver {

    public static void main(String[] args) {
        skyTest2();
    }

    public static void skyTest1() {
        Integer[] skyTest = {1 , 11 , 3, 13, 9, 0, 12, 7, 16};
        ArrayList<Integer> skyTestArr = new ArrayList<>(Arrays.asList(skyTest));
        Skyline test = new Skyline(skyTestArr);
        System.out.println(test);
        Integer[] box = {8,10,10,5,15,23,20};
        ArrayList<Integer> boxList = new ArrayList<>(Arrays.asList(box));
        test.mergeSkyThis(boxList);
        System.out.println(test);
    }

    public static void skyTest2() {
        Integer[][] boxes = {{1,11,5},{2,6,7},{3,13,9},{12,7,16},{14,3,25},{19,18,22},{23,13,29},{24,4,28}};
        ArrayList<ArrayList<Integer>> boxArray = new ArrayList<>();
        for (int i = 0; i < boxes.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(boxes[i]));
            boxArray.add(temp);
        }
        System.out.println(boxArray);
        Skyline test = new Skyline(Skyline.skylineFromBoxes(boxArray));
        System.out.println(test);
    }
}
