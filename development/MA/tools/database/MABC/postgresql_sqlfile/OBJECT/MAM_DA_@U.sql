\encoding UTF-8

CREATE OR REPLACE VIEW mam_da_$u(
	da_cd,
	da_nm,
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
	mam_da_$u_mam_da_all_org.da_cd,
	mam_da_$u_mam_da_all_org.da_nm,
	mam_da_$u_mam_da_all_org.memo1,
	mam_da_$u_mam_da_all_org.memo2,
	mam_da_$u_mam_da_all_org.memo3,
	mam_da_$u_mam_da_all_org.del_flg,
	mam_da_$u_mam_da_all_org.del_usr_id,
	mam_da_$u_mam_da_all_org.del_usr_nm,
	mam_da_$u_mam_da_all_org.del_ts,
	mam_da_$u_mam_da_all_org.ins_usr_id,
	mam_da_$u_mam_da_all_org.ins_usr_nm,
	mam_da_$u_mam_da_all_org.ins_ts,
	mam_da_$u_mam_da_all_org.ins_func_id,
	mam_da_$u_mam_da_all_org.upd_cntr,
	mam_da_$u_mam_da_all_org.upd_usr_id,
	mam_da_$u_mam_da_all_org.upd_usr_nm,
	mam_da_$u_mam_da_all_org.upd_ts,
	mam_da_$u_mam_da_all_org.upd_func_id,
	mam_da_$u_mam_da_all_org.upd_srv_req_no
FROM
	mam_da_all mam_da_$u_mam_da_all_org
WHERE
	0 = 0
	AND mam_da_$u_mam_da_all_org.co_cd = fcpa_context$f_get_co_cd()
;

