public class scoreCalculation {
    public static void main(String[] args) {
        char [][] answers={
            {'A','E','C','C','D','E','E','F','D','A'},
            {'A','B','D','E','D','C','E','F','F','E'},
            {'B','C','E','D','A','E','D','E','D','A'}
        };

        char keys[]={'A','B','E','D','B','C','E','A','F','E'};

        for(int i=0;i<answers.length;i++){
            int count = 0; // Reset count for each student
            for(int j=0;j<answers[i].length;j++){
                if(answers[i][j]==keys[j]){
                    count ++;
                }
            }
            System.out.println((i+1) + "th student's total correct answers is " + count);
        }
    }
}
