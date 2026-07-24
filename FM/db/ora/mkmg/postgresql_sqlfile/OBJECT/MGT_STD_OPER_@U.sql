\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_oper_$u(
	calc_no,
	calc_grp_cd,
	oper_rec_no,
	top_rec_no,
	inpt_rec_no,
	loc_cd,
	wg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	oper_ptn,
	oper_cd,
	oper_seq,
	disp_seq,
	std_qty,
	the_qty,
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
	mgt_std_oper_$u_mgt_std_oper_all_org.calc_no,
	mgt_std_oper_$u_mgt_std_oper_all_org.calc_grp_cd,
	mgt_std_oper_$u_mgt_std_oper_all_org.oper_rec_no,
	mgt_std_oper_$u_mgt_std_oper_all_org.top_rec_no,
	mgt_std_oper_$u_mgt_std_oper_all_org.inpt_rec_no,
	mgt_std_oper_$u_mgt_std_oper_all_org.loc_cd,
	mgt_std_oper_$u_mgt_std_oper_all_org.wg_cd,
	mgt_std_oper_$u_mgt_std_oper_all_org.itm_cd,
	mgt_std_oper_$u_mgt_std_oper_all_org.itm_sub1,
	mgt_std_oper_$u_mgt_std_oper_all_org.itm_sub2,
	mgt_std_oper_$u_mgt_std_oper_all_org.itm_sub3,
	mgt_std_oper_$u_mgt_std_oper_all_org.oper_ptn,
	mgt_std_oper_$u_mgt_std_oper_all_org.oper_cd,
	mgt_std_oper_$u_mgt_std_oper_all_org.oper_seq,
	mgt_std_oper_$u_mgt_std_oper_all_org.disp_seq,
	mgt_std_oper_$u_mgt_std_oper_all_org.std_qty,
	mgt_std_oper_$u_mgt_std_oper_all_org.the_qty,
	mgt_std_oper_$u_mgt_std_oper_all_org.ins_usr_id,
	mgt_std_oper_$u_mgt_std_oper_all_org.ins_usr_nm,
	mgt_std_oper_$u_mgt_std_oper_all_org.ins_ts,
	mgt_std_oper_$u_mgt_std_oper_all_org.ins_func_id,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_cntr,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_usr_id,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_usr_nm,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_ts,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_func_id,
	mgt_std_oper_$u_mgt_std_oper_all_org.upd_srv_req_no
FROM
	mgt_std_oper_all mgt_std_oper_$u_mgt_std_oper_all_org
WHERE
	0 = 0
	AND mgt_std_oper_$u_mgt_std_oper_all_org.co_cd = fcpa_context$f_get_co_cd()
;

