public class Testing extends Population {
    public int fitnessValue[];
    public int sameElement[];
    public int sameValues[];
    
    public Testing(){
        fitnessValue= new int[20];
        sameElement= new int[noOfSubjects*noOfTeachers];
        sameValues= new int[noOfSubjects*noOfTeachers];

        for(k=0;k<sameElement.length;k++){
            sameValues[k]=0;
            sameElement[k]=-1;
        }
    }
    public void Test1(){
        for(i=0;i<20;i++){
            for(j=0;j<noOfSubjects*noOfTeachers;j++){
                if(gene[chromosomes[i][j]].equals("0 0") || gene[chromosomes[i][j]].equals("1 1") || gene[chromosomes[i][j]].equals("10 10")){
                    fitnessValue[i]+=1;
                }
            }
            
        }
        System.out.println("Fitness value of test 01");
            for(k=0;k<fitnessValue.length;k++){
                System.out.println("chromosome"+k+" = "+fitnessValue[k]);
            }
        
    }
    // Not Working properly
    public void Test2(){
        
        for(i=0;i<20;i++){
            int pointer=0;
            int penalty=0;
            sameElement[0]=chromosomes[i][0];
            for(j=0;j<noOfSubjects*noOfTeachers;j++){
                for(k=0;k<sameElement.length;k++){
                    
                        if(chromosomes[i][j]==sameElement[k]){
                            // fitnessValue[i]+=1;
                            sameValues[k]+=1;
                        }else{
                            if(sameElement[k]==-1){
                            pointer+=1;
                            if(pointer<9)
                            sameElement[pointer]=chromosomes[i][j];
                            }else break;
                        }
                    
                }
            }
            for(k=0;k<sameElement.length;k++){
                System.out.println("Same Element["+i+":"+k+"]="+sameElement[k]);
                System.out.println("Same values["+i+":"+k+"]="+sameValues[k]);
                if(sameValues[k]>3){
                    penalty+=1;
                    sameValues[k]=0;
                    sameElement[k]=-1;
                }else{
                    sameValues[k]=0;
                    sameElement[k]=-1;
                }
                
            }
            fitnessValue[i]-=penalty;
        }
        System.out.println("Fitness value of test 02");
            for(k=0;k<fitnessValue.length;k++){
                System.out.println("chromosome"+k+" = "+fitnessValue[k]);
            }
    }

}
