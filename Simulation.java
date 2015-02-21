public class Simulation {            
    public static void series(int amountRun) {
        Integer[] hitB = {47, 25, 25, 3};
        Integer[] returnHitB = {80, 45, 75};
        Player bL = new Player(hitB, returnHitB, "Bruce Leeds");

        Integer[] hitS = {10, 20, 66, 4};
        Integer[] returnHitS = {65, 50, 85};
        Player sW = new Player(hitS, returnHitS, "Serena Williamson");
        
        Integer[] hitJ = {70, 10, 15, 5};
        Integer[] returnHitJ = {90, 25, 85};
        Player jD = new Player(hitJ, returnHitJ, "Jean Claude Van Dime");
 
        Game[] games = new Game[3];
        games[0] = new Game(bL, sW);
        games[1] = new Game(bL, jD);
        games[2] = new Game(sW, jD);
        
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < amountRun; j++) games[i].playGame();
        }
        System.out.println(bL.getName() + " won " + bL.getWon() + " lost " +
                           bL.getLost());
        System.out.println(sW.getName() + " won " + sW.getWon() + " lost " +
                           sW.getLost());
        System.out.println(jD.getName() + " won " + jD.getWon() + " lost " +
                           jD.getLost());
                
    }
    
    public static void headToHead(int amountRun) {
        Integer[] hitB = {47, 25, 25, 3};
        Integer[] returnHitB = {80, 45, 75};
        Player bL1 = new Player(hitB, returnHitB, "Bruce Leeds");
        Player bL2 = new Player(hitB, returnHitB, "Bruce Leeds");

        Integer[] hitS = {10, 20, 66, 4};
        Integer[] returnHitS = {65, 50, 85};
        Player sW1 = new Player(hitS, returnHitS, "Serena Williamson");
        Player sW2 = new Player(hitS, returnHitS, "Serena Williamson");
        
        Integer[] hitJ = {70, 10, 15, 5};
        Integer[] returnHitJ = {90, 25, 85};
        Player jD1 = new Player(hitJ, returnHitJ, "Jean Claude Van Dime");
        Player jD2 = new Player(hitJ, returnHitJ, "Jean Claude Van Dime");
 
        Game[] games = new Game[3];
        games[0] = new Game(bL1, sW1);
        games[1] = new Game(bL2, jD1);
        games[2] = new Game(sW2, jD2);
        
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < amountRun; j++) games[i].playGame();
        }
        System.out.println("match 1: " + bL1.getName() + " won " + bL1.getWon() 
                               + " and " + sW1.getName() + " won "
                               + sW1.getWon());
         System.out.println("match 1  : " + bL1.getName() + " won " + 
                            (bL1.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + sW1.getName() + " won "
                               + (sW1.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");
        System.out.println("match 2: " + bL2.getName() + " won " + bL2.getWon() 
                               + " and " + jD1.getName() + " won "
                               + jD1.getWon());
         System.out.println("match 2  : " + bL2.getName() + " won " + 
                            (bL2.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + jD1.getName() + " won "
                               + (jD1.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");
        System.out.println("match 3: " + sW2.getName() + " won " + sW2.getWon() 
                               + " and " + jD2.getName() + " won "
                               + jD2.getWon());
         System.out.println("match 3  : " + sW2.getName() + " won " + 
                            (sW2.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + jD2.getName() + " won "
                               + (jD2.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");                
    }    
    public static void myPlayer(int amountRun) {
        Integer[] hitB = {47, 25, 25, 3};
        Integer[] returnHitB = {80, 45, 75};
        Player bL = new Player(hitB, returnHitB, "Bruce Leeds");

        Integer[] hitS = {10, 20, 66, 4};
        Integer[] returnHitS = {65, 50, 85};
        Player sW = new Player(hitS, returnHitS, "Serena Williamson");
        
        Integer[] hitJ = {70, 10, 15, 5};
        Integer[] returnHitJ = {90, 25, 85};
        Player jD = new Player(hitJ, returnHitJ, "Jean Claude Van Dime");
        
        Integer[] hitR = {0, 95, 0, 5};
        Integer[] returnHitR = {65, 81, 54};
        Player rF1 = new Player(hitR, returnHitR, "Rojer Federation");
        Player rF2 = new Player(hitR, returnHitR, "Rojer Federation");        
        Player rF3 = new Player(hitR, returnHitR, "Rojer Federation");
               
        Game[] games = new Game[3];
        games[0] = new Game(rF1, bL);
        games[1] = new Game(rF2, sW);
        games[2] = new Game(rF3, jD);
        
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < amountRun; j++) games[i].playGame();
        }
        System.out.println("match 1: " + rF1.getName() + " won " + rF1.getWon() 
                               + " and " + bL.getName() + " won "
                               + bL.getWon());
         System.out.println("match 1  : " + rF1.getName() + " won " + 
                            (rF1.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + bL.getName() + " won "
                               + (bL.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");
        System.out.println("match 2: " + rF2.getName() + " won " + rF2.getWon() 
                               + " and " + sW.getName() + " won "
                               + sW.getWon());
         System.out.println("match 2  : " + rF2.getName() + " won " + 
                            (rF2.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + sW.getName() + " won "
                               + (sW.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");
        System.out.println("match 3: " + rF3.getName() + " won " + rF3.getWon() 
                               + " and " + jD.getName() + " won "
                               + jD.getWon());
         System.out.println("match 3  : " + rF3.getName() + " won " + 
                            (rF3.getWon() + 0.0)/(amountRun + 0.0)*100.0 
                               + "% and " + jD.getName() + " won "
                               + (jD.getWon() + 0.0)/(amountRun + 0.0)*100.0
                           + "%");                
    }    
}
