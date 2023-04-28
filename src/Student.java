import java.security.spec.ECField;
import java.util.Scanner;

public class Student {
    private String divison;
    private int english, math, science, japanese, history, total, totalScience, totalHumanities;


    public Student() {
    }

    public Student(String divison, int english, int math, int science, int japanese, int history) {
        this.divison = divison;
        this.english = english;
        this.math = math;
        this.science = science;
        this.japanese = japanese;
        this.history = history;
    }



    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getJapanese() {
        return japanese;
    }

    public void setJapanese(int japanese) {
        this.japanese = japanese;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalScience() {
        return totalScience;
    }

    public void setTotalScience(int totalScience) {
        this.totalScience = totalScience;
    }

    public int getTotalHumanities() {
        return totalHumanities;
    }

    public void setTotalHumanities(int totalHumanities) {
        this.totalHumanities = totalHumanities;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        this.divison = sc.next().toLowerCase();
//        do {
//                this.divison = sc.next();
//                if(this.divison == "l" || this.divison == "s"){
//                    break;
//                }else{
//                    System.out.println("l và s phải viết thường");
//                }
//        }while (true);
        do {
            try {
                this.english = Integer.parseInt(sc.next());
                if (this.english >= 0 && this.english <= 100) {
                    break;
                } else {
                    System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                }
            }catch (Exception e){
                System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
            }
        }while (true);
        do {
            try {
                this.math = Integer.parseInt(sc.next());
                if (this.math >= 0 && this.math <= 100) {
                    break;
                } else {
                    System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                }
            }catch (Exception e){
                System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
            }
        }while (true);
        do {
            try {
                this.science = Integer.parseInt(sc.next());
                if (this.science >= 0 && this.science <= 100) {
                    break;
                } else {
                    System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                }
            }catch (Exception e){
                System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
            }
        }while (true);
        do {
            try {
                this.japanese = Integer.parseInt(sc.next());
                if (this.japanese >= 0 && this.japanese <= 100) {
                    break;
                } else {
                    System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                }
            }catch (Exception e){
                System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
            }
        }while (true);
        do {
            try {
                this.history = Integer.parseInt(sc.next());
                if (this.history >= 0 && this.history <= 100) {
                    break;
                } else {
                    System.out.println("điểm phải nằm trong khoảng 0 - 100 ");
                }
            }catch (Exception e){
                System.out.println("điểm phải là số nguyên, vui lòng nhập lại");
            }
        }while (true);

    }
public void calTotal(){
        this.total = this.english + this.math+ this.science+this.japanese+this.history;
}
public void calToTalScience(){
        this.totalScience = this.math + this.science;
}
public void calTotalHumanities(){
        this.totalHumanities = this.japanese +  this.history;
}
    @Override
    public String toString() {
        return this.divison +" "+ this.english +" "+ this.math +" "+ this.science + " " + this.japanese +" "+ this.history+ " "+this.total+" " +this.totalHumanities+" "+this.totalScience;
    }

}
