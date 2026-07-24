\encoding UTF-8

CREATE OR REPLACE VIEW mam_mps_grp_$s(
	mps_grp_cd,
	mps_grp_nm,
	base_mps_grp_nm,
	rqmt_mons,
	prcd_mons,
	date_div_mons,
	week_div_mons,
	period_div_mons,
	date_div_typ,
	mon01_prod_qty,
	mon02_prod_qty,
	mon03_prod_qty,
	mon04_prod_qty,
	mon05_prod_qty,
	mon06_prod_qty,
	mon07_prod_qty,
	mon08_prod_qty,
	mon09_prod_qty,
	mon10_prod_qty,
	mon11_prod_qty,
	mon12_prod_qty,
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
	mam_mps_grp_$s_mam_mps_grp_all_org.mps_grp_cd,
	mam_mps_grp_$s_mam_mps_grp_lcl_all_lcl.mps_grp_nm,
	mam_mps_grp_$s_mam_mps_grp_all_org.mps_grp_nm AS base_mps_grp_nm,
	mam_mps_grp_$s_mam_mps_grp_all_org.rqmt_mons,
	mam_mps_grp_$s_mam_mps_grp_all_org.prcd_mons,
	mam_mps_grp_$s_mam_mps_grp_all_org.date_div_mons,
	mam_mps_grp_$s_mam_mps_grp_all_org.week_div_mons,
	mam_mps_grp_$s_mam_mps_grp_all_org.period_div_mons,
	mam_mps_grp_$s_mam_mps_grp_all_org.date_div_typ,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon01_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon02_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon03_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon04_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon05_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon06_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon07_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon08_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon09_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon10_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon11_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.mon12_prod_qty,
	mam_mps_grp_$s_mam_mps_grp_all_org.memo1,
	mam_mps_grp_$s_mam_mps_grp_all_org.memo2,
	mam_mps_grp_$s_mam_mps_grp_all_org.memo3,
	mam_mps_grp_$s_mam_mps_grp_all_org.del_flg,
	mam_mps_grp_$s_mam_mps_grp_all_org.del_usr_id,
	mam_mps_grp_$s_mam_mps_grp_all_org.del_usr_nm,
	mam_mps_grp_$s_mam_mps_grp_all_org.del_ts,
	mam_mps_grp_$s_mam_mps_grp_all_org.ins_usr_id,
	mam_mps_grp_$s_mam_mps_grp_all_org.ins_usr_nm,
	mam_mps_grp_$s_mam_mps_grp_all_org.ins_ts,
	mam_mps_grp_$s_mam_mps_grp_all_org.ins_func_id,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_cntr,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_usr_id,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_usr_nm,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_ts,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_func_id,
	mam_mps_grp_$s_mam_mps_grp_all_org.upd_srv_req_no
FROM
	mam_mps_grp_all mam_mps_grp_$s_mam_mps_grp_all_org
LEFT OUTER JOIN
	mam_mps_grp_lcl_all mam_mps_grp_$s_mam_mps_grp_lcl_all_lcl
ON
	mam_mps_grp_$s_mam_mps_grp_all_org.mps_grp_cd = mam_mps_grp_$s_mam_mps_grp_lcl_all_lcl.mps_grp_cd
	AND mam_mps_grp_$s_mam_mps_grp_all_org.co_cd = mam_mps_grp_$s_mam_mps_grp_lcl_all_lcl.co_cd
	AND mam_mps_grp_$s_mam_mps_grp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_mps_grp_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_mps_grp_$s_mam_mps_grp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_mps_grp_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_mps_grp_$s_mam_mps_grp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_mps_grp_$s_maw_del_flg_ctl_W WHERE lower(mam_mps_grp_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_mps_grp'))
;

