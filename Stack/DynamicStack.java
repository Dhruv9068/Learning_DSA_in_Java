package first_ideaprogram.src.Stack;

public class DynamicStack extends CustomStack {

    // WHY DYNAMIC ARRAY Because what if Array gets full Problem ! to solve this we only need to modeify the push function here

    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    public boolean push(int item) {
        // Check if the array is full
        if (this.isFull()) {
            // If it is, double the size of the array
            int[] temp = new int[data.length * 2];

            // Copy elements from the original array to the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // Update the reference to the new array
            data = temp;
        }


        return super.push(item);
    }


}
