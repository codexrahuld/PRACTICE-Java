public class Q3 {

    public static void main(String[] args) {
        get(1);
        even(10);
    }
    public static void get(int nos) {
        int day=nos;

        switch(day) {
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("Tuesday");
                break;

            case 3: System.out.println("Wednesday");
                break;

            case 4: System.out.println("Thursday");
                break;

            case 5: System.out.println("Friday");
                break;

            case 6: System.out.println("Saturday");
                break;

            case 7: System.out.println("Sunday");
                break;
        }
    }
    public static void even(int n) {
        int i = 1;

        do {
            System.out.println(2 * i);
        }
        while (++i <= n);
    }
}
