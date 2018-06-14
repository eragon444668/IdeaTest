package cn.cairenhui.eragon;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.of(new Integer[]{1,2,3,4}).forEach(a-> System.out.println(a));
    }
}
