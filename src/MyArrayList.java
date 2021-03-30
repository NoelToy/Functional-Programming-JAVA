import java.util.ArrayList;

public class MyArrayList {

    private ArrayList<String> stringArrayList;

    public MyArrayList(){
        stringArrayList = new ArrayList<>();
    }

    public ArrayList<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public void add(String element){
        stringArrayList.add(element);
    }

    public Boolean removeBool(Integer i){
        return stringArrayList.remove(i);
    }
    public String set(Integer i,String ele){
        return stringArrayList.set(i,ele);
    }
}
