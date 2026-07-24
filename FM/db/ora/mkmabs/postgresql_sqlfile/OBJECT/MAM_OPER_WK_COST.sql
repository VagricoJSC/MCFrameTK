\encoding UTF-8

CREATE OR REPLACE VIEW mam_oper_wk_cost(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
	oper_ptn,
	oper_cd,
	oper_seq,
	wk_cost_cd,
	st_dt,
	end_dt,
	fxd_wk_cost,
	wk_cost,
	base_qty,
	wk_cost_calc_flg,
	disp_seq,
	not_cost_flg,
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
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.itm_cd,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.itm_sub1,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.itm_sub2,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.itm_sub3,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.loc_cd,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.oper_ptn,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.oper_cd,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.oper_seq,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.wk_cost_cd,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.st_dt,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.end_dt,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.fxd_wk_cost,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.wk_cost,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.base_qty,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.wk_cost_calc_flg,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.disp_seq,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.not_cost_flg,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.memo1,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.memo2,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.memo3,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.del_flg,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.del_usr_id,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.del_usr_nm,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.del_ts,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.ins_usr_id,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.ins_usr_nm,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.ins_ts,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.ins_func_id,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_cntr,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_usr_id,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_usr_nm,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_ts,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_func_id,
	mam_oper_wk_cost_mam_oper_wk_cost_all_org.upd_srv_req_no
FROM
	mam_oper_wk_cost_all mam_oper_wk_cost_mam_oper_wk_cost_all_org
WHERE
	0 = 0
	AND mam_oper_wk_cost_mam_oper_wk_cost_all_org.co_cd = (SELECT co_cd FROM fct_context mam_oper_wk_cost_fct_context WHERE pid = pg_backend_pid())
	AND (mam_oper_wk_cost_mam_oper_wk_cost_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_oper_wk_cost_maw_del_flg_ctl_W WHERE lower(mam_oper_wk_cost_maw_del_flg_ctl_W.tbl_nm) = 'mam_oper_wk_cost'))
;

