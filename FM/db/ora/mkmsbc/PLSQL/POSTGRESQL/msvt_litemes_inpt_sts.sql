CREATE OR REPLACE VIEW msvt_litemes_inpt_sts(
	co_cd,
	inpt_schd_no,
	oper_inst_no,
	mfg_inst_no,
	mfg_sts_typ,
	mfg_sts_typ_nm,
	mfg_sts_typ_nm_lcl1,
	mfg_sts_typ_nm_lcl2,
	mfg_sts_typ_nm_lcl3,
	mfg_sts_typ_nm_lcl4,
	mfg_sts_typ_nm_lcl5,
	inst_mfg_sts_typ,
	base_unit_inpt_qty,
	base_unit_rqmt_qty,
	base_unit_fxd_rqmt_qty,
	base_unit_inpt_act_qty,
	base_unit_loss_act_qty,
	base_unit_fxd_loss_qty,
	oper_cd,
	mfg_itm_cd,
	mfg_itm_sub1,
	mfg_itm_sub2,
	mfg_itm_sub3,
	wg_cd,
	wg_nm,
	wg_nm_lcl1,
	wg_nm_lcl2,
	wg_nm_lcl3,
	wg_nm_lcl4,
	wg_nm_lcl5,
	alt_grp_cd,
	alt_grp_nm,
	inpt_itm_cd,
	inpt_itm_sub1,
	inpt_itm_sub2,
	inpt_itm_sub3,
	lot_no,
	sublot_no,
	inpt_loc_cd,
	inpt_str_ln_cd,
	schd_tm,
	act_tm,
	st_act_tm,
	end_act_tm
	)
AS
SELECT
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.inpt_schd_no, -- 投入予定NO
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.oper_inst_no, -- 工程指図NO
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.mfg_inst_no, -- 製造指図NO
	t2.mfg_sts_typ, -- 製造状況区分[投入状況]
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ) AS mfg_sts_typ_nm,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'ja_JP'::character varying) AS mfg_sts_typ_nm_lcl1,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'en_US'::character varying) AS mfg_sts_typ_nm_lcl2,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'zh_CN'::character varying) AS mfg_sts_typ_nm_lcl3,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, ''::character varying) AS mfg_sts_typ_nm_lcl4,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, ''::character varying) AS mfg_sts_typ_nm_lcl5,
	t7.mfg_sts_typ AS inst_mfg_sts_typ, -- 製造状況区分[製造指図]
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.base_unit_inpt_qty, -- 基準単位投入数量[予定投入数量]
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.base_unit_rqmt_qty,-- 基準単位必要数量
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.base_unit_fxd_rqmt_qty, -- 基準単位固定必要数量[予定固定ロス数量]
	COALESCE(t3.base_unit_inpt_act_qty, (0)::numeric) AS base_unit_inpt_act_qty, -- 基準単位投入数量[投入数量]
	COALESCE(t3.base_unit_loss_act_qty, (0)::numeric) AS base_unit_loss_act_qty, -- 基準単位ロス数量[ロス数量]
	COALESCE(t3.base_unit_fxd_loss_qty, (0)::numeric) AS base_unit_fxd_loss_qty, -- 基準単位固定ロス数量[固定ロス数量]
	msvt_litemes_inpt_sts_mst_oper_inst_all_t4.oper_cd, -- 工程CD
	msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.itm_cd AS mfg_itm_cd, -- 製造品目CD
	msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.itm_sub1 AS mfg_itm_sub1,
	msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.itm_sub2 AS mfg_itm_sub2,
	msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.itm_sub3 AS mfg_itm_sub3,
	msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.wg_cd,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm_lcl1,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm_lcl2,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm_lcl3,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm_lcl4,
	msvt_litemes_inpt_sts_mavm_loc_if_all_m2.wg_nm_lcl5,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.alt_grp_cd, -- 代替グループCD
	msvt_litemes_inpt_sts_mam_alt_grp_all_m1.alt_grp_nm,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.itm_cd AS inpt_itm_cd, -- 投入品目CD
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.itm_sub1 AS inpt_itm_sub1,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.itm_sub2 AS inpt_itm_sub2,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.itm_sub3 AS inpt_itm_sub3,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.lot_no,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.sublot_no,
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.inpt_loc_cd, -- 投入場所
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.inpt_str_ln_cd, -- 投入棚・ライン
	msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.schd_tm, -- 投入予定日時
	t3.act_tm, -- 投入実績日時
	msvt_litemes_inpt_sts_mst_mfg_act_all_t6.st_act_tm,
	msvt_litemes_inpt_sts_mst_mfg_act_all_t6.end_act_tm
