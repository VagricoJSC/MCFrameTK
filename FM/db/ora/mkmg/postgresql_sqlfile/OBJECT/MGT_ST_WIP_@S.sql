\encoding UTF-8

CREATE OR REPLACE VIEW mgt_st_wip_$s(
	st_wip_key,
	calc_grp_cd,
	wg_cd,
	ym,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_ext,
	itm_mfg_inst_no,
	mfg_act_no,
	oper_act_no,
	loc_cd,
	str_ln_cd,
	oper_cd,
	oper_seq,
	wip_qty,
	wip_per,
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
	mgt_st_wip_$s_mgt_st_wip_all_org.st_wip_key,
	mgt_st_wip_$s_mgt_st_wip_all_org.calc_grp_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.wg_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.ym,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_sub1,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_sub2,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_sub3,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_ext,
	mgt_st_wip_$s_mgt_st_wip_all_org.itm_mfg_inst_no,
	mgt_st_wip_$s_mgt_st_wip_all_org.mfg_act_no,
	mgt_st_wip_$s_mgt_st_wip_all_org.oper_act_no,
	mgt_st_wip_$s_mgt_st_wip_all_org.loc_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.str_ln_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.oper_cd,
	mgt_st_wip_$s_mgt_st_wip_all_org.oper_seq,
	mgt_st_wip_$s_mgt_st_wip_all_org.wip_qty,
	mgt_st_wip_$s_mgt_st_wip_all_org.wip_per,
	mgt_st_wip_$s_mgt_st_wip_all_org.rmrks,
	mgt_st_wip_$s_mgt_st_wip_all_org.sub_char1,
	mgt_st_wip_$s_mgt_st_wip_all_org.sub_char2,
	mgt_st_wip_$s_mgt_st_wip_all_org.sub_char3,
	mgt_st_wip_$s_mgt_st_wip_all_org.ins_usr_id,
	mgt_st_wip_$s_mgt_st_wip_all_org.ins_usr_nm,
	mgt_st_wip_$s_mgt_st_wip_all_org.ins_ts,
	mgt_st_wip_$s_mgt_st_wip_all_org.ins_func_id,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_cntr,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_usr_id,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_usr_nm,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_ts,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_func_id,
	mgt_st_wip_$s_mgt_st_wip_all_org.upd_srv_req_no
FROM
	mgt_st_wip_all mgt_st_wip_$s_mgt_st_wip_all_org
WHERE
	0 = 0
	AND mgt_st_wip_$s_mgt_st_wip_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_st_wip_$s_fct_context WHERE pid = pg_backend_pid())
;

