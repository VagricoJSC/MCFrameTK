\encoding UTF-8

CREATE OR REPLACE VIEW mam_alc_expns_$u(
	alc_ptn_cd,
	expns_cd,
	term,
	self_oper_flg,
	inpt_itm_typ,
	ctg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
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
	mam_alc_expns_$u_mam_alc_expns_all_org.alc_ptn_cd,
	mam_alc_expns_$u_mam_alc_expns_all_org.expns_cd,
	mam_alc_expns_$u_mam_alc_expns_all_org.term,
	mam_alc_expns_$u_mam_alc_expns_all_org.self_oper_flg,
	mam_alc_expns_$u_mam_alc_expns_all_org.inpt_itm_typ,
	mam_alc_expns_$u_mam_alc_expns_all_org.ctg_cd,
	mam_alc_expns_$u_mam_alc_expns_all_org.itm_cd,
	mam_alc_expns_$u_mam_alc_expns_all_org.itm_sub1,
	mam_alc_expns_$u_mam_alc_expns_all_org.itm_sub2,
	mam_alc_expns_$u_mam_alc_expns_all_org.itm_sub3,
	mam_alc_expns_$u_mam_alc_expns_all_org.memo1,
	mam_alc_expns_$u_mam_alc_expns_all_org.memo2,
	mam_alc_expns_$u_mam_alc_expns_all_org.memo3,
	mam_alc_expns_$u_mam_alc_expns_all_org.del_flg,
	mam_alc_expns_$u_mam_alc_expns_all_org.del_usr_id,
	mam_alc_expns_$u_mam_alc_expns_all_org.del_usr_nm,
	mam_alc_expns_$u_mam_alc_expns_all_org.del_ts,
	mam_alc_expns_$u_mam_alc_expns_all_org.ins_usr_id,
	mam_alc_expns_$u_mam_alc_expns_all_org.ins_usr_nm,
	mam_alc_expns_$u_mam_alc_expns_all_org.ins_ts,
	mam_alc_expns_$u_mam_alc_expns_all_org.ins_func_id,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_cntr,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_usr_id,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_usr_nm,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_ts,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_func_id,
	mam_alc_expns_$u_mam_alc_expns_all_org.upd_srv_req_no
FROM
	mam_alc_expns_all mam_alc_expns_$u_mam_alc_expns_all_org
WHERE
	0 = 0
	AND mam_alc_expns_$u_mam_alc_expns_all_org.co_cd = fcpa_context$f_get_co_cd()
;

