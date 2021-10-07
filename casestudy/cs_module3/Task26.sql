USE furama;


-- Task 2
SELECT * FROM nhan_vien WHERE (hoten_nhanvien LIKE 'H%'
OR hoten_nhanvien LIKE 'T%' OR hoten_nhanvien LIKE 'K%')
AND CHAR_LENGTH(hoten_nhanvien) <= 15;


-- Task 3
SELECT * FROM khach_hang
WHERE(TIMESTAMPDIFF(YEAR, ngay_sinh, CURDATE()) BETWEEN 18 AND 50)
AND (dia_chi = 'Đà Nẵng' OR dia_chi = 'Quảng Trị');
        

-- Task 4
SELECT kh.hoten_khachhang, lk.ten_loaikhach, COUNT(hd.id_dichvu) AS solan_datphong
FROM khach_hang kh JOIN loai_khach lk ON kh.id_loaikhach = lk.id_loaikhach
JOIN hop_dong hd ON kh.id_khachhang = hd.id_khachhang
JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
WHERE lk.ten_loaikhach = 'Diamond'
GROUP BY kh.id_khachhang
ORDER BY solan_datphong;

-- Task 5
SELECT kh.id_khachhang, kh.hoten_khachhang, lk.ten_loaikhach, hd.id_hopdong, dv.ten_dichvu, hd.ngaylam_hopdong, hd.ngay_ketthuc,
SUM(dv.chiphi_thue + dvdk.gia * dvdk.donvi) AS tong_tien
FROM khach_hang kh LEFT JOIN hop_dong hd ON kh.id_khachhang = hd.id_khachhang
LEFT JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
LEFT JOIN loai_khach lk ON kh.id_loaikhach = lk.id_loaikhach
LEFT JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong
LEFT JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
GROUP BY kh.id_khachhang;

-- Task 6
SELECT DISTINCT dv.id_dichvu, dv.ten_dichvu, dv.dien_tich, dv.chiphi_thue, ldv.ten_loaidichvu
FROM dich_vu dv JOIN loai_dichvu ldv ON dv.id_loaidichvu = ldv.id_loaidichvu
JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE dv.id_dichvu NOT IN (SELECT dv.id_dichvu FROM dich_vu dv JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE (QUARTER(hd.ngaylam_hopdong) = 1) AND (YEAR(hd.ngaylam_hopdong) = 2019));