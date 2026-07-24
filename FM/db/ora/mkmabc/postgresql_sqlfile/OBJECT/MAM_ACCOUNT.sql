\encoding UTF-8

CREATE OR REPLACE VIEW mam_account(
	ac_cd,
	ac_nm,
	base_ac_nm,
	ac_nm2,
	base_ac_nm2,
	dc_typ,
	sub_flg,
	ac_typ,
	ac_tax_cd,
	ac_tax_typ,
	foreign_flg,
	sum0_flg,
	sum1_flg,
	sum2_flg,
	sum3_flg,
	sum4_flg,
	sum5_flg,
	project_flg,
	bp_flg,
	usr_flg,
	bank_ac_flg,
	ap_typ,
	ar_typ,
	ac_typ1,
	ac_typ2,
	ac_typ3,
	ac_typ4,
	ac_typ5,
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
	mam_account_mam_account_all_org.ac_cd,
	mam_account_mam_account_lcl_all_lcl.ac_nm,
	mam_account_mam_account_all_org.ac_nm AS base_ac_nm,
	mam_account_mam_account_lcl_all_lcl.ac_nm2,
	mam_account_mam_account_all_org.ac_nm2 AS base_ac_nm2,
	mam_account_mam_account_all_org.dc_typ,
	mam_account_mam_account_all_org.sub_flg,
	mam_account_mam_account_all_org.ac_typ,
	mam_account_mam_account_all_org.ac_tax_cd,
	mam_account_mam_account_all_org.ac_tax_typ,
	mam_account_mam_account_all_org.foreign_flg,
	mam_account_mam_account_all_org.sum0_flg,
	mam_account_mam_account_all_org.sum1_flg,
	mam_account_mam_account_all_org.sum2_flg,
	mam_account_mam_account_all_org.sum3_flg,
	mam_account_mam_account_all_org.sum4_flg,
	mam_account_mam_account_all_org.sum5_flg,
	mam_account_mam_account_all_org.project_flg,
	mam_account_mam_account_all_org.bp_flg,
	mam_account_mam_account_all_org.usr_flg,
	mam_account_mam_account_all_org.bank_ac_flg,
	mam_account_mam_account_all_org.ap_typ,
	mam_account_mam_account_all_org.ar_typ,
	mam_account_mam_account_all_org.ac_typ1,
	mam_account_mam_account_all_org.ac_typ2,
	mam_account_mam_account_all_org.ac_typ3,
	mam_account_mam_account_all_org.ac_typ4,
	mam_account_mam_account_all_org.ac_typ5,
	mam_account_mam_account_all_org.memo1,
	mam_account_mam_account_all_org.memo2,
	mam_account_mam_account_all_org.memo3,
	mam_account_mam_account_all_org.del_flg,
	mam_account_mam_account_all_org.del_usr_id,
	mam_account_mam_account_all_org.del_usr_nm,
	mam_account_mam_account_all_org.del_ts,
	mam_account_mam_account_all_org.ins_usr_id,
	mam_account_mam_account_all_org.ins_usr_nm,
	mam_account_mam_account_all_org.ins_ts,
	mam_account_mam_account_all_org.ins_func_id,
	mam_account_mam_account_all_org.upd_cntr,
	mam_account_mam_account_all_org.upd_usr_id,
	mam_account_mam_account_all_org.upd_usr_nm,
	mam_account_mam_account_all_org.upd_ts,
	mam_account_mam_account_all_org.upd_func_id,
	mam_account_mam_account_all_org.upd_srv_req_no
FROM
	mam_account_all mam_account_mam_account_all_org
LEFT OUTER JOIN
	mam_account_lcl_all mam_account_mam_account_lcl_all_lcl
ON
	mam_account_mam_account_all_org.ac_cd = mam_account_mam_account_lcl_all_lcl.ac_cd
	AND mam_account_mam_account_all_org.co_cd = mam_account_mam_account_lcl_all_lcl.co_cd
	AND mam_account_mam_account_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_account_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_account_mam_account_all_org.co_cd = (SELECT co_cd FROM fct_context mam_account_fct_context WHERE pid = pg_backend_pid())
	AND (mam_account_mam_account_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_account_maw_del_flg_ctl_W WHERE lower(mam_account_maw_del_flg_ctl_W.tbl_nm) = 'mam_account'))
;

