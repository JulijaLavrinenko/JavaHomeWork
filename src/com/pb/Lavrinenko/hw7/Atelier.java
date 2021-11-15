package com.pb.Lavrinenko.hw7;

import static com.pb.Lavrinenko.hw7.Size.*;

public class Atelier {
    public static void main(String[] args) {

        Clothes.Tshirt tshirt = new Clothes.Tshirt(XXS, 100, "синий");
        Clothes.Pants pants = new Clothes.Pants(XS, 150, "желтый");
        Clothes.Skirt skirt = new Clothes.Skirt(S, 200, "черный");
        Clothes.Tie tie = new Clothes.Tie(L, 50, "красный");

        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt,tie};
        dressMan(clothes);
        dressWomen(clothes);
    }

    static void dressMan(Clothes[] clothes){
        for (Clothes cl : clothes) {
               if (cl instanceof ManClothes){
                 ((ManClothes) cl).dressMan();
               }
        }

    }
    static void dressWomen(Clothes[] clothes){
        for (Clothes cl : clothes) {
            if (cl instanceof WomenClothes){
                ((WomenClothes) cl).dressWomen();
            }
        }
    }
}
