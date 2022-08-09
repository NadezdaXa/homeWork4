public class Main {
    public static void main(String[] args) {
        System.out.println("задание 4");
        // задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.print("\n");
        int i = 10;
        while (i > 0) {
            System.out.print(i);
           i--;
        }



        // задание 2
        System.out.print("\n");
        int friday = 5;
        for (friday = 5; friday<31;friday = friday + 7){
            System.out.println("сегодня пятница " + friday + " число " + " необходимо подготовить отчет");
        }

        //задание 3
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear +100;
        for (int year = start;year <=end;year ++){
            if (year % 79 ==0){
                System.out.println(year);
            }
        }


        }

            }








