\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_chk(
	calc_grp_cd,
	msg_id,
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
	mgt_calc_chk_mgt_calc_chk_all_org.calc_grp_cd,
	mgt_calc_chk_mgt_calc_chk_all_org.msg_id,
	mgt_calc_chk_mgt_calc_chk_all_org.rmrks,
	mgt_calc_chk_mgt_calc_chk_all_org.sub_char1,
	mgt_calc_chk_mgt_calc_chk_all_org.sub_char2,
	mgt_calc_chk_mgt_calc_chk_all_org.sub_char3,
	mgt_calc_chk_mgt_calc_chk_all_org.ins_usr_id,
	mgt_calc_chk_mgt_calc_chk_all_org.ins_usr_nm,
	mgt_calc_chk_mgt_calc_chk_all_org.ins_ts,
	mgt_calc_chk_mgt_calc_chk_all_org.ins_func_id,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_cntr,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_usr_id,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_usr_nm,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_ts,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_func_id,
	mgt_calc_chk_mgt_calc_chk_all_org.upd_srv_req_no
FROM
	mgt_calc_chk_all mgt_calc_chk_mgt_calc_chk_all_org
WHERE
	0 = 0
	AND mgt_calc_chk_mgt_calc_chk_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_chk_fct_context WHERE pid = pg_backend_pid())
;

