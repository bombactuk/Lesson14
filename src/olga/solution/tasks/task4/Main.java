package olga.solution.tasks.task4;

public class Main {
    public static void main(String[] args) {

        TrainStation trains = new TrainStation();

        trains.addTrain(1, "Гомель", 10, 0);
        trains.addTrain(10, "Минск", 12, 0);
        trains.addTrain(33, "Минск", 11, 0);
        trains.addTrain(42, "Могилев", 13, 0);
        trains.addTrain(4, "Витебск", 14, 0);
        trains.addTrain(6, "Минск", 7, 0);
        trains.addTrain(7, "Минск", 5, 0);

        trains.sortByTrainNumber();
        trains.sortByDestinationAndTime();

        trains.deletionByTrainNumber(42);

        displayingTrainInformation(1, trains);
        displayingTrainInformation(trains);

    }

    public static void displayingTrainInformation(int number, TrainStation trains) {

        for (Train train : trains.getTrains()) {

            if (train.getNumberTrain() == number) {
                System.out.println("Поезд (Номер поезда:" + train.getNumberTrain() +
                        ", Место назначения: " + train.getDestination() +
                        ", Время отправления: " + train.getDepartureTime().getHour() + " час. " +
                        train.getDepartureTime().getMinute() + " мин. )");
            }

        }

    }

    public static void displayingTrainInformation(TrainStation trains) {

        for (Train train : trains.getTrains()) {

            System.out.println("Поезд (Номер поезда:" + train.getNumberTrain() +
                    ", Место назначения: " + train.getDestination() +
                    ", Время отправления: " + train.getDepartureTime().getHour() + " час. " +
                    train.getDepartureTime().getMinute() + " мин. )");

        }

    }

}
