package zad4;

public record ExpenseRequest(double amount) {
}

class Main{
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        ExpenseRequest request1 = new ExpenseRequest(500);
        ExpenseRequest request2 = new ExpenseRequest(5000);
        ExpenseRequest request3 = new ExpenseRequest(15000);

        System.out.println("Processing expense requests:");
        manager.approveExpense(request1);
        manager.approveExpense(request2);
        manager.approveExpense(request3);
    }
}
