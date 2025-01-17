
public class SubArray {
    /**
     * Return only a part of an array. For instance, given the array {1,2,3,4,5}, a sub array with start 1 and end 4
     * would result in {2,3,4}, because the starting index is inclusive, but the ending index is exclusive.
     *
     * You will need to create a new array whose size is only the amound of elements requested between the start and
     * end index, and then write a for loop which copies values from nums over to this new resulting array.
     *
     * @param nums an array of ints.
     * @param start the starting index, inclusive.
     * @param end the ending index, exclusive.
     * @return a sub-array of nums containing the values between start and end.
     */
    public int[] sub(int[] nums, int start, int end){
        // calculate size of subary
        int newArySize = end - start;
        // create an array of type int w/ size set to subary
        int[] numsSubAry = new int[newArySize];

        // subarry's iterator
        int itr = start;
        // iterate through subarray
        for(int i = 0; i < newArySize; ++i){
            // while itr < end
            if(itr < end){
                // append int to subarray
                numsSubAry[i] = nums[itr];
                // increment by 1
                ++itr;
            }
        }
        //return subarray
        return numsSubAry;

        // below works too
        // int[] subAry = java.util.Arrays.copyOfRange(nums, start, end);
        // return subAry;
    }
}
