\encoding UTF-8

CREATE OR REPLACE VIEW mbc_bulk_imp_ctl_lcl(
	table_id,
	table_nm,
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
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.table_id,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.table_nm,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.ins_usr_id,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.ins_usr_nm,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.ins_ts,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.ins_func_id,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_cntr,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_usr_id,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_usr_nm,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_ts,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_func_id,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.upd_srv_req_no,
	mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.lcl_cd
FROM
	mbc_bulk_imp_ctl_lcl_all mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org
WHERE
	0 = 0
	AND mbc_bulk_imp_ctl_lcl_mbc_bulk_imp_ctl_lcl_all_org.co_cd = (SELECT co_cd FROM fct_context mbc_bulk_imp_ctl_lcl_fct_context WHERE pid = pg_backend_pid())
;

