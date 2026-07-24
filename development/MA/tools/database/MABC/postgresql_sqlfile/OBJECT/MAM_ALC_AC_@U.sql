\encoding UTF-8

CREATE OR REPLACE VIEW mam_alc_ac_$u(
	alc_ac_cd,
	alc_ac_nm,
	alc_ptn_cd,
	expns_cd,
	alc_ac_grp_cd1,
	alc_ac_grp_cd2,
	alc_ac_grp_cd3,
	co_alc_ac_cd,
	not_itm_alc_ac_flg,
	not_alc_rate_ac_flg,
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
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ac_cd,
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ac_nm,
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ptn_cd,
	mam_alc_ac_$u_mam_alc_ac_all_org.expns_cd,
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ac_grp_cd1,
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ac_grp_cd2,
	mam_alc_ac_$u_mam_alc_ac_all_org.alc_ac_grp_cd3,
	mam_alc_ac_$u_mam_alc_ac_all_org.co_alc_ac_cd,
	mam_alc_ac_$u_mam_alc_ac_all_org.not_itm_alc_ac_flg,
	mam_alc_ac_$u_mam_alc_ac_all_org.not_alc_rate_ac_flg,
	mam_alc_ac_$u_mam_alc_ac_all_org.memo1,
	mam_alc_ac_$u_mam_alc_ac_all_org.memo2,
	mam_alc_ac_$u_mam_alc_ac_all_org.memo3,
	mam_alc_ac_$u_mam_alc_ac_all_org.del_flg,
	mam_alc_ac_$u_mam_alc_ac_all_org.del_usr_id,
	mam_alc_ac_$u_mam_alc_ac_all_org.del_usr_nm,
	mam_alc_ac_$u_mam_alc_ac_all_org.del_ts,
	mam_alc_ac_$u_mam_alc_ac_all_org.ins_usr_id,
	mam_alc_ac_$u_mam_alc_ac_all_org.ins_usr_nm,
	mam_alc_ac_$u_mam_alc_ac_all_org.ins_ts,
	mam_alc_ac_$u_mam_alc_ac_all_org.ins_func_id,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_cntr,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_usr_id,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_usr_nm,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_ts,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_func_id,
	mam_alc_ac_$u_mam_alc_ac_all_org.upd_srv_req_no
FROM
	mam_alc_ac_all mam_alc_ac_$u_mam_alc_ac_all_org
WHERE
	0 = 0
	AND mam_alc_ac_$u_mam_alc_ac_all_org.co_cd = fcpa_context$f_get_co_cd()
;

