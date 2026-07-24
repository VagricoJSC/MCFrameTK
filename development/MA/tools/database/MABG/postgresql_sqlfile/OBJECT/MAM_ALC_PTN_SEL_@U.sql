\encoding UTF-8

CREATE OR REPLACE VIEW mam_alc_ptn_sel_$u(
	alc_ac_cd,
	dpt_alc_grp,
	loc_alc_grp,
	oper_alc_grp,
	bp_alc_grp,
	ctg_alc_grp,
	itm_alc_grp,
	term,
	calc_ctg_cd,
	wg_cd,
	alc_ptn_cd,
	expns_cd,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.alc_ac_cd,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.dpt_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.loc_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.oper_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.bp_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.ctg_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.itm_alc_grp,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.term,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.calc_ctg_cd,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.wg_cd,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.alc_ptn_cd,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.expns_cd,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.memo1,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.memo2,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.memo3,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.del_flg,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.del_usr_id,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.del_usr_nm,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.del_ts,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.ins_usr_id,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.ins_usr_nm,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.ins_ts,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.ins_func_id,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_cntr,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_usr_id,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_usr_nm,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_ts,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_func_id,
	mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.upd_srv_req_no
FROM
	mam_alc_ptn_sel_all mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org
WHERE
	0 = 0
	AND mam_alc_ptn_sel_$u_mam_alc_ptn_sel_all_org.co_cd = fcpa_context$f_get_co_cd()
;

