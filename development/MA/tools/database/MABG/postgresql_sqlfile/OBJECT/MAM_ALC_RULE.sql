\encoding UTF-8

CREATE OR REPLACE VIEW mam_alc_rule(
	alc_ptn_cd,
	term,
	alc_tgt_typ,
	alc_rule_typ,
	expns_cd,
	diff_calc_typ,
	rnd_typ,
	dec_place,
	alc_coef_cd,
	coef_limit_flg,
	asst_typ,
	non_minus_flg,
	non_os_flg,
	scst_alc_flg,
	std_alc_flg,
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
	mam_alc_rule_mam_alc_rule_all_org.alc_ptn_cd,
	mam_alc_rule_mam_alc_rule_all_org.term,
	mam_alc_rule_mam_alc_rule_all_org.alc_tgt_typ,
	mam_alc_rule_mam_alc_rule_all_org.alc_rule_typ,
	mam_alc_rule_mam_alc_rule_all_org.expns_cd,
	mam_alc_rule_mam_alc_rule_all_org.diff_calc_typ,
	mam_alc_rule_mam_alc_rule_all_org.rnd_typ,
	mam_alc_rule_mam_alc_rule_all_org.dec_place,
	mam_alc_rule_mam_alc_rule_all_org.alc_coef_cd,
	mam_alc_rule_mam_alc_rule_all_org.coef_limit_flg,
	mam_alc_rule_mam_alc_rule_all_org.asst_typ,
	mam_alc_rule_mam_alc_rule_all_org.non_minus_flg,
	mam_alc_rule_mam_alc_rule_all_org.non_os_flg,
	mam_alc_rule_mam_alc_rule_all_org.scst_alc_flg,
	mam_alc_rule_mam_alc_rule_all_org.std_alc_flg,
	mam_alc_rule_mam_alc_rule_all_org.memo1,
	mam_alc_rule_mam_alc_rule_all_org.memo2,
	mam_alc_rule_mam_alc_rule_all_org.memo3,
	mam_alc_rule_mam_alc_rule_all_org.del_flg,
	mam_alc_rule_mam_alc_rule_all_org.del_usr_id,
	mam_alc_rule_mam_alc_rule_all_org.del_usr_nm,
	mam_alc_rule_mam_alc_rule_all_org.del_ts,
	mam_alc_rule_mam_alc_rule_all_org.ins_usr_id,
	mam_alc_rule_mam_alc_rule_all_org.ins_usr_nm,
	mam_alc_rule_mam_alc_rule_all_org.ins_ts,
	mam_alc_rule_mam_alc_rule_all_org.ins_func_id,
	mam_alc_rule_mam_alc_rule_all_org.upd_cntr,
	mam_alc_rule_mam_alc_rule_all_org.upd_usr_id,
	mam_alc_rule_mam_alc_rule_all_org.upd_usr_nm,
	mam_alc_rule_mam_alc_rule_all_org.upd_ts,
	mam_alc_rule_mam_alc_rule_all_org.upd_func_id,
	mam_alc_rule_mam_alc_rule_all_org.upd_srv_req_no
FROM
	mam_alc_rule_all mam_alc_rule_mam_alc_rule_all_org
WHERE
	0 = 0
	AND mam_alc_rule_mam_alc_rule_all_org.co_cd = (SELECT co_cd FROM fct_context mam_alc_rule_fct_context WHERE pid = pg_backend_pid())
	AND (mam_alc_rule_mam_alc_rule_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_alc_rule_maw_del_flg_ctl_W WHERE lower(mam_alc_rule_maw_del_flg_ctl_W.tbl_nm) = 'mam_alc_rule'))
;

