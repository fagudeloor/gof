package gangs.of.four.structural.adapter.numbers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberSorter {
    public List<Integer> sortList(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }
}
