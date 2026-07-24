\encoding UTF-8

CREATE OR REPLACE VIEW mbc_bulk_imp_ctg_lcl_$u(
	table_ctg,
	table_ctg_nm,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no,
	lcl_cd
	)
AS
SELECT
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.table_ctg,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.table_ctg_nm,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.ins_usr_id,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.ins_usr_nm,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.ins_ts,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.ins_func_id,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_cntr,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_usr_id,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_usr_nm,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_ts,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_func_id,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.upd_srv_req_no,
	mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.lcl_cd
FROM
	mbc_bulk_imp_ctg_lcl_all mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org
WHERE
	0 = 0
	AND mbc_bulk_imp_ctg_lcl_$u_mbc_bulk_imp_ctg_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

