package com.pb.Lavrinenko.hw7;

public abstract class Clothes {
    Size size;
    float price;
    String color;

    public static class Tshirt extends  Clothes implements ManClothes,WomenClothes {
        public Tshirt(Size size, float price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        @Override
        public void dressWomen(){
            System.out.println("Женская рубашка, размер: "+this.size+"("+this.size.euroSize+"),"+this.size.description+", стоимостью: "+this.price+", в цвете: "+this.color);
        };

        @Override
        public void dressMan(){
            System.out.println("Мужская рубашка, размер: "+this.size+"("+this.size.euroSize+"),"+this.size.description+", стоимостью: "+this.price+", в цвете: "+this.color);
        };

    }

    public static class Pants  extends  Clothes implements ManClothes,WomenClothes {

        public Pants(Size size, float price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        @Override
        public void dressWomen(){
            System.out.println("Женские штаны, размер: " + this.size +"("+this.size.euroSize+"),"+this.size.description+ ", стоимостью: " + this.price + ", в цвете: " + this.color);
        }
        ;

        @Override
        public void dressMan(){
            System.out.println("Мужские штаны, размер: " + this.size + "("+this.size.euroSize+"),"+this.size.description+", стоимостью: " + this.price + ", в цвете: " + this.color);
        }
        ;
    }
    public static class Skirt extends  Clothes implements WomenClothes {

        public Skirt(Size size, float price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        @Override
        public void dressWomen(){
            System.out.println("Юбка, размер: "+this.size+"("+this.size.euroSize+"),"+this.size.description+", стоимостью: "+this.price+", в цвете: "+this.color);
        };

    }

    public static class Tie extends  Clothes implements ManClothes {
        public Tie(Size size, float price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }
        @Override
        public void dressMan(){
            System.out.println("Галстук, размер: "+this.size+"("+this.size.euroSize+"),"+this.size.description+", стоимостью: "+this.price+", в цвете: "+this.color);
        };

    }

}
