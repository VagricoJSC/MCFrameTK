\encoding UTF-8

CREATE OR REPLACE VIEW mam_lg_grp(
	lg_grp_cd,
	lg_grp_nm,
	base_lg_grp_nm,
	loc_flg,
	wg_cd,
	ship_slip_flg,
	pick_list_flg,
	ship_inst_flg,
	ship_slip_act_flg,
	cal_cd,
	site_co_cd,
	gi_minus_stk_chk_flg,
	ship_loc_prio_flg,
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
	mam_lg_grp_mam_lg_grp_all_org.lg_grp_cd,
	mam_lg_grp_mam_lg_grp_lcl_all_lcl.lg_grp_nm,
	mam_lg_grp_mam_lg_grp_all_org.lg_grp_nm AS base_lg_grp_nm,
	mam_lg_grp_mam_lg_grp_all_org.loc_flg,
	mam_lg_grp_mam_lg_grp_all_org.wg_cd,
	mam_lg_grp_mam_lg_grp_all_org.ship_slip_flg,
	mam_lg_grp_mam_lg_grp_all_org.pick_list_flg,
	mam_lg_grp_mam_lg_grp_all_org.ship_inst_flg,
	mam_lg_grp_mam_lg_grp_all_org.ship_slip_act_flg,
	mam_lg_grp_mam_lg_grp_all_org.cal_cd,
	mam_lg_grp_mam_lg_grp_all_org.site_co_cd,
	mam_lg_grp_mam_lg_grp_all_org.gi_minus_stk_chk_flg,
	mam_lg_grp_mam_lg_grp_all_org.ship_loc_prio_flg,
	mam_lg_grp_mam_lg_grp_all_org.memo1,
	mam_lg_grp_mam_lg_grp_all_org.memo2,
	mam_lg_grp_mam_lg_grp_all_org.memo3,
	mam_lg_grp_mam_lg_grp_all_org.del_flg,
	mam_lg_grp_mam_lg_grp_all_org.del_usr_id,
	mam_lg_grp_mam_lg_grp_all_org.del_usr_nm,
	mam_lg_grp_mam_lg_grp_all_org.del_ts,
	mam_lg_grp_mam_lg_grp_all_org.ins_usr_id,
	mam_lg_grp_mam_lg_grp_all_org.ins_usr_nm,
	mam_lg_grp_mam_lg_grp_all_org.ins_ts,
	mam_lg_grp_mam_lg_grp_all_org.ins_func_id,
	mam_lg_grp_mam_lg_grp_all_org.upd_cntr,
	mam_lg_grp_mam_lg_grp_all_org.upd_usr_id,
	mam_lg_grp_mam_lg_grp_all_org.upd_usr_nm,
	mam_lg_grp_mam_lg_grp_all_org.upd_ts,
	mam_lg_grp_mam_lg_grp_all_org.upd_func_id,
	mam_lg_grp_mam_lg_grp_all_org.upd_srv_req_no
FROM
	mam_lg_grp_all mam_lg_grp_mam_lg_grp_all_org
LEFT OUTER JOIN
	mam_lg_grp_lcl_all mam_lg_grp_mam_lg_grp_lcl_all_lcl
ON
	mam_lg_grp_mam_lg_grp_all_org.lg_grp_cd = mam_lg_grp_mam_lg_grp_lcl_all_lcl.lg_grp_cd
	AND mam_lg_grp_mam_lg_grp_all_org.co_cd = mam_lg_grp_mam_lg_grp_lcl_all_lcl.co_cd
	AND mam_lg_grp_mam_lg_grp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_lg_grp_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_lg_grp_mam_lg_grp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_lg_grp_fct_context WHERE pid = pg_backend_pid())
	AND (mam_lg_grp_mam_lg_grp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_lg_grp_maw_del_flg_ctl_W WHERE lower(mam_lg_grp_maw_del_flg_ctl_W.tbl_nm) = 'mam_lg_grp'))
;

