package com.learning_java.day5;

public class JewelleryBox {
    private Jewellery jewellery;
    private JewelleryBox jewelleryBox;

    public JewelleryBox(){

    }

    public JewelleryBox(JewelleryBox jewelleryBox) {
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox(Jewellery jewellery) {
        this.jewellery = jewellery;
    }

    public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
        this.jewellery = jewellery;
        this.jewelleryBox = jewelleryBox;
    }

    public boolean doesHaveAJewellery(){
        return jewellery != null;
    }

    public boolean doesHaveAJewelleryBox(){
        return jewelleryBox != null;
    }

    public int getJewelleriesCount() {
        if(this.doesHaveAJewellery() && this.doesHaveAJewelleryBox()){
            return 1 + this.jewelleryBox.getJewelleriesCount();
        }

        if(this.doesHaveAJewelleryBox()){
            return this.jewelleryBox.getJewelleriesCount();
        }

        if(this.doesHaveAJewellery()){
            return 1;
        }

        return 0;
    }
}
