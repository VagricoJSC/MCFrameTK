\encoding UTF-8

CREATE OR REPLACE VIEW mam_rcv_schd_ctl(
	bcst_cd,
	cur_cd,
	min_amt,
	sttl_cd,
	wg_cd,
	rate,
	crryovr_mons_typ,
	rcv_day1,
	rcv_day2,
	rcv_day3,
	rcv_day4,
	rcv_day5,
	rcv_crryovr_mons1,
	rcv_crryovr_mons2,
	rcv_crryovr_mons3,
	rcv_crryovr_mons4,
	rcv_crryovr_mons5,
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
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.bcst_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.cur_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.min_amt,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.sttl_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.wg_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rate,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.crryovr_mons_typ,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_day1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_day2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_day3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_day4,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_day5,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_crryovr_mons1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_crryovr_mons2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_crryovr_mons3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_crryovr_mons4,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.rcv_crryovr_mons5,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.memo1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.memo2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.memo3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_flg,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.ins_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.ins_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.ins_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.ins_func_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_cntr,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_func_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.upd_srv_req_no
FROM
	mam_rcv_schd_ctl_all mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org
WHERE
	0 = 0
	AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_rcv_schd_ctl_fct_context WHERE pid = pg_backend_pid())
	AND (mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_rcv_schd_ctl_maw_del_flg_ctl_W WHERE lower(mam_rcv_schd_ctl_maw_del_flg_ctl_W.tbl_nm) = 'mam_rcv_schd_ctl'))
;

