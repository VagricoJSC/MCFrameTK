\encoding UTF-8

CREATE OR REPLACE VIEW mbc_bulk_imp_ctl_$s(
	table_id,
	table_nm,
	table_ctg,
	db_class_path,
	chk_ope,
	upd_ope,
	table_seq,
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
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.table_id,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_lcl_all_lcl.table_nm,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.table_ctg,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.db_class_path,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.chk_ope,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_ope,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.table_seq,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.ins_usr_id,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.ins_usr_nm,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.ins_ts,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.ins_func_id,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_cntr,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_usr_id,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_usr_nm,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_ts,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_func_id,
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.upd_srv_req_no
FROM
	mbc_bulk_imp_ctl_all mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org
LEFT OUTER JOIN
	mbc_bulk_imp_ctl_lcl_all mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_lcl_all_lcl
ON
	mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.table_id = mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_lcl_all_lcl.table_id
	AND mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.co_cd = mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_lcl_all_lcl.co_cd
	AND mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mbc_bulk_imp_ctl_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mbc_bulk_imp_ctl_$s_mbc_bulk_imp_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mbc_bulk_imp_ctl_$s_fct_context WHERE pid = pg_backend_pid())
;

