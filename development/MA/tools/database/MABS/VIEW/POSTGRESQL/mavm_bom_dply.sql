SELECT
	m1.bom_key,
	m1.wg_cd,
	m1.par_itm_cd,
	m1.par_itm_sub1,
	m1.par_itm_sub2,
	m1.par_itm_sub3,
	m1.bom_ptn,
	m1.oper_cd,
	m1.oper_seq,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_itm_cd
		ELSE mavm_bom_mam_alt_itm_m3.chd_itm_cd
	END AS chd_itm_cd,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_itm_sub1
		ELSE mavm_bom_mam_alt_itm_m3.chd_itm_sub1
	END AS chd_itm_sub1,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_itm_sub2
		ELSE mavm_bom_mam_alt_itm_m3.chd_itm_sub2
	END AS chd_itm_sub2,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_itm_sub3
		ELSE mavm_bom_mam_alt_itm_m3.chd_itm_sub3
	END AS chd_itm_sub3,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.ver_no
		ELSE mavm_bom_mam_alt_itm_m3.ver_no
	END AS ver_no,
	m1.ph_flg,
	m1.ph_bom_ptn,
	m1.alt_itm_flg,
	m1.alt_grp_cd,
	CASE
		WHEN mavm_bom_mam_alt_grp__m2.alt_grp_cd IS NULL THEN m1.alt_itm_typ
		ELSE mavm_bom_mam_alt_grp__m2.alt_itm_typ
	END AS alt_itm_typ,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.alt_itm_ratio
		ELSE mavm_bom_mam_alt_itm_m3.alt_itm_ratio
	END AS alt_itm_ratio,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.alt_alloc_prio
		ELSE mavm_bom_mam_alt_itm_m3.alt_alloc_prio
	END AS alt_alloc_prio,
	CASE mavm_bom_mam_itm_com_m4.sno1_mng_typ
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','NOT_MNG') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_REQ') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_NOT_STK') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE m1.sno_typ1
	END AS sno_typ1,
	CASE mavm_bom_mam_itm_com_m4.sno2_mng_typ
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','NOT_MNG') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_REQ') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_NOT_STK') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE m1.sno_typ2
	END AS sno_typ2,
	CASE mavm_bom_mam_itm_com_m4.sno3_mng_typ
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','NOT_MNG') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_REQ') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_NOT_STK') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE m1.SNO_TYP3
	END AS sno_typ3,
	CASE mavm_bom_mam_itm_com_m4.sno4_mng_typ
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','NOT_MNG') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_REQ') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
		WHEN fcpa_const$get_const_val('MAC_SNO_MNG_TYP','MNG_NOT_STK') THEN fcpa_const$get_const_val('MAC_SNO_TYP','EXTND_NULL')
		ELSE m1.sno_typ4
	END AS sno_typ4,
	m1.min_sno1,
	m1.max_sno1,
	m1.min_sno2,
	m1.max_sno2,
	m1.min_sno3,
	m1.max_sno3,
	m1.min_sno4,
	m1.max_sno4,
	m1.par_inst_qty,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_inpt_qty
		ELSE m1.chd_inpt_qty * mavm_bom_mam_alt_itm_m3.chd_inpt_ratio
	END AS chd_inpt_qty,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.chd_rqmt_qty
		ELSE m1.chd_rqmt_qty * mavm_bom_mam_alt_itm_m3.chd_rqmt_ratio
	END AS chd_rqmt_qty,
	mavm_bom_mam_alt_itm_m3.chd_inpt_ratio,
	mavm_bom_mam_alt_itm_m3.chd_rqmt_ratio,
	CASE
		CASE
			WHEN mavm_bom_mam_alt_grp__m2.alt_grp_cd IS NULL THEN m1.alt_itm_typ
			ELSE mavm_bom_mam_alt_grp__m2.alt_itm_typ
		END
		WHEN fcpa_const$get_const_val('MAC_ALT_ITM_TYP','MIX') THEN 0 -- 代替混在可の場合は常に0
		ELSE
		CASE
			WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.fxd_chd_rqmt_qty
			ELSE m1.fxd_chd_rqmt_qty + mavm_bom_mam_alt_itm_m3.fxd_chd_rqmt_qty
		END
	END AS fxd_chd_rqmt_qty,
	m1.byprod_flg,
	m1.in_offst_typ,
	m1.in_offst,
	m1.bkf_typ,
	m1.inst_lot_fix_flg,
	CASE
		WHEN mavm_bom_mam_itm_com_m4.lot_mng_typ IS NULL THEN m1.lot_mix_flg
		WHEN mavm_bom_mam_itm_com_m4.lot_mng_typ = fcpa_const$get_const_val('MAC_LOT_MNG_TYP','NOT_MNG') THEN '0'
		ELSE
		CASE mavm_bom_mam_alt_grp__m2.alt_itm_typ
			WHEN fcpa_const$get_const_val('MAC_ALT_ITM_TYP','MIX') THEN '1'
			ELSE m1.LOT_MIX_FLG
		END
	END AS lot_mix_flg,
	CASE
		WHEN mavm_bom_mam_itm_com_m4.sublot_mng_typ IS NULL THEN m1.sublot_mix_flg
		WHEN mavm_bom_mam_itm_com_m4.sublot_mng_typ = fcpa_const$get_const_val('MAC_SUBLOT_MNG_TYP','NOT_MNG') THEN '0'
		ELSE
		CASE mavm_bom_mam_alt_grp__m2.alt_itm_typ
			WHEN fcpa_const$get_const_val('MAC_ALT_ITM_TYP','MIX') THEN '1'
			ELSE m1.sublot_mix_flg
		END
	END AS sublot_mix_flg,
	m1.alloc_ctl_typ,
	m1.main_itm_flg,
	m1.yield_calc_flg,
	m1.inpt_ctl_typ,
	m1.disp_seq,
	m1.chng_no,
	m1.ext_sys_no_bom,
	CASE
		WHEN mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL THEN m1.not_cost_flg
		ELSE mavm_bom_mam_alt_itm_m3.not_cost_flg
	END AS not_cost_flg,
	fcpa_postgres_util$greatest(m1.st_dt, COALESCE(mavm_bom_mam_alt_itm_m3.st_dt, m1.st_dt)) AS st_dt,
	fcpa_postgres_util$least(m1.end_dt, COALESCE(mavm_bom_mam_alt_itm_m3.end_dt, m1.end_dt)) AS end_dt,
	m1.memo1,
	m1.memo2,
	m1.memo3,
	m1.del_flg
