//11. Container With Most Water
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.

class Solution {
    public int maxArea(int[] height) {
        int maxCapacity = 0;
        int i =0 ,j = height.length-1;
        while (i<j){
            if (height[i] < height[j]){
                maxCapacity = Math.max(maxCapacity,height[i]*(j-i));
                i++;
            }
            else {
                maxCapacity = Math.max(maxCapacity,height[j]*(j-i));
                j--;
            }
        }
        return maxCapacity;
    }
}
