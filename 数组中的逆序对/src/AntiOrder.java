/**
 * @program: 数组中的逆序对
 * @description
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数.
 * @author: matilda
 * @create: 2020-06-02 15:36
 **/

//思路：使用归并排序统计逆序对
public class AntiOrder {

    public int count(int[] A,int n){
        if (A == null || n == 0){
            return 0;
        }
        return mergeSortRecursion(A,0,n-1);
    }

    //递归实现归并排序
    public static int mergeSortRecursion(int[] A,int left,int right){
        if (left == right){
            return 0;
        }
        int mid = (left + right)/2;
        return mergeSortRecursion(A, left, mid)+mergeSortRecursion(A,mid+1, right)+merge(A,left,mid,right);
    }

    //合并排好序的数组
    public static int merge(int[] A,int left,int mid,int right) {
        int[] tmp = new int[right - left + 1];
        int index = 0;
        int i = left;
        int j = mid + 1;
        int inverseNum = 0;//用来累加数组逆序对
        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                tmp[index++] = A[i++];
            } else {
                inverseNum = inverseNum + (mid - i + 1);
                tmp[index++] = A[j++];
            }
        }
        while (i <= mid){
            tmp[index++] = A[i++];
        }
        while (j <= right){
            tmp[index++] = A[j++];
        }
        for (int k = 0; k < tmp.length; k++) {
            A[left++] = tmp[k];
        }
        return inverseNum;
    }
}
