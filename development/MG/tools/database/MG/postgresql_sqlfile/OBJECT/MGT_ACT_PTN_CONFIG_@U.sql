\encoding UTF-8

CREATE OR REPLACE VIEW mgt_act_ptn_config_$u(
	act_ptn_cd,
	calc_act_seq,
	term,
	calc_grp_cd,
	st_ym,
	end_ym,
	xrate_cd,
	carry_flg,
	err_proceed_flg,
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
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.act_ptn_cd,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.calc_act_seq,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.term,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.calc_grp_cd,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.st_ym,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.end_ym,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.xrate_cd,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.carry_flg,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.err_proceed_flg,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.rmrks,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.sub_char1,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.sub_char2,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.sub_char3,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.ins_usr_id,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.ins_usr_nm,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.ins_ts,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.ins_func_id,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_cntr,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_usr_id,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_usr_nm,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_ts,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_func_id,
	mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.upd_srv_req_no
FROM
	mgt_act_ptn_config_all mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org
WHERE
	0 = 0
	AND mgt_act_ptn_config_$u_mgt_act_ptn_config_all_org.co_cd = fcpa_context$f_get_co_cd()
;

