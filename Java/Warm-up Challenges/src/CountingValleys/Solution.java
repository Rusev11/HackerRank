package CountingValleys;

import java.io.*;

class Result {

//    8
//    UDDDUDUU

    public static int countingValleys(int steps, String path) {
        int valleyNumber = 0;
        int seaLevel = 0;
        for (int i = 0; i < path.length(); i++) {
            if (seaLevel == 0 && path.charAt(i) == 'D') {
                valleyNumber++;
            }
            if (path.charAt(i) == 'D') {
                seaLevel--;
            } else {
                seaLevel++;
            }
        }
        return valleyNumber;
    }

}

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
