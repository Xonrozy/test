public class Aplication {
    //Начало выполнения 2 задания
    byte bt=127;
    short st=31000;
    int it=21000000;
    long lg=999999999;
    float ft=55.5f;
    double db=45.45;
    boolean bl=false;
    char cr='B';
    //Конец выполнения 2 задания
    //Начало выполнения 3 задания
    public static float otvet(float a, float b, float c, float d){
        if (d==0) System.out.println("Делить на ноль нельзя");
        return a*(b+(c/d));
    }
    //Конец выполнения 3 задания
    //Начало выполнения 4 задания
    public static boolean ten(int a,int b){
        if((a+b)>=10 & (a+b)<=20) return true; else return false;
    }
    //Конец выполнения 4 задания

    //Начало выполнения 5 задания
    public static String minus(int a){
        if(a>0 || a==0) return "Введенное число положительное"; else return "Введенное число отрицательное";
    }
    //Конец выполнения 5 задания

    //Начало выполнения 6 задания
    public static boolean neg(int a){
        if(a<0)return true;else return false;
    }
    //Конец выполнения 6 задания
    //Начало выполнения 7 задания
    public static String welcome(String a){
        return "Привет, "+a;
    }
    //Конец выполнения 7 задания
    //Начало выполнения 8 задания
    public static String year(int a){
        if(a%4==0 && a%100 !=0 || a%400==0)return a + " год високосный";else return a + " год невисокосный";
    }
    //Конец выполнения 8 задания
    public static void main(String[] args) {
        System.out.println(otvet(1,3,4,1));//Проверка 3 задания
        System.out.println(ten(5,10));//Проверка 4 задания
        System.out.println(minus(-14));//Проверка задания 5
        System.out.println(neg(-70));//Проверка задания 6
        System.out.println(welcome("Тимофей")); //Проверка задания 7
        System.out.println(year(100));//Проверка задания 8
    }
}
