\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_schd(
	purc_schd_no,
	arr_pr_no,
	arr_schd_no,
	purc_schd_dt,
	trd_unit_schd_qty,
	trd_unit_cd,
	base_unit_schd_qty,
	base_unit_abort_qty,
	base_unit_purc_qty,
	base_unit_temp_purc_qty,
	base_unit_accpt_dfct_qty,
	base_unit_cd,
	non_purc_flg,
	cmpl_flg,
	abort_flg,
	purc_split_flg,
	sub_char1,
	sub_char2,
	sub_char3,
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
	mst_purc_schd_mst_purc_schd_all_org.purc_schd_no,
	mst_purc_schd_mst_purc_schd_all_org.arr_pr_no,
	mst_purc_schd_mst_purc_schd_all_org.arr_schd_no,
	mst_purc_schd_mst_purc_schd_all_org.purc_schd_dt,
	mst_purc_schd_mst_purc_schd_all_org.trd_unit_schd_qty,
	mst_purc_schd_mst_purc_schd_all_org.trd_unit_cd,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_schd_qty,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_abort_qty,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_purc_qty,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_temp_purc_qty,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_accpt_dfct_qty,
	mst_purc_schd_mst_purc_schd_all_org.base_unit_cd,
	mst_purc_schd_mst_purc_schd_all_org.non_purc_flg,
	mst_purc_schd_mst_purc_schd_all_org.cmpl_flg,
	mst_purc_schd_mst_purc_schd_all_org.abort_flg,
	mst_purc_schd_mst_purc_schd_all_org.purc_split_flg,
	mst_purc_schd_mst_purc_schd_all_org.sub_char1,
	mst_purc_schd_mst_purc_schd_all_org.sub_char2,
	mst_purc_schd_mst_purc_schd_all_org.sub_char3,
	mst_purc_schd_mst_purc_schd_all_org.ins_usr_id,
	mst_purc_schd_mst_purc_schd_all_org.ins_usr_nm,
	mst_purc_schd_mst_purc_schd_all_org.ins_ts,
	mst_purc_schd_mst_purc_schd_all_org.ins_func_id,
	mst_purc_schd_mst_purc_schd_all_org.upd_cntr,
	mst_purc_schd_mst_purc_schd_all_org.upd_usr_id,
	mst_purc_schd_mst_purc_schd_all_org.upd_usr_nm,
	mst_purc_schd_mst_purc_schd_all_org.upd_ts,
	mst_purc_schd_mst_purc_schd_all_org.upd_func_id,
	mst_purc_schd_mst_purc_schd_all_org.upd_srv_req_no
FROM
	mst_purc_schd_all mst_purc_schd_mst_purc_schd_all_org
WHERE
	0 = 0
	AND mst_purc_schd_mst_purc_schd_all_org.co_cd = (SELECT co_cd FROM fct_context mst_purc_schd_fct_context WHERE pid = pg_backend_pid())
;

