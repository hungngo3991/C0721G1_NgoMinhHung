USE furama;


-- Task 12
SELECT hd.id_hopdong, nv.hoten_nhanvien, kh.hoten_khachhang, kh.sdt, dv.ten_dichvu,
COUNT(hdct.id_dichvu_dikem) AS soluong_dichvu_dikem
FROM hop_dong hd JOIN nhan_vien nv ON hd.id_nhanvien = nv.id_nhanvien
JOIN khach_hang kh ON hd.id_khachhang = kh.id_khachhang
JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong
JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
WHERE dv.id_dichvu IN (SELECT dv.id_dichvu FROM dich_vu dv JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu 
WHERE (QUARTER(hd.ngaylam_hopdong) = 4) AND (YEAR(hd.ngaylam_hopdong) = 2019))
AND dv.id_dichvu NOT IN (SELECT dv.id_dichvu FROM dich_vu dv JOIN hop_dong hd ON dv.id_dichvu = hd.id_dichvu
WHERE(QUARTER(hd.ngaylam_hopdong) = 1 OR QUARTER(hd.ngaylam_hopdong) = 2) AND (YEAR(hd.ngaylam_hopdong) = 2019))
GROUP BY hdct.id_hopdong;




-- Task 13 
SELECT hdct.id_dichvu_dikem, dvdk.ten_dichvu_dikem, COUNT(hdct.id_dichvu_dikem) AS solan_sudung
FROM hopdong_chitiet hdct JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
GROUP BY hdct.id_dichvu_dikem
HAVING COUNT(hdct.id_dichvu_dikem) >= ALL (SELECT COUNT(hdct.id_dichvu_dikem) FROM hopdong_chitiet hdct GROUP BY hdct.id_dichvu_dikem);
    

-- Task 14
SELECT hd.id_hopdong, ldv.ten_loaidichvu, dvdk.ten_dichvu_dikem, COUNT(hdct.id_dichvu_dikem) AS solan_sudung
FROM hop_dong hd JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
JOIN loai_dichvu ldv ON dv.id_loaidichvu = ldv.id_loaidichvu
JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong 
JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
GROUP BY dvdk.id_dichvu_dikem
HAVING COUNT(hdct.id_dichvu_dikem) = 1;


-- Task 15
SELECT nv.id_nhanvien, nv.hoten_nhanvien, td.ten_trinhdo, bp.ten_bophan, nv.sdt, nv.dia_chi, COUNT(hd.id_hopdong) AS soluong_hopdong
FROM nhan_vien nv JOIN trinh_do td ON nv.id_trinhdo = td.id_trinhdo
JOIN bo_phan bp ON nv.id_bophan = bp.id_bophan
JOIN hop_dong hd ON nv.id_nhanvien = hd.id_nhanvien
WHERE YEAR(hd.ngaylam_hopdong) BETWEEN 2018 AND 2019
GROUP BY nv.id_nhanvien
HAVING COUNT(hd.id_hopdong) <= 3;

-- Task 16
SET SQL_SAFE_UPDATES = 0;
DELETE FROM nhan_vien 
WHERE id_nhanvien NOT IN (SELECT id_nhanvien FROM (SELECT nv.id_nhanvien FROM nhan_vien nv 
JOIN hop_dong hd  ON nv.id_nhanvien = hd.id_nhanvien
WHERE YEAR(hd.ngaylam_hopdong) BETWEEN 2017 AND 2019 
GROUP BY nv.id_nhanvien
HAVING COUNT(hd.id_hopdong) > 0) as so_lan_lap_hop_dong);

SET SQL_SAFE_UPDATES = 1;




