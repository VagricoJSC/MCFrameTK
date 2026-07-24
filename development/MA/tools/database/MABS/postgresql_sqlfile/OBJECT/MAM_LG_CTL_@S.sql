\encoding UTF-8

CREATE OR REPLACE VIEW mam_lg_ctl_$s(
	fr_lg_grp_cd,
	to_lg_grp_cd,
	ship_term_cd,
	xfr_lt,
	fin_cl_time,
	alloc_days,
	iv_trd_flg,
	def_tdlv_cd,
	ship_wk_grp_cd,
	non_dmnd_lt_flg,
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
	upd_srv_req_no,
	early_ship_dt_add_days
	)
AS
SELECT
	mam_lg_ctl_$s_mam_lg_ctl_all_org.fr_lg_grp_cd,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.to_lg_grp_cd,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ship_term_cd,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.xfr_lt,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.fin_cl_time,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.alloc_days,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.iv_trd_flg,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.def_tdlv_cd,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ship_wk_grp_cd,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.non_dmnd_lt_flg,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.memo1,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.memo2,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.memo3,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.del_flg,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.del_usr_id,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.del_usr_nm,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.del_ts,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ins_usr_id,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ins_usr_nm,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ins_ts,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.ins_func_id,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_cntr,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_usr_id,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_usr_nm,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_ts,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_func_id,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.upd_srv_req_no,
	mam_lg_ctl_$s_mam_lg_ctl_all_org.early_ship_dt_add_days
FROM
	mam_lg_ctl_all mam_lg_ctl_$s_mam_lg_ctl_all_org
WHERE
	0 = 0
	AND mam_lg_ctl_$s_mam_lg_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_lg_ctl_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_lg_ctl_$s_mam_lg_ctl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_lg_ctl_$s_maw_del_flg_ctl_W WHERE lower(mam_lg_ctl_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_lg_ctl'))
;

