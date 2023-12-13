package olga.solution.tasks.task8;

import java.util.Objects;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int numOfCreditCard;
    private int numOfBankAccount;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic, int numOfCreditCard,
                    int numOfBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.numOfCreditCard = numOfCreditCard;
        this.numOfBankAccount = numOfBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumOfCreditCard() {
        return numOfCreditCard;
    }

    public void setNumOfCreditCard(int numOfCreditCard) {
        this.numOfCreditCard = numOfCreditCard;
    }

    public int getNumOfBankAccount() {
        return numOfBankAccount;
    }

    public void setNumOfBankAccount(int numOfBankAccount) {
        this.numOfBankAccount = numOfBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(surname, customer.surname) && Objects.equals(name, customer.name) && Objects.equals(patronymic, customer.patronymic) && Objects.equals(numOfCreditCard, customer.numOfCreditCard) && Objects.equals(numOfBankAccount, customer.numOfBankAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, numOfCreditCard, numOfBankAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", numOfCreditCard='" + numOfCreditCard + '\'' +
                ", numOfBankAccount='" + numOfBankAccount + '\'' +
                '}';
    }

}
