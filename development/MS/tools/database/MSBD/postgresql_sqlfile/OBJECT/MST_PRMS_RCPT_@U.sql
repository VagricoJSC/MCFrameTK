\encoding UTF-8

CREATE OR REPLACE VIEW mst_prms_rcpt_$u(
	prms_rcpt_no,
	prms_rcpt_rev,
	prms_rcpt_grp_no,
	po_d_no,
	arr_schd_refl_flg,
	arr_schd_refl_dt,
	prms_rcpt_dt,
	edi_flg,
	can_flg,
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
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.prms_rcpt_no,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.prms_rcpt_rev,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.prms_rcpt_grp_no,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.po_d_no,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.arr_schd_refl_flg,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.arr_schd_refl_dt,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.prms_rcpt_dt,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.edi_flg,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.can_flg,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.intr_rmrks,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.sub_char1,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.sub_char2,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.sub_char3,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.ins_usr_id,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.ins_usr_nm,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.ins_ts,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.ins_func_id,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_cntr,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_usr_id,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_usr_nm,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_ts,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_func_id,
	mst_prms_rcpt_$u_mst_prms_rcpt_all_org.upd_srv_req_no
FROM
	mst_prms_rcpt_all mst_prms_rcpt_$u_mst_prms_rcpt_all_org
WHERE
	0 = 0
	AND mst_prms_rcpt_$u_mst_prms_rcpt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

