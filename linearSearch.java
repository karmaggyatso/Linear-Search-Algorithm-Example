public class linearSearch {
    public static void main(String [] args){
        int [] list = {23,43,12,45,4,6,50}; //list of array. size of length = 7
        System.out.println("The largest number is " + ls(list)); //calling the function ls
    }

    public static int ls(int[] result){
        int temp = 0;
        for (int i = 0; i < result.length; i++){
            if (temp<result[i]) { //if temp is less than the value of result[i] then it replaces the value
                temp = result[i];
            }
        }
        return temp; //prints the result
    }
}
