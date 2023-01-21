package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class RepairStation {
    private final Queue<Transport> queue = new LinkedList<>();

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
                System.out.println(nextTransport.getMechanics() + " " + Competing.MAKE_DIAGNOSTICS + " " + nextTransport.getBrand() + " " + nextTransport.getModel());
            }
        }
    }

    public void printMaintenance(RepairStation... repairStations) {
        for (RepairStation repairStation : repairStations) {
            System.out.println();
        }
    }
//    public void addTransport(List<Transport> transports) {
//        for (Transport transport : transports) {
//            this.addTransport(transport);
//        }
//    }
}