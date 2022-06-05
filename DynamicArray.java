public class DynamicArray {
    private int[] phoneNumbers;
    private int count;
    private int sizeofarray;

    public DynamicArray() {
        sizeofarray = 1;
        phoneNumbers = new int[sizeofarray];
        count = 0;
    }

    public void addElement(int a) {
        if (count == sizeofarray) {
            extendSize();
        }
        phoneNumbers[count] = a;
        count++;
    }

    public void extendSize() {
        int[] temp;

            temp = new int[sizeofarray * 2];

            for (int i = 0; i < sizeofarray; i++) {
                temp[i] = phoneNumbers[i];
            }

        phoneNumbers = temp;
        sizeofarray = sizeofarray * 2;
    }


    public static void main(String[] args) {
        DynamicArray data = new DynamicArray();


        data.addElement(12);
        data.addElement(88);
        data.addElement(6);
        data.addElement(67);
        data.addElement(67);


        System.out.println("Elements of the array:");
        for (int i = 0; i < data.sizeofarray; i++) {
            System.out.print(data.phoneNumbers[i] + " ");
        }

    }
}