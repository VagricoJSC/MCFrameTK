\encoding UTF-8

CREATE OR REPLACE VIEW mgt_stk_eval_$u(
	calc_ctg_cd,
	stk_eval_cd,
	wg_cd,
	ym,
	mng_dpt_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	asst_typ,
	base_qty,
	upri,
	rmrks,
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
	mgt_stk_eval_$u_mgt_stk_eval_all_org.calc_ctg_cd,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.stk_eval_cd,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.wg_cd,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.ym,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.mng_dpt_cd,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.itm_cd,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.itm_sub1,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.itm_sub2,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.itm_sub3,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.lot_no,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sublot_no,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sno1,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sno2,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sno3,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sno4,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.asst_typ,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.base_qty,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upri,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.rmrks,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sub_char1,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sub_char2,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.sub_char3,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.ins_usr_id,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.ins_usr_nm,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.ins_ts,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.ins_func_id,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_cntr,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_usr_id,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_usr_nm,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_ts,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_func_id,
	mgt_stk_eval_$u_mgt_stk_eval_all_org.upd_srv_req_no
FROM
	mgt_stk_eval_all mgt_stk_eval_$u_mgt_stk_eval_all_org
WHERE
	0 = 0
	AND mgt_stk_eval_$u_mgt_stk_eval_all_org.co_cd = fcpa_context$f_get_co_cd()
;

