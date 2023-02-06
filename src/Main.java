public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("Hello");
        myArrayList.add("World");

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }
}