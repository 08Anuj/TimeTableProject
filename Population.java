import java.util.*;
public class Population extends Inputs{

    Random r=new Random();
    int chromosomes[][];
    String gene[];
    int test[][];
    int i,j,k=0;

    public Population(){
        chromosomes= new int[20][noOfDays*noOfLectures];
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
                        gene[i]=binaryConverter(j,k);   // Make j&k +1
                        System.out.println("Gene "+i+" = "+gene[i]);
                        i++;
                    } 
                }
            }  
        }
    public void chromosome(){
        
        for(i=0;i<noOfChromosome;i++){
            System.out.println("Chromosome"+i+" :");
            for(j=0;j<noOfDays*noOfLectures;j++){
                chromosomes[i][j]=r.nextInt(noOfDays*noOfLectures);
                System.out.print(" "+chromosomes[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}