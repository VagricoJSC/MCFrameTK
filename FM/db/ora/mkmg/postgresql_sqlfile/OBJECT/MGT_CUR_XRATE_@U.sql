\encoding UTF-8

CREATE OR REPLACE VIEW mgt_cur_xrate_$u(
	fr_cur_cd,
	to_cur_cd,
	xrate_cd,
	term,
	xrate,
	fix_flg,
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
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.fr_cur_cd,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.to_cur_cd,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.xrate_cd,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.term,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.xrate,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.fix_flg,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.rmrks,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.sub_char1,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.sub_char2,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.sub_char3,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.ins_usr_id,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.ins_usr_nm,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.ins_ts,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.ins_func_id,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_cntr,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_usr_id,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_usr_nm,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_ts,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_func_id,
	mgt_cur_xrate_$u_mgt_cur_xrate_all_org.upd_srv_req_no
FROM
	mgt_cur_xrate_all mgt_cur_xrate_$u_mgt_cur_xrate_all_org
WHERE
	0 = 0
	AND mgt_cur_xrate_$u_mgt_cur_xrate_all_org.co_cd = fcpa_context$f_get_co_cd()
;

