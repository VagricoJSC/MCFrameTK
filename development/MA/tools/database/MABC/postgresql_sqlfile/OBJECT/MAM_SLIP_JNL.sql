\encoding UTF-8

CREATE OR REPLACE VIEW mam_slip_jnl(
	ac_slip_typ,
	summary_typ,
	slo_no_flg,
	po_no_flg,
	iv_no_flg,
	bill_no_flg,
	trd_unit_flg,
	red_input_flg,
	jnl_act_cd,
	auto_jnl_key_cd,
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
	mam_slip_jnl_mam_slip_jnl_all_org.ac_slip_typ,
	mam_slip_jnl_mam_slip_jnl_all_org.summary_typ,
	mam_slip_jnl_mam_slip_jnl_all_org.slo_no_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.po_no_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.iv_no_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.bill_no_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.trd_unit_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.red_input_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.jnl_act_cd,
	mam_slip_jnl_mam_slip_jnl_all_org.auto_jnl_key_cd,
	mam_slip_jnl_mam_slip_jnl_all_org.memo1,
	mam_slip_jnl_mam_slip_jnl_all_org.memo2,
	mam_slip_jnl_mam_slip_jnl_all_org.memo3,
	mam_slip_jnl_mam_slip_jnl_all_org.del_flg,
	mam_slip_jnl_mam_slip_jnl_all_org.del_usr_id,
	mam_slip_jnl_mam_slip_jnl_all_org.del_usr_nm,
	mam_slip_jnl_mam_slip_jnl_all_org.del_ts,
	mam_slip_jnl_mam_slip_jnl_all_org.ins_usr_id,
	mam_slip_jnl_mam_slip_jnl_all_org.ins_usr_nm,
	mam_slip_jnl_mam_slip_jnl_all_org.ins_ts,
	mam_slip_jnl_mam_slip_jnl_all_org.ins_func_id,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_cntr,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_usr_id,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_usr_nm,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_ts,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_func_id,
	mam_slip_jnl_mam_slip_jnl_all_org.upd_srv_req_no
FROM
	mam_slip_jnl_all mam_slip_jnl_mam_slip_jnl_all_org
WHERE
	0 = 0
	AND mam_slip_jnl_mam_slip_jnl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_slip_jnl_fct_context WHERE pid = pg_backend_pid())
	AND (mam_slip_jnl_mam_slip_jnl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_slip_jnl_maw_del_flg_ctl_W WHERE lower(mam_slip_jnl_maw_del_flg_ctl_W.tbl_nm) = 'mam_slip_jnl'))
;

