public class Testing extends Population {
    public int fitnessValue[];
    public int doneList[];
    // public int sameValues[];
    Tools ts=new Tools();
    
    public Testing(){
        fitnessValue= new int[noOfChromosome];
        doneList= new int[noOfSubjects*noOfTeachers];
        // sameValues= new int[noOfSubjects*noOfTeachers];
    }
    public void Test1(){
        for(i=0;i<noOfChromosome;i++){
            for(j=0;j<noOfSubjects*noOfTeachers;j++){
                if(gene[chromosomes[i][j]].equals("0 0") || gene[chromosomes[i][j]].equals("1 1") || gene[chromosomes[i][j]].equals("10 10")){
                    fitnessValue[i]+=1;
                }
            }
            fitnessValue[i]-=10;
            
        }
        System.out.println("Fitness value of test 01");
            for(k=0;k<fitnessValue.length;k++){
                System.out.println("chromosome"+k+" = "+fitnessValue[k]);
            }
        
    }
    
    public void Test2(){
        for(i=0;i<noOfChromosome;i++){
            int penalty=0;
            for(k=0;k<doneList.length;k++){
                doneList[k]=-1;
            }

            for(j=0;j<noOfDays*noOfLectures;j++){
                if(!(ts.existElement(chromosomes[i][j], doneList))){
                    if(ts.countRepitition(chromosomes[i][j], chromosomes[i])>parameter01_NotMoreLecturesOfTeacherInWeek){
                        penalty++;
                        doneList=ts.addElement(chromosomes[i][j], doneList);
                    }else{
                        doneList=ts.addElement(chromosomes[i][j], doneList);
                    }
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
