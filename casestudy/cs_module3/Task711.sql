USE furama;

-- Task 7
SELECT dv.id_dichvu, dv.ten_dichvu, dv.dien_tich, dv.songuoi_toida, dv.chiphi_thue, ldv.ten_loaidichvu
FROM dich_vu dv JOIN loai_dichvu ldv ON dv.id_loaidichvu = ldv.id_loaidichvu
JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE dv.id_dichvu IN (SELECT dv.id_dichvu FROM dich_vu dv JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE YEAR(hd.ngaylam_hopdong) = 2018)
AND dv.id_dichvu NOT IN (SELECT dv.id_dichvu FROM dich_vu dv JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE YEAR(hd.ngaylam_hopdong) = 2019);

-- Task 8
-- Cách 1
SELECT hoten_khachhang FROM khach_hang 
UNION 
SELECT hoten_khachhang FROM khach_hang;
-- Cách 2
SELECT hoten_khachhang FROM khach_hang
GROUP BY hoten_khachhang;
-- Cách 3
SELECT DISTINCT hoten_khachhang
FROM khach_hang;


-- Task 9
SELECT MONTH(hd.ngaylam_hopdong) AS thang,
SUM(dv.chiphi_thue + dvdk.gia * dvdk.donvi) AS doanh_thu,
COUNT(hd.id_khachhang) AS so_khachhang_datphong
FROM hop_dong hd JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong
JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
WHERE YEAR(hd.ngaylam_hopdong) = 2019
GROUP BY MONTH(hd.ngaylam_hopdong)
ORDER BY MONTH(hd.ngaylam_hopdong);



-- Task 10 
SELECT hd.id_hopdong, hd.ngaylam_hopdong, hd.ngay_ketthuc, hd.tien_datcoc,
COUNT(hdct.id_dichvu_dikem) AS soluong_dichvu_dikem
FROM hop_dong hd JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong
JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
GROUP BY hdct.id_hopdong;



-- Task 11
SELECT dvdk.*
FROM dichvu_dikem dvdk JOIN hopdong_chitiet hdct ON dvdk.id_dichvu_dikem = hdct.id_dichvu_dikem
JOIN hop_dong hd ON hdct.id_hopdong =hd.id_hopdong
JOIN khach_hang kh ON hd.id_khachhang = kh.id_khachhang
JOIN loai_khach lk ON kh.id_loaikhach = lk.id_loaikhach
WHERE lk.ten_loaikhach = 'Diamond' AND (kh.dia_chi = 'Vinh' OR kh.dia_chi = 'Quảng Ngãi');

