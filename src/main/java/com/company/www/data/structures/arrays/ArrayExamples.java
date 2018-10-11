package com.company.www.data.structures.arrays;

import java.util.*;
import java.util.stream.Stream;

public class ArrayExamples {

  /** Adjacent Sum of array. **/

  int findSum(int[] array, int start) {
    if (start >= array.length) return 0;
    else {
      int sum = 0;
      sum += Math.max(array[start] + findSum(array, start + 2), findSum(array, start + 1));
      return sum;
    }
  }

  /** check pair sum Method 1 : Use Sorting Method 2 : Use HashSet O(n) complexity* */
  boolean checkSum(int[] array, int sum) {
    Arrays.sort(array);
    int start = 0, end = array.length - 1;
    while (start < end) {
      if (array[start] + array[end] == sum) return true;
      else if (array[start] + array[end] < sum) start++;
      else end--;
    }
    return false;
  }

  void checkPairSum(int[] array, int sum) {
    Set<Integer> set = new HashSet<>();
    for (int i : array) {
      if (set.contains(sum - i)) System.out.println(i + " " + (sum - i));
      else set.add(i);
    }
  }

  /** sort three types of element in an array. **/

  int[] sortThreeType(int[] array){
    int itr = -1 ;
    for(int i = 0; i<array.length-1 ; i++){
      if(array[i] <= 1){
        itr++;
        swap(array, i, itr);
      }
    }
    return array;
  }

  /**
   * Problem: Find the Number Occurring Odd Number of Times. Given an array of positive integers.
   * All numbers occur even number of times except one number which occurs odd number of times. Find
   * the number in O(n) time & constant space. Solution: Use XOR operator.
   */

  /**
   * Problem: Merge an array of size n into another array of size m+n. There are two sorted arrays.
   * First one is of size m+n containing only m elements. Another one is of size n and contains n
   * elements. Merge these two arrays into the first array of size m+n such that the output is
   * sorted. Solution: fill up bigger array using two pointers starting from right and moving to
   * left O(m+n).
   */

  /**
   * The idea is to get total sum of array first. Then Iterate through the array and keep up dating
   * the left sum which is initialized as zero. In the loop, we can get right sum by subtracting the
   * elements one by one.
   */
  /** Problem: Majority Element. Solution: */

  /**
   * Problem: Find the transition point in a binary array. Given a sorted array containing only
   * numbers 0 and 1, the task is to find the transition point efficiently. Transition point is a
   * point where “0” ends and “1” begins.
   */
  /** Move all zeroes to end of array * */
  void moveZeroToEnd(int[] array) {
    int start = 0, end = array.length;
    int itr = start - 1;
    int pivot = 0;
    for (int i = start; i < end; i++) {
      if (array[i] != pivot) {
        itr++;
        swap(array, itr, i);
      }
    }
    Arrays.stream(array).forEach(X -> System.out.print(X + " "));
  }
  /**
   * Rearrange positive and negative numbers in O(n) time and O(1) extra space. Use Quick sort
   * technique. Take the pivot element as 0 and do the first round of Quick Sort. After above step
   * you will have all the negative elements on left and all the positive elements on the right.
   * Then just the every alternate element in the left half (negative elements) with the elements in
   * the right (positive elements)*
   */
  void alternateSign(int[] array) {
    int pivot = 0;
    int start = 0, end = array.length;
    int itr = start - 1;

    for (int i = start; i < end; i++) {
      if (array[i] < pivot) {
        itr++;
        swap(array, itr, i);
      }
    }
    int pos = itr + 1, neg = 0;
    while (pos < end && neg < pos && array[neg] < 0) {
      swap(array, pos, neg);
      pos++;
      neg += 2;
    }
  }

  /**
   * Write a program to find number of inversions in an array. Example- Array 2, 5, 3, 1,10 ,
   * Inversions (2,1) , (5,1), (3,1), (5,3) Answer will be – 4 Sol 1 : For each element, count
   * number of elements which are on right side of it and are smaller than it. O(N^2). Sol2 :
   * Enhanced Merge Sort, for each element we count the all the elements greater than it to its left
   * and add to the output . This whole magic happens inside merge function of merge Sort.
   */
  int countInversion(int[] array, int start, int end) {
    if (start == end) return 0;
    int inversion = 0;
    int mid = start + (end - start) / 2;
      inversion += countInversion(array, start, mid);
      inversion += countInversion(array, mid + 1, end);
      inversion += merge(array, start, mid, end);
    return inversion;
  }

