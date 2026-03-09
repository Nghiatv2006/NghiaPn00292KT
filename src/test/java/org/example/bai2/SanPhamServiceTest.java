package org.example.bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    SanPhamService service;

    @BeforeEach
    void setUp() {
        service = new SanPhamService();
    }

    @Test
    void Oke(){
        SanPham sp = new SanPham("2","laptop",2026,20000,5,"dt");
        assertTrue(service.themMoi(sp));
    }

    @Test
    void Oke1(){
        SanPham sp = new SanPham("2","laptop",2026,20000,7,"dt");
        assertTrue(service.themMoi(sp));
    }

    @Test
    void Oke2(){
        SanPham sp = new SanPham("2","laptop",2026,20000,9,"dt");
        assertTrue(service.themMoi(sp));
    }

    @Test
    void Oke3(){
        SanPham sp = new SanPham("2","laptop",2026,20000,11,"dt");
        assertTrue(service.themMoi(sp));
    }

    @Test
    void Oke4(){
        SanPham sp = new SanPham("2","laptop",2026,20000,99,"dt");
        assertTrue(service.themMoi(sp));
    }

    @Test
    void Trung(){
        SanPham sp = new SanPham("1","laptop",2026,20000,5,"dt");
        SanPham sp1 = new SanPham("1","laptop",2026,20000,5,"dt");
        service.themMoi(sp);
        assertFalse(service.themMoi(sp1));
    }
}