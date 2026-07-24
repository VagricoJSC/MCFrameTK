\encoding UTF-8

CREATE OR REPLACE VIEW mst_inpt_act_rem_$u(
	inpt_schd_no,
	div_seq,
	mfg_sts_typ,
	mfg_inst_no,
	itm_mfg_inst_no,
	oper_inst_no,
	base_unit_inpt_qty,
	base_unit_rqmt_qty,
	base_unit_fxd_rqmt_qty,
	base_unit_inpt_rem_qty,
	base_unit_rqmt_rem_qty,
	base_unit_fxd_rqmt_rem_qty,
	base_unit_inpt_abort_qty,
	cont_inpt_qty,
	cont_rqmt_qty,
	cont_fxd_rqmt_qty,
	cont_inpt_rem_qty,
	cont_rqmt_rem_qty,
	cont_fxd_rqmt_rem_qty,
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
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.inpt_schd_no,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.div_seq,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.mfg_sts_typ,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.mfg_inst_no,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.itm_mfg_inst_no,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.oper_inst_no,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_inpt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_rqmt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_fxd_rqmt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_inpt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_rqmt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_fxd_rqmt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.base_unit_inpt_abort_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_inpt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_rqmt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_fxd_rqmt_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_inpt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_rqmt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.cont_fxd_rqmt_rem_qty,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.sub_char1,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.sub_char2,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.sub_char3,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.ins_usr_id,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.ins_usr_nm,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.ins_ts,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.ins_func_id,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_cntr,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_usr_id,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_usr_nm,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_ts,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_func_id,
	mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.upd_srv_req_no
FROM
	mst_inpt_act_rem_all mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org
WHERE
	0 = 0
	AND mst_inpt_act_rem_$u_mst_inpt_act_rem_all_org.co_cd = fcpa_context$f_get_co_cd()
;

