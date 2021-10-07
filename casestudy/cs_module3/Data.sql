DROP DATABASE furama;

CREATE DATABASE furama;

USE furama;

CREATE TABLE vi_tri (
    id_vitri INT PRIMARY KEY AUTO_INCREMENT,
    ten_vitri VARCHAR(45) NOT NULL
);

CREATE TABLE trinh_do (
    id_trinhdo INT PRIMARY KEY AUTO_INCREMENT,
    ten_trinhdo VARCHAR(45) NOT NULL
);

CREATE TABLE bo_phan (
    id_bophan INT PRIMARY KEY AUTO_INCREMENT,
    ten_bophan VARCHAR(45) NOT NULL
);

CREATE TABLE nhan_vien (
    id_nhanvien INT PRIMARY KEY AUTO_INCREMENT,
    hoten_nhanvien VARCHAR(45) NOT NULL,
    id_vitri INT NOT NULL,
    id_trinhdo INT NOT NULL,
    id_bophan INT NOT NULL,
    FOREIGN KEY (id_vitri) REFERENCES vi_tri (id_vitri) on update cascade on delete cascade,
    FOREIGN KEY (id_trinhdo) REFERENCES trinh_do (id_trinhdo) on update cascade on delete cascade,
    FOREIGN KEY (id_bophan) REFERENCES bo_phan (id_bophan) on update cascade on delete cascade,
    ngay_sinh DATE NOT NULL,
    so_cmnd VARCHAR(45) NOT NULL,
    luong INT NOT NULL,
    sdt VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    dia_chi VARCHAR(45) NOT NULL
);

CREATE TABLE loai_khach (
    id_loaikhach INT PRIMARY KEY AUTO_INCREMENT,
    ten_loaikhach VARCHAR(45) NOT NULL
);

CREATE TABLE khach_hang (
    id_khachhang INT PRIMARY KEY AUTO_INCREMENT,
    id_loaikhach INT NOT NULL,
    FOREIGN KEY (id_loaikhach) REFERENCES loai_khach (id_loaikhach) on update cascade on delete cascade,
    hoten_khachhang VARCHAR(45) NOT NULL,
    ngay_sinh DATE NOT NULL,
    so_cmnd VARCHAR(45) NOT NULL,
    sdt VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    dia_chi VARCHAR(255) NOT NULL
);

CREATE TABLE kieu_thue (
    id_kieuthue INT PRIMARY KEY AUTO_INCREMENT,
    ten_kieuthue VARCHAR(45) NOT NULL,
    gia INT NOT NULL
);

CREATE TABLE loai_dichvu (
    id_loaidichvu INT PRIMARY KEY AUTO_INCREMENT,
    ten_loaidichvu VARCHAR(45) NOT NULL
);

CREATE TABLE dich_vu (
    id_dichvu INT PRIMARY KEY AUTO_INCREMENT,
    ten_dichvu VARCHAR(45) NOT NULL,
    dien_tich INT NOT NULL,
    so_tang INT NOT NULL,
    songuoi_toida INT NOT NULL,
    chiphi_thue INT NOT NULL,
    id_kieuthue INT NOT NULL,
    id_loaidichvu INT NOT NULL,
    FOREIGN KEY (id_kieuthue) REFERENCES kieu_thue (id_kieuthue) on update cascade on delete cascade,
    FOREIGN KEY (id_loaidichvu) REFERENCES loai_dichvu (id_loaidichvu) on update cascade on delete cascade,
    trang_thai VARCHAR(45) NOT NULL
);

CREATE TABLE hop_dong (
    id_hopdong INT PRIMARY KEY AUTO_INCREMENT,
    id_nhanvien INT NOT NULL,
    id_khachhang INT NOT NULL,
    id_dichvu INT NOT NULL,
    FOREIGN KEY (id_nhanvien) REFERENCES nhan_vien (id_nhanvien) on update cascade on delete cascade,
    FOREIGN KEY (id_khachhang) REFERENCES khach_hang (id_khachhang) on update cascade on delete cascade,
    FOREIGN KEY (id_dichvu) REFERENCES dich_vu (id_dichvu) on update cascade on delete cascade,
    ngaylam_hopdong DATE NOT NULL,
    ngay_ketthuc DATE NOT NULL,
    tien_datcoc INT NOT NULL,
    tong_tien INT
);

CREATE TABLE dichvu_dikem (
    id_dichvu_dikem INT PRIMARY KEY AUTO_INCREMENT,
    ten_dichvu_dikem VARCHAR(45) NOT NULL,
    gia INT NOT NULL,
    donvi INT NOT NULL,
    trangthai_khadung VARCHAR(45) NOT NULL
);

CREATE TABLE hopdong_chitiet (
    id_hopdong_chitiet INT PRIMARY KEY AUTO_INCREMENT,
    id_hopdong INT NOT NULL,
    id_dichvu_dikem INT NOT NULL,
    FOREIGN KEY (id_hopdong) REFERENCES hop_dong (id_hopdong) on update cascade on delete cascade,
    FOREIGN KEY (id_dichvu_dikem) REFERENCES dichvu_dikem (id_dichvu_dikem) on update cascade on delete cascade,
    so_luong INT NOT NULL
);

