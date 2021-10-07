CREATE DATABASE QuanLyHangHoa;

USE QuanLyHangHoa;

CREATE TABLE PhieuXuat (
    so_px INT PRIMARY KEY,
    ngay_xuat DATE
);

CREATE TABLE VatTu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(20)
);

CREATE TABLE ChiTietPhieuXuat (
    so_px INT,
    ma_vat_tu INT,
    PRIMARY KEY (so_px , ma_vat_tu),
    dg_xuat FLOAT,
    sl_xuat INT,
    FOREIGN KEY (so_px) REFERENCES PhieuXuat (so_px),
    FOREIGN KEY (ma_vat_tu) REFERENCES VatTu (ma_vat_tu)
);

CREATE TABLE PhieuNhap (
    so_pn INT PRIMARY KEY,
    ngay_nhap DATE
);

CREATE TABLE ChiTietPhieuNhap (
    so_pn INT,
    ma_vat_tu INT,
    PRIMARY KEY (so_pn , ma_vat_tu),
    dg_nhap FLOAT,
    sl_nhap INT,
    FOREIGN KEY (so_pn) REFERENCES PhieuNhap (so_pn),
    FOREIGN KEY (ma_vat_tu) REFERENCES VatTu (ma_vat_tu)
);

CREATE TABLE NhaCungCap (
    ma_ncc INT PRIMARY KEY,
    ten_ncc VARCHAR(20),
    dia_chi VARCHAR(20),
    so_dt INT
);

CREATE TABLE DonDatHang (
    so_dh INT PRIMARY KEY,
    ngay_dh DATE,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc) REFERENCES NhaCungCap (ma_ncc)
);

CREATE TABLE ChiTietDonDatHang (
    ma_vat_tu INT,
    so_dh INT,
    PRIMARY KEY (ma_vat_tu , so_dh),
    FOREIGN KEY (ma_vat_tu) REFERENCES VatTu (ma_vat_tu),
    FOREIGN KEY (so_dh) REFERENCES DonDatHang (so_dh)
);