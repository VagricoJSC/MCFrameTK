\encoding UTF-8

CREATE OR REPLACE VIEW mam_push_ntc_$s(
	push_ntc_typ,
	ntc_wg_cd,
	ntc_dpt_cd,
	ntc_aprv_role_cd,
	st_dt,
	end_dt,
	msg_imp_typ,
	push_typ,
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
	mam_push_ntc_$s_mam_push_ntc_all_org.push_ntc_typ,
	mam_push_ntc_$s_mam_push_ntc_all_org.ntc_wg_cd,
	mam_push_ntc_$s_mam_push_ntc_all_org.ntc_dpt_cd,
	mam_push_ntc_$s_mam_push_ntc_all_org.ntc_aprv_role_cd,
	mam_push_ntc_$s_mam_push_ntc_all_org.st_dt,
	mam_push_ntc_$s_mam_push_ntc_all_org.end_dt,
	mam_push_ntc_$s_mam_push_ntc_all_org.msg_imp_typ,
	mam_push_ntc_$s_mam_push_ntc_all_org.push_typ,
	mam_push_ntc_$s_mam_push_ntc_all_org.memo1,
	mam_push_ntc_$s_mam_push_ntc_all_org.memo2,
	mam_push_ntc_$s_mam_push_ntc_all_org.memo3,
	mam_push_ntc_$s_mam_push_ntc_all_org.del_flg,
	mam_push_ntc_$s_mam_push_ntc_all_org.del_usr_id,
	mam_push_ntc_$s_mam_push_ntc_all_org.del_usr_nm,
	mam_push_ntc_$s_mam_push_ntc_all_org.del_ts,
	mam_push_ntc_$s_mam_push_ntc_all_org.ins_usr_id,
	mam_push_ntc_$s_mam_push_ntc_all_org.ins_usr_nm,
	mam_push_ntc_$s_mam_push_ntc_all_org.ins_ts,
	mam_push_ntc_$s_mam_push_ntc_all_org.ins_func_id,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_cntr,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_usr_id,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_usr_nm,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_ts,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_func_id,
	mam_push_ntc_$s_mam_push_ntc_all_org.upd_srv_req_no
FROM
	mam_push_ntc_all mam_push_ntc_$s_mam_push_ntc_all_org
WHERE
	0 = 0
	AND mam_push_ntc_$s_mam_push_ntc_all_org.co_cd = (SELECT co_cd FROM fct_context mam_push_ntc_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_push_ntc_$s_mam_push_ntc_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_push_ntc_$s_maw_del_flg_ctl_W WHERE lower(mam_push_ntc_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_push_ntc'))
;

