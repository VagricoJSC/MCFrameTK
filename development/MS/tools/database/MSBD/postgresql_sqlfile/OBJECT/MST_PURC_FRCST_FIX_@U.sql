\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_frcst_fix_$u(
	purc_frcst_fix_no,
	purc_frcst_no,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	trd_unit_cd,
	base_unit_cd,
	fix_flg,
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
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.purc_frcst_fix_no,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.purc_frcst_no,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.itm_cd,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.itm_sub1,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.itm_sub2,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.itm_sub3,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.trd_unit_cd,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.base_unit_cd,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.fix_flg,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.rpt_rmrks,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.intr_rmrks,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.sub_char1,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.sub_char2,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.sub_char3,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.ins_usr_id,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.ins_usr_nm,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.ins_ts,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.ins_func_id,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_cntr,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_usr_id,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_usr_nm,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_ts,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_func_id,
	mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.upd_srv_req_no
FROM
	mst_purc_frcst_fix_all mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org
WHERE
	0 = 0
	AND mst_purc_frcst_fix_$u_mst_purc_frcst_fix_all_org.co_cd = fcpa_context$f_get_co_cd()
;

