import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group A= new Group("Toán", "Lý", "Hóa");
        Group B = new Group("Toán", "Hóa", "Sinh");
        Group C = new Group("Văn", "Sử", "Địa");

        Examinee examinee1= new Examinee("001", "Nguyễn Văn A", "Hà Nội",0, A );
        Examinee examinee2= new Examinee("002", "Nguyễn Văn B", "Hải Phòng",1, A );
        Examinee examinee3= new Examinee("003", "Nguyễn Văn C", "Hà Nam",2, A );

        ManagerExaminee manager1 = new ManagerExaminee();
        manager1.add(examinee1);
        manager1.add(examinee2);
        manager1.add(examinee3);
        System.out.println(manager1.listExaminee.get(0));

        int value;
        do{
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("1: Thêm sinh viên");
            System.out.println("2: Xem danh sách các thí sinh");
            System.out.println("3: Tìm kiếm thí sinh theo SDB");
            System.out.println("4 Exit khỏi chương trình");

            Scanner input = new Scanner(System.in);
            value = input.nextInt();

            switch (value) {
                case 1:
                    Examinee newExaminee = inputInfomation();
                    manager1.add(newExaminee);
                    break;
                case 2:
                    for (Examinee e : manager1.listExaminee) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id của thí sinh");
                    String id = new Scanner(System.in).nextLine();
                    int index = manager1.search(id);
                    if(index>=0){
                        System.out.println(manager1.listExaminee.get(index));
                    }else System.out.println("Không tìm thấy thí sinh");
                    break;

                default:
                    break;


            }
        }while(0<=value && value<4);
    }

    public static Examinee inputInfomation(){
        Examinee newExaminee =new Examinee();

        Scanner inputExaminee = new Scanner(System.in);
        System.out.println("Nhập số báo danh của thí sinh");
        newExaminee.setId(inputExaminee.nextLine());
        System.out.println("Nhập họ và tên của thí sinh");
        newExaminee.setFullName(inputExaminee.nextLine());
        System.out.println("Nhập địa chỉ của thí sinh");
        newExaminee.setAddress(inputExaminee.nextLine());
        System.out.println("Nhập mức độ ưu tiên của thí sinh");
        newExaminee.setPrivacyl(inputExaminee.nextInt());
        //Nhập trường dữ liệu của group;
        System.out.println("Nhập môn dự thi số 1 của thí sinh");
        String a = inputExaminee.nextLine();
        String  keyOfSubject1= inputExaminee.nextLine();
        System.out.println("Nhập môn dự thi số 2 của thí sinh");
        String keyOfSubject2 = inputExaminee.nextLine();
        System.out.println("Nhập môn dự thi số 3 của thí sinh");
        String keyOfSubject3 = inputExaminee.nextLine();
        newExaminee.setGroup(new Group(keyOfSubject1,keyOfSubject2,keyOfSubject3));

        return newExaminee;
    }

}
