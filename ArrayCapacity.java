public class MyClass {
    public static void main(String args[]) {
        int[] array = new int[6];

// Current length is 0, because it has 0 elements.
        int length = 0;

// Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
        
// print the elements of the array
         for (int i = 0; i < 3; i++) {
            System.out.println("The "+i+"th element of array is " + array[i]);    
        }
        
    }
}
