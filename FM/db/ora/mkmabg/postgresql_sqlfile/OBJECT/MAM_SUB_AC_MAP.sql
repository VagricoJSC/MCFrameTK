\encoding UTF-8

CREATE OR REPLACE VIEW mam_sub_ac_map(
	ac_cd,
	sub_ac_cd,
	st_dt,
	end_dt,
	alc_ac_cd,
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
	mam_sub_ac_map_mam_sub_ac_map_all_org.ac_cd,
	mam_sub_ac_map_mam_sub_ac_map_all_org.sub_ac_cd,
	mam_sub_ac_map_mam_sub_ac_map_all_org.st_dt,
	mam_sub_ac_map_mam_sub_ac_map_all_org.end_dt,
	mam_sub_ac_map_mam_sub_ac_map_all_org.alc_ac_cd,
	mam_sub_ac_map_mam_sub_ac_map_all_org.memo1,
	mam_sub_ac_map_mam_sub_ac_map_all_org.memo2,
	mam_sub_ac_map_mam_sub_ac_map_all_org.memo3,
	mam_sub_ac_map_mam_sub_ac_map_all_org.del_flg,
	mam_sub_ac_map_mam_sub_ac_map_all_org.del_usr_id,
	mam_sub_ac_map_mam_sub_ac_map_all_org.del_usr_nm,
	mam_sub_ac_map_mam_sub_ac_map_all_org.del_ts,
	mam_sub_ac_map_mam_sub_ac_map_all_org.ins_usr_id,
	mam_sub_ac_map_mam_sub_ac_map_all_org.ins_usr_nm,
	mam_sub_ac_map_mam_sub_ac_map_all_org.ins_ts,
	mam_sub_ac_map_mam_sub_ac_map_all_org.ins_func_id,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_cntr,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_usr_id,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_usr_nm,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_ts,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_func_id,
	mam_sub_ac_map_mam_sub_ac_map_all_org.upd_srv_req_no
FROM
	mam_sub_ac_map_all mam_sub_ac_map_mam_sub_ac_map_all_org
WHERE
	0 = 0
	AND mam_sub_ac_map_mam_sub_ac_map_all_org.co_cd = (SELECT co_cd FROM fct_context mam_sub_ac_map_fct_context WHERE pid = pg_backend_pid())
	AND (mam_sub_ac_map_mam_sub_ac_map_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_sub_ac_map_maw_del_flg_ctl_W WHERE lower(mam_sub_ac_map_maw_del_flg_ctl_W.tbl_nm) = 'mam_sub_ac_map'))
;

