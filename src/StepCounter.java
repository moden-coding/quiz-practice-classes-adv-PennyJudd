public class StepCounter {
    private int steps = 0;
    private int dailySteps = 0;
    private int days = 0;
    private double average = 0;
    private double totalSteps = 0;
    private int activeDays = 0;
    private double doubleDays = 0;



    public StepCounter(int steps){

        this.steps = steps;
    }
    public StepCounter(){
        steps = 7000;

    }

    public void addDailySteps(int daily){
       dailySteps = daily;
       totalSteps = totalSteps + (daily * 1.0);

       if (dailySteps >= steps){
        // System.out.println(steps);
        activeDays++;
       }
    //    System.out.println(days);
       days++;
    

    }
    public int activeDays(){
        return activeDays;
        
    }
    public double averageSteps(){
       
        doubleDays = days * 1.0;
        // System.out.println(days);

        average = (totalSteps/days);
         if (days == 0){
            
            average = 0.0;
        }
       
        return average;
        

    }
}
