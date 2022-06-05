public class ArrayTest {
    int count = 0;
    int sizeOfArray = 3;
    int[] phoneNumbers = new int[sizeOfArray];

    void addPhone(int phone) {
       if(count == sizeOfArray) {
           System.out.println("the array is full");
       } else {
           phoneNumbers[count] = phone;
           count++;
       }
    }
    public static void main(String[] args) {
       ArrayTest arr = new ArrayTest();
       arr.addPhone(888888888);
        arr.addPhone(999999);
        arr.addPhone(86565);
        arr.addPhone(1265);

        for(int i=0; i< arr.phoneNumbers.length; i++) {
            System.out.println("phones numbers: "+ arr.phoneNumbers[i]);
        }


    }
}
