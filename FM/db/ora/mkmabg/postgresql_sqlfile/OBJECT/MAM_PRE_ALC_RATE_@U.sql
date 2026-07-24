\encoding UTF-8

CREATE OR REPLACE VIEW mam_pre_alc_rate_$u(
	pre_alc_rate_cd,
	pre_alc_rate_nm,
	pre_alc_ptn_cd,
	pln_mly_flg,
	act_mly_flg,
	pln_rule_flg,
	pre_alc_set_typ,
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
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pre_alc_rate_cd,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pre_alc_rate_nm,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pre_alc_ptn_cd,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pln_mly_flg,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.act_mly_flg,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pln_rule_flg,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.pre_alc_set_typ,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.memo1,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.memo2,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.memo3,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.del_flg,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.del_usr_id,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.del_usr_nm,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.del_ts,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.ins_usr_id,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.ins_usr_nm,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.ins_ts,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.ins_func_id,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_cntr,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_usr_id,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_usr_nm,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_ts,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_func_id,
	mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.upd_srv_req_no
FROM
	mam_pre_alc_rate_all mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org
WHERE
	0 = 0
	AND mam_pre_alc_rate_$u_mam_pre_alc_rate_all_org.co_cd = fcpa_context$f_get_co_cd()
;

