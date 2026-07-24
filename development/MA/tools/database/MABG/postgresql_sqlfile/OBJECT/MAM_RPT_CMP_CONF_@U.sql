\encoding UTF-8

CREATE OR REPLACE VIEW mam_rpt_cmp_conf_$u(
	cmp_ptn_cd,
	col_cd,
	col_nm,
	print_sort,
	sml_flg,
	calc_grp_cd,
	st_month,
	end_month,
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
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.cmp_ptn_cd,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.col_cd,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.col_nm,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.print_sort,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.sml_flg,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.calc_grp_cd,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.st_month,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.end_month,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.memo1,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.memo2,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.memo3,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.del_flg,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.del_usr_id,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.del_usr_nm,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.del_ts,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.ins_usr_id,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.ins_usr_nm,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.ins_ts,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.ins_func_id,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_cntr,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_usr_id,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_usr_nm,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_ts,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_func_id,
	mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.upd_srv_req_no
FROM
	mam_rpt_cmp_conf_all mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org
WHERE
	0 = 0
	AND mam_rpt_cmp_conf_$u_mam_rpt_cmp_conf_all_org.co_cd = fcpa_context$f_get_co_cd()
;

