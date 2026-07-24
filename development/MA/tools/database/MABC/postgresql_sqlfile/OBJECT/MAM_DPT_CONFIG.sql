\encoding UTF-8

CREATE OR REPLACE VIEW mam_dpt_config(
	par_dpt_cd,
	dpt_cd,
	loc_cd,
	oper_cd,
	oper_null_flg,
	term,
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
	mam_dpt_config_mam_dpt_config_all_org.par_dpt_cd,
	mam_dpt_config_mam_dpt_config_all_org.dpt_cd,
	mam_dpt_config_mam_dpt_config_all_org.loc_cd,
	mam_dpt_config_mam_dpt_config_all_org.oper_cd,
	mam_dpt_config_mam_dpt_config_all_org.oper_null_flg,
	mam_dpt_config_mam_dpt_config_all_org.term,
	mam_dpt_config_mam_dpt_config_all_org.memo1,
	mam_dpt_config_mam_dpt_config_all_org.memo2,
	mam_dpt_config_mam_dpt_config_all_org.memo3,
	mam_dpt_config_mam_dpt_config_all_org.del_flg,
	mam_dpt_config_mam_dpt_config_all_org.del_usr_id,
	mam_dpt_config_mam_dpt_config_all_org.del_usr_nm,
	mam_dpt_config_mam_dpt_config_all_org.del_ts,
	mam_dpt_config_mam_dpt_config_all_org.ins_usr_id,
	mam_dpt_config_mam_dpt_config_all_org.ins_usr_nm,
	mam_dpt_config_mam_dpt_config_all_org.ins_ts,
	mam_dpt_config_mam_dpt_config_all_org.ins_func_id,
	mam_dpt_config_mam_dpt_config_all_org.upd_cntr,
	mam_dpt_config_mam_dpt_config_all_org.upd_usr_id,
	mam_dpt_config_mam_dpt_config_all_org.upd_usr_nm,
	mam_dpt_config_mam_dpt_config_all_org.upd_ts,
	mam_dpt_config_mam_dpt_config_all_org.upd_func_id,
	mam_dpt_config_mam_dpt_config_all_org.upd_srv_req_no
FROM
	mam_dpt_config_all mam_dpt_config_mam_dpt_config_all_org
WHERE
	0 = 0
	AND mam_dpt_config_mam_dpt_config_all_org.co_cd = (SELECT co_cd FROM fct_context mam_dpt_config_fct_context WHERE pid = pg_backend_pid())
	AND (mam_dpt_config_mam_dpt_config_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_dpt_config_maw_del_flg_ctl_W WHERE lower(mam_dpt_config_maw_del_flg_ctl_W.tbl_nm) = 'mam_dpt_config'))
;

