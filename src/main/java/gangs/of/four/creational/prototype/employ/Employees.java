package gangs.of.four.creational.prototype.employ;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(List<String> temp){
        empList = temp;
    }

    public Employees() {
        empList = new ArrayList<>();
    }

    public void loadData(){
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone(){
        List<String> temp = new ArrayList<>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
