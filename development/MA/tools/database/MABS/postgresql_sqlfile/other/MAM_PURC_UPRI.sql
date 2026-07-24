\encoding UTF-8

CREATE OR REPLACE VIEW mam_purc_upri(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	sppl_cd,
	maker_cd,
	unit_cd,
	lot_qty,
	cur_cd,
	loc_cd,
	dlv_cd,
	wg_cd,
	st_dt,
	end_dt,
	upri,
	upri_bf,
	interim_flg,
	not_cost_flg,
	sub_upri1,
	sub_upri2,
	sub_upri3,
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
	upd_srv_req_no,
	row_id,
	org_wg_cd
	) 
AS 
SELECT
	mam_purc_upri_mam_purc_upri_all_org.itm_cd,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub1,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub2,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub3,
	mam_purc_upri_mam_purc_upri_all_org.sppl_cd,
	mam_purc_upri_mam_purc_upri_all_org.maker_cd,
	mam_purc_upri_mam_purc_upri_all_org.unit_cd,
	mam_purc_upri_mam_purc_upri_all_org.lot_qty,
	mam_purc_upri_mam_purc_upri_all_org.cur_cd,
	mam_purc_upri_mam_purc_upri_all_org.loc_cd,
	mam_purc_upri_mam_purc_upri_all_org.dlv_cd,
	mam_purc_upri_mam_purc_upri_all_org.wg_cd,
	mam_purc_upri_mam_purc_upri_all_org.st_dt,
	mam_purc_upri_mam_purc_upri_all_org.end_dt,
	mam_purc_upri_mam_purc_upri_all_org.upri,
	mam_purc_upri_mam_purc_upri_all_org.upri_bf,
	mam_purc_upri_mam_purc_upri_all_org.interim_flg,
	mam_purc_upri_mam_purc_upri_all_org.not_cost_flg,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri1,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri2,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri3,
	mam_purc_upri_mam_purc_upri_all_org.memo1,
	mam_purc_upri_mam_purc_upri_all_org.memo2,
	mam_purc_upri_mam_purc_upri_all_org.memo3,
	mam_purc_upri_mam_purc_upri_all_org.del_flg,
	mam_purc_upri_mam_purc_upri_all_org.del_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.del_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.del_ts,
	mam_purc_upri_mam_purc_upri_all_org.ins_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.ins_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.ins_ts,
	mam_purc_upri_mam_purc_upri_all_org.ins_func_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_cntr,
	mam_purc_upri_mam_purc_upri_all_org.upd_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.upd_ts,
	mam_purc_upri_mam_purc_upri_all_org.upd_func_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_srv_req_no,
	mam_purc_upri_mam_purc_upri_all_org.ctid::VARCHAR	row_id,
	mam_purc_upri_mam_purc_upri_all_org.wg_cd	org_wg_cd
FROM
	mam_purc_upri_all mam_purc_upri_mam_purc_upri_all_org
WHERE
	0 = 0
AND mam_purc_upri_mam_purc_upri_all_org.del_flg = '0'
	AND mam_purc_upri_mam_purc_upri_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_purc_upri_mam_purc_upri_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mam_purc_upri_mam_purc_upri_all_org.itm_cd,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub1,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub2,
	mam_purc_upri_mam_purc_upri_all_org.itm_sub3,
	mam_purc_upri_mam_purc_upri_all_org.sppl_cd,
	mam_purc_upri_mam_purc_upri_all_org.maker_cd,
	mam_purc_upri_mam_purc_upri_all_org.unit_cd,
	mam_purc_upri_mam_purc_upri_all_org.lot_qty,
	mam_purc_upri_mam_purc_upri_all_org.cur_cd,
	mam_purc_upri_mam_purc_upri_all_org.loc_cd,
	mam_purc_upri_mam_purc_upri_all_org.dlv_cd,
	mam_purc_upri_mam_wg_wg.wg_cd,
	mam_purc_upri_mam_purc_upri_all_org.st_dt,
	mam_purc_upri_mam_purc_upri_all_org.end_dt,
	mam_purc_upri_mam_purc_upri_all_org.upri,
	mam_purc_upri_mam_purc_upri_all_org.upri_bf,
	mam_purc_upri_mam_purc_upri_all_org.interim_flg,
	mam_purc_upri_mam_purc_upri_all_org.not_cost_flg,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri1,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri2,
	mam_purc_upri_mam_purc_upri_all_org.sub_upri3,
	mam_purc_upri_mam_purc_upri_all_org.memo1,
	mam_purc_upri_mam_purc_upri_all_org.memo2,
	mam_purc_upri_mam_purc_upri_all_org.memo3,
	mam_purc_upri_mam_purc_upri_all_org.del_flg,
	mam_purc_upri_mam_purc_upri_all_org.del_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.del_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.del_ts,
	mam_purc_upri_mam_purc_upri_all_org.ins_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.ins_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.ins_ts,
	mam_purc_upri_mam_purc_upri_all_org.ins_func_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_cntr,
	mam_purc_upri_mam_purc_upri_all_org.upd_usr_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_usr_nm,
	mam_purc_upri_mam_purc_upri_all_org.upd_ts,
	mam_purc_upri_mam_purc_upri_all_org.upd_func_id,
	mam_purc_upri_mam_purc_upri_all_org.upd_srv_req_no,
	mam_purc_upri_mam_purc_upri_all_org.ctid::VARCHAR	row_id,
	mam_purc_upri_mam_purc_upri_all_org.wg_cd	org_wg_cd
