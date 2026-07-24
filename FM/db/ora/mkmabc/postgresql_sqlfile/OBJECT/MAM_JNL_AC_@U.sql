\encoding UTF-8

CREATE OR REPLACE VIEW mam_jnl_ac_$u(
	jnl_grp_cd,
	itm_jnl_cd,
	ac_cd,
	sub_ac_cd,
	bp_typ,
	bp_cd,
	itm_typ,
	amt_typ,
	ac_tax_cd,
	abs_typ,
	abstract2,
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
	mam_jnl_ac_$u_mam_jnl_ac_all_org.jnl_grp_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.itm_jnl_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ac_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.sub_ac_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.bp_typ,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.bp_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.itm_typ,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.amt_typ,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ac_tax_cd,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.abs_typ,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.abstract2,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.memo1,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.memo2,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.memo3,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.del_flg,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.del_usr_id,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.del_usr_nm,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.del_ts,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ins_usr_id,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ins_usr_nm,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ins_ts,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.ins_func_id,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_cntr,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_usr_id,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_usr_nm,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_ts,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_func_id,
	mam_jnl_ac_$u_mam_jnl_ac_all_org.upd_srv_req_no
FROM
	mam_jnl_ac_all mam_jnl_ac_$u_mam_jnl_ac_all_org
WHERE
	0 = 0
	AND mam_jnl_ac_$u_mam_jnl_ac_all_org.co_cd = fcpa_context$f_get_co_cd()
;

