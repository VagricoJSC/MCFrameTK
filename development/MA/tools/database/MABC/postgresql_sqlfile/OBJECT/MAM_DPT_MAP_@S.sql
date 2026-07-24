\encoding UTF-8

CREATE OR REPLACE VIEW mam_dpt_map_$s(
	old_dpt_cd,
	st_dt,
	end_dt,
	new_dpt_cd,
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
	mam_dpt_map_$s_mam_dpt_map_all_org.old_dpt_cd,
	mam_dpt_map_$s_mam_dpt_map_all_org.st_dt,
	mam_dpt_map_$s_mam_dpt_map_all_org.end_dt,
	mam_dpt_map_$s_mam_dpt_map_all_org.new_dpt_cd,
	mam_dpt_map_$s_mam_dpt_map_all_org.ins_usr_id,
	mam_dpt_map_$s_mam_dpt_map_all_org.ins_usr_nm,
	mam_dpt_map_$s_mam_dpt_map_all_org.ins_ts,
	mam_dpt_map_$s_mam_dpt_map_all_org.ins_func_id,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_cntr,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_usr_id,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_usr_nm,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_ts,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_func_id,
	mam_dpt_map_$s_mam_dpt_map_all_org.upd_srv_req_no
FROM
	mam_dpt_map_all mam_dpt_map_$s_mam_dpt_map_all_org
WHERE
	0 = 0
	AND mam_dpt_map_$s_mam_dpt_map_all_org.co_cd = (SELECT co_cd FROM fct_context mam_dpt_map_$s_fct_context WHERE pid = pg_backend_pid())
;