FROM
	mam_wg mam_purc_upri_mam_wg_wg,
	mam_purc_upri_all mam_purc_upri_mam_purc_upri_all_org
WHERE
	0 = 0
AND mam_purc_upri_mam_purc_upri_all_org.del_flg = '0'
	AND mam_purc_upri_mam_purc_upri_all_org.co_cd = fcpa_context$f_get_co_cd()
	AND mam_purc_upri_mam_purc_upri_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	AND (mam_purc_upri_mam_wg_wg.lg_flg = '1' OR mam_purc_upri_mam_wg_wg.mfg_flg = '1' OR mam_purc_upri_mam_wg_wg.sls_flg = '1')
	AND NOT EXISTS (
		SELECT	'X'
		FROM	mam_purc_upri_all mam_purc_upri_mam_purc_upri_all_x
		WHERE	0=0
		AND	mam_purc_upri_mam_purc_upri_all_x.co_cd = mam_purc_upri_mam_purc_upri_all_org.co_cd
		AND	mam_purc_upri_mam_purc_upri_all_x.itm_cd = mam_purc_upri_mam_purc_upri_all_org.itm_cd
		AND	mam_purc_upri_mam_purc_upri_all_x.itm_sub1 = mam_purc_upri_mam_purc_upri_all_org.itm_sub1
		AND	mam_purc_upri_mam_purc_upri_all_x.itm_sub2 = mam_purc_upri_mam_purc_upri_all_org.itm_sub2
		AND	mam_purc_upri_mam_purc_upri_all_x.itm_sub3 = mam_purc_upri_mam_purc_upri_all_org.itm_sub3
		AND	mam_purc_upri_mam_purc_upri_all_x.wg_cd = mam_purc_upri_mam_wg_wg.wg_cd
		AND 	mam_purc_upri_mam_purc_upri_all_x.del_flg = '0'
		)
;
CREATE OR REPLACE VIEW mam_purc_upri_$s (
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	sppl_cd,
	maker_cd,
	unit_cd,
	lot_qty,
	cur_cd,
	loc_cd,
	dlv_cd,
	wg_cd,
	st_dt,
	end_dt,
	upri,
	upri_bf,
	interim_flg,
	not_cost_flg,
	sub_upri1,
	sub_upri2,
	sub_upri3,
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
	upd_srv_req_no,
	row_id,
	org_wg_cd
	)
AS
SELECT 
	mam_purc_upri_mam_purc_upri_org.itm_cd,
	mam_purc_upri_mam_purc_upri_org.itm_sub1,
	mam_purc_upri_mam_purc_upri_org.itm_sub2,
	mam_purc_upri_mam_purc_upri_org.itm_sub3,
	mam_purc_upri_mam_purc_upri_org.sppl_cd,
	mam_purc_upri_mam_purc_upri_org.maker_cd,
	mam_purc_upri_mam_purc_upri_org.unit_cd,
	mam_purc_upri_mam_purc_upri_org.lot_qty,
	mam_purc_upri_mam_purc_upri_org.cur_cd,
	mam_purc_upri_mam_purc_upri_org.loc_cd,
	mam_purc_upri_mam_purc_upri_org.dlv_cd,
	mam_purc_upri_mam_purc_upri_org.wg_cd,
	mam_purc_upri_mam_purc_upri_org.st_dt,
	mam_purc_upri_mam_purc_upri_org.end_dt,
	mam_purc_upri_mam_purc_upri_org.upri,
	mam_purc_upri_mam_purc_upri_org.upri_bf,
	mam_purc_upri_mam_purc_upri_org.interim_flg,
	mam_purc_upri_mam_purc_upri_org.not_cost_flg,
	mam_purc_upri_mam_purc_upri_org.sub_upri1,
	mam_purc_upri_mam_purc_upri_org.sub_upri2,
	mam_purc_upri_mam_purc_upri_org.sub_upri3,
	mam_purc_upri_mam_purc_upri_org.memo1,
	mam_purc_upri_mam_purc_upri_org.memo2,
	mam_purc_upri_mam_purc_upri_org.memo3,
	mam_purc_upri_mam_purc_upri_org.del_flg,
	mam_purc_upri_mam_purc_upri_org.del_usr_id,
	mam_purc_upri_mam_purc_upri_org.del_usr_nm,
	mam_purc_upri_mam_purc_upri_org.del_ts,
	mam_purc_upri_mam_purc_upri_org.ins_usr_id,
	mam_purc_upri_mam_purc_upri_org.ins_usr_nm,
	mam_purc_upri_mam_purc_upri_org.ins_ts,
	mam_purc_upri_mam_purc_upri_org.ins_func_id,
	mam_purc_upri_mam_purc_upri_org.upd_cntr,
	mam_purc_upri_mam_purc_upri_org.upd_usr_id,
	mam_purc_upri_mam_purc_upri_org.upd_usr_nm,
	mam_purc_upri_mam_purc_upri_org.upd_ts,
	mam_purc_upri_mam_purc_upri_org.upd_func_id,
	mam_purc_upri_mam_purc_upri_org.upd_srv_req_no,
	mam_purc_upri_mam_purc_upri_org.row_id,
	mam_purc_upri_mam_purc_upri_org.org_wg_cd
FROM 
	mam_purc_upri mam_purc_upri_mam_purc_upri_org
;


