package gangs.of.four.structural.adapter.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SorterListAdapter implements Sorter {

    private NumberSorter numberSorter;

    public SorterListAdapter(){
        numberSorter = new NumberSorter();
    }

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> integer = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        numberSorter.sortList(integer);
        return integer.stream().mapToInt(i->i).toArray();
    }
}
