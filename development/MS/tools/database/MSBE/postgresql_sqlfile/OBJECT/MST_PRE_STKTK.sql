\encoding UTF-8

CREATE OR REPLACE VIEW mst_pre_stktk(
	loc_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	last_stktk_dt,
	latest_stktk_st_dt,
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
	mst_pre_stktk_mst_pre_stktk_all_org.loc_cd,
	mst_pre_stktk_mst_pre_stktk_all_org.itm_cd,
	mst_pre_stktk_mst_pre_stktk_all_org.itm_sub1,
	mst_pre_stktk_mst_pre_stktk_all_org.itm_sub2,
	mst_pre_stktk_mst_pre_stktk_all_org.itm_sub3,
	mst_pre_stktk_mst_pre_stktk_all_org.last_stktk_dt,
	mst_pre_stktk_mst_pre_stktk_all_org.latest_stktk_st_dt,
	mst_pre_stktk_mst_pre_stktk_all_org.sub_char1,
	mst_pre_stktk_mst_pre_stktk_all_org.sub_char2,
	mst_pre_stktk_mst_pre_stktk_all_org.sub_char3,
	mst_pre_stktk_mst_pre_stktk_all_org.ins_usr_id,
	mst_pre_stktk_mst_pre_stktk_all_org.ins_usr_nm,
	mst_pre_stktk_mst_pre_stktk_all_org.ins_ts,
	mst_pre_stktk_mst_pre_stktk_all_org.ins_func_id,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_cntr,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_usr_id,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_usr_nm,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_ts,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_func_id,
	mst_pre_stktk_mst_pre_stktk_all_org.upd_srv_req_no
FROM
	mst_pre_stktk_all mst_pre_stktk_mst_pre_stktk_all_org
WHERE
	0 = 0
	AND mst_pre_stktk_mst_pre_stktk_all_org.co_cd = (SELECT co_cd FROM fct_context mst_pre_stktk_fct_context WHERE pid = pg_backend_pid())
;

