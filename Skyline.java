import java.util.ArrayList;

public class Skyline {

    ArrayList<Integer> sky;

    public Skyline(ArrayList<Integer> line) {
        sky = line;
    }

    public ArrayList<Integer> mergeSkylines(ArrayList<Integer> sky, ArrayList<Integer> sky2) {
        ArrayList<Integer> result = new ArrayList<>();
        int currHBlue = 0;
        int currHGreen = 0;
        int indexBlue = 0;
        int indexGreen = 0;
        int currHeight = 0;
        while (indexBlue < sky.size() && indexGreen < sky2.size()) {
            if (sky.get(indexBlue) < sky2.get(indexGreen)) {
                currHBlue = (indexBlue < sky.size() - 1) ? sky.get(indexBlue + 1) : 0;
                if (Math.max(currHBlue,currHGreen) != currHeight) {
                    result.add(sky.get(indexBlue));
                    result.add(Math.max(currHBlue,currHGreen));
                    currHeight = Math.max(currHBlue,currHGreen);
                }
                indexBlue += 2;
            } else if (sky2.get(indexGreen) < sky.get(indexBlue)) {
                currHGreen = (indexGreen < sky2.size() - 1) ? sky2.get(indexGreen + 1) : 0;
                if (Math.max(currHBlue,currHGreen) != currHeight) {
                    result.add(sky2.get(indexGreen));
                    result.add(Math.max(currHBlue,currHGreen));
                    currHeight = Math.max(currHBlue,currHGreen);
                }
                indexGreen += 2;
            } else {
                currHBlue = (indexBlue < sky.size() - 1) ? sky.get(indexBlue + 1) : 0;
                currHGreen = (indexGreen < sky2.size() - 1) ? sky2.get(indexGreen + 1) : 0;
                if (Math.max(currHBlue,currHGreen) != currHeight) {
                    result.add(sky.get(indexBlue));
                    result.add(Math.max(currHBlue,currHGreen));
                    currHeight = Math.max(currHBlue,currHGreen);
                }
                indexBlue += 2;
                indexGreen += 2;
            }
        }
        if (indexBlue < sky.size()) {
            for (int i = indexBlue; i < sky.size(); i++) {
                result.add(sky.get(i));
            }
        } else if (indexGreen < sky2.size()) {
            for (int i = indexGreen; i < sky2.size(); i++) {
                result.add(sky2.get(i));
            }
        }
        return result;
    }

    


    public String toString() {
        return sky.toString();
    }

    public ArrayList<Integer> getSky() {
        return sky;
    }

    public void mergeSkyThis(ArrayList<Integer> sky2) {
        ArrayList<Integer> result = mergeSkylines(sky,sky2);
        this.sky = result;
    }
}
