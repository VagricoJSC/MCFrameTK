\encoding UTF-8

CREATE OR REPLACE VIEW mst_mfg_act_rem_$u(
	mfg_inst_no,
	div_seq,
	mfg_sts_typ,
	itm_mfg_inst_no,
	base_unit_mfg_qty,
	base_unit_mfg_rem_qty,
	base_unit_mfg_abort_qty,
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
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.mfg_inst_no,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.div_seq,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.mfg_sts_typ,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.itm_mfg_inst_no,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.base_unit_mfg_qty,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.base_unit_mfg_rem_qty,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.base_unit_mfg_abort_qty,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.sub_char1,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.sub_char2,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.sub_char3,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.ins_usr_id,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.ins_usr_nm,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.ins_ts,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.ins_func_id,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_cntr,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_usr_id,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_usr_nm,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_ts,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_func_id,
	mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.upd_srv_req_no
FROM
	mst_mfg_act_rem_all mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org
WHERE
	0 = 0
	AND mst_mfg_act_rem_$u_mst_mfg_act_rem_all_org.co_cd = fcpa_context$f_get_co_cd()
;

