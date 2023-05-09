public class Generic_class {
    public static <T> void printArray(T[] elements){
        for (T element : elements){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6,7 };
        String[] stringArray = {"hello", "hi", "ha", };

        System.out.print("In mang so nguyen: ");
        printArray(intArray);

        System.out.print("In mang String: ");
        printArray(stringArray);
    }
}
