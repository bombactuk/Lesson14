package olga.solution.tasks.task4;

import java.util.Objects;

public class DepartureTimes {

    private int hour;
    private int minute;

    public DepartureTimes() {
    }

    public DepartureTimes(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "DepartureTimes{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartureTimes that = (DepartureTimes) o;
        return hour == that.hour && minute == that.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

}

