
package constructor;



public class main {
    public static void main(String[] args) {
        int k =21;
        int bit = k/3;
        long max = (long) Math.pow(2, k);
        long maxValue = (long) Math.pow(2, bit);
        String loopupTable[] = new String[(int)max];
        System.out.println(max + " - " + maxValue + " - " + k + " - " + bit);
        int chiSoLoopup = 0;
         for(int r=0; r<maxValue; r++)
           {
               for (int g = 0; g < maxValue; g++) 
               {
                   for (int b = 0; b < maxValue; b++) 
                   {
                       loopupTable[chiSoLoopup] = Integer.toString(r) + Integer.toString(g) + Integer.toString(b);
                       chiSoLoopup++;
                   }   
               }
           }

       for(int i=0; i< loopupTable.length; i++)
       {
           System.out.println(i + "   " + loopupTable[i]);
       }
    }
   
}
