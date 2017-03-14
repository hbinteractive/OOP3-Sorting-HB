package model;

import java.util.ArrayList;

/**
 * BubbleSort subclass of the Algorithm interface. Peforms 1 step of the BubbleSort algorithm.
 */
public class BubbleSort implements Algorithm {

    private int sortingPosition;
    private int lengthOfList;
    private ArrayList<Integer> listToSort;
    private boolean isSorted;


    public BubbleSort(ArrayList<Integer> list) {
        listToSort = list;
        sortingPosition = 0;
        lengthOfList = list.size();
        isSorted = false;
    }

    /**
     * Performs 1 step of the BubbleSort Algorithm.
     *
     * @return listToSort, a partly sorted ArrayList.
     */
    @Override
    public ArrayList<Integer> step() {

        if (lengthOfList <= 1) {
            isSorted = true;
        }

        if (sortingPosition < (lengthOfList - 1)) {
            int first = listToSort.get(sortingPosition);
            int second = listToSort.get(sortingPosition + 1);

            if (first > second) {
                listToSort.set(sortingPosition, second);
                listToSort.set((sortingPosition + 1), first);
            }
            sortingPosition++;

        } else {
            sortingPosition = 0;
            lengthOfList--;
        }
        return listToSort;
    }

    /**
     * Boolean method specifying if BarChart values are sorted or not.
     *
     * @return true when sorted.
     */
    @Override
    public boolean isSorted() {
        return isSorted;
    }
}
