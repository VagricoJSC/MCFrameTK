\encoding UTF-8

CREATE OR REPLACE VIEW mst_slo_prms_h_$s(
	slo_prms_h_no,
	slo_prms_rev,
	last_prms_rev,
	slo_d_no,
	edi_prms_flg,
	prms_prnt_tm,
	slo_prms_prnt_flg,
	can_flg,
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
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.slo_prms_h_no,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.slo_prms_rev,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.last_prms_rev,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.slo_d_no,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.edi_prms_flg,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.prms_prnt_tm,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.slo_prms_prnt_flg,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.can_flg,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.sub_char1,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.sub_char2,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.sub_char3,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.ins_usr_id,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.ins_usr_nm,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.ins_ts,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.ins_func_id,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_cntr,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_usr_id,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_usr_nm,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_ts,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_func_id,
	mst_slo_prms_h_$s_mst_slo_prms_h_all_org.upd_srv_req_no
FROM
	mst_slo_prms_h_all mst_slo_prms_h_$s_mst_slo_prms_h_all_org
WHERE
	0 = 0
	AND mst_slo_prms_h_$s_mst_slo_prms_h_all_org.co_cd = (SELECT co_cd FROM fct_context mst_slo_prms_h_$s_fct_context WHERE pid = pg_backend_pid())
;