INSERT INTO vi_tri (ten_vitri)
VALUES
('Lễ tân'),
('Phục vụ'),
('Chuyên viên'),
('Giám sát'),
('Quản lý'),
('Giám đốc');

INSERT INTO trinh_do (ten_trinhdo)
VALUES
('Trung cấp'),
('Cao đẳng'),
('Đại học'),
('Sau đại học');


INSERT INTO bo_phan (ten_bophan)
VALUES
('Sale - Marketing'),
('Hành chính'),
('Phục vụ'),
('Quản lý');


INSERT INTO nhan_vien (hoten_nhanvien, id_vitri, id_trinhdo, id_bophan, ngay_sinh, so_cmnd, luong, sdt, email, dia_chi)
VALUES
('Ngô Văn Nam', 3, 2, 1, '1990-03-05', '4242423423', 7000000, '0382948989', 'Nam@gmail.com', 'Đà Nẵng'),
('Nguyễn Thị Hoa', 2, 1, 3, '1995-09-08', '4535353543', 5000000, '0943583989', 'Hoa@gmail.com', 'Hà Nội'),
('Nguyễn Minh Đức', 6, 3, 4, '1980-06-07', '4242423424', 100000000, '0382948987', 'Duc@gmail.com', 'Sài Gòn'),
('Nguyễn Thị Phượng', 2, 2, 3, '1970-05-05', '4242423425', 500000, '0945345564', 'Phuong@gmail.com', 'Vinh'),
('Ngô Văn Quang', 3, 4, 3, '1975-06-06', '4242423426', 500000, '0342434434', 'Quang@gmail.com', 'Đà Nẵng');



INSERT INTO loai_khach (ten_loaikhach)
VALUES
('Diamond'),
('Platinium'),
('Gold'),
('Silver'),
('Member');


INSERT INTO khach_hang (id_loaikhach, hoten_khachhang, ngay_sinh, so_cmnd, sdt, email, dia_chi)
VALUES
(3, 'Nguyễn Văn Hải', '1994-03-11', '4242424242', '0134543543', 'Hai@gmail.com', 'Đà Nẵng'),
(2, 'Nguyễn Thị Hồng', '1995-04-11', '4242424243', '0134543544', 'Hong@gmail.com', 'Hà Nội'),
(1, 'Lý Văn Khoa', '1995-04-12', '4242424244', '0134543545', 'Khoa@gmail.com', 'Vinh'),
(1, 'Nguyễn Thành Nam', '1990-03-03', '4242424245', '0954454343', 'Nam@gmail.com', 'Hà Nội'),
(4, 'Nguyễn Thị Hồng', '1992-04-04', '4242424246', '0234545454', 'NTHong@gmail.com', 'Quảng Ngãi');


INSERT INTO kieu_thue (ten_kieuthue, gia)
VALUES
('Năm', 500000000),
('Tháng', 100000000),
('Ngày', 50000000),
('Giờ', 1000000);

INSERT INTO loai_dichvu (ten_loaidichvu)
VALUES
('Villa'),
('House'),
('Room');



INSERT INTO dich_vu (ten_dichvu, dien_tich, so_tang, songuoi_toida, chiphi_thue, id_kieuthue, id_loaidichvu, trang_thai)
VALUES
('Villa 1', 100, 3, 6, 1000000, 1, 1, 'Unavailable'),
('House 1', 50, 2, 4, 500000, 1, 2, 'Availability'),
('Room 1', 25, 1, 2, 150000 , 1, 3, 'Availability'),
('Villa 2', 100, 3, 6, 1000000, 1, 1, 'Availability');


INSERT INTO hop_dong (id_nhanvien, id_khachhang, id_dichvu, ngaylam_hopdong, ngay_ketthuc, tien_datcoc)
VALUES
(1, 3, 1, '2021-05-05', '2021-06-05', 1000000),
(2, 2, 2, '2021-06-04', '2021-07-07', 1500000),
(3, 1, 1, '2021-10-02', '2021-11-03', 2000000),
(2, 4, 4, '2019-03-03', '2019-04-03', 2000000),
(5, 3, 4, '2015-04-04', '2015-05-04', 2000000);



INSERT INTO dichvu_dikem (ten_dichvu_dikem, gia, donvi, trangthai_khadung)
VALUES
('Massage', 500000, 1, 'Availability'),
('Karaoke', 300000, 1, 'Availability'),
('Thức ăn', 150000, 1, 'Availability'),
('Nước uống', 50000, 1, 'Availability'),
('Thuê xe', 1000000, 1, 'Availability');




INSERT INTO hopdong_chitiet (id_hopdong, id_dichvu_dikem, so_luong)
VALUES
(1, 5, 2),
(2, 4, 4),
(3, 2, 5),
(2, 2, 3),
(4, 5, 1);


