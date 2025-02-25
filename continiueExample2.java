public class continiueExample2 {
    public static void main(String[] args) {
        String s="Uttara University Uttara Model Town";
        int length=s.length();
        int nomOfu=0;
        for(int i=0; i<length;i++){
            if(s.charAt(i)!='U'){
                continue;
            }
            nomOfu++;
        }
System.out.println("the num of u is :"+nomOfu);
    }
}
