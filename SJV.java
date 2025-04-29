public class SJV{
    static class process{
        int id;
        int bt;
        int ct;
        process(int id,int bt){
            this.id=id;
            this.bt=bt;
        }
    }

    public static void main(String[] args) {
        int n=3;
        process [] p  ={
            new process(1, 23),
            new process(2, 12),
            new process(3, 10)
        };
        for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(p[j].bt>p[j+1].bt){
                process temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;

            }

        }}


        int cut=0;
        for(int i=0;i<n;i++){
            cut+=p[i].bt;
            p[i].ct=cut;

        }

        System.out.println("\nSJF (Non-preemptive) Scheduling Table:");
        System.out.println("------------------------------------------");
        System.out.println("| Process | Burst Time | Completion Time |");
        System.out.println("------------------------------------------");

        for(int i=0;i<n;i++){
            System.out.printf("|  p%d  |  %2d  |  %2d  |",p[i].id,p[i].bt,p[i].ct);
        }

        System.out.println("------------------------------------------");
        System.out.println("\nGantt Chart:");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("| P%d ", p[i].id);
        }
        System.out.println("|");
        System.out.println("--------------------------------------------------");

        // Timeline
        System.out.print("0");
        
        for (int i = 0; i < n; i++) {
            System.out.print("    " +p[i].ct);
        }
        System.out.println();


    }
}