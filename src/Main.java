public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Noel");
        myArrayList.add("Beena");
        myArrayList.add("Toy");
        myArrayList.add("Laina");
        System.out.println("The array list is: "+myArrayList.getStringArrayList());
        myArrayList.set(0,"Harry");
        System.out.println(myArrayList.getStringArrayList());
        for(String s:myArrayList.getStringArrayList()){
            System.out.println(s);
        }
    }
}
