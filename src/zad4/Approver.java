package zad4;

public interface Approver {
    void setNext(Approver next);
    void approveExpense(ExpenseRequest request);
}

class Manager implements Approver{
    private Approver next;

    @Override
    public void setNext(Approver next) {
        this.next = next;
    }

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.amount() <= 1000) {
            System.out.println("Manager approved the expense of " + request.amount() + " PLN");
        } else if (next != null) {
            next.approveExpense(request);
        }
    }
}

class Director implements Approver {
    private Approver next;

    @Override
    public void setNext(Approver next) {
        this.next = next;
    }

    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.amount() <= 10000) {
            System.out.println("Director approved the expense of " + request.amount() + " PLN");
        } else if (next != null) {
            next.approveExpense(request);
        }
    }
}

class CEO implements Approver {
    @Override
    public void setNext(Approver next) {
        // CEO nie ma następcy, ponieważ może zatwierdzić dowolną kwotę
    }

    @Override
    public void approveExpense(ExpenseRequest request) {
        System.out.println("CEO approved the expense of " + request.amount() + " PLN");
    }
}
