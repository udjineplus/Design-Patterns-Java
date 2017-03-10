package creational.builder.product;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<HousePart> parts = new ArrayList<>();

    public void add(HousePart part) {
        parts.add(part);
    }


    public void sout() {
        for(HousePart part : parts) {
            System.out.println(part);
        }
    }
}
