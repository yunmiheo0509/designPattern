package com.company;

import com.company.builder.Text;

public class Main {

    public static void main(String[] args) {
        Text text = new Text.Builder()
                .setTeitle("hello")
                .setContent("CONTENT")
                .setItem("항목1", "항목2", "항목3")
                .build();
        System.out.println(text);

    }
}
