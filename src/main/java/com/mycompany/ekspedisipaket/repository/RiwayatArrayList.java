/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekspedisipaket.repository;

import com.mycompany.ekspedisipaket.model.Pengiriman;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syahrilfarhan
 */
public class RiwayatArrayList implements RiwayatRepository{
    private final List<Pengiriman> daftar = new ArrayList<>();
    
    @Override
    public void simpan(Pengiriman pengiriman){
        daftar.add(pengiriman);
    }
    
    @Override
    public List<Pengiriman> ambilSemua(){
        return List.copyOf(daftar);
    }
}
