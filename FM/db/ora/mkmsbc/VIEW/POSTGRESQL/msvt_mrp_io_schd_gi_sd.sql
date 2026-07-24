SELECT
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_sts_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_pr_no AS itm_ord_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ver_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.loc_cd,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd IS NULL THEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.base_unit_qty
		ELSE
			CASE
				WHEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4.inst_base_unit_qty IS NULL THEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t3.ord_base_unit_qty
				ELSE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4.inst_base_unit_qty
			END
	END as base_unit_qty,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.schd_dt,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_inst_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_itm_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_itm_ratio,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_alloc_prio,
	msvt_mrp_io_schd_gi_sd_mst_oper_order_t2.oper_ptn,
	msvt_mrp_io_schd_gi_sd_mst_oper_order_t2.oper_cd,
	msvt_mrp_io_schd_gi_sd_mst_oper_order_t2.oper_seq,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.lot_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sublot_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno1,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno1_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno2,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno2_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno3,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno3_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno4,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno4_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ4,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno4,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.gd_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.inpt_ctl_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alloc_flg,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.wg_cd
FROM
	msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1
	LEFT OUTER JOIN mst_oper_order msvt_mrp_io_schd_gi_sd_mst_oper_order_t2 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no = msvt_mrp_io_schd_gi_sd_mst_oper_order_t2.oper_ord_no)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.base_unit_qty) AS numeric(21,8)) AS ord_base_unit_qty
					FROM
						msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no
		) msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t3 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t3.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t3.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t3.oper_ord_no)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.base_unit_qty) AS numeric(21,8)) AS inst_base_unit_qty
					FROM
						msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no
		) msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_inst_no = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t4.oper_inst_no)
WHERE 0=0
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.quality_typ = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD')
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GI') 
/* 以下の受払予定からオーダ生成されないようにマイナス在庫としてIFするため、対象外 */
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_typ NOT IN 
	(
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','ARR_RTN'),	/* 入荷返品 */
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','ARR_RTN_PROV'),	/* 入荷返品（支給） */
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','SCRP')	/* 廃棄 */
	) 
/* 仕入直送の受払予定は出庫、入庫とも対象外とする */
AND	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_sts_typ NOT IN
	(
	fcpa_const$get_const_val('MSC_IO_SCHD_STS_TYP','DDLV_SLO')	/* 直送受注 */
	) 
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.stk_id_typ IN 
	(
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
/* システムパラメータの値が'0'なら、依頼のデータを除外する */
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_sts_typ <> COALESCE(
	(CASE (SELECT parm_val AS sys_parm FROM mam_sys_parm WHERE parm_key = 'INCLD_SCHD_STS_FIX_FLG')
		WHEN '0' THEN
			fcpa_const$get_const_val('MSC_IO_SCHD_STS_TYP','FIX')	 /* 依頼 */
	END),'*')
UNION ALL
SELECT
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_schd_typ,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_schd_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_schd_sts_typ,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_schd_pr_no AS itm_ord_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_cd,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub1,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub2,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub3,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.ver_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.loc_cd,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_cd IS NULL THEN msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.base_unit_qty
		ELSE
			CASE
				WHEN msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5.inst_base_unit_qty IS NULL THEN msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t4.ord_base_unit_qty
				ELSE msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5.inst_base_unit_qty
			END
	END as base_unit_qty,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.schd_dt,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_cd,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_seq,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.oper_inst_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.oper_ord_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_itm_typ,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_itm_ratio,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_alloc_prio,
	NULL AS oper_ptn,
	NULL AS oper_cd,
	NULL AS oper_seq,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.lot_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sublot_no,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno1,
	CAST (CASE msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno1_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ1,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno2,
	CAST (CASE msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno2_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ2,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno3,
	CAST (CASE msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno3_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ3,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno4,
	CAST (CASE msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.sno4_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ4,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.ex_sno1,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.ex_sno2,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.ex_sno3,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.ex_sno4,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.gd_cd,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.inpt_ctl_typ,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alloc_flg,
	msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.wg_cd
FROM
	(SELECT fcpa_date_util$f_get_today() AS co_today) t3,
	mst_ord_io_schd msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2
		ON (msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_cd = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.itm_cd AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub1 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.itm_sub1 AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub2 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.itm_sub2 AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.itm_sub3 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.itm_sub3 AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.wg_cd = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.wg_cd)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.oper_ord_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.base_unit_qty) AS numeric(21,8)) AS ord_base_unit_qty
					FROM
						mst_ord_io_schd msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.oper_ord_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta1.oper_ord_no
		) msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t4 ON (msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t4.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t4.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.oper_ord_no = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t4.oper_ord_no)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.oper_inst_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.base_unit_qty) AS numeric(21,8)) AS inst_base_unit_qty
					FROM
						mst_ord_io_schd msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.oper_inst_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_ta2.oper_inst_no
		) msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5 ON (msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.oper_inst_no = msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t5.oper_inst_no)