  private int merge(int[] array, int start, int mid, int end) {
    int leftCount = mid - start + 1;
    int inversion = 0;
    int rightCount = end - mid;
    int[] leftArray = new int[leftCount + 1];
    int[] rightArray = new int[rightCount + 1];
    for (int i = 0; i <= leftCount; i++) leftArray[i] = array[i + start];
    for (int j = 0; j < rightCount; j++) rightArray[j] = array[j + mid + 1];
    // System.arraycopy(array, start, leftArray, 0, leftCount);
    // System.arraycopy(array, mid+1, rightArray, 0, rightCount);
    leftArray[leftCount] = Integer.MAX_VALUE;
    rightArray[rightCount] = Integer.MAX_VALUE;
    int lPointer = 0;
    int rPointer = 0;
    for (int i = start; i <= end; i++) {
      if (leftArray[lPointer] <= rightArray[rPointer]) {
        array[i] = leftArray[lPointer];
        lPointer++;
      } else {
        array[i] = rightArray[rPointer];
        rPointer++;
        inversion += mid -lPointer +1;
      }
    }
    return inversion;
  }

  /**
   * Rotate an array to the left by a given value. reverseArray( theArray, 0, k-1 ) reverseArray(
   * theArray, k, end-1) reverseArray( theArray, 0, end-1) to rotate right reverseArray( theArray,
   * 0, end- 1 ) reverseArray( theArray, 0, K - 1 ) reverseArray( theArray, k, end - 1 )
   */
  void rotateByK(int[] array, int k) {
    Arrays.stream(array).forEach(X -> System.out.print(X + " "));
    System.out.println();
    reverseArray(array, 0, k - 1);
    reverseArray(array, k, array.length - 1);
    reverseArray(array, 0, array.length - 1);
    Arrays.stream(array).forEach(X -> System.out.print(X + " "));
  }

  void rotateright(int[] array, int k) {
    Arrays.stream(array).forEach(X -> System.out.print(X + " "));
    System.out.println();
    reverseArray(array, 0, array.length - 1);
    reverseArray(array, 0, k - 1);
    reverseArray(array, k, array.length - 1);
    Arrays.stream(array).forEach(X -> System.out.print(X + " "));
  }

  /** find the minimum element in a rotated array Use Binary Search * */
  int minimumInRotated(int[] array, int start, int end) {
    if (start > end) return array[0];
    else {
      int mid = start + (end - start) / 2;
      if (mid < end && array[mid] > array[mid + 1]) return array[mid + 1];
      if (mid > start && array[mid - 1] > array[mid]) return array[mid];
      if (array[mid] < array[end]) return minimumInRotated(array, start, mid - 1);
      else return minimumInRotated(array, mid + 1, end);
    }
  }

  /**
   * Given an array of integers, segregate even and odd numbers in the array. All the even numbers
   * should be present first, and then the odd numbers.*
   */
  void SaggregateOddEven(int[] array) {}

  /** Segregate 0 , 1, 2 in an Array* */
  void segregate(int[] array) {
    int zeroCount = 0, oneCount = 0, twoCount = 0;
    for (int i : array) {
      if (i == 0) zeroCount++;
      else if (i == 1) oneCount++;
      else twoCount++;
    }

    for (int i = 0; i < array.length; i++) {
      if (zeroCount-- > 0) array[i] = 0;
      else if (oneCount-- > 0) array[i] = 1;
      else array[i] = 2;
    }
  }

  /**
   * find first occurence of an integer in a sorted array. Use Binary search and compare mid with
   * adjacent element. *
   */
  int getFirstOccur(int[] array, int key) {
    return getFirstOccur(array, 0, array.length - 1, key);
  }

