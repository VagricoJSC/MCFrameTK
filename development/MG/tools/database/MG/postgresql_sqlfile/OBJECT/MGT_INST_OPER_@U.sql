\encoding UTF-8

CREATE OR REPLACE VIEW mgt_inst_oper_$u(
	calc_ctg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_mfg_inst_no,
	mfg_act_no,
	oper_act_no,
	wg_cd,
	mng_dpt_cd,
	oper_cd,
	oper_seq,
	disp_seq,
	qty,
	schd_st_dt,
	schd_end_dt,
	act_st_dt,
	act_end_dt,
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
	mgt_inst_oper_$u_mgt_inst_oper_all_org.calc_ctg_cd,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.itm_cd,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.itm_sub1,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.itm_sub2,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.itm_sub3,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.itm_mfg_inst_no,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.mfg_act_no,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.oper_act_no,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.wg_cd,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.mng_dpt_cd,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.oper_cd,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.oper_seq,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.disp_seq,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.qty,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.schd_st_dt,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.schd_end_dt,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.act_st_dt,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.act_end_dt,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.rmrks,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.sub_char1,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.sub_char2,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.sub_char3,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.ins_usr_id,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.ins_usr_nm,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.ins_ts,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.ins_func_id,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_cntr,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_usr_id,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_usr_nm,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_ts,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_func_id,
	mgt_inst_oper_$u_mgt_inst_oper_all_org.upd_srv_req_no
FROM
	mgt_inst_oper_all mgt_inst_oper_$u_mgt_inst_oper_all_org
WHERE
	0 = 0
	AND mgt_inst_oper_$u_mgt_inst_oper_all_org.co_cd = fcpa_context$f_get_co_cd()
;

