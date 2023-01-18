package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class RepairStation {
    public final Queue<Transport> queue = new LinkedList<>();

    public void addTransport(Transport transport) {
        if ((transport instanceof Bus)) {
            System.out.println("Диагностика не проводится");
        } else {
            queue.add(transport);
        }
    }

    public void doMaintenance() {
        while (queue.peek() != null) {
            Transport nextTransport = queue.poll();
            if (nextTransport != null) {
                System.out.println("Сделали диагностику " + nextTransport.getBrand() + " " + nextTransport.getModel());
            }
        }
    }

//    public void addTransport(List<Transport> transports) {
//        for (Transport transport : transports) {
//            this.addTransport(transport);
//        }
//    }
}