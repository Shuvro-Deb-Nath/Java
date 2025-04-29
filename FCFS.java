import java.util.Scanner;

public class FCFS {
    static class Process {
        int id;
        int burstTime;
        int completionTime;

        Process(int id, int burstTime) {
            this.id = id;
            this.burstTime = burstTime;
            this.completionTime = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        Process[] processes = new Process[n];

        // Input burst time only; assign process ID automatically
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Burst Time for Process " + (i + 1) + ": ");
            int bt = sc.nextInt();
            processes[i] = new Process(i + 1, bt);
        }

        // Calculate completion times
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            currentTime += processes[i].burstTime;
            processes[i].completionTime = currentTime;
        }

        // Print scheduling table
        System.out.println("\nFCFS Scheduling Table:");
        System.out.println("-----------------------------------------");
        System.out.println("| Process | Burst Time | Completion Time |");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < n; i++) {
            Process p = processes[i];
            System.out.printf("|   P%d    |     %2d     |       %2d        |\n",
                    p.id, p.burstTime, p.completionTime);
        }
        System.out.println("-----------------------------------------");

        // Print Gantt chart
        System.out.println("\nGantt Chart:");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("| P" + processes[i].id + " ");
        }
        System.out.println("|");
        System.out.println("-----------------------------------------");

        // Print time markers
        System.out.print("0");
        for (int i = 0; i < n; i++) {
            System.out.print("   " + processes[i].completionTime);
        }
        System.out.println();

        sc.close();
    }
}
