\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_itm(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
itm_ext,
wg_cd,
itm_typ,
calc_ptn_cd,
std_qty,
rnd_typ,
dec_place
)
AS
SELECT	mgvm_itm_mgt_calc_itm_t1.itm_cd,
	mgvm_itm_mgt_calc_itm_t1.itm_sub1,
	mgvm_itm_mgt_calc_itm_t1.itm_sub2,
	mgvm_itm_mgt_calc_itm_t1.itm_sub3,
	mgvm_itm_mgt_calc_itm_t1.itm_ext,
	mgvm_itm_mgt_calc_itm_t1.wg_cd,
	CASE mgvm_itm_mam_itm_cmn__m1.asset_mng_typ
		WHEN fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG') THEN '0'
		ELSE '1'
	END AS itm_typ,
	mgvm_itm_mgt_calc_itm_t1.calc_ptn_cd,
	mgvm_itm_mgt_calc_itm_t1.std_qty,
	fcpa_const$get_const_val('MAC_RND_TYP','RNDUP') AS rnd_typ, /* 切り上げ固定 */
	COALESCE(mgvm_itm_mam_itm_cmn__m1.dec_place, 2) AS dec_place
FROM	mgw_arg mgvm_itm_mgw_arg_w1, mgt_calc_itm mgvm_itm_mgt_calc_itm_t1, mam_itm_cmn_ mgvm_itm_mam_itm_cmn__m1
WHERE	0=0
AND	mgvm_itm_mgw_arg_w1.calc_no = mgvm_itm_mgt_calc_itm_t1.calc_no
AND	mgvm_itm_mgw_arg_w1.calc_grp_cd = mgvm_itm_mgt_calc_itm_t1.calc_grp_cd
AND	mgvm_itm_mgt_calc_itm_t1.itm_cd = mgvm_itm_mam_itm_cmn__m1.itm_cd
AND	mgvm_itm_mgt_calc_itm_t1.itm_sub1 = mgvm_itm_mam_itm_cmn__m1.itm_sub1
AND	mgvm_itm_mgt_calc_itm_t1.itm_sub2 = mgvm_itm_mam_itm_cmn__m1.itm_sub2
AND	mgvm_itm_mgt_calc_itm_t1.itm_sub3 = mgvm_itm_mam_itm_cmn__m1.itm_sub3
;;

