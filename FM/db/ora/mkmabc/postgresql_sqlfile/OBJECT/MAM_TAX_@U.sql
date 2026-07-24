\encoding UTF-8

CREATE OR REPLACE VIEW mam_tax_$u(
	tax_cd,
	tax_nm,
	tax_typ,
	inc_tax_flg,
	tax_rate,
	sls_flg,
	purc_flg,
	prov_flg,
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
	mam_tax_$u_mam_tax_all_org.tax_cd,
	mam_tax_$u_mam_tax_all_org.tax_nm,
	mam_tax_$u_mam_tax_all_org.tax_typ,
	mam_tax_$u_mam_tax_all_org.inc_tax_flg,
	mam_tax_$u_mam_tax_all_org.tax_rate,
	mam_tax_$u_mam_tax_all_org.sls_flg,
	mam_tax_$u_mam_tax_all_org.purc_flg,
	mam_tax_$u_mam_tax_all_org.prov_flg,
	mam_tax_$u_mam_tax_all_org.memo1,
	mam_tax_$u_mam_tax_all_org.memo2,
	mam_tax_$u_mam_tax_all_org.memo3,
	mam_tax_$u_mam_tax_all_org.del_flg,
	mam_tax_$u_mam_tax_all_org.del_usr_id,
	mam_tax_$u_mam_tax_all_org.del_usr_nm,
	mam_tax_$u_mam_tax_all_org.del_ts,
	mam_tax_$u_mam_tax_all_org.ins_usr_id,
	mam_tax_$u_mam_tax_all_org.ins_usr_nm,
	mam_tax_$u_mam_tax_all_org.ins_ts,
	mam_tax_$u_mam_tax_all_org.ins_func_id,
	mam_tax_$u_mam_tax_all_org.upd_cntr,
	mam_tax_$u_mam_tax_all_org.upd_usr_id,
	mam_tax_$u_mam_tax_all_org.upd_usr_nm,
	mam_tax_$u_mam_tax_all_org.upd_ts,
	mam_tax_$u_mam_tax_all_org.upd_func_id,
	mam_tax_$u_mam_tax_all_org.upd_srv_req_no
FROM
	mam_tax_all mam_tax_$u_mam_tax_all_org
WHERE
	0 = 0
	AND mam_tax_$u_mam_tax_all_org.co_cd = fcpa_context$f_get_co_cd()
;

