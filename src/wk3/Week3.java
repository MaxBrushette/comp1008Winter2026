package wk3;

public class Week3 {

    public static void main(String[] args) {
//        EventTicketingSystem ts = new EventTicketingSystem("Lemonade Stand", 5, 200);
//        ts.buyTickets(5);
//        ts.refundTickets(2);
//        ts.buyTickets(20);
//        System.out.println(ts.getRevenueGenerated());

        Course comp1008 = new Course("Intro to OOP", "comp1008", 6);
        comp1008.addEvaluation("Assignment 1", 90);
        comp1008.addEvaluation("Assignment 2", 80);
        Object[] values = comp1008.getEvaluation(0);

        for(Object o : values) {
            System.out.println(o);
        }
    }
}