FROM
	(SELECT mavm_bom_mam_bom_m1.*, row_number() OVER (ORDER BY NULL) AS bom_rownum FROM mam_bom mavm_bom_mam_bom_m1 WHERE mavm_bom_mam_bom_m1.del_flg = '0') m1
	LEFT OUTER JOIN mam_alt_grp_ mavm_bom_mam_alt_grp__m2 ON (m1.alt_itm_flg = '1' AND m1.alt_grp_cd = mavm_bom_mam_alt_grp__m2.alt_grp_cd AND m1.wg_cd = mavm_bom_mam_alt_grp__m2.wg_cd AND mavm_bom_mam_alt_grp__m2.del_flg = '0')
	LEFT OUTER JOIN mam_alt_itm mavm_bom_mam_alt_itm_m3 ON (m1.alt_itm_flg = '1' AND m1.alt_grp_cd = mavm_bom_mam_alt_itm_m3.alt_grp_cd AND m1.wg_cd = mavm_bom_mam_alt_itm_m3.wg_cd AND mavm_bom_mam_alt_itm_m3.del_flg = '0')
	LEFT OUTER JOIN mam_itm_com mavm_bom_mam_itm_com_m4 ON 
		(0 = 0
		AND mavm_bom_mam_alt_itm_m3.chd_itm_cd = mavm_bom_mam_itm_com_m4.itm_cd 
		AND mavm_bom_mam_alt_itm_m3.chd_itm_sub1 = mavm_bom_mam_itm_com_m4.itm_sub1 
		AND mavm_bom_mam_alt_itm_m3.chd_itm_sub2 = mavm_bom_mam_itm_com_m4.itm_sub2 
		AND mavm_bom_mam_alt_itm_m3.chd_itm_sub3 = mavm_bom_mam_itm_com_m4.itm_sub3 
		AND mavm_bom_mam_itm_com_m4.co_cd = fcpa_context$f_get_co_cd() 
		AND mavm_bom_mam_itm_com_m4.del_flg = '0'
		)
WHERE 0 = 0
AND fcpa_postgres_util$greatest(m1.st_dt, COALESCE(mavm_bom_mam_alt_itm_m3.st_dt, m1.st_dt)) <= fcpa_postgres_util$least(m1.end_dt, COALESCE(mavm_bom_mam_alt_itm_m3.end_dt, m1.end_dt))
AND NOT (m1.alt_itm_flg = '1' AND (mavm_bom_mam_alt_grp__m2.alt_grp_cd IS NULL OR mavm_bom_mam_alt_itm_m3.alt_grp_cd IS NULL))
;
