package extraExercies;

public class TeamWork02_03 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3} ,{7,2} };
        int [][] arr2 = {{1,2,3} ,{7,3,2} };

        System.out.println(isLastElementSame(arr1, arr2));

    }

    private static boolean isLastElementSame(int[][] arr1, int[][] arr2) {
        boolean isSame= true;
        if(arr1[0]==arr2[0]){
            for (int i = 0; i <arr1.length ; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[arr1.length-1]== arr2[arr2.length-1]){
                        return isSame;
                    }else isSame=false;
                }
            }
        }else if(arr1[0]!=arr2[0]){
            isSame=false;
        }
        return isSame;
    }
}
 /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk elemana sahiplerse veya aynı son elemana sahip olmalarını kontrol eden code create ediniz.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

    */