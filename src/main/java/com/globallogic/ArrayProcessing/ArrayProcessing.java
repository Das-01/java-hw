package com.globallogic.ArrayProcessing;

import java.util.Arrays;

public class ArrayProcessing {

    /**
     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
     * <p>
     * Examples:
     * input array - [1, 2, 5, 2, 4]
     * output array - [1, 2, 5, 4]
     * <p>
     * input array - [2, 3, 2, 3]
     * output array - [2, 3]
     *
     * @param arr - array with elements
     * @return - array with elements that don't have duplicates
     */
    public int[] uniqueElements(int[] arr) {

        int[] arrNoDuplicates = new int[arr.length];
        int elementUnique = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!findElement(arrNoDuplicates, arr[i])) {
                arrNoDuplicates[elementUnique] = arr[i];
                elementUnique++;
            }
        }
        return Arrays.copyOf(arrNoDuplicates, elementUnique);
    }


    /**
     * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
     * <p>
     * Example:
     * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
     * output array - [2, 3, 4, 7]
     *
     * @param arr1 - first input array with unique elements
     * @param arr2 - second input array with unique elements
     * @return array with not common elements from input arrays
     */
    public boolean findElement(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++ ) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public int[] findUniqueElementIntArray(int[] arrayToInvestigate, int[] arrToIterate, boolean unique) {
        int[] resultArray = new int[arrToIterate.length];
        int elementsInResultArray = 0;

        for (int i = 0; i < arrToIterate.length; i++) {
            boolean elementExist = findElement(arrayToInvestigate, arrToIterate[i]);
            if (unique ? elementExist : !elementExist) {
                resultArray[elementsInResultArray] = arrToIterate[i];
                elementsInResultArray++;
            }
        }
        return Arrays.copyOf(resultArray, elementsInResultArray);
    }

    public int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] resultArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, resultArray, 0, arr1.length);
        System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);

        return resultArray;
    }

    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] uniqueElementsFirstArray = findUniqueElementIntArray(arr1, arr2, false);
        int[] uniqueElementsSecondArray = findUniqueElementIntArray(arr2, arr1, false);

        int[] resultArray = concatenateArrays(uniqueElementsFirstArray,uniqueElementsSecondArray);
        return resultArray;
    }

    /**
     * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
     * <p>
     * Example:
     * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
     * output array - [2, 3]
     *
     * @param arr1 - first input array with unique elements
     * @param arr2 - second input array with unique elements
     * @return array with common elements from first and second arrays
     */

    public int[] commonElements(int[] arr1, int[] arr2) {
        int[] recurringElementsFirstArray = findUniqueElementIntArray(arr1, arr2, true);
        int[] recurringElementsSecondArray = findUniqueElementIntArray(arr2, arr1, true);

        int[] resultArray = concatenateArrays(recurringElementsFirstArray,recurringElementsSecondArray);
        return uniqueElements(resultArray);
        }

    /**
     * Implement the method that reverses input array in the opposite order
     * <p>
     * Example:
     * input array - [1, 2, 3, 4]
     * output array - [4, 3, 2, 1]
     *
     * @param arr - input array
     * @return array with opposite ordering of elements
     */
    public int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = (result.length - 1); i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }

    /**
     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
     * <p>
     * Example:
     * input array - [3, 7, 1, 4, 2]
     * output array - [1, 7, 2, 4, 3]
     *
     * @param arr - input array
     * @return - sorted array of elements on even positions
     */
    public int[] sortEvenPositionArray(int[] arr) {
        int[] arrForEven = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i+=2) {
            arrForEven[j] = arr[i];
            j++;
        }
        int[] newArrForEven = Arrays.copyOf(arrForEven, j);
        Arrays.sort(newArrForEven);

        for (int i = 0, k = 0; i < arr.length; i+=2) {
            arr[i] = newArrForEven[k];
            k++;
        }

        return arr;
    }
}
