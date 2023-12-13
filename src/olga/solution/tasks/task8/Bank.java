package olga.solution.tasks.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private final List<Customer> customers = new ArrayList<>();

    public Bank() {
    }

    public void add(int id, String surname, String name, String patronymic, int numOfCreditCard,
                    int numOfBankAccount) {
        customers.add(new Customer(id, surname, name, patronymic, numOfCreditCard, numOfBankAccount));
    }

    public void sortCustomersByName() {

        for (int i = 0; i < customers.size() - 1; i++) {
            for (int j = 0; j < customers.size() - i - 1; j++) {

                if (customers.get(j + 1).getSurname().compareTo(customers.get(j).getSurname()) < 0) {
                    Customer swap = customers.get(j);
                    customers.set(j, customers.get(j + 1));
                    customers.set(j + 1, swap);
                }

            }
        }

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(customers, bank.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                '}';
    }

}