  private int getFirstOccur(int[] array, int start, int end, int key) {
    if (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid == 0 || array[mid - 1] < key && array[mid] == key) return mid;
      else if (array[mid] >= key) return getFirstOccur(array, start, mid - 1, key);
      else return getFirstOccur(array, mid + 1, end, key);
    }
    return -1;
  }

  /** Segregate even and odd numbers . Start from left and right.* */

  /** Recursively sum of an Array* */
  int linearSum(int[] arr, int n) {
    if (n == 1) return arr[0];
    else return linearSum(arr, n - 1) + arr[n - 1];
  }

  /** Frequency of a given element in the array* */
  int elementFrequency(int[] arr, int key) {
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int i : arr) {
      if (frequency.containsKey(i)) frequency.put(i, frequency.get(i) + 1);
      else frequency.put(i, 1);
    }
    return frequency.get(key);
  }

  /** {1, 2, 5} K = 4 * */
  int micro(int[] array, int k) {
    int min = Arrays.stream(array).min().orElse(Integer.MIN_VALUE);
    return k - min;
  }

  /** Given two arrays and store the sum of elements in C Array* */
  void sumOfArrays(int[] A, int[] B) {
    int length = A.length;
    int[] C = new int[length];

    for (int i = 0; i < length; i++) {
      C[i] = A[i] + B[i];
    }
    Arrays.stream(C).forEach(x -> System.out.print(x + " "));
  }

  /** Alterate negative and positive designs. * */

  /** Reverse an array* */
  void reverseArray(int[] array, int start, int end) {
    if (start > end) return;
    if (start <= end) {
      swap(array, start, end);
    }
    reverseArray(array, start + 1, end - 1);
  }

  private void swap(int[] array, int start, int end) {

    if (start != end) {
      array[start] = array[start] ^ array[end];
      array[end] = array[start] ^ array[end];
      array[start] = array[start] ^ array[end];
    }
  }

  /** Reverse Print an array * */
  void reversePrint(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i] + " ");
  }

  /**
   * Find the two repeating elements in a given array Sol1. Use HashMap. Sol2. Put negative sign for
   * every visited number. *
   */
  Set<Integer> findDuplicates(int[] array) {
    Set<Integer> duplicates = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
      if (array[Math.abs(array[i])] >= 0) {
        array[Math.abs(array[i])] = -array[Math.abs(array[i])];
      } else duplicates.add(Math.abs(array[i]));
    }

    return duplicates;
  }

  /**
   * Find the only repeating element in a sorted array of size n Sol : Use Binary Search. Numbers
   * are given in the range of 1 to n-1 *
   */
  int findRepeating(int[] arr, int start, int end) {
    if (start > end) return -1;
    int mid = (start + end) / 2;
    if (arr[mid] != mid + 1) {
      if (mid > 0 && arr[mid] == arr[mid - 1]) return mid;
      return findRepeating(arr, start, mid - 1);
    }
    return findRepeating(arr, mid + 1, end);
  }

  /**
   * Given a list of non negative integers, arrange them such that they form the largest number. *
   */

  /**
   * Largest subarray with equal number of 0s and 1s. Input: arr[] = {1, 0, 1, 1, 1, 0, 0} Output: 1
   * to 6 (Starting and Ending indexes of output subarray) Sol. The count variable is incremented by
   * one for every 1 encountered and decremented by one for every 0. if we keep a track of the
   * indices corresponding to the same count values that lie farthest apart,
   */
  int findMaxLength(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int maxLen = 0, count = 0;
    for (int i = 0; i < array.length; i++) {
      count = count + (array[i] == 1 ? 1 : -1);
      if (map.containsKey(count)) {
        maxLen = Math.max(maxLen, i - map.get(count));
      } else map.put(count, i);
    }
    return maxLen;
  }

  /**
   * Leader in a Array . An element is leader if it is greater than all the elements to its right
   * side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5,
   * 2}, leaders are 17, 5 and 2.*
   */
  ArrayList<Integer> leader(int[] array) {
    ArrayList<Integer> leaders = new ArrayList<>();
    int max = array[array.length - 1];
    leaders.add(max);
    for (int i = array.length - 2; i >= 0; i--) {
      if (array[i] > max) {
        max = array[i];
        leaders.add(max);
      }
    }
    return leaders;
  }

  /**
   * Kadane's Algorithm find the sum of contiguous sub array within a one-dimensional array of
   * numbers which has the largest sum.*
   */
  int Kadane(int[] array) {
    int maxEndsHere = 0;
    int maxSoFar = 0;

    for (int i = 0; i < array.length; i++) {
      maxEndsHere = maxEndsHere + array[i];
      if (maxEndsHere < 0) maxEndsHere = 0;
      if (maxSoFar < maxEndsHere) maxSoFar = maxEndsHere;
    }
    return maxSoFar;
  }

  /**
   * You are given an array with duplicates. You have to sort the array with decreasing frequency of
   * elements. If two elements have the same frequency, sort them by their actual value in
   * increasing order. Ex: [2 3 5 3 7 9 5 3 7] Output: [3 3 3 5 5 7 7 2 9]*
   */
  void sortFrequency(int[] arr) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++)
      if (!map.containsKey(arr[i])) map.put(arr[i], 1);
      else map.put(arr[i], (map.get(arr[i]) + 1));

    List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
    Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

    for (Map.Entry<Integer, Integer> i : list) {
      for (int value = i.getValue(); value > 0; value--) System.out.print(i.getKey() + " ");
    }

    Stream<Map.Entry<Integer, Integer>> sorted =
        map.entrySet().stream().sorted(Map.Entry.comparingByValue());
    System.out.println(sorted);

    System.out.println();
    for (int i = 0; i < list.size(); i++) {
      int frequency = list.get(i).getValue();
      int value = list.get(i).getKey();
      while (frequency > 0) {
        System.out.print(value + " ");
        frequency--;
      }
    }
  }

  /** Find all the subset of an array. * */
  void subset(int[] array, String soFar, int start) {
    if (start > array.length - 1) System.out.println(soFar);
    else {
      subset(array, soFar + array[start], start + 1);
      subset(array, soFar, start + 1);
    }
  }

  /**
   * There are two array array1 = [a, f, h, k, m, o, s, r …….. and so on], array2 = [h, k, m. o].
   * Check that array1 contain array2 or not . Method1. We can use hashing , but it will not cover
   * the case when duplicates are present. Method2. Sort both the arrays, and use merge type of
   * process, traverse both the arrays. *
   */

  /**
   * There is an array [1,2,5,4,8,3] and sum = 7. Find all the sub set array such that sum of
   * elements is 7. Example [1+2+4]=7, [2+5]=7, [4+3]=7 4 *
   */

  /**
   * Merge k sorted arrays in to a single sorted array. 1st Method : Copy arrays in a single array
   * and sort them ( nk * log(nk)) 2nd Method : Compare 1st element from each element since they are
   * already sorted. for smallest element array increment the index (kn * k). 3rd Priority Queue :
   * time Complexity(nk*log(k)) *
   */

  /** seggregate 0s to the left and 1s to the right in the array* */
  void zeroAndOne(int[] array) {
    int start = 0, end = array.length - 1;
    while (start < end) {
      while (array[start] == 0) start++;
      while (array[end] == 1) end--;
      if (array[start] > array[end]) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
      }
    }
  }

  /** QuickSort* */
  void saggregateZeroOne(int[] array) {
    int pivot = 0;
    int start = 0, end = array.length;
    int itr = start - 1;
    for (int i = start; i < end; i++) {
      if (array[i] <= pivot) {
        itr++;
        swap(array, itr, i);
      }
    }
    Arrays.stream(array).forEach(X -> System.out.println(X));
  }

  /**
   * find the longest consecutive Sequence of numbers in an unsorted array. Use HashSet and store
   * all the elements of array in the set. Iterate through the Set ti find the longest Sequence*
   */
  int longestConsecutive(int[] array) {
    HashSet<Integer> value = new HashSet<Integer>();
    for (int a : array) {
      value.add(a);
    }
    int max = 0;
    for (int val : value) {
      if (value.contains(val - 1))
        continue; // this means current val cannot be the first item of the Sequence hence skip it
      int length = 0;
      while (value.contains(val++)) length++;
      max = Math.max(max, length);
    }
    return max;
  }

  /** Solve the three sum problem in an array. a+b+c = 0 , Time Complexity : linear time O(n)* */
  ArrayList<int[]> threeSum(int[] arr) {
    ArrayList<int[]> result = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 3; i++) {
      if (i == 0 || arr[i] > arr[i - 1]) {
        int start = i + 1;
        int end = arr.length - 1;
        while (start < end) {
          if (arr[i] + arr[start] + arr[end] == 0) {
            result.add(new int[] {arr[i], arr[start], arr[end]});
          }
          if (arr[i] + arr[start] + arr[end] < 0) {
            int currentStart = start;
            while (arr[currentStart] == arr[start]) start++;
          } else {
            int currentEnd = end;
            while (arr[currentEnd] == arr[end]) end--;
          }
        }
      }
    }
    return result;
  }

  /** Find the only repetitive element between 1 to n-1 Solution: */

  /**
   * find all of the duplicate elements. Given an array of n elements which contains elements from 0
   * to n-1, Brute Force = O(N^2) Hashset = O(N) time complexity and O(N) space complexity
   */
  ArrayList<Integer> findAllDuplicate(int[] array) {
    Set<Integer> resultSet = new HashSet<Integer>();

    for (int i = 0; i < array.length; i++) {
      int index = Math.abs(array[i]) - 1;
      if (array[index] < 0) {
        resultSet.add(array[i]);
      } else array[index] = -array[index];
    }
    return new ArrayList(resultSet);
  }

  /**
   * 1) Initialize start and end indexes as start = 0, end = n-1 2) Swap arr[start] with arr[end] 3)
   */
  public void printReverse(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i]);
  }

  /**
   * alternative peak and valley algorithm. Given an unsorted array of integers, sort the array into
   * a wave like array. An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2]
   * >= arr[3] <= arr[4] >= …..
   *
   * <p>Examples:
   *
   * <p>Input: arr[] = {10, 5, 6, 3, 2, 20, 100, 80} Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
   * OR {20, 5, 10, 2, 80, 6, 100, 3} OR any other array that is in wave form.
   */
}
