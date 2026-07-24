\encoding UTF-8

CREATE OR REPLACE VIEW mam_sttl_$s(
	sttl_cd,
	sttl_nm,
	base_sttl_nm,
	ar_sttl_flg,
	ap_sttl_flg,
	ar_sttl_typ,
	rcv_reg_typ,
	sls_purc_typ,
	calc_com_paid_flg,
	ar_setoff_cd,
	debt_cred_id_typ,
	ap_sttl_typ,
	ap_setoff_typ,
	ap_setoff_act_flg,
	bill_tax_disp_flg,
	ac_rsn_cd,
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
	mam_sttl_$s_mam_sttl_all_org.sttl_cd,
	mam_sttl_$s_mam_sttl_lcl_all_lcl.sttl_nm,
	mam_sttl_$s_mam_sttl_all_org.sttl_nm AS base_sttl_nm,
	mam_sttl_$s_mam_sttl_all_org.ar_sttl_flg,
	mam_sttl_$s_mam_sttl_all_org.ap_sttl_flg,
	mam_sttl_$s_mam_sttl_all_org.ar_sttl_typ,
	mam_sttl_$s_mam_sttl_all_org.rcv_reg_typ,
	mam_sttl_$s_mam_sttl_all_org.sls_purc_typ,
	mam_sttl_$s_mam_sttl_all_org.calc_com_paid_flg,
	mam_sttl_$s_mam_sttl_all_org.ar_setoff_cd,
	mam_sttl_$s_mam_sttl_all_org.debt_cred_id_typ,
	mam_sttl_$s_mam_sttl_all_org.ap_sttl_typ,
	mam_sttl_$s_mam_sttl_all_org.ap_setoff_typ,
	mam_sttl_$s_mam_sttl_all_org.ap_setoff_act_flg,
	mam_sttl_$s_mam_sttl_all_org.bill_tax_disp_flg,
	mam_sttl_$s_mam_sttl_all_org.ac_rsn_cd,
	mam_sttl_$s_mam_sttl_all_org.memo1,
	mam_sttl_$s_mam_sttl_all_org.memo2,
	mam_sttl_$s_mam_sttl_all_org.memo3,
	mam_sttl_$s_mam_sttl_all_org.del_flg,
	mam_sttl_$s_mam_sttl_all_org.del_usr_id,
	mam_sttl_$s_mam_sttl_all_org.del_usr_nm,
	mam_sttl_$s_mam_sttl_all_org.del_ts,
	mam_sttl_$s_mam_sttl_all_org.ins_usr_id,
	mam_sttl_$s_mam_sttl_all_org.ins_usr_nm,
	mam_sttl_$s_mam_sttl_all_org.ins_ts,
	mam_sttl_$s_mam_sttl_all_org.ins_func_id,
	mam_sttl_$s_mam_sttl_all_org.upd_cntr,
	mam_sttl_$s_mam_sttl_all_org.upd_usr_id,
	mam_sttl_$s_mam_sttl_all_org.upd_usr_nm,
	mam_sttl_$s_mam_sttl_all_org.upd_ts,
	mam_sttl_$s_mam_sttl_all_org.upd_func_id,
	mam_sttl_$s_mam_sttl_all_org.upd_srv_req_no
FROM
	mam_sttl_all mam_sttl_$s_mam_sttl_all_org
LEFT OUTER JOIN
	mam_sttl_lcl_all mam_sttl_$s_mam_sttl_lcl_all_lcl
ON
	mam_sttl_$s_mam_sttl_all_org.sttl_cd = mam_sttl_$s_mam_sttl_lcl_all_lcl.sttl_cd
	AND mam_sttl_$s_mam_sttl_all_org.co_cd = mam_sttl_$s_mam_sttl_lcl_all_lcl.co_cd
	AND mam_sttl_$s_mam_sttl_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_sttl_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_sttl_$s_mam_sttl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_sttl_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_sttl_$s_mam_sttl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_sttl_$s_maw_del_flg_ctl_W WHERE lower(mam_sttl_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_sttl'))
;

