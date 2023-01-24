/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> Array1 = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
             List<Integer> Array2 = new ArrayList<>();
                    
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    Array2.add(1);
                }

               else{
                   Array2.add(j, Array1.get(i-1).get(j-1)+ Array1.get(i-1).get(j));
               }
            }
            Array1.add(Array2);
        }
        return Array1;
        
    }
}

       

        
      
