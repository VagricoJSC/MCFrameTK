\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_inpt(
	calc_no,
	calc_grp_cd,
	inpt_rec_no,
	top_rec_no,
	lvl,
	wg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	mfg_purc_typ,
	oper_cd,
	oper_seq,
	disp_seq,
	loc_cd,
	sppl_cd,
	prov_typ,
	std_qty,
	the_qty,
	req_qty,
	bottom_flg,
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
	mgt_std_inpt_mgt_std_inpt_all_org.calc_no,
	mgt_std_inpt_mgt_std_inpt_all_org.calc_grp_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.inpt_rec_no,
	mgt_std_inpt_mgt_std_inpt_all_org.top_rec_no,
	mgt_std_inpt_mgt_std_inpt_all_org.lvl,
	mgt_std_inpt_mgt_std_inpt_all_org.wg_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.itm_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.itm_sub1,
	mgt_std_inpt_mgt_std_inpt_all_org.itm_sub2,
	mgt_std_inpt_mgt_std_inpt_all_org.itm_sub3,
	mgt_std_inpt_mgt_std_inpt_all_org.mfg_purc_typ,
	mgt_std_inpt_mgt_std_inpt_all_org.oper_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.oper_seq,
	mgt_std_inpt_mgt_std_inpt_all_org.disp_seq,
	mgt_std_inpt_mgt_std_inpt_all_org.loc_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.sppl_cd,
	mgt_std_inpt_mgt_std_inpt_all_org.prov_typ,
	mgt_std_inpt_mgt_std_inpt_all_org.std_qty,
	mgt_std_inpt_mgt_std_inpt_all_org.the_qty,
	mgt_std_inpt_mgt_std_inpt_all_org.req_qty,
	mgt_std_inpt_mgt_std_inpt_all_org.bottom_flg,
	mgt_std_inpt_mgt_std_inpt_all_org.ins_usr_id,
	mgt_std_inpt_mgt_std_inpt_all_org.ins_usr_nm,
	mgt_std_inpt_mgt_std_inpt_all_org.ins_ts,
	mgt_std_inpt_mgt_std_inpt_all_org.ins_func_id,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_cntr,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_usr_id,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_usr_nm,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_ts,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_func_id,
	mgt_std_inpt_mgt_std_inpt_all_org.upd_srv_req_no
FROM
	mgt_std_inpt_all mgt_std_inpt_mgt_std_inpt_all_org
WHERE
	0 = 0
	AND mgt_std_inpt_mgt_std_inpt_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_std_inpt_fct_context WHERE pid = pg_backend_pid())
;

