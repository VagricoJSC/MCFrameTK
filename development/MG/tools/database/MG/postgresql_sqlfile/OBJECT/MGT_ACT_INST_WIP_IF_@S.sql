\encoding UTF-8

CREATE OR REPLACE VIEW mgt_act_inst_wip_if_$s(
	data_lno,
	calc_ctg_cd,
	wg_cd,
	ym,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_mfg_inst_no,
	mfg_act_no,
	oper_act_no,
	loc_cd,
	str_ln_cd,
	ac_rsn_cd,
	wip_qty,
	wip_per,
	scm_if_flg,
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
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.data_lno,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.calc_ctg_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.wg_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ym,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.itm_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.itm_sub1,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.itm_sub2,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.itm_sub3,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.itm_mfg_inst_no,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.mfg_act_no,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.oper_act_no,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.loc_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.str_ln_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ac_rsn_cd,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.wip_qty,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.wip_per,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.scm_if_flg,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.rmrks,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.sub_char1,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.sub_char2,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.sub_char3,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ins_usr_id,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ins_usr_nm,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ins_ts,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.ins_func_id,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_cntr,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_usr_id,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_usr_nm,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_ts,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_func_id,
	mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.upd_srv_req_no
FROM
	mgt_act_inst_wip_if_all mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org
WHERE
	0 = 0
	AND mgt_act_inst_wip_if_$s_mgt_act_inst_wip_if_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_act_inst_wip_if_$s_fct_context WHERE pid = pg_backend_pid())
;

