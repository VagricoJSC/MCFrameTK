CREATE OR REPLACE VIEW mam_rcv_schd_ctl (
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
AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_flg = '0'
	AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.bcst_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.cur_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.min_amt,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.sttl_cd,
	mam_rcv_schd_ctl_mam_wg_wg.wg_cd,
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
	mam_wg mam_rcv_schd_ctl_mam_wg_wg,
	mam_rcv_schd_ctl_all mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org
WHERE
	0 = 0
AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.del_flg = '0'
	AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	AND mam_rcv_schd_ctl_mam_wg_wg.ar_flg = '1'
	AND NOT EXISTS (
		SELECT	'X'
		FROM	mam_rcv_schd_ctl_all mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_x
		WHERE	0=0
		AND	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_x.co_cd = mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.co_cd
		AND	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_x.bcst_cd = mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_org.bcst_cd
		AND	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_x.wg_cd = mam_rcv_schd_ctl_mam_wg_wg.wg_cd
		AND	mam_rcv_schd_ctl_mam_rcv_schd_ctl_all_x.del_flg = '0'
		)
;
CREATE OR REPLACE VIEW mam_rcv_schd_ctl_$s (
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
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.bcst_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.cur_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.min_amt,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.sttl_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.wg_cd,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rate,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.crryovr_mons_typ,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_day1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_day2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_day3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_day4,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_day5,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_crryovr_mons1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_crryovr_mons2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_crryovr_mons3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_crryovr_mons4,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.rcv_crryovr_mons5,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.memo1,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.memo2,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.memo3,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.del_flg,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.del_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.del_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.del_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.ins_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.ins_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.ins_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.ins_func_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_cntr,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_usr_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_usr_nm,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_ts,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_func_id,
	mam_rcv_schd_ctl_mam_rcv_schd_ctl_org.upd_srv_req_no
FROM 
	mam_rcv_schd_ctl mam_rcv_schd_ctl_mam_rcv_schd_ctl_org
;
