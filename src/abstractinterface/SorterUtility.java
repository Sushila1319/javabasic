package abstractinterface;

public class SorterUtility extends AbstractSorter {
    @Override
    public void sortNumbers() {

        //use sorting method (Swap method)
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                //Reset the index value;
                i = -1;

            }
        }

    }
    }