import java.util.Scanner;

public class SJV {
    static class Process {
        int id;
        int bt;
        int ct;
        int wt;
        int tat;

        Process(int id, int bt) {
            this.id = id;
            this.bt = bt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        Process[] p = new Process[n];

        // Input burst time only; process number is auto-assigned
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Burst Time for Process " + (i + 1) + ": ");
            int bt = sc.nextInt();
            p[i] = new Process(i + 1, bt);
        }

        // Sort by burst time (SJF)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (p[j].bt > p[j + 1].bt) {
                    Process temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        // Calculate waiting and turnaround times
        p[0].wt = 0;
        int total_wt = 0, total_tat = 0;

        for (int i = 1; i < n; i++) {
            p[i].wt = p[i - 1].wt + p[i - 1].bt;
            total_wt += p[i].wt;
        }

        for (int i = 0; i < n; i++) {
            p[i].tat = p[i].wt + p[i].bt;
            total_tat += p[i].tat;
        }

        float avg_wt = (float) total_wt / n;
        float avg_tat = (float) total_tat / n;

        // Calculate completion times
        int cut = 0;
        for (int i = 0; i < n; i++) {
            cut += p[i].bt;
            p[i].ct = cut;
        }

        // Print scheduling table
        System.out.println("\nShortest Job First Scheduling Table:");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| Process | Burst Time | Completion Time | Waiting Time | Turnaround Time |");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("|   P%d    |     %2d     |       %2d        |       %2d       |       %2d       |\n",
                    p[i].id, p[i].bt, p[i].ct, p[i].wt, p[i].tat);
        }
        System.out.println("-------------------------------------------------------------------------------");

        // Print Gantt chart
        System.out.println("\nGantt Chart:");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("| P" + p[i].id + " ");
        }
        System.out.println("|");
        System.out.println("-----------------------------------------");

        System.out.print("0");
        for (int i = 0; i < n; i++) {
            System.out.print("   " + p[i].ct);
        }
        System.out.println();

        // Print averages
        System.out.printf("\nAverage Waiting Time = %.2f", avg_wt);
        System.out.printf("\nAverage Turnaround Time = %.2f\n", avg_tat);

        sc.close();
    }
}
