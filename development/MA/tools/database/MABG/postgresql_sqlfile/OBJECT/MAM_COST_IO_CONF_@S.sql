\encoding UTF-8

CREATE OR REPLACE VIEW mam_cost_io_conf_$s(
	cost_io_id,
	io_col_cd,
	io_col_nm,
	base_io_col_nm,
	io_seq,
	io_tgt_typ,
	io_sml_typ,
	unit_flg,
	qty_flg,
	amt_flg,
	std_flg,
	diff_flg,
	bal_calc_typ,
	minus_flg,
	fg_r,
	fg_g,
	fg_b,
	bg_r,
	bg_g,
	bg_b,
	prov_expns_flg,
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
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.cost_io_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_col_cd,
	mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl.io_col_nm,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_col_nm AS base_io_col_nm,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_seq,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_tgt_typ,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_sml_typ,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.unit_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.qty_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.amt_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.std_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.diff_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.bal_calc_typ,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.minus_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.fg_r,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.fg_g,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.fg_b,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.bg_r,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.bg_g,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.bg_b,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.prov_expns_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.memo1,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.memo2,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.memo3,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.del_flg,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.del_usr_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.del_usr_nm,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.del_ts,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.ins_usr_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.ins_usr_nm,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.ins_ts,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.ins_func_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_cntr,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_usr_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_usr_nm,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_ts,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_func_id,
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.upd_srv_req_no
FROM
	mam_cost_io_conf_all mam_cost_io_conf_$s_mam_cost_io_conf_all_org
LEFT OUTER JOIN
	mam_cost_io_conf_lcl_all mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl
ON
	mam_cost_io_conf_$s_mam_cost_io_conf_all_org.cost_io_id = mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl.cost_io_id
	AND mam_cost_io_conf_$s_mam_cost_io_conf_all_org.io_col_cd = mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl.io_col_cd
	AND mam_cost_io_conf_$s_mam_cost_io_conf_all_org.co_cd = mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl.co_cd
	AND mam_cost_io_conf_$s_mam_cost_io_conf_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_cost_io_conf_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_cost_io_conf_$s_mam_cost_io_conf_all_org.co_cd = (SELECT co_cd FROM fct_context mam_cost_io_conf_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_cost_io_conf_$s_mam_cost_io_conf_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_cost_io_conf_$s_maw_del_flg_ctl_W WHERE lower(mam_cost_io_conf_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_cost_io_conf'))
;

