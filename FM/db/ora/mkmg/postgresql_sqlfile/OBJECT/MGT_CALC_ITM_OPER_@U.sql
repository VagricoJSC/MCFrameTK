\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_oper_$u(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
	oper_ptn,
	oper_cd,
	oper_seq,
	wg_cd,
	disp_seq,
	nmr_qty,
	dnm_qty,
	yield_oper_flg,
	oper_unit_cd,
	oper_std_qty,
	oper_conv_qty,
	dec_place,
	unit_conv_rnd_typ,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.calc_no,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.calc_grp_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.itm_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.itm_sub1,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.itm_sub2,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.itm_sub3,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.loc_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_ptn,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_seq,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.wg_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.disp_seq,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.nmr_qty,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.dnm_qty,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.yield_oper_flg,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_unit_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_std_qty,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.oper_conv_qty,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.dec_place,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.unit_conv_rnd_typ,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.calc_ctg_cd,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.rmrks,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.sub_char1,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.sub_char2,
	mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.sub_char3
FROM
	mgt_calc_itm_oper_all mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_oper_$u_mgt_calc_itm_oper_all_org.co_cd = fcpa_context$f_get_co_cd()
;

