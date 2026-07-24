\encoding UTF-8

CREATE OR REPLACE VIEW mam_ac_tax_$u(
	ac_tax_cd,
	ac_tax_nm,
	ac_tax_typ,
	ac_cd,
	sub_ac_cd,
	tran_flg,
	st_dt,
	end_dt,
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
	mam_ac_tax_$u_mam_ac_tax_all_org.ac_tax_cd,
	mam_ac_tax_$u_mam_ac_tax_all_org.ac_tax_nm,
	mam_ac_tax_$u_mam_ac_tax_all_org.ac_tax_typ,
	mam_ac_tax_$u_mam_ac_tax_all_org.ac_cd,
	mam_ac_tax_$u_mam_ac_tax_all_org.sub_ac_cd,
	mam_ac_tax_$u_mam_ac_tax_all_org.tran_flg,
	mam_ac_tax_$u_mam_ac_tax_all_org.st_dt,
	mam_ac_tax_$u_mam_ac_tax_all_org.end_dt,
	mam_ac_tax_$u_mam_ac_tax_all_org.memo1,
	mam_ac_tax_$u_mam_ac_tax_all_org.memo2,
	mam_ac_tax_$u_mam_ac_tax_all_org.memo3,
	mam_ac_tax_$u_mam_ac_tax_all_org.del_flg,
	mam_ac_tax_$u_mam_ac_tax_all_org.del_usr_id,
	mam_ac_tax_$u_mam_ac_tax_all_org.del_usr_nm,
	mam_ac_tax_$u_mam_ac_tax_all_org.del_ts,
	mam_ac_tax_$u_mam_ac_tax_all_org.ins_usr_id,
	mam_ac_tax_$u_mam_ac_tax_all_org.ins_usr_nm,
	mam_ac_tax_$u_mam_ac_tax_all_org.ins_ts,
	mam_ac_tax_$u_mam_ac_tax_all_org.ins_func_id,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_cntr,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_usr_id,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_usr_nm,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_ts,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_func_id,
	mam_ac_tax_$u_mam_ac_tax_all_org.upd_srv_req_no
FROM
	mam_ac_tax_all mam_ac_tax_$u_mam_ac_tax_all_org
WHERE
	0 = 0
	AND mam_ac_tax_$u_mam_ac_tax_all_org.co_cd = fcpa_context$f_get_co_cd()
;

