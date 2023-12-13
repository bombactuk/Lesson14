package olga.solution.tasks.task8;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.add(10, "Петров", "Ваня", "Васильевич", 120, 12);
        bank.add(11, "Алексеенко", "Владислав", "Владимерович", 250, 25);
        bank.add(15, "Сидоров", "Генадий", "Алексеевич", 60, 15);
        bank.add(17, "Борсукова", "Екатерина", "Андреевна", 239, 26);

        bank.sortCustomersByName();

        withdrawalCustomers(bank);
        withdrawalClientsWithinTheCardNumberRange(bank, 15, 25);

    }

    public static void withdrawalCustomers(Bank bank) {

        for (Customer customer : bank.getCustomers()) {

            System.out.println("Клиент(Фамилия: " + customer.getSurname() +
                    ", Имя: " + customer.getName() +
                    ", Отчество: " + customer.getPatronymic() +
                    ", Номер кридитчной карточки: " + customer.getNumOfCreditCard() +
                    ", Номер банковского счета: " + customer.getNumOfBankAccount());

        }

    }

    public static void withdrawalClientsWithinTheCardNumberRange(Bank bank, int min, int max) {

        for (Customer customer : bank.getCustomers()) {

            if (customer.getNumOfCreditCard() > min && customer.getNumOfBankAccount() < max) {

                System.out.println("Клиент(Фамилия: " + customer.getSurname() +
                        ", Имя: " + customer.getName() +
                        ", Отчество: " + customer.getPatronymic() +
                        ", Номер кридитчной карточки: " + customer.getNumOfCreditCard() +
                        ", Номер банковского счета: " + customer.getNumOfBankAccount());

            }

        }

    }

}
