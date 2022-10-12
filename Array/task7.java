package Array;

public class task7 {
    public static void main(String[] args) {
        int[] FirstArray = new int[900];
        for (int firstLoop = 0; firstLoop < FirstArray.length; firstLoop++) {
            FirstArray[firstLoop] = firstLoop + 100;
        }
        int[] secondArray = new int[FirstArray.length];
        for (int secondLoopStart = 0, secondLoopEnd = FirstArray.length - 1; secondLoopStart < FirstArray.length; secondLoopStart++, secondLoopEnd--) {
            secondArray[secondLoopEnd] = FirstArray[secondLoopStart];
        }
        for (int firstLoop:secondArray) {
            System.out.println(firstLoop);
        }
    }
}
