import java.util.Arrays;
class Quick_Sort {
  static int partition(int array[], int low, int high) {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }
    
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  static void quick_Sort(int array[], int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);
      quick_Sort(array, low, pi - 1);
      quick_Sort(array, pi + 1, high);
    }
  }
}

class Main {
  public static void main(String args[]) {

    int[] data = { 10, 15, 2, 55, 3, 9, 23, 87, 34 };
    System.out.printf("Input Array : " + Arrays.toString(data) + "\n\n");

    int size = data.length;
    Quick_Sort.quick_Sort(data, 0, size - 1);

    System.out.println("Quick Sorted Array : " + Arrays.toString(data) + "\n");
  }
}
