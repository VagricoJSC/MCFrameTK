CREATE OR REPLACE VIEW mam_pay_schd_ctl (
	bsppl_cd,
	cur_cd,
	min_amt,
	sttl_cd,
	wg_cd,
	rate,
	crryovr_mons_typ,
	pay_day1,
	pay_day2,
	pay_day3,
	pay_day4,
	pay_day5,
	pay_crryovr_mons1,
	pay_crryovr_mons2,
	pay_crryovr_mons3,
	pay_crryovr_mons4,
	pay_crryovr_mons5,
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
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.bsppl_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.cur_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.min_amt,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.sttl_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.wg_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.rate,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.crryovr_mons_typ,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_flg,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_cntr,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_srv_req_no
FROM 
	mam_pay_schd_ctl_all mam_pay_schd_ctl_mam_pay_schd_ctl_all_org
WHERE 
	0 = 0
AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_flg = '0' 
	AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.bsppl_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.cur_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.min_amt,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.sttl_cd,
	mam_pay_schd_ctl_mam_wg_wg.wg_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.rate,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.crryovr_mons_typ,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_day5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.pay_crryovr_mons5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.memo3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_flg,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.ins_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_cntr,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.upd_srv_req_no
FROM 
	mam_wg mam_pay_schd_ctl_mam_wg_wg,
	mam_pay_schd_ctl_all mam_pay_schd_ctl_mam_pay_schd_ctl_all_org
WHERE 
	0 = 0
AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.del_flg = '0' 
	AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	AND mam_pay_schd_ctl_mam_wg_wg.ap_flg = '1' 
	AND NOT EXISTS (
		SELECT	'X'
		FROM	mam_pay_schd_ctl_all mam_pay_schd_ctl_mam_pay_schd_ctl_all_x
		WHERE	0 = 0
		AND	mam_pay_schd_ctl_mam_pay_schd_ctl_all_x.co_cd = mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.co_cd 
		AND	mam_pay_schd_ctl_mam_pay_schd_ctl_all_x.bsppl_cd = mam_pay_schd_ctl_mam_pay_schd_ctl_all_org.bsppl_cd 
		AND	mam_pay_schd_ctl_mam_pay_schd_ctl_all_x.wg_cd = mam_pay_schd_ctl_mam_wg_wg.wg_cd 
		AND	mam_pay_schd_ctl_mam_pay_schd_ctl_all_x.del_flg = '0'
		)
;
CREATE OR REPLACE VIEW mam_pay_schd_ctl_$s (
	bsppl_cd,
	cur_cd,
	min_amt,
	sttl_cd,
	wg_cd,
	rate,
	crryovr_mons_typ,
	pay_day1,
	pay_day2,
	pay_day3,
	pay_day4,
	pay_day5,
	pay_crryovr_mons1,
	pay_crryovr_mons2,
	pay_crryovr_mons3,
	pay_crryovr_mons4,
	pay_crryovr_mons5,
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
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.bsppl_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.cur_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.min_amt,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.sttl_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.wg_cd,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.rate,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.crryovr_mons_typ,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_day1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_day2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_day3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_day4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_day5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_crryovr_mons1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_crryovr_mons2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_crryovr_mons3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_crryovr_mons4,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.pay_crryovr_mons5,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.memo1,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.memo2,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.memo3,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.del_flg,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.del_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.del_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.del_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.ins_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.ins_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.ins_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.ins_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_cntr,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_usr_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_usr_nm,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_ts,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_func_id,
	mam_pay_schd_ctl_mam_pay_schd_ctl_org.upd_srv_req_no
FROM  
	mam_pay_schd_ctl mam_pay_schd_ctl_mam_pay_schd_ctl_org
;
