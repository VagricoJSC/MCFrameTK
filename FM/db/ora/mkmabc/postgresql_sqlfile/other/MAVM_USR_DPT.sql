\encoding UTF-8

CREATE OR REPLACE VIEW mavm_usr_dpt(
usr_cd,
dpt_cd,
st_dt,
end_dt,
main_flg,
memo1,
memo2,
memo3,
del_flg,
del_usr_id,
del_usr_nm,
del_ts,
ins_usr_id,
ins_usr_nm,
ins_ts,
ins_func_id,
upd_cntr,
upd_usr_id,
upd_usr_nm,
upd_ts,
upd_func_id,
upd_srv_req_no
)
AS
SELECT
	mavm_usr_dpt_mam_usr_acl_m.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m.dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m.st_dt,
	mavm_usr_dpt_mam_usr_acl_m.end_dt,
	'1' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m.memo1,
	mavm_usr_dpt_mam_usr_acl_m.memo2,
	mavm_usr_dpt_mam_usr_acl_m.memo3,
	mavm_usr_dpt_mam_usr_acl_m.del_flg,
	mavm_usr_dpt_mam_usr_acl_m.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m.del_ts,
	mavm_usr_dpt_mam_usr_acl_m.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m1.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m1.add_dpt_cd1 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m1.st_dt,
	mavm_usr_dpt_mam_usr_acl_m1.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m1.memo1,
	mavm_usr_dpt_mam_usr_acl_m1.memo2,
	mavm_usr_dpt_mam_usr_acl_m1.memo3,
	mavm_usr_dpt_mam_usr_acl_m1.del_flg,
	mavm_usr_dpt_mam_usr_acl_m1.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m1.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m1.del_ts,
	mavm_usr_dpt_mam_usr_acl_m1.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m1.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m1.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m1.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m1.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m1.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m1.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m1.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m1.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m1.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m1
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m1.add_dpt_cd1 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m2.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m2.add_dpt_cd2 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m2.st_dt,
	mavm_usr_dpt_mam_usr_acl_m2.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m2.memo1,
	mavm_usr_dpt_mam_usr_acl_m2.memo2,
	mavm_usr_dpt_mam_usr_acl_m2.memo3,
	mavm_usr_dpt_mam_usr_acl_m2.del_flg,
	mavm_usr_dpt_mam_usr_acl_m2.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m2.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m2.del_ts,
	mavm_usr_dpt_mam_usr_acl_m2.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m2.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m2.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m2.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m2.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m2.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m2.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m2.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m2.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m2.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m2
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m2.add_dpt_cd2 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m3.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m3.add_dpt_cd3 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m3.st_dt,
	mavm_usr_dpt_mam_usr_acl_m3.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m3.memo1,
	mavm_usr_dpt_mam_usr_acl_m3.memo2,
	mavm_usr_dpt_mam_usr_acl_m3.memo3,
	mavm_usr_dpt_mam_usr_acl_m3.del_flg,
	mavm_usr_dpt_mam_usr_acl_m3.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m3.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m3.del_ts,
	mavm_usr_dpt_mam_usr_acl_m3.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m3.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m3.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m3.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m3.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m3.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m3.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m3.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m3.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m3.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m3
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m3.add_dpt_cd3 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m3.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m4.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m4.add_dpt_cd4 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m4.st_dt,
	mavm_usr_dpt_mam_usr_acl_m4.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m4.memo1,
	mavm_usr_dpt_mam_usr_acl_m4.memo2,
	mavm_usr_dpt_mam_usr_acl_m4.memo3,
	mavm_usr_dpt_mam_usr_acl_m4.del_flg,
	mavm_usr_dpt_mam_usr_acl_m4.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m4.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m4.del_ts,
	mavm_usr_dpt_mam_usr_acl_m4.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m4.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m4.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m4.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m4.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m4.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m4.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m4.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m4.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m4.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m4
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m4.add_dpt_cd4 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m4.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m5.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m5.add_dpt_cd5 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m5.st_dt,
	mavm_usr_dpt_mam_usr_acl_m5.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m5.memo1,
	mavm_usr_dpt_mam_usr_acl_m5.memo2,
	mavm_usr_dpt_mam_usr_acl_m5.memo3,
	mavm_usr_dpt_mam_usr_acl_m5.del_flg,
	mavm_usr_dpt_mam_usr_acl_m5.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m5.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m5.del_ts,
	mavm_usr_dpt_mam_usr_acl_m5.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m5.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m5.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m5.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m5.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m5.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m5.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m5.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m5.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m5.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m5
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m5.add_dpt_cd5 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m5.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m6.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m6.add_dpt_cd6 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m6.st_dt,
	mavm_usr_dpt_mam_usr_acl_m6.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m6.memo1,
	mavm_usr_dpt_mam_usr_acl_m6.memo2,
	mavm_usr_dpt_mam_usr_acl_m6.memo3,
	mavm_usr_dpt_mam_usr_acl_m6.del_flg,
	mavm_usr_dpt_mam_usr_acl_m6.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m6.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m6.del_ts,
	mavm_usr_dpt_mam_usr_acl_m6.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m6.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m6.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m6.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m6.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m6.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m6.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m6.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m6.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m6.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m6
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m6.add_dpt_cd6 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m6.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m7.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m7.add_dpt_cd7 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m7.st_dt,
	mavm_usr_dpt_mam_usr_acl_m7.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m7.memo1,
	mavm_usr_dpt_mam_usr_acl_m7.memo2,
	mavm_usr_dpt_mam_usr_acl_m7.memo3,
	mavm_usr_dpt_mam_usr_acl_m7.del_flg,
	mavm_usr_dpt_mam_usr_acl_m7.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m7.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m7.del_ts,
	mavm_usr_dpt_mam_usr_acl_m7.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m7.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m7.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m7.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m7.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m7.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m7.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m7.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m7.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m7.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m7
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m7.add_dpt_cd7 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m7.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m8.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m8.add_dpt_cd8 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m8.st_dt,
	mavm_usr_dpt_mam_usr_acl_m8.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m8.memo1,
	mavm_usr_dpt_mam_usr_acl_m8.memo2,
	mavm_usr_dpt_mam_usr_acl_m8.memo3,
	mavm_usr_dpt_mam_usr_acl_m8.del_flg,
	mavm_usr_dpt_mam_usr_acl_m8.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m8.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m8.del_ts,
	mavm_usr_dpt_mam_usr_acl_m8.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m8.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m8.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m8.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m8.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m8.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m8.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m8.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m8.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m8.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m8
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m8.add_dpt_cd8 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m8.del_flg = '0'
UNION ALL
SELECT
	mavm_usr_dpt_mam_usr_acl_m9.usr_cd,
	mavm_usr_dpt_mam_usr_acl_m9.add_dpt_cd9 AS dpt_cd,
	mavm_usr_dpt_mam_usr_acl_m9.st_dt,
	mavm_usr_dpt_mam_usr_acl_m9.end_dt,
	'0' AS main_flg,
	mavm_usr_dpt_mam_usr_acl_m9.memo1,
	mavm_usr_dpt_mam_usr_acl_m9.memo2,
	mavm_usr_dpt_mam_usr_acl_m9.memo3,
	mavm_usr_dpt_mam_usr_acl_m9.del_flg,
	mavm_usr_dpt_mam_usr_acl_m9.del_usr_id,
	mavm_usr_dpt_mam_usr_acl_m9.del_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m9.del_ts,
	mavm_usr_dpt_mam_usr_acl_m9.ins_usr_id,
	mavm_usr_dpt_mam_usr_acl_m9.ins_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m9.ins_ts,
	mavm_usr_dpt_mam_usr_acl_m9.ins_func_id,
	mavm_usr_dpt_mam_usr_acl_m9.upd_cntr,
	mavm_usr_dpt_mam_usr_acl_m9.upd_usr_id,
	mavm_usr_dpt_mam_usr_acl_m9.upd_usr_nm,
	mavm_usr_dpt_mam_usr_acl_m9.upd_ts,
	mavm_usr_dpt_mam_usr_acl_m9.upd_func_id,
	mavm_usr_dpt_mam_usr_acl_m9.upd_srv_req_no
FROM	mam_usr_acl mavm_usr_dpt_mam_usr_acl_m9
WHERE	0=0
AND	mavm_usr_dpt_mam_usr_acl_m9.add_dpt_cd9 IS NOT NULL
AND	mavm_usr_dpt_mam_usr_acl_m9.del_flg = '0'
;;

