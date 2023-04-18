package com.stc.petlove.dtos.dichvu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GiaDichVuDTO {

    private String id;

    private String loaiThuCungId;

    @JsonProperty("can_nang_tu")
    private double canNangTu;

    @JsonProperty("can_nang_den")
    private double canNangDen;

    private double gia;

    public GiaDichVuDTO(String loaiThuCungId, double canNangTu, double canNangDen, double gia) {
        this.loaiThuCungId = loaiThuCungId;
        this.canNangTu = canNangTu;
        this.canNangDen = canNangDen;
        this.gia = gia;
    }
}