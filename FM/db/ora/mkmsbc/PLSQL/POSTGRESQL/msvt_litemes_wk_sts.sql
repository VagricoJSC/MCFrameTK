CREATE OR REPLACE VIEW msvt_litemes_wk_sts(
	co_cd,
	wk_schd_no,
	oper_inst_no,
	mfg_inst_no,
	wk_cost,
	fxd_wk_cost,
	mfg_sts_typ,
	mfg_sts_typ_nm,
	mfg_sts_typ_nm_lcl1,
	mfg_sts_typ_nm_lcl2,
	mfg_sts_typ_nm_lcl3,
	mfg_sts_typ_nm_lcl4,
	mfg_sts_typ_nm_lcl5,
	inst_mfg_sts_typ,
	wk_act_cost,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	wg_nm,
	wg_nm_lcl1,
	wg_nm_lcl2,
	wg_nm_lcl3,
	wg_nm_lcl4,
	wg_nm_lcl5,
	wk_cost_cd,
	oper_cd,
	st_schd_tm,
	end_schd_tm,
	st_tm,
	end_tm,
	brk_pd,
	st_act_tm,
	end_act_tm
	)
AS
SELECT
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd,
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.wk_schd_no, -- 工数予定NO
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.oper_inst_no, -- 工程指図NO
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.mfg_inst_no, -- 製造指図NO
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.wk_cost, -- 予定工数（数量依存）
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.fxd_wk_cost, -- 予定工数（固定）
	t2.mfg_sts_typ, -- 工数状況区分[工数状況]
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ) AS mfg_sts_typ_nm,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'ja_JP'::character varying) AS mfg_sts_typ_nm_lcl1,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'en_US'::character varying) AS mfg_sts_typ_nm_lcl2,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, 'zh_CN'::character varying) AS mfg_sts_typ_nm_lcl3,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, ''::character varying) AS mfg_sts_typ_nm_lcl4,
	"fcpa_const$str2name"('MSC_MFG_STS_TYP'::character varying, t2.mfg_sts_typ, ''::character varying) AS mfg_sts_typ_nm_lcl5,
	t7.mfg_sts_typ AS inst_mfg_sts_typ, -- 製造状況区分[製造指図]
	COALESCE(t3.wk_act_cost, (0)::numeric) AS wk_act_cost, -- 工数実績
	msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.itm_cd, -- 製造品目CD
	msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.itm_sub1,
	msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.itm_sub2,
	msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.itm_sub3,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm_lcl1,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm_lcl2,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm_lcl3,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm_lcl4,
	msvt_litemes_wk_sts_mavm_loc_if_all_m1.wg_nm_lcl5,
	msvt_litemes_wk_sts_mst_wk_schd_all_t1.wk_cost_cd, -- 工数管理CD
	msvt_litemes_wk_sts_mst_oper_inst_all_t4.oper_cd, -- 工程CD
	msvt_litemes_wk_sts_mst_oper_inst_all_t4.st_schd_tm, -- 着手予定日時[工程着手予定日]
	msvt_litemes_wk_sts_mst_oper_inst_all_t4.end_schd_tm, -- 終了予定日時[工程終了予定日]
	(to_timestamp(to_char(COALESCE(t3.st_tm, t3.ac_dt_min), 'YYYY/MM/DD HH24:MI:SS'::text), 'YYYY/MM/DD HH24:MI:SS'::text))::timestamp without time zone AS st_tm, -- [工数着手日時] NULLの場合「計上日MIN ＋ 00:00:00」
	(to_timestamp(replace(to_char(greatest(COALESCE(t3.end_tm, t3.ac_dt_max), t3.ac_dt_max), 'YYYY/MM/DD HH24:MI:SS'::text), '00:00:00'::text, '23:59:00'::text), 'YYYY/MM/DD HH24:MI:SS'::text))::timestamp without time zone AS end_tm, -- [工数終了日時] NULLの場合「計上日MAX + 23:59:00」
	COALESCE(t3.brk_pd, (0)::numeric) AS brk_pd,
	msvt_litemes_wk_sts_mst_mfg_act_all_t6.st_act_tm,
	msvt_litemes_wk_sts_mst_mfg_act_all_t6.end_act_tm
