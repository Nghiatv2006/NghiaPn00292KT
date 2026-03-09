package org.example.bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {

    @Test
    void tongLeDung(){
        assertEquals(250000,Bai1.tongle());
    }

    @Test
    void lonHonKo(){
        assertTrue(Bai1.tongle()>0);
    }

    @Test
    void khongAm(){
        assertTrue(Bai1.tongle()>=0);
    }

    @Test
    void tongKhongVuot(){
        assertTrue(Bai1.tongle() <=250000);
    }

    @Test
    void tongKhongSai(){
        assertNotEquals(1000,Bai1.tongle());
    }

}