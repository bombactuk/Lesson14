package olga.solution.tasks.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainStation {

    private final List<Train> trains = new ArrayList<>();

    public void addTrain(int numberTrain, String destination, int hour, int minute) {
        trains.add(new Train(numberTrain, destination, hour, minute));
    }

    public void deletionByTrainNumber(int number) {

        for (int i = 0; i < trains.size(); i++) {

            if (trains.get(i).getNumberTrain() == number) {
                trains.remove(i);
            }

        }

    }

    public void sortByTrainNumber() {

        for (int i = 0; i < trains.size() - 1; i++) {
            for (int j = 0; j < trains.size() - i - 1; j++) {

                if (trains.get(j + 1).getNumberTrain() < trains.get(j).getNumberTrain()) {
                    Train swap = trains.get(j);
                    trains.set(j, trains.get(j + 1));
                    trains.set(j + 1, swap);
                }

            }
        }

    }

    public void sortByDestinationAndTime() {

        for (int i = 0; i < trains.size() - 1; i++) {
            for (int j = 0; j < trains.size() - i - 1; j++) {

                if (trains.get(j + 1).getDestination().compareTo(trains.get(j).getDestination()) < 0) {
                    Train swap = trains.get(j);
                    trains.set(j, trains.get(j + 1));
                    trains.set(j + 1, swap);
                }

                if (trains.get(j + 1).getDestination().equals(trains.get(j).getDestination())) {
                    if (trains.get(j + 1).getDepartureTime().getHour() < trains.get(j).getDepartureTime().getHour()) {
                        Train swap = trains.get(j);
                        trains.set(j, trains.get(j + 1));
                        trains.set(j + 1, swap);
                    }
                }

            }
        }

    }

    public List<Train> getTrains() {
        return trains;
    }

    @Override
    public String toString() {
        return "TrainStation{" +
                "trains=" + trains +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainStation that = (TrainStation) o;
        return Objects.equals(trains, that.trains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trains);
    }

}