FROM
	mst_inpt_schd_all msvt_litemes_inpt_sts_mst_inpt_schd_all_t1 -- 投入予定
	JOIN (SELECT
			msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1.inpt_schd_no,
			msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1.co_cd,
			msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1.mfg_sts_typ
		FROM
			mst_inpt_act_rem_all msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1-- 投入実績残
		WHERE ((0=0)
			AND (msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1.div_seq = (0)::numeric) -- 分割連番
			AND ((msvt_litemes_inpt_sts_mst_inpt_act_rem_all_ta1.mfg_sts_typ)::text = ANY ((ARRAY["fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'ORD'::character varying), "fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'STT'::character varying), "fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'CMPL'::character varying)])::text[]))) --製造状況区分が指図済・着手中・完了と一致(SAV:指図保存、YET:未指図)
		) t2 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.inpt_schd_no)::text = (t2.inpt_schd_no)::text)
			AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (t2.co_cd)::text)) -- 投入実績残
	LEFT OUTER JOIN (SELECT 
						msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.co_cd,
						sum(msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.base_unit_inpt_qty) base_unit_inpt_act_qty, -- 基準単位投入数量
						sum(msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.base_unit_loss_qty) base_unit_loss_act_qty, -- 基準単位ロス数量
						sum(msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.base_unit_fxd_loss_qty) base_unit_fxd_loss_qty, -- 基準単位固定ロス数量
						max(msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.act_tm) act_tm -- 投入実績日時
					FROM
						mst_inpt_act_all msvt_litemes_inpt_sts_mst_inpt_act_all_ta2
					GROUP BY
						msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.inpt_schd_no,
						msvt_litemes_inpt_sts_mst_inpt_act_all_ta2.co_cd
					) t3 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.inpt_schd_no)::text = (t3.inpt_schd_no)::text) 
						AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (t3.co_cd)::text)) -- 投入実績
	LEFT OUTER JOIN mst_oper_inst_all msvt_litemes_inpt_sts_mst_oper_inst_all_t4 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.oper_inst_no)::text = (msvt_litemes_inpt_sts_mst_oper_inst_all_t4.oper_inst_no)::text) AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (msvt_litemes_inpt_sts_mst_oper_inst_all_t4.co_cd)::text)) -- 工程指図
	LEFT OUTER JOIN mst_itm_mfg_inst_all msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.itm_mfg_inst_no)::text = (msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.itm_mfg_inst_no)::text) AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.co_cd)::text)) -- 品目製造指図
	LEFT OUTER JOIN mam_alt_grp_all msvt_litemes_inpt_sts_mam_alt_grp_all_m1 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.alt_grp_cd)::text = (msvt_litemes_inpt_sts_mam_alt_grp_all_m1.alt_grp_cd)::text) AND ((msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.wg_cd)::text = (msvt_litemes_inpt_sts_mam_alt_grp_all_m1.wg_cd)::text) AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (msvt_litemes_inpt_sts_mam_alt_grp_all_m1.co_cd)::text)) -- 代替グループマスタ
	LEFT OUTER JOIN mavm_loc_if_all msvt_litemes_inpt_sts_mavm_loc_if_all_m2 ON (((msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.mfg_loc_cd)::text = (msvt_litemes_inpt_sts_mavm_loc_if_all_m2.loc_cd)::text) AND ((msvt_litemes_inpt_sts_mst_itm_mfg_inst_all_t5.co_cd)::text = (msvt_litemes_inpt_sts_mavm_loc_if_all_m2.co_cd)::text))
	LEFT OUTER JOIN mst_mfg_act_all msvt_litemes_inpt_sts_mst_mfg_act_all_t6 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.mfg_inst_no)::text = (msvt_litemes_inpt_sts_mst_mfg_act_all_t6.mfg_inst_no)::text) AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (msvt_litemes_inpt_sts_mst_mfg_act_all_t6.co_cd)::text)) -- 製造実績
	JOIN (SELECT
			msvt_litemes_inpt_sts_mst_mfg_act_rem_all_ta7.mfg_inst_no,
			msvt_litemes_inpt_sts_mst_mfg_act_rem_all_ta7.co_cd,
			msvt_litemes_inpt_sts_mst_mfg_act_rem_all_ta7.mfg_sts_typ
		FROM
			mst_mfg_act_rem_all msvt_litemes_inpt_sts_mst_mfg_act_rem_all_ta7 -- 製造実績残
		WHERE ((0=0)
			AND (msvt_litemes_inpt_sts_mst_mfg_act_rem_all_ta7.div_seq = (0)::numeric)) -- 分割連番
		) t7 ON (((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.mfg_inst_no)::text = (t7.mfg_inst_no)::text)
			AND ((msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.co_cd)::text = (t7.co_cd)::text)) -- 製造実績残
WHERE 0=0
	AND msvt_litemes_inpt_sts_mst_inpt_schd_all_t1.can_flg = '0'::bpchar
;
