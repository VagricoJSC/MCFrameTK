\encoding UTF-8

CREATE OR REPLACE VIEW mam_schd_pay_$s(
	pay_ap_typ,
	seq,
	prio,
	cur_cd,
	foreign_typ,
	asppl_cd,
	dpt_id_flg,
	slip_cnt_id,
	ac_cd,
	sub_ac_cd,
	abs_typ,
	abstract1,
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
	mam_schd_pay_$s_mam_schd_pay_all_org.pay_ap_typ,
	mam_schd_pay_$s_mam_schd_pay_all_org.seq,
	mam_schd_pay_$s_mam_schd_pay_all_org.prio,
	mam_schd_pay_$s_mam_schd_pay_all_org.cur_cd,
	mam_schd_pay_$s_mam_schd_pay_all_org.foreign_typ,
	mam_schd_pay_$s_mam_schd_pay_all_org.asppl_cd,
	mam_schd_pay_$s_mam_schd_pay_all_org.dpt_id_flg,
	mam_schd_pay_$s_mam_schd_pay_all_org.slip_cnt_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.ac_cd,
	mam_schd_pay_$s_mam_schd_pay_all_org.sub_ac_cd,
	mam_schd_pay_$s_mam_schd_pay_all_org.abs_typ,
	mam_schd_pay_$s_mam_schd_pay_all_org.abstract1,
	mam_schd_pay_$s_mam_schd_pay_all_org.memo1,
	mam_schd_pay_$s_mam_schd_pay_all_org.memo2,
	mam_schd_pay_$s_mam_schd_pay_all_org.memo3,
	mam_schd_pay_$s_mam_schd_pay_all_org.del_flg,
	mam_schd_pay_$s_mam_schd_pay_all_org.del_usr_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.del_usr_nm,
	mam_schd_pay_$s_mam_schd_pay_all_org.del_ts,
	mam_schd_pay_$s_mam_schd_pay_all_org.ins_usr_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.ins_usr_nm,
	mam_schd_pay_$s_mam_schd_pay_all_org.ins_ts,
	mam_schd_pay_$s_mam_schd_pay_all_org.ins_func_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_cntr,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_usr_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_usr_nm,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_ts,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_func_id,
	mam_schd_pay_$s_mam_schd_pay_all_org.upd_srv_req_no
FROM
	mam_schd_pay_all mam_schd_pay_$s_mam_schd_pay_all_org
WHERE
	0 = 0
	AND mam_schd_pay_$s_mam_schd_pay_all_org.co_cd = (SELECT co_cd FROM fct_context mam_schd_pay_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_schd_pay_$s_mam_schd_pay_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_schd_pay_$s_maw_del_flg_ctl_W WHERE lower(mam_schd_pay_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_schd_pay'))
;

