public class Population extends Inputs{

    int chromosome[][];
    String gene[];
    int test[][];
    int i,j,k=0;
    public Population(){
        chromosome= new int[noOfDays][noOfLectures];
        gene= new String[noOfDays*noOfLectures];
        test= new int[noOfDays*noOfLectures][noOfDays*noOfLectures];
    }
    public String binaryConverter(int a,int b){
        return (Integer.toBinaryString(a)+" "+Integer.toBinaryString(b));
    }
    public void geneGenerator(){
            for(j=0;j<noOfSubjects;j++){
                for(k=0;k<noOfTeachers;k++){
                    if(i<gene.length){
                        gene[i]=binaryConverter(j+1,k+1); 
                        System.out.println("Gene "+i+" = "+gene[i]);
                        i++;
                    } 
                }
            }
            
        }
    
}