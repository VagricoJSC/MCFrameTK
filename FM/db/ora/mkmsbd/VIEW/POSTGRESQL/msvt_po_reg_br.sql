SELECT
	msvt_po_reg_br_mst_po_reg_br_t1.batch_data_no,
	msvt_po_reg_br_mst_po_reg_br_t1.batch_log_no,
	msvt_po_reg_br_mst_po_reg_br_t1.log_sub_key1,
	msvt_po_reg_br_mst_po_reg_br_t1.log_sub_key2,
	msvt_po_reg_br_mst_po_reg_br_t1.exe_sts_typ,
	msvt_po_reg_br_mst_po_reg_br_t1.po_schd_no,
	msvt_po_reg_br_mst_po_reg_br_t1.wg_cd,
	msvt_po_reg_br_mst_po_reg_br_t1.sppl_cd,
	msvt_po_reg_br_mst_po_reg_br_t1.itm_cd,
	msvt_po_reg_br_mst_po_reg_br_t1.itm_sub1,
	msvt_po_reg_br_mst_po_reg_br_t1.itm_sub2,
	msvt_po_reg_br_mst_po_reg_br_t1.itm_sub3,
	COALESCE(msvt_po_reg_br_mst_po_reg_br_t1.itm_nm, msvt_po_reg_br_mam_itm_m1.itm_nm),
	msvt_po_reg_br_mst_po_reg_br_t1.po_schd_dt,
	msvt_po_reg_br_mst_po_reg_br_t1.dlv_rqst_tm,
	msvt_po_reg_br_mst_po_reg_br_t1.ins_usr_id,
	msvt_po_reg_br_mst_po_reg_br_t1.ins_usr_nm,
	msvt_po_reg_br_mst_po_reg_br_t1.ins_ts,
	msvt_po_reg_br_mst_po_reg_br_t1.ins_func_id,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_cntr,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_usr_id,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_usr_nm,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_ts,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_func_id,
	msvt_po_reg_br_mst_po_reg_br_t1.upd_srv_req_no
FROM
	mst_po_reg_br msvt_po_reg_br_mst_po_reg_br_t1
	LEFT OUTER JOIN mam_itm msvt_po_reg_br_mam_itm_m1 ON 
		(msvt_po_reg_br_mst_po_reg_br_t1.itm_cd = msvt_po_reg_br_mam_itm_m1.itm_cd
		AND msvt_po_reg_br_mst_po_reg_br_t1.itm_sub1 = msvt_po_reg_br_mam_itm_m1.itm_sub1
		AND msvt_po_reg_br_mst_po_reg_br_t1.itm_sub2 = msvt_po_reg_br_mam_itm_m1.itm_sub2
		AND msvt_po_reg_br_mst_po_reg_br_t1.itm_sub3 = msvt_po_reg_br_mam_itm_m1.itm_sub3)
WHERE 
	0=0
;
