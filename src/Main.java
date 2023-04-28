import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<Student> listPass = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n>= 1 && n <=1000){
            for(int i = 1; i<=n; i++){
                Student s = new Student();
                s.inputData();
                s.calTotal();
                s.calToTalScience();
                s.calTotalHumanities();
                list.add(s);
            }

        }else{
            System.out.println("nhập lại số sinh viên trong khoảng từ 1 - 1000");
        }
        for (Student s : list){
            if(s.getTotal() >= 350){
                if(s.getDivison().equals("s")) {
                    if(s.getTotalScience() >= 160) {
                       listPass.add(s);
                    }
                }else if(s.getDivison().equals("l")){
                    if(s.getTotalHumanities() >= 160){
                        listPass.add(s);
                    }
                }
            }
        }
        System.out.println(listPass.size());

    }
}