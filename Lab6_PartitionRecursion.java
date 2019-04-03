
/*
    JAVA code to partition a set into two subsets 
    such that the difference of subset sums 
    is minimum.

    @author Joao Pedro Affonso de Almeida 
    @author 18145957
    @version 13/11/2018
*/

class Lab6_PartitionRecursion{ 

    // Function to find the minimum sum 
    public static Long findMinRec(Long arr[], int i, 
        Long sumSub1, 
        Long sumArr) 
    { 
        // If we have reached last element. 
        // Sum of one subset is sumSub1, 
        // sum of other subset is sumArr- 
        // sumSub1.  Return absolute  
        // difference of two sums. 
        if (i == 0) 
            return Math.abs((sumArr-sumSub1) - 
             sumSub1); 


        // For every item arr[i], we have two choices 
        // (1) We do not include it first set 
        // (2) We include it in first set 
        // We return minimum of two choices 
        return Math.min(findMinRec(arr, i - 1, sumSub1  
         + arr[i-1], sumArr), 
        findMinRec(arr, i-1, 
          sumSub1, sumArr)); 
    } 

    // Returns minimum possible difference between 
    // sums of two subsets 
    public static Long findMin(Long arr[], int n) 
    { 
        // Compute total sum of elements 
        Long sumArr = 0L; 
        for (int i = 0; i < n; i++) 
            sumArr += arr[i]; 

        // Compute result using recursive function 
        return findMinRec(arr, n, 0L, sumArr); 
    } 

    /* Driver program to test above function */
    public static void main(String[] args)  
    { 		
        Long arr[] = {
            7270536038336708566L,8019217342518227357L,3040884611156577620L,4971410678527411098L,183064013267932758L,
            8056584603037925167L,1899884129638764508L,5128941762697709445L,5047244487910064394L,3305601720113745382L,
            5776953008539814370L,34988082947722169L,7434345681532331612L,5407786886759427803L,688068291500036320L,
        	/*2068510150417278708L,1868790318480929054L,3425404376196216488L,1131190712360422749L,102967645096808272L,
        	1445942735952374406L,8456737838228485082L,7623544032966572081L,3942629391233399085L,75109850685511728L,
        	223515536869223609L,764673323466830185L,2792331077502901882L,8043871486090449356L,8027891460874623856L,
        	9035205129603316628L,5210176758109223792L,6369027410439876015L,719764136449271247L,6275216998605832028L,
        	7518974182407464286L,8228098362075889963L,4364500170274364383L,5160900320056121570L,3574188741140445768L,
        	3799725687163235416L,8971054323076859594L,303947614746485290L,4072768654844778108L,422948319988286530L,
        	228169257627773589L,4695919214544378987L,5634695221137989240L,2134479954298742138L,7591363728605668117L,
        	227743280468209272L,3815359581987719752L,240831188333789404L,1682051551566226L,7028911732181187415L,*/
        	8534901095561461575L,604981729275990578L,4379371367686136078L,2561184379973031673L,3251231714574439892L,
        	8507596701451728093L,1479176915196229414L,4596908701725205546L,7434222118200184219L

        };
        int n = arr.length; 
        System.out.print("The minimum difference"+ 
            " between two sets is " +  
            findMin(arr, n)); 
    } 
} 