WHERE 0=0
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GI') 
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.io_schd_typ = fcpa_const$get_const_val('MSC_IO_SCHD_TYP','XFR_GI_PLN') 
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.in_xfr_typ = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC')
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.stk_insp_typ = fcpa_const$get_const_val('MSC_STK_INSP_TYP','FIN') 
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.schd_dt <= TO_TIMESTAMP(t3.CO_TODAY::TEXT, 'YYYY-MM-DD HH24:MI:SS') + (msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.mrp_opn_xfr_days::NUMERIC || ' days')::INTERVAL /* msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t2.MRP_OPN_XFR_DAYSがnullの場合はfalseとなり抽出されない */
AND msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.wg_cd <> msvt_mrp_io_schd_gi_sd_mst_ord_io_schd_t1.org_wg_cd
UNION ALL
/* システムパラメータの値が'0'の時のみ、「MRP未確定移送依頼考慮日数」を考慮して、受払い状況区分が「依頼」のデータを追加する */
SELECT
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_sts_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_pr_no AS itm_ord_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ver_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.loc_cd,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd IS NULL THEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.base_unit_qty
		ELSE
			CASE
				WHEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6.inst_base_unit_qty IS NULL THEN msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t5.ord_base_unit_qty
				ELSE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6.inst_base_unit_qty
			END
	END as base_unit_qty,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.schd_dt,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_inst_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_itm_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_itm_ratio,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_alloc_prio,
	msvt_mrp_io_schd_gi_mst_oper_order_t2.oper_ptn,
	msvt_mrp_io_schd_gi_mst_oper_order_t2.oper_cd,
	msvt_mrp_io_schd_gi_mst_oper_order_t2.oper_seq,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.lot_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sublot_no,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno1,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno1_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP', 'EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno2,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno2_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP', 'EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno3,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno3_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP', 'EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno_typ3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno4,
	CAST (CASE msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.sno4_null_flg
		WHEN '1' THEN fcpa_const$get_const_val('MAC_SNO_TYP', 'EXTND_NULL')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP', 'EXTND')
	END AS VARCHAR(1)) AS sno_typ4,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno1,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno2,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno3,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.ex_sno4,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.gd_cd,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.inpt_ctl_typ,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alloc_flg,
	msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.wg_cd
FROM
	(SELECT fcpa_date_util$f_get_today() AS co_today) t4,
	msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1
	LEFT OUTER JOIN mst_oper_order msvt_mrp_io_schd_gi_mst_oper_order_t2 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no = msvt_mrp_io_schd_gi_mst_oper_order_t2.oper_ord_no)
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_io_schd_gi_mavm_itm_wg_t3
	ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_cd = msvt_mrp_io_schd_gi_mavm_itm_wg_t3.itm_cd AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub1 = msvt_mrp_io_schd_gi_mavm_itm_wg_t3.itm_sub1 AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub2 = msvt_mrp_io_schd_gi_mavm_itm_wg_t3.itm_sub2 AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.itm_sub3 = msvt_mrp_io_schd_gi_mavm_itm_wg_t3.itm_sub3 AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.wg_cd = msvt_mrp_io_schd_gi_mavm_itm_wg_t3.wg_cd)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.base_unit_qty) AS numeric(21,8)) AS ord_base_unit_qty
					FROM
						msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta1.oper_ord_no
		) msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t5 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t5.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t5.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_ord_no = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t5.oper_ord_no)
	LEFT OUTER JOIN (SELECT 
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no
						,CAST(SUM(msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.base_unit_qty) AS numeric(21,8)) AS inst_base_unit_qty
					FROM
						msvt_avl_io_schd msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2
					WHERE 0 = 0
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd IS NOT NULL
					AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no IS NOT NULL
					GROUP BY
						 msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_cd
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.alt_grp_seq
						,msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_ta2.oper_inst_no
		) msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6 ON (msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_cd = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6.alt_grp_cd AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.alt_grp_seq = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6.alt_grp_seq AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.oper_inst_no = msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t6.oper_inst_no)
WHERE 0=0
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.quality_typ = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD')
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_schd_sts_typ = COALESCE(
	(CASE (SELECT parm_val AS sys_parm FROM mam_sys_parm WHERE parm_key = 'INCLD_SCHD_STS_FIX_FLG')
		WHEN '0' THEN
			fcpa_const$get_const_val('MSC_IO_SCHD_STS_TYP','FIX')	 /* 依頼 */
	END),'*')
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GI')
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.stk_id_typ IN (
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
AND msvt_mrp_io_schd_gi_sd_msvt_avl_io_schd_t1.schd_dt <= TO_TIMESTAMP(t4.co_today::TEXT, 'YYYY-MM-DD HH24:MI:SS') + (msvt_mrp_io_schd_gi_mavm_itm_wg_t3.mrp_opn_xfr_days::NUMERIC || ' days')::INTERVAL	/* msvt_mrp_io_schd_gi_mavm_itm_wg_t2.mrp_opn_xfr_daysがnullの場合はfalseとなり抽出されない */
UNION ALL
/* ここまではMSVT_MRP_IO_SCHD_GIと同じ仕様 */
/* 日次需要はシミュの場合MAVM_ITM_WGのPROD_PLN_TYPがMAC_PROD_PLN_TYP.DMND_USE以外のものも取得する */
SELECT
	CAST (fcpa_const$get_const_val('MSC_IO_SCHD_TYP','SHIP_OUT') AS VARCHAR(5)) AS io_schd_typ,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.rqmt_no AS io_schd_no,
	CAST (fcpa_const$get_const_val('MSC_IO_SCHD_STS_TYP','SCHD') AS VARCHAR(2)) AS io_schd_sts_typ,
	NULL AS itm_ord_no,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_cd,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub1,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub2,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub3,
	NULL AS ver_no,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.strg_loc_cd AS loc_cd,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.rqmt_qty AS base_unit_qty,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.due_dt AS schd_dt,
	NULL AS alt_grp_cd,
	NULL AS alt_grp_seq,
	NULL AS oper_inst_no,
	NULL AS oper_ord_no,
	NULL AS alt_itm_typ,
	NULL AS alt_itm_ratio,
	NULL AS alt_alloc_prio,
	NULL AS oper_ptn,
	NULL AS oper_cd,
	NULL AS oper_seq,
	NULL AS lot_no,
	NULL AS sublot_no,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.sno1_mng_typ = MAC_SNO_MNG_TYP$MNG_NOT_STK() THEN MAC_STR$NULL_VAL()
		ELSE msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno1
	END as sno1,
	CAST (fcpa_const$get_const_val('MAC_SNO_TYP','EXTND') AS VARCHAR(1)) AS sno_typ1,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.sno2_mng_typ = MAC_SNO_MNG_TYP$MNG_NOT_STK() THEN MAC_STR$NULL_VAL()
		ELSE msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno2
	END as sno2,
	CAST (fcpa_const$get_const_val('MAC_SNO_TYP','EXTND') AS VARCHAR(1)) AS sno_typ2,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.sno3_mng_typ = MAC_SNO_MNG_TYP$MNG_NOT_STK() THEN MAC_STR$NULL_VAL()
		ELSE msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno3
	END as sno3,
	CAST (fcpa_const$get_const_val('MAC_SNO_TYP','EXTND') AS VARCHAR(1)) AS sno_typ3,
	CASE
		WHEN msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.sno4_mng_typ = MAC_SNO_MNG_TYP$MNG_NOT_STK() THEN MAC_STR$NULL_VAL()
		ELSE msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno4
	END as sno4,
	CAST (fcpa_const$get_const_val('MAC_SNO_TYP','EXTND') AS VARCHAR(1)) AS sno_typ4,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno1 AS ex_sno1,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno2 AS ex_sno2,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno3 AS ex_sno3,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.sno4 AS ex_sno4,
	t2.GD_CD,
	NULL AS inpt_ctl_typ,
	'0' AS alloc_flg,
	msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.wg_cd
FROM
	msvt_mrp_dly_dmnd msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3 ON (msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_cd = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.itm_cd AND msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub1 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.itm_sub1 AND msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub2 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.itm_sub2 AND msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.itm_sub3 = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.itm_sub3 AND msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.wg_cd = msvt_mrp_io_schd_gi_sd_mavm_itm_wg_t3.wg_cd),
	(SELECT mapa_util$f_get_def_gd_cd() AS gd_cd) t2
WHERE 0=0
AND msvt_mrp_io_schd_gi_sd_msvt_mrp_dly_dmnd_t1.dmnd_typ IN (
	fcpa_const$get_const_val('MSC_DMND_TYP','CST_FRCST'),
	fcpa_const$get_const_val('MSC_DMND_TYP','PLN_SLS')
	)
;
