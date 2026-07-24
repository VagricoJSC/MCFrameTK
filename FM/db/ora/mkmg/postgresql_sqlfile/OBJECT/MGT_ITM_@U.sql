\encoding UTF-8

CREATE OR REPLACE VIEW mgt_itm_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	term,
	calc_ctg_cd,
	wg_cd,
	calc_ptn_cd,
	std_qty,
	cmn_upri_flg,
	fix_flg,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	non_calc_flg,
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
	mgt_itm_$u_mgt_itm_all_org.itm_cd,
	mgt_itm_$u_mgt_itm_all_org.itm_sub1,
	mgt_itm_$u_mgt_itm_all_org.itm_sub2,
	mgt_itm_$u_mgt_itm_all_org.itm_sub3,
	mgt_itm_$u_mgt_itm_all_org.term,
	mgt_itm_$u_mgt_itm_all_org.calc_ctg_cd,
	mgt_itm_$u_mgt_itm_all_org.wg_cd,
	mgt_itm_$u_mgt_itm_all_org.calc_ptn_cd,
	mgt_itm_$u_mgt_itm_all_org.std_qty,
	mgt_itm_$u_mgt_itm_all_org.cmn_upri_flg,
	mgt_itm_$u_mgt_itm_all_org.fix_flg,
	mgt_itm_$u_mgt_itm_all_org.rmrks,
	mgt_itm_$u_mgt_itm_all_org.sub_char1,
	mgt_itm_$u_mgt_itm_all_org.sub_char2,
	mgt_itm_$u_mgt_itm_all_org.sub_char3,
	mgt_itm_$u_mgt_itm_all_org.non_calc_flg,
	mgt_itm_$u_mgt_itm_all_org.ins_usr_id,
	mgt_itm_$u_mgt_itm_all_org.ins_usr_nm,
	mgt_itm_$u_mgt_itm_all_org.ins_ts,
	mgt_itm_$u_mgt_itm_all_org.ins_func_id,
	mgt_itm_$u_mgt_itm_all_org.upd_cntr,
	mgt_itm_$u_mgt_itm_all_org.upd_usr_id,
	mgt_itm_$u_mgt_itm_all_org.upd_usr_nm,
	mgt_itm_$u_mgt_itm_all_org.upd_ts,
	mgt_itm_$u_mgt_itm_all_org.upd_func_id,
	mgt_itm_$u_mgt_itm_all_org.upd_srv_req_no
FROM
	mgt_itm_all mgt_itm_$u_mgt_itm_all_org
WHERE
	0 = 0
	AND mgt_itm_$u_mgt_itm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

