\encoding UTF-8

CREATE OR REPLACE VIEW mam_jnl_ptn_base_lcl(
	jnl_ptn_cd,
	jnl_ptn_nm,
	memo1,
	memo2,
	memo3,
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
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.jnl_ptn_cd,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.jnl_ptn_nm,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.memo1,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.memo2,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.memo3,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.ins_usr_id,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.ins_usr_nm,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.ins_ts,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.ins_func_id,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_cntr,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_usr_id,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_usr_nm,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_ts,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_func_id,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.upd_srv_req_no,
	mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.lcl_cd
FROM
	mam_jnl_ptn_base_lcl_all mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org
WHERE
	0 = 0
	AND mam_jnl_ptn_base_lcl_mam_jnl_ptn_base_lcl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_jnl_ptn_base_lcl_fct_context WHERE pid = pg_backend_pid())
;

