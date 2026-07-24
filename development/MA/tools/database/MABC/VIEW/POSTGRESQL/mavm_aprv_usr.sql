SELECT
	mavm_aprv_usr_mam_usr_acl_m.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m.aprv_role_cd AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m.st_dt,
	mavm_aprv_usr_mam_usr_acl_m.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m.memo1,
	mavm_aprv_usr_mam_usr_acl_m.memo2,
	mavm_aprv_usr_mam_usr_acl_m.memo3,
	mavm_aprv_usr_mam_usr_acl_m.del_flg,
	mavm_aprv_usr_mam_usr_acl_m.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m.del_ts,
	mavm_aprv_usr_mam_usr_acl_m.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m.aprv_role_cd IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m1.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m1.aprv_role_cd1 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m1.st_dt,
	mavm_aprv_usr_mam_usr_acl_m1.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m1.memo1,
	mavm_aprv_usr_mam_usr_acl_m1.memo2,
	mavm_aprv_usr_mam_usr_acl_m1.memo3,
	mavm_aprv_usr_mam_usr_acl_m1.del_flg,
	mavm_aprv_usr_mam_usr_acl_m1.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m1.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m1.del_ts,
	mavm_aprv_usr_mam_usr_acl_m1.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m1.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m1.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m1.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m1.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m1.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m1.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m1.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m1.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m1.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m1
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m1.aprv_role_cd1 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m2.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m2.aprv_role_cd2 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m2.st_dt,
	mavm_aprv_usr_mam_usr_acl_m2.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m2.memo1,
	mavm_aprv_usr_mam_usr_acl_m2.memo2,
	mavm_aprv_usr_mam_usr_acl_m2.memo3,
	mavm_aprv_usr_mam_usr_acl_m2.del_flg,
	mavm_aprv_usr_mam_usr_acl_m2.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m2.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m2.del_ts,
	mavm_aprv_usr_mam_usr_acl_m2.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m2.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m2.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m2.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m2.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m2.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m2.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m2.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m2.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m2.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m2
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m2.aprv_role_cd2 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m3.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m3.aprv_role_cd3 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m3.st_dt,
	mavm_aprv_usr_mam_usr_acl_m3.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m3.memo1,
	mavm_aprv_usr_mam_usr_acl_m3.memo2,
	mavm_aprv_usr_mam_usr_acl_m3.memo3,
	mavm_aprv_usr_mam_usr_acl_m3.del_flg,
	mavm_aprv_usr_mam_usr_acl_m3.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m3.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m3.del_ts,
	mavm_aprv_usr_mam_usr_acl_m3.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m3.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m3.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m3.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m3.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m3.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m3.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m3.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m3.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m3.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m3
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m3.aprv_role_cd3 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m3.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m4.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m4.aprv_role_cd4 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m4.st_dt,
	mavm_aprv_usr_mam_usr_acl_m4.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m4.memo1,
	mavm_aprv_usr_mam_usr_acl_m4.memo2,
	mavm_aprv_usr_mam_usr_acl_m4.memo3,
	mavm_aprv_usr_mam_usr_acl_m4.del_flg,
	mavm_aprv_usr_mam_usr_acl_m4.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m4.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m4.del_ts,
	mavm_aprv_usr_mam_usr_acl_m4.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m4.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m4.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m4.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m4.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m4.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m4.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m4.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m4.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m4.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m4
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m4.aprv_role_cd4 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m4.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m5.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m5.aprv_role_cd5 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m5.st_dt,
	mavm_aprv_usr_mam_usr_acl_m5.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m5.memo1,
	mavm_aprv_usr_mam_usr_acl_m5.memo2,
	mavm_aprv_usr_mam_usr_acl_m5.memo3,
	mavm_aprv_usr_mam_usr_acl_m5.del_flg,
	mavm_aprv_usr_mam_usr_acl_m5.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m5.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m5.del_ts,
	mavm_aprv_usr_mam_usr_acl_m5.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m5.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m5.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m5.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m5.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m5.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m5.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m5.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m5.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m5.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m5
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m5.aprv_role_cd5 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m5.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m6.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m6.aprv_role_cd6 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m6.st_dt,
	mavm_aprv_usr_mam_usr_acl_m6.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m6.memo1,
	mavm_aprv_usr_mam_usr_acl_m6.memo2,
	mavm_aprv_usr_mam_usr_acl_m6.memo3,
	mavm_aprv_usr_mam_usr_acl_m6.del_flg,
	mavm_aprv_usr_mam_usr_acl_m6.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m6.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m6.del_ts,
	mavm_aprv_usr_mam_usr_acl_m6.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m6.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m6.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m6.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m6.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m6.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m6.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m6.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m6.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m6.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m6
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m6.aprv_role_cd6 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m6.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m7.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m7.aprv_role_cd7 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m7.st_dt,
	mavm_aprv_usr_mam_usr_acl_m7.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m7.memo1,
	mavm_aprv_usr_mam_usr_acl_m7.memo2,
	mavm_aprv_usr_mam_usr_acl_m7.memo3,
	mavm_aprv_usr_mam_usr_acl_m7.del_flg,
	mavm_aprv_usr_mam_usr_acl_m7.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m7.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m7.del_ts,
	mavm_aprv_usr_mam_usr_acl_m7.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m7.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m7.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m7.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m7.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m7.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m7.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m7.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m7.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m7.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m7
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m7.aprv_role_cd7 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m7.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m8.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m8.aprv_role_cd8 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m8.st_dt,
	mavm_aprv_usr_mam_usr_acl_m8.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m8.memo1,
	mavm_aprv_usr_mam_usr_acl_m8.memo2,
	mavm_aprv_usr_mam_usr_acl_m8.memo3,
	mavm_aprv_usr_mam_usr_acl_m8.del_flg,
	mavm_aprv_usr_mam_usr_acl_m8.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m8.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m8.del_ts,
	mavm_aprv_usr_mam_usr_acl_m8.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m8.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m8.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m8.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m8.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m8.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m8.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m8.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m8.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m8.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m8
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m8.aprv_role_cd8 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m8.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_m9.usr_cd,
	mavm_aprv_usr_mam_usr_acl_m9.aprv_role_cd9 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_m9.st_dt,
	mavm_aprv_usr_mam_usr_acl_m9.end_dt,
	'1' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_m9.memo1,
	mavm_aprv_usr_mam_usr_acl_m9.memo2,
	mavm_aprv_usr_mam_usr_acl_m9.memo3,
	mavm_aprv_usr_mam_usr_acl_m9.del_flg,
	mavm_aprv_usr_mam_usr_acl_m9.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_m9.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m9.del_ts,
	mavm_aprv_usr_mam_usr_acl_m9.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_m9.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m9.ins_ts,
	mavm_aprv_usr_mam_usr_acl_m9.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_m9.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_m9.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_m9.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_m9.upd_ts,
	mavm_aprv_usr_mam_usr_acl_m9.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_m9.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_m9
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_m9.aprv_role_cd9 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_m9.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n.sub_aprv_role_cd AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n.st_dt,
	mavm_aprv_usr_mam_usr_acl_n.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n.memo1,
	mavm_aprv_usr_mam_usr_acl_n.memo2,
	mavm_aprv_usr_mam_usr_acl_n.memo3,
	mavm_aprv_usr_mam_usr_acl_n.del_flg,
	mavm_aprv_usr_mam_usr_acl_n.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n.del_ts,
	mavm_aprv_usr_mam_usr_acl_n.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n.sub_aprv_role_cd IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n1.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n1.sub_aprv_role_cd1 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n1.st_dt,
	mavm_aprv_usr_mam_usr_acl_n1.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n1.memo1,
	mavm_aprv_usr_mam_usr_acl_n1.memo2,
	mavm_aprv_usr_mam_usr_acl_n1.memo3,
	mavm_aprv_usr_mam_usr_acl_n1.del_flg,
	mavm_aprv_usr_mam_usr_acl_n1.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n1.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n1.del_ts,
	mavm_aprv_usr_mam_usr_acl_n1.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n1.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n1.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n1.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n1.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n1.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n1.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n1.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n1.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n1.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n1
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n1.sub_aprv_role_cd1 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n1.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n2.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n2.sub_aprv_role_cd2 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n2.st_dt,
	mavm_aprv_usr_mam_usr_acl_n2.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n2.memo1,
	mavm_aprv_usr_mam_usr_acl_n2.memo2,
	mavm_aprv_usr_mam_usr_acl_n2.memo3,
	mavm_aprv_usr_mam_usr_acl_n2.del_flg,
	mavm_aprv_usr_mam_usr_acl_n2.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n2.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n2.del_ts,
	mavm_aprv_usr_mam_usr_acl_n2.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n2.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n2.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n2.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n2.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n2.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n2.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n2.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n2.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n2.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n2
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n2.sub_aprv_role_cd2 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n2.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n3.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n3.sub_aprv_role_cd3 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n3.st_dt,
	mavm_aprv_usr_mam_usr_acl_n3.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n3.memo1,
	mavm_aprv_usr_mam_usr_acl_n3.memo2,
	mavm_aprv_usr_mam_usr_acl_n3.memo3,
	mavm_aprv_usr_mam_usr_acl_n3.del_flg,
	mavm_aprv_usr_mam_usr_acl_n3.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n3.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n3.del_ts,
	mavm_aprv_usr_mam_usr_acl_n3.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n3.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n3.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n3.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n3.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n3.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n3.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n3.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n3.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n3.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n3
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n3.sub_aprv_role_cd3 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n3.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n4.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n4.sub_aprv_role_cd4 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n4.st_dt,
	mavm_aprv_usr_mam_usr_acl_n4.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n4.memo1,
	mavm_aprv_usr_mam_usr_acl_n4.memo2,
	mavm_aprv_usr_mam_usr_acl_n4.memo3,
	mavm_aprv_usr_mam_usr_acl_n4.del_flg,
	mavm_aprv_usr_mam_usr_acl_n4.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n4.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n4.del_ts,
	mavm_aprv_usr_mam_usr_acl_n4.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n4.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n4.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n4.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n4.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n4.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n4.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n4.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n4.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n4.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n4
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n4.sub_aprv_role_cd4 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n4.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n5.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n5.sub_aprv_role_cd5 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n5.st_dt,
	mavm_aprv_usr_mam_usr_acl_n5.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n5.memo1,
	mavm_aprv_usr_mam_usr_acl_n5.memo2,
	mavm_aprv_usr_mam_usr_acl_n5.memo3,
	mavm_aprv_usr_mam_usr_acl_n5.del_flg,
	mavm_aprv_usr_mam_usr_acl_n5.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n5.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n5.del_ts,
	mavm_aprv_usr_mam_usr_acl_n5.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n5.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n5.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n5.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n5.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n5.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n5.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n5.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n5.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n5.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n5
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n5.sub_aprv_role_cd5 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n5.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n6.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n6.sub_aprv_role_cd6 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n6.st_dt,
	mavm_aprv_usr_mam_usr_acl_n6.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n6.memo1,
	mavm_aprv_usr_mam_usr_acl_n6.memo2,
	mavm_aprv_usr_mam_usr_acl_n6.memo3,
	mavm_aprv_usr_mam_usr_acl_n6.del_flg,
	mavm_aprv_usr_mam_usr_acl_n6.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n6.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n6.del_ts,
	mavm_aprv_usr_mam_usr_acl_n6.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n6.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n6.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n6.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n6.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n6.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n6.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n6.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n6.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n6.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n6
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n6.sub_aprv_role_cd6 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n6.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n7.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n7.sub_aprv_role_cd7 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n7.st_dt,
	mavm_aprv_usr_mam_usr_acl_n7.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n7.memo1,
	mavm_aprv_usr_mam_usr_acl_n7.memo2,
	mavm_aprv_usr_mam_usr_acl_n7.memo3,
	mavm_aprv_usr_mam_usr_acl_n7.del_flg,
	mavm_aprv_usr_mam_usr_acl_n7.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n7.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n7.del_ts,
	mavm_aprv_usr_mam_usr_acl_n7.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n7.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n7.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n7.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n7.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n7.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n7.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n7.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n7.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n7.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n7
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n7.sub_aprv_role_cd7 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n7.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n8.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n8.sub_aprv_role_cd8 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n8.st_dt,
	mavm_aprv_usr_mam_usr_acl_n8.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n8.memo1,
	mavm_aprv_usr_mam_usr_acl_n8.memo2,
	mavm_aprv_usr_mam_usr_acl_n8.memo3,
	mavm_aprv_usr_mam_usr_acl_n8.del_flg,
	mavm_aprv_usr_mam_usr_acl_n8.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n8.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n8.del_ts,
	mavm_aprv_usr_mam_usr_acl_n8.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n8.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n8.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n8.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n8.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n8.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n8.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n8.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n8.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n8.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n8
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n8.sub_aprv_role_cd8 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n8.del_flg = '0'
UNION ALL
SELECT
	mavm_aprv_usr_mam_usr_acl_n9.usr_cd,
	mavm_aprv_usr_mam_usr_acl_n9.sub_aprv_role_cd9 AS aprv_role_cd,
	mavm_aprv_usr_mam_usr_acl_n9.st_dt,
	mavm_aprv_usr_mam_usr_acl_n9.end_dt,
	'0' AS main_flg,
	mavm_aprv_usr_mam_usr_acl_n9.memo1,
	mavm_aprv_usr_mam_usr_acl_n9.memo2,
	mavm_aprv_usr_mam_usr_acl_n9.memo3,
	mavm_aprv_usr_mam_usr_acl_n9.del_flg,
	mavm_aprv_usr_mam_usr_acl_n9.del_usr_id,
	mavm_aprv_usr_mam_usr_acl_n9.del_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n9.del_ts,
	mavm_aprv_usr_mam_usr_acl_n9.ins_usr_id,
	mavm_aprv_usr_mam_usr_acl_n9.ins_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n9.ins_ts,
	mavm_aprv_usr_mam_usr_acl_n9.ins_func_id,
	mavm_aprv_usr_mam_usr_acl_n9.upd_cntr,
	mavm_aprv_usr_mam_usr_acl_n9.upd_usr_id,
	mavm_aprv_usr_mam_usr_acl_n9.upd_usr_nm,
	mavm_aprv_usr_mam_usr_acl_n9.upd_ts,
	mavm_aprv_usr_mam_usr_acl_n9.upd_func_id,
	mavm_aprv_usr_mam_usr_acl_n9.upd_srv_req_no
FROM mam_usr_acl mavm_aprv_usr_mam_usr_acl_n9
WHERE 0 = 0
AND mavm_aprv_usr_mam_usr_acl_n9.sub_aprv_role_cd9 IS NOT NULL
AND mavm_aprv_usr_mam_usr_acl_n9.del_flg = '0'
;
