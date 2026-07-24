\encoding UTF-8

CREATE OR REPLACE VIEW mst_dlv_inst_$s(
	dlv_inst_no,
	dlv_inst_rev,
	dlv_inst_seq,
	dlv_inst_grp_no,
	po_d_no,
	dlv_inst_print_dt,
	dlv_inst_print_flg,
	last_dlv_inst_rev,
	dlv_inst_dt,
	edi_flg,
	can_flg,
	dlv_inst_print_rmrks,
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
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_no,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_rev,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_seq,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_grp_no,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.po_d_no,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_print_dt,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_print_flg,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.last_dlv_inst_rev,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_dt,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.edi_flg,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.can_flg,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.dlv_inst_print_rmrks,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.intr_rmrks,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.sub_char1,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.sub_char2,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.sub_char3,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.ins_usr_id,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.ins_usr_nm,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.ins_ts,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.ins_func_id,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_cntr,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_usr_id,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_usr_nm,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_ts,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_func_id,
	mst_dlv_inst_$s_mst_dlv_inst_all_org.upd_srv_req_no
FROM
	mst_dlv_inst_all mst_dlv_inst_$s_mst_dlv_inst_all_org
WHERE
	0 = 0
	AND mst_dlv_inst_$s_mst_dlv_inst_all_org.co_cd = (SELECT co_cd FROM fct_context mst_dlv_inst_$s_fct_context WHERE pid = pg_backend_pid())
;

