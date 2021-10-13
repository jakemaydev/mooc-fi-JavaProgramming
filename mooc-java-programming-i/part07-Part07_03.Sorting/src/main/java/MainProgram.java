
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 2};

        

        System.out.println("Smallest: " + indexOfSmallestFrom(array, 2));
    }

    public static int smallest(int[] array){
        int smallest = array[0];

        for(int i : array){
            if(i < smallest){
                smallest = i;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallest = array[startIndex];
        int index = startIndex;

        for(int i = startIndex; i <= array.length-1; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array){
        int startIndex = 0;
        while(startIndex < array.length -1){
            int smallestIndex = indexOfSmallestFrom(array, startIndex);

            swap(array, startIndex, smallestIndex);

            startIndex++;
        }
    }
}
