\encoding UTF-8

CREATE OR REPLACE VIEW mst_spln_usr_vers_$u(
	usr_cd,
	ym,
	edited_flg,
	intr_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
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
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.usr_cd,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.ym,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.edited_flg,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.intr_rmrks,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.sub_char1,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.sub_char2,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.sub_char3,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.ins_usr_id,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.ins_usr_nm,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.ins_ts,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.ins_func_id,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_cntr,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_usr_id,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_usr_nm,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_ts,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_func_id,
	mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.upd_srv_req_no
FROM
	mst_spln_usr_vers_all mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org
WHERE
	0 = 0
	AND mst_spln_usr_vers_$u_mst_spln_usr_vers_all_org.co_cd = fcpa_context$f_get_co_cd()
;

