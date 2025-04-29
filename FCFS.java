public class FCFS{
    static class process{
        int id;
        int brustTime;
        int completionTime;

        process(int id,int brustTime){
            this.id=id;
            this.brustTime=brustTime;
            this.completionTime=0;
        }
    }


    public static void main(String[] args) {
        int n=3;
        process [] processes= {
            new process(1,24 ),
            new process(2, 3),
            new process(3, 3)
        };


        int curretTime=0;
        for(int i=0;i<n;i++){
            curretTime+=processes[i].brustTime;
            processes[i].completionTime=curretTime;

        }

        System.out.println("\nFCFS Scheduling Table:");
        System.out.println("-----------------------------------------");
        System.out.println("| Process | Burst Time | Completion Time |");
        System.out.println("-----------------------------------------");



        for(int i=0;i<n;i++){
            process p=processes[i];
            System.out.printf("|   P%d    |     %2d     |       %2d        |\n",
                p.id, p.brustTime, p.completionTime);
        }


        System.out.println("-----------------------------------------");

        // Print Gantt Chart
        System.out.println("\nGantt Chart:");
        System.out.println("---------------------------------");


for(int i=0;i<n;i++){
    System.out.print("| p"+ processes[i].id+" ");
}
System.out.println("|");

System.out.println("---------------------------------");

// Print time markers
System.out.print("0");
for (int i = 0; i < n; i++) {
    System.out.print("   " + processes[i].completionTime);
}
System.out.println();

    }

   
}