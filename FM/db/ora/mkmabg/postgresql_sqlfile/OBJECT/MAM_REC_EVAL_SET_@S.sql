\encoding UTF-8

CREATE OR REPLACE VIEW mam_rec_eval_set_$s(
	set_tgt_typ,
	ac_slip_typ,
	ac_rsn_cd,
	calc_ctg_cd,
	wg_cd,
	st_dt,
	end_dt,
	amt_set_typ,
	calc_grp_cd,
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
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.set_tgt_typ,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ac_slip_typ,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ac_rsn_cd,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.calc_ctg_cd,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.wg_cd,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.st_dt,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.end_dt,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.amt_set_typ,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.calc_grp_cd,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.memo1,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.memo2,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.memo3,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.del_flg,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.del_usr_id,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.del_usr_nm,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.del_ts,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ins_usr_id,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ins_usr_nm,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ins_ts,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.ins_func_id,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_cntr,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_usr_id,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_usr_nm,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_ts,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_func_id,
	mam_rec_eval_set_$s_mam_rec_eval_set_all_org.upd_srv_req_no
FROM
	mam_rec_eval_set_all mam_rec_eval_set_$s_mam_rec_eval_set_all_org
WHERE
	0 = 0
	AND mam_rec_eval_set_$s_mam_rec_eval_set_all_org.co_cd = (SELECT co_cd FROM fct_context mam_rec_eval_set_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_rec_eval_set_$s_mam_rec_eval_set_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_rec_eval_set_$s_maw_del_flg_ctl_W WHERE lower(mam_rec_eval_set_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_rec_eval_set'))
;

