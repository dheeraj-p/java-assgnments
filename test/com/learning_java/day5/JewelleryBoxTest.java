package com.learning_java.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelleryBoxTest {
    @Test
    void shouldReturn2JewelleriesInsideAJewelleryBox() {
        Jewellery diamond_ring = new Jewellery("Diamond Ring");
        JewelleryBox jewelleryBox = new JewelleryBox(diamond_ring);
        Jewellery necklace = new Jewellery("necklace");
        JewelleryBox jewelleryBox1 = new JewelleryBox(necklace, jewelleryBox);

        assertEquals(2,jewelleryBox1.getJewelleriesCount());
    }

    @Test
    void shouldReturnJewelleriesCountInsideAJewelleryBox() {
        JewelleryBox smallestJwellryBox = new JewelleryBox();

        Jewellery jewelleryInBiggest = new Jewellery("gold");
        JewelleryBox smallerBox = new JewelleryBox(jewelleryInBiggest, smallestJwellryBox);

        JewelleryBox biggestBox = new JewelleryBox(jewelleryInBiggest, smallerBox);
        assertEquals(2,biggestBox.getJewelleriesCount());
    }


    @Test
    void name() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        JewelleryBox _3rdLevelBox = new JewelleryBox(nacklace, _4thLevelBox);

        Jewellery ring = new Jewellery("ring");
        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelleriesCount());
    }
}