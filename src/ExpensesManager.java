import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Double> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(expense);
        System.out.println("�������� ���������! ��� ������� ������ � ������: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("�� ����� ����� �������� ������ �������. ����� ������ ���������!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("����� � " + (i + 1) + ". ��������� " + expenses.get(i) + " ������");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double exp : expenses) {
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("������ ���� ����.");
    }

    double removeExpense(double expense) {
        int index = 0;
        if (expenses.isEmpty())
            System.out.println("������ ���� ����.");
        else if (expenses.contains(expense)) {
            for (int i = 0; i < expenses.size(); i++) {
                if (expenses.get(i) == expense) {
                    index = i;
                    expenses.remove(index);
                    break;
                }
            }
            System.out.println("����� �������!");
        } else
            System.out.println("����� ����� ���.");
        return expense;
    }
}
