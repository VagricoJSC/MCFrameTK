\encoding UTF-8

CREATE OR REPLACE VIEW mam_rpt_row_sml_$u(
	rpt_ptn_cd,
	sml_rpt_row_cd,
	tgt_rpt_row_cd,
	minus_flg,
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
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.rpt_ptn_cd,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.sml_rpt_row_cd,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.tgt_rpt_row_cd,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.minus_flg,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.memo1,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.memo2,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.memo3,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.del_flg,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.del_usr_id,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.del_usr_nm,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.del_ts,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.ins_usr_id,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.ins_usr_nm,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.ins_ts,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.ins_func_id,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_cntr,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_usr_id,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_usr_nm,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_ts,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_func_id,
	mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.upd_srv_req_no
FROM
	mam_rpt_row_sml_all mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org
WHERE
	0 = 0
	AND mam_rpt_row_sml_$u_mam_rpt_row_sml_all_org.co_cd = fcpa_context$f_get_co_cd()
;

