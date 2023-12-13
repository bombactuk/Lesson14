package olga.solution.tasks.task4;

import java.util.Objects;

public class Train {

    private int numberTrain;
    private String destination;
    private DepartureTimes departureTime;

    public Train() {
    }

    public Train(int numberTrain, String destination, int hour, int minute) {
        this.numberTrain = numberTrain;
        this.destination = destination;
        this.departureTime = new DepartureTimes(hour, minute);
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DepartureTimes getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(DepartureTimes departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberTrain=" + numberTrain +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numberTrain == train.numberTrain &&
                Objects.equals(destination, train.destination) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberTrain, destination, departureTime);
    }

}
