\encoding UTF-8

CREATE OR REPLACE VIEW mam_if_ntc_$u(
	module_id,
	logic_id,
	wg_cd,
	bp_cd,
	usr_cd,
	st_dt,
	end_dt,
	msg_lvl,
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
	mam_if_ntc_$u_mam_if_ntc_all_org.module_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.logic_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.wg_cd,
	mam_if_ntc_$u_mam_if_ntc_all_org.bp_cd,
	mam_if_ntc_$u_mam_if_ntc_all_org.usr_cd,
	mam_if_ntc_$u_mam_if_ntc_all_org.st_dt,
	mam_if_ntc_$u_mam_if_ntc_all_org.end_dt,
	mam_if_ntc_$u_mam_if_ntc_all_org.msg_lvl,
	mam_if_ntc_$u_mam_if_ntc_all_org.memo1,
	mam_if_ntc_$u_mam_if_ntc_all_org.memo2,
	mam_if_ntc_$u_mam_if_ntc_all_org.memo3,
	mam_if_ntc_$u_mam_if_ntc_all_org.del_flg,
	mam_if_ntc_$u_mam_if_ntc_all_org.del_usr_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.del_usr_nm,
	mam_if_ntc_$u_mam_if_ntc_all_org.del_ts,
	mam_if_ntc_$u_mam_if_ntc_all_org.ins_usr_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.ins_usr_nm,
	mam_if_ntc_$u_mam_if_ntc_all_org.ins_ts,
	mam_if_ntc_$u_mam_if_ntc_all_org.ins_func_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_cntr,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_usr_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_usr_nm,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_ts,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_func_id,
	mam_if_ntc_$u_mam_if_ntc_all_org.upd_srv_req_no
FROM
	mam_if_ntc_all mam_if_ntc_$u_mam_if_ntc_all_org
WHERE
	0 = 0
	AND mam_if_ntc_$u_mam_if_ntc_all_org.co_cd = fcpa_context$f_get_co_cd()
;