FROM
	mst_wk_schd_all msvt_litemes_wk_sts_mst_wk_schd_all_t1 -- 工数予定
	JOIN (SELECT
			msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1.wk_schd_no,
			msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1.co_cd,
			msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1.mfg_sts_typ
		FROM
			mst_wk_act_rem_all msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1 -- 工数実績残
		WHERE ((0=0)
			AND (msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1.div_seq = (0)::numeric)
			AND ((msvt_litemes_wk_sts_mst_wk_act_rem_all_ta1.mfg_sts_typ)::text = ANY ((ARRAY["fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'ORD'::character varying), "fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'STT'::character varying), "fcpa_const$get_const_val"('MSC_MFG_STS_TYP'::character varying, 'CMPL'::character varying)])::text[]))) --製造状況区分が指図済・着手中・完了と一致(SAV:指図保存、YET:未指図)
		) t2 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.wk_schd_no)::text = (t2.wk_schd_no)::text) AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (t2.co_cd)::text))
	LEFT OUTER JOIN (SELECT
						msvt_litemes_wk_sts_mst_wk_act_all_ta2.wk_schd_no,
						msvt_litemes_wk_sts_mst_wk_act_all_ta2.co_cd,
						sum(msvt_litemes_wk_sts_mst_wk_act_all_ta2.wk_cost) wk_act_cost, -- 工数実績
						min(msvt_litemes_wk_sts_mst_wk_act_all_ta2.ac_dt) ac_dt_min, -- 最小計上日
						max(msvt_litemes_wk_sts_mst_wk_act_all_ta2.ac_dt) ac_dt_max, -- 最大計上日
						min(msvt_litemes_wk_sts_mst_wk_act_all_ta2.st_tm) st_tm, -- 着手時刻
						max(msvt_litemes_wk_sts_mst_wk_act_all_ta2.end_tm) end_tm, -- 終了時刻
						sum(msvt_litemes_wk_sts_mst_wk_act_all_ta2.brk_pd) brk_pd -- 中断時間
					FROM
						mst_wk_act_all msvt_litemes_wk_sts_mst_wk_act_all_ta2 -- 工数実績
					GROUP BY
						msvt_litemes_wk_sts_mst_wk_act_all_ta2.wk_schd_no,
						msvt_litemes_wk_sts_mst_wk_act_all_ta2.co_cd
	) t3 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.wk_schd_no)::text = (t3.wk_schd_no)::text) AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (t3.co_cd)::text))
	LEFT OUTER JOIN mst_oper_inst_all msvt_litemes_wk_sts_mst_oper_inst_all_t4 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.oper_inst_no)::text = (msvt_litemes_wk_sts_mst_oper_inst_all_t4.oper_inst_no)::text) AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (msvt_litemes_wk_sts_mst_oper_inst_all_t4.co_cd)::text)) -- 工程指図
	LEFT OUTER JOIN mst_itm_mfg_inst_all msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.itm_mfg_inst_no)::text = (msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.itm_mfg_inst_no)::text) AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.co_cd)::text)) -- 品目製造指図
	LEFT OUTER JOIN mavm_loc_if_all msvt_litemes_wk_sts_mavm_loc_if_all_m1 ON (((msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.mfg_loc_cd)::text = (msvt_litemes_wk_sts_mavm_loc_if_all_m1.loc_cd)::text) AND ((msvt_litemes_wk_sts_mst_itm_mfg_inst_all_t5.co_cd)::text = (msvt_litemes_wk_sts_mavm_loc_if_all_m1.co_cd)::text))
	LEFT OUTER JOIN mst_mfg_act_all msvt_litemes_wk_sts_mst_mfg_act_all_t6 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.mfg_inst_no)::text = (msvt_litemes_wk_sts_mst_mfg_act_all_t6.mfg_inst_no)::text) AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (msvt_litemes_wk_sts_mst_mfg_act_all_t6.co_cd)::text)) -- 製造実績
	JOIN (SELECT
			msvt_litemes_wk_sts_mst_mfg_act_rem_all_ta7.mfg_inst_no,
			msvt_litemes_wk_sts_mst_mfg_act_rem_all_ta7.co_cd,
			msvt_litemes_wk_sts_mst_mfg_act_rem_all_ta7.mfg_sts_typ
		FROM
			mst_mfg_act_rem_all msvt_litemes_wk_sts_mst_mfg_act_rem_all_ta7 -- 製造実績残
		WHERE ((0=0)
			AND (msvt_litemes_wk_sts_mst_mfg_act_rem_all_ta7.div_seq = (0)::numeric)) -- 分割連番
		) t7 ON (((msvt_litemes_wk_sts_mst_wk_schd_all_t1.mfg_inst_no)::text = (t7.mfg_inst_no)::text)
			AND ((msvt_litemes_wk_sts_mst_wk_schd_all_t1.co_cd)::text = (t7.co_cd)::text)) -- 製造実績残
WHERE 0=0
AND msvt_litemes_wk_sts_mst_wk_schd_all_t1.can_flg = '0'::bpchar
;

