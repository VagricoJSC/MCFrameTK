\encoding UTF-8

CREATE OR REPLACE VIEW mam_sppl_usr_$u(
	sppl_cd,
	st_dt,
	end_dt,
	purc_usr_cd,
	purc_dpt_cd,
	outsrc_usr_cd,
	outsrc_dpt_cd,
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
	mam_sppl_usr_$u_mam_sppl_usr_all_org.sppl_cd,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.st_dt,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.end_dt,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.purc_usr_cd,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.purc_dpt_cd,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.outsrc_usr_cd,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.outsrc_dpt_cd,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.memo1,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.memo2,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.memo3,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.del_flg,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.del_usr_id,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.del_usr_nm,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.del_ts,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.ins_usr_id,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.ins_usr_nm,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.ins_ts,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.ins_func_id,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_cntr,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_usr_id,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_usr_nm,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_ts,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_func_id,
	mam_sppl_usr_$u_mam_sppl_usr_all_org.upd_srv_req_no
FROM
	mam_sppl_usr_all mam_sppl_usr_$u_mam_sppl_usr_all_org
WHERE
	0 = 0
	AND mam_sppl_usr_$u_mam_sppl_usr_all_org.co_cd = fcpa_context$f_get_co_cd()
;

