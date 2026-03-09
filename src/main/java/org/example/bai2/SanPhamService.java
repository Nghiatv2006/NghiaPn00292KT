package org.example.bai2;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> ds = new ArrayList<>();

    public boolean themMoi(SanPham sp) {
        for (SanPham p : ds) {
            if (p.getMa().equals(sp.getMa())) {
                return false;
            }
        }
        if (sp.getSoLuong() < 1 || sp.getSoLuong() > 100) {
            return false;
        }
        return ds.add(sp);
    }
}

