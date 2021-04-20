import java.util.ArrayList;
import java.util.List;

public class ManagerExaminee {
    List<Examinee> listExaminee =new ArrayList<>();


    public ManagerExaminee() {

    }
    public ManagerExaminee(List<Examinee> listExaminee) {
        this.listExaminee = listExaminee;
    }
    public void show(){

    }
    public void add(Examinee ts1){
        listExaminee.add(ts1);
    }

    public int search(String id){

        for (int i = 0; i <listExaminee.size() ; i++) {
            if(listExaminee.get(i).getId().compareToIgnoreCase(id)==0) {
                return i;
            }
//            if(listExaminee.get(i).getId().equals(id)) {
//                return i;
//            }
        }
        return -1;
    }

}
