package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //int declaration
        int first = 1, second = 10, third = 100;
        //int output
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //var declaration
        var linkToFirst = first;
        var linkToSecond = second;
        var linkToThird = third;
        //int re-assignment
        first = 15;
        second = 6;
        third = 4;
        //all variables output
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
