package linkedlist;

class BusStop {
    String stopName;
    BusStop next;

    BusStop(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }
}

public class BusRoute {
    BusStop stop; // Head of the linked list

    public void addStop(String stopName) {
        BusStop newStop = new BusStop(stopName);

        if (stop == null) {
            stop = newStop;
            return;
        }

        BusStop temp = stop;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStop;
    }

    public void displayRoute() {
        BusStop temp = stop;

        System.out.println("Bus Route:");

        while (temp != null) {
            System.out.print(temp.stopName);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        BusRoute route = new BusRoute();

        route.addStop("Railway Station");
        route.addStop("V College");
        route.addStop("Bus Stand");
        route.addStop("Market");

        route.displayRoute();
    }
}