\encoding UTF-8

CREATE OR REPLACE VIEW mam_cur_xrate(
	fr_cur_cd,
	to_cur_cd,
	xrate_cd,
	st_dt,
	end_dt,
	xrate,
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
	mam_cur_xrate_mam_cur_xrate_all_org.fr_cur_cd,
	mam_cur_xrate_mam_cur_xrate_all_org.to_cur_cd,
	mam_cur_xrate_mam_cur_xrate_all_org.xrate_cd,
	mam_cur_xrate_mam_cur_xrate_all_org.st_dt,
	mam_cur_xrate_mam_cur_xrate_all_org.end_dt,
	mam_cur_xrate_mam_cur_xrate_all_org.xrate,
	mam_cur_xrate_mam_cur_xrate_all_org.memo1,
	mam_cur_xrate_mam_cur_xrate_all_org.memo2,
	mam_cur_xrate_mam_cur_xrate_all_org.memo3,
	mam_cur_xrate_mam_cur_xrate_all_org.del_flg,
	mam_cur_xrate_mam_cur_xrate_all_org.del_usr_id,
	mam_cur_xrate_mam_cur_xrate_all_org.del_usr_nm,
	mam_cur_xrate_mam_cur_xrate_all_org.del_ts,
	mam_cur_xrate_mam_cur_xrate_all_org.ins_usr_id,
	mam_cur_xrate_mam_cur_xrate_all_org.ins_usr_nm,
	mam_cur_xrate_mam_cur_xrate_all_org.ins_ts,
	mam_cur_xrate_mam_cur_xrate_all_org.ins_func_id,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_cntr,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_usr_id,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_usr_nm,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_ts,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_func_id,
	mam_cur_xrate_mam_cur_xrate_all_org.upd_srv_req_no
FROM
	mam_cur_xrate_all mam_cur_xrate_mam_cur_xrate_all_org
WHERE
	0 = 0
	AND mam_cur_xrate_mam_cur_xrate_all_org.co_cd = (SELECT co_cd FROM fct_context mam_cur_xrate_fct_context WHERE pid = pg_backend_pid())
	AND (mam_cur_xrate_mam_cur_xrate_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_cur_xrate_maw_del_flg_ctl_W WHERE lower(mam_cur_xrate_maw_del_flg_ctl_W.tbl_nm) = 'mam_cur_xrate'))
;

