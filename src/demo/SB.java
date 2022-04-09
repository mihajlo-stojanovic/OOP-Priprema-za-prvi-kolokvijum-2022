package demo;

import java.util.ArrayList;
import java.util.List;

public class SB {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Object object : objects) {
            sb.append(object);
        }
        System.out.println(sb.toString());
    }
}
