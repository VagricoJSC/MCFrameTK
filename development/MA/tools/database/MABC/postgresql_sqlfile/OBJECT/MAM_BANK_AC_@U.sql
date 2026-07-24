\encoding UTF-8

CREATE OR REPLACE VIEW mam_bank_ac_$u(
	bank_ac_cd,
	bank_ac_nm,
	ext_flg,
	bank_cd,
	branch_cd,
	bank_ac_no,
	bank_ac_typ,
	bank_ac_holder,
	bank_ac_holder_sub,
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
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_cd,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_nm,
	mam_bank_ac_$u_mam_bank_ac_all_org.ext_flg,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_cd,
	mam_bank_ac_$u_mam_bank_ac_all_org.branch_cd,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_no,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_typ,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_holder,
	mam_bank_ac_$u_mam_bank_ac_all_org.bank_ac_holder_sub,
	mam_bank_ac_$u_mam_bank_ac_all_org.memo1,
	mam_bank_ac_$u_mam_bank_ac_all_org.memo2,
	mam_bank_ac_$u_mam_bank_ac_all_org.memo3,
	mam_bank_ac_$u_mam_bank_ac_all_org.del_flg,
	mam_bank_ac_$u_mam_bank_ac_all_org.del_usr_id,
	mam_bank_ac_$u_mam_bank_ac_all_org.del_usr_nm,
	mam_bank_ac_$u_mam_bank_ac_all_org.del_ts,
	mam_bank_ac_$u_mam_bank_ac_all_org.ins_usr_id,
	mam_bank_ac_$u_mam_bank_ac_all_org.ins_usr_nm,
	mam_bank_ac_$u_mam_bank_ac_all_org.ins_ts,
	mam_bank_ac_$u_mam_bank_ac_all_org.ins_func_id,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_cntr,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_usr_id,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_usr_nm,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_ts,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_func_id,
	mam_bank_ac_$u_mam_bank_ac_all_org.upd_srv_req_no
FROM
	mam_bank_ac_all mam_bank_ac_$u_mam_bank_ac_all_org
WHERE
	0 = 0
	AND mam_bank_ac_$u_mam_bank_ac_all_org.co_cd = fcpa_context$f_get_co_cd()
;

