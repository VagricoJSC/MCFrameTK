\encoding UTF-8

CREATE OR REPLACE VIEW mgt_wip_loc_$u(
	calc_no,
	calc_grp_cd,
	wg_cd,
	ym,
	mng_dpt_cd,
	loc_cd,
	str_ln_cd,
	oper_cd,
	oper_seq,
	expns_cd,
	st_wip_amt,
	prod_amt,
	inpt_amt,
	comp_amt,
	end_wip_amt,
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
	mgt_wip_loc_$u_mgt_wip_loc_all_org.calc_no,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.calc_grp_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.wg_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.ym,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.mng_dpt_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.loc_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.str_ln_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.oper_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.oper_seq,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.expns_cd,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.st_wip_amt,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.prod_amt,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.inpt_amt,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.comp_amt,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.end_wip_amt,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.ins_usr_id,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.ins_usr_nm,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.ins_ts,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.ins_func_id,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_cntr,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_usr_id,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_usr_nm,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_ts,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_func_id,
	mgt_wip_loc_$u_mgt_wip_loc_all_org.upd_srv_req_no
FROM
	mgt_wip_loc_all mgt_wip_loc_$u_mgt_wip_loc_all_org
WHERE
	0 = 0
	AND mgt_wip_loc_$u_mgt_wip_loc_all_org.co_cd = fcpa_context$f_get_co_cd()
;

