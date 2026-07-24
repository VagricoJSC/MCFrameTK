\encoding UTF-8

CREATE OR REPLACE VIEW mbc_bulk_imp_ctg_$s(
	table_ctg,
	table_ctg_nm,
	table_ctg_seq,
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
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.table_ctg,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_lcl_all_lcl.table_ctg_nm,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.table_ctg_seq,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.ins_usr_id,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.ins_usr_nm,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.ins_ts,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.ins_func_id,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_cntr,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_usr_id,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_usr_nm,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_ts,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_func_id,
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.upd_srv_req_no
FROM
	mbc_bulk_imp_ctg_all mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org
LEFT OUTER JOIN
	mbc_bulk_imp_ctg_lcl_all mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_lcl_all_lcl
ON
	mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.table_ctg = mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_lcl_all_lcl.table_ctg
	AND mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.co_cd = mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_lcl_all_lcl.co_cd
	AND mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mbc_bulk_imp_ctg_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mbc_bulk_imp_ctg_$s_mbc_bulk_imp_ctg_all_org.co_cd = (SELECT co_cd FROM fct_context mbc_bulk_imp_ctg_$s_fct_context WHERE pid = pg_backend_pid())
;

