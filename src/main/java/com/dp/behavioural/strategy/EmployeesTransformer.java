package com.dp.behavioural.strategy;

import java.util.List;

public class EmployeesTransformer implements Transformer {

    private List<String> employees;
    // Composition is used instead of inheritance or code duplication
    private SortStratergy sorter;

    EmployeesTransformer() {
        this.sorter = new BubbleSort();
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public void transform() {
        // sort as a part of tranformation
        sorter.sort();
    }

    public void setSorter(SortStratergy sorter) {
        this.sorter = sorter;
    }
}
