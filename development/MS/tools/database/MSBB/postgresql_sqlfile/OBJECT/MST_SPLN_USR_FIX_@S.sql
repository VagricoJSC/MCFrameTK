\encoding UTF-8

CREATE OR REPLACE VIEW mst_spln_usr_fix_$s(
	usr_cd,
	ym,
	dpt_cd,
	cst_cd,
	wrk_no,
	spln_itm_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	cur_cd,
	fix_flg,
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
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.usr_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.ym,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.dpt_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.cst_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.wrk_no,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.spln_itm_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.itm_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.itm_sub1,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.itm_sub2,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.itm_sub3,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.cur_cd,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.fix_flg,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.ins_usr_id,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.ins_usr_nm,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.ins_ts,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.ins_func_id,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_cntr,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_usr_id,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_usr_nm,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_ts,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_func_id,
	mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.upd_srv_req_no
FROM
	mst_spln_usr_fix_all mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org
WHERE
	0 = 0
	AND mst_spln_usr_fix_$s_mst_spln_usr_fix_all_org.co_cd = (SELECT co_cd FROM fct_context mst_spln_usr_fix_$s_fct_context WHERE pid = pg_backend_pid())
;

