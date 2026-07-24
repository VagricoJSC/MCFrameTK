\encoding UTF-8

CREATE OR REPLACE VIEW mst_po_crct_rsn(
	po_crct_rsn_cd,
	po_crct_rsn_nm,
	po_crct_rsn_rmrks,
	upri_mod_typ,
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
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.po_crct_rsn_cd,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.po_crct_rsn_nm,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.po_crct_rsn_rmrks,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upri_mod_typ,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.memo1,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.memo2,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.memo3,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.del_flg,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.del_usr_id,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.del_usr_nm,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.del_ts,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.ins_usr_id,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.ins_usr_nm,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.ins_ts,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.ins_func_id,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_cntr,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_usr_id,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_usr_nm,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_ts,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_func_id,
	mst_po_crct_rsn_mst_po_crct_rsn_all_org.upd_srv_req_no
FROM
	mst_po_crct_rsn_all mst_po_crct_rsn_mst_po_crct_rsn_all_org
WHERE
	0 = 0
	AND mst_po_crct_rsn_mst_po_crct_rsn_all_org.co_cd = (SELECT co_cd FROM fct_context mst_po_crct_rsn_fct_context WHERE pid = pg_backend_pid())
	AND (mst_po_crct_rsn_mst_po_crct_rsn_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mst_po_crct_rsn_maw_del_flg_ctl_W WHERE lower(mst_po_crct_rsn_maw_del_flg_ctl_W.tbl_nm) = 'mst_po_crct_rsn'))
;

