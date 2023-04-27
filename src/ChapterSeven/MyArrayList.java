package ChapterSeven;

public class MyArrayList extends List {
private int[] numbers;
private int indexCounter = 0;

    public MyArrayList(int length){
        numbers =new int[length];
    }
@Override
    public boolean isEmpty(){
 return indexCounter ==0;
}
@Override
 public void add(int element){
     numbers[indexCounter++] = element;
}
@Override
    public void remove(int index) {
        for (int j = 0; j <numbers.length ; j++) {
        if (index == numbers[j]) {
            --j;
        }
        }
        if (indexCounter == -0)
            throw new IllegalArgumentException("can not remove element");
        --indexCounter;
    }

    public int size() {
        return indexCounter;
    }

    public int get(int index) {
        return numbers[index];

    }

    public int getIndexOf(int element) {
        for (int j = 0; j < numbers.length ; j++) {
        if (element == numbers[j])
        return j;}
     return 0;
    }

    public int getCapacity() {

        return numbers.length;
    }
}
