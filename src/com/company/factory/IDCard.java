package com.company.factory;

public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "님의 카드를 사용합니다.");
    }

    //이건 결합도는 낮추지만 내가 코딩의 편의성을 위해,, static으로 함으로써 서로관계는 없음
    public static class Factory{
        public static IDCard create(String owner) {
            return new IDCard(owner);
        }
    }
}
