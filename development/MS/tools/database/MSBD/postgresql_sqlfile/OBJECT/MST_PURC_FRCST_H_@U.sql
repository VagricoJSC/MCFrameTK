\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_frcst_h_$u(
	purc_frcst_no,
	pf_dt,
	sppl_cd,
	wg_cd,
	pf_usr_cd,
	pf_dpt_cd,
	pf_rpt_no,
	pf_rpt_id,
	pf_rpt_dt,
	pf_rpt_flg,
	del_flg,
	del_pf_rpt_id,
	del_pf_rpt_dt,
	del_pf_rpt_flg,
	rpt_rmrks,
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
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.purc_frcst_no,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_dt,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.sppl_cd,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.wg_cd,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_usr_cd,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_dpt_cd,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_rpt_no,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_rpt_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_rpt_dt,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.pf_rpt_flg,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.del_flg,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.del_pf_rpt_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.del_pf_rpt_dt,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.del_pf_rpt_flg,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.rpt_rmrks,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.intr_rmrks,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.sub_char1,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.sub_char2,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.sub_char3,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.ins_usr_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.ins_usr_nm,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.ins_ts,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.ins_func_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_cntr,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_usr_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_usr_nm,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_ts,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_func_id,
	mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.upd_srv_req_no
FROM
	mst_purc_frcst_h_all mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org
WHERE
	0 = 0
	AND mst_purc_frcst_h_$u_mst_purc_frcst_h_all_org.co_cd = fcpa_context$f_get_co_cd()
;

