package kr.ac.hs.coffeeapp;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of Drinks
    public static final Food[] foods = {
            new Food("Tteok-bokki", "Tteok-bokki or stir-fried rice cakes is " +
                    "a popular Korean food made from small-sized garae-tteok",
                    R.drawable.tteok_bokki),
            new Food("soy crab", "Gejang or gejeot is a variety of jeotgal, " +
                    "salted fermented seafood in Korean cuisine, which is made by marinating " +
                    "fresh raw crabs either in ganjang " +
                    "(soy sauce) or in a sauce based on chili pepper powder. ", R.drawable.soy_crab),
            new Food("selongtang", "설렁탕(영어: Seolleongtang 또는 ox bone soup)은 " +
                    "소의 머리, 내장, 뼈다귀, 발, 도가니(무릎 뒤 오목하게 들어간 부위로 사람의 경우는 오금이라 부름) " +
                    "따위를 푹 삶아서 만든 국 또는 우려낸 국물에 밥을 말아 먹는 음식이다.", R.drawable.selongtang),
            new Food("stake", "A steak (/ˈsteɪk/) is a meat generally sliced " +
                    "across the muscle fibers, potentially including a bone. Exceptions, " +
                    "in which the meat is sliced parallel to the fibers, " +
                    "include the skirt steak cut from the plate, the flank steak cut from the abdominal muscles, and " +
                    "the Silverfinger steak cut from the loin and includes three rib bones. ", R.drawable.stake),
    };

    //Each Drink has a name, description, and an image resource
    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }


}
