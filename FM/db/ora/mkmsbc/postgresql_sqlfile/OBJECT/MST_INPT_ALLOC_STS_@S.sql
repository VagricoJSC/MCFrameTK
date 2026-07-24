\encoding UTF-8

CREATE OR REPLACE VIEW mst_inpt_alloc_sts_$s(
	inpt_alloc_sts_no,
	inpt_schd_no,
	mfg_inst_no,
	itm_mfg_inst_no,
	oper_inst_no,
	base_unit_qty,
	stk_id_typ,
	stk_bp_cd,
	stk_arrv_bp_cd,
	to_stk_id_typ,
	to_stk_bp_cd,
	to_stk_arrv_bp_cd,
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
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.inpt_alloc_sts_no,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.inpt_schd_no,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.mfg_inst_no,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.itm_mfg_inst_no,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.oper_inst_no,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.base_unit_qty,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.stk_id_typ,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.stk_bp_cd,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.stk_arrv_bp_cd,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.to_stk_id_typ,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.to_stk_bp_cd,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.to_stk_arrv_bp_cd,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.sub_char1,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.sub_char2,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.sub_char3,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.ins_usr_id,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.ins_usr_nm,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.ins_ts,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.ins_func_id,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_cntr,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_usr_id,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_usr_nm,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_ts,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_func_id,
	mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.upd_srv_req_no
FROM
	mst_inpt_alloc_sts_all mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org
WHERE
	0 = 0
	AND mst_inpt_alloc_sts_$s_mst_inpt_alloc_sts_all_org.co_cd = (SELECT co_cd FROM fct_context mst_inpt_alloc_sts_$s_fct_context WHERE pid = pg_backend_pid())
;

