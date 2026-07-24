\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_frcst_bal(
	ym,
	sppl_cd,
	wg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	trd_unit_cd,
	trd_unit_qty,
	base_unit_cd,
	base_unit_qty,
	cmpl_flg,
	intr_rmrks,
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
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.ym,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.sppl_cd,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.wg_cd,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.itm_cd,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.itm_sub1,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.itm_sub2,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.itm_sub3,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.trd_unit_cd,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.trd_unit_qty,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.base_unit_cd,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.base_unit_qty,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.cmpl_flg,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.intr_rmrks,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.sub_char1,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.sub_char2,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.sub_char3,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.ins_usr_id,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.ins_usr_nm,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.ins_ts,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.ins_func_id,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_cntr,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_usr_id,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_usr_nm,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_ts,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_func_id,
	mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.upd_srv_req_no
FROM
	mst_purc_frcst_bal_all mst_purc_frcst_bal_mst_purc_frcst_bal_all_org
WHERE
	0 = 0
	AND mst_purc_frcst_bal_mst_purc_frcst_bal_all_org.co_cd = (SELECT co_cd FROM fct_context mst_purc_frcst_bal_fct_context WHERE pid = pg_backend_pid())
;

