package bullscows;

public class Number {
    String number;

    public Number(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void printNumber (){
        System.out.print(this.number);
    }

//    public int convertToInt () {
//        return Integer.parseInt(this.number);
//    }
}
