\encoding UTF-8

CREATE OR REPLACE VIEW mam_pre_rate_tgt(
	pre_alc_rate_cd,
	data_calc_ctg_cd,
	data_wg_cd,
	sa_typ,
	calc_ctg_cd,
	wg_cd,
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
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.pre_alc_rate_cd,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.data_calc_ctg_cd,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.data_wg_cd,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.sa_typ,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.calc_ctg_cd,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.wg_cd,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.term,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.memo1,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.memo2,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.memo3,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.del_flg,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.del_usr_id,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.del_usr_nm,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.del_ts,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.ins_usr_id,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.ins_usr_nm,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.ins_ts,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.ins_func_id,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_cntr,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_usr_id,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_usr_nm,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_ts,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_func_id,
	mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.upd_srv_req_no
FROM
	mam_pre_rate_tgt_all mam_pre_rate_tgt_mam_pre_rate_tgt_all_org
WHERE
	0 = 0
	AND mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.co_cd = (SELECT co_cd FROM fct_context mam_pre_rate_tgt_fct_context WHERE pid = pg_backend_pid())
	AND (mam_pre_rate_tgt_mam_pre_rate_tgt_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_pre_rate_tgt_maw_del_flg_ctl_W WHERE lower(mam_pre_rate_tgt_maw_del_flg_ctl_W.tbl_nm) = 'mam_pre_rate_tgt'))
;

