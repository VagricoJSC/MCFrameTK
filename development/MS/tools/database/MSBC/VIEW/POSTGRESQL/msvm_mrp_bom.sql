SELECT
	msvm_mrp_bom_mavm_bom_t1.par_itm_cd,
	msvm_mrp_bom_mavm_bom_t1.par_itm_sub1,
	msvm_mrp_bom_mavm_bom_t1.par_itm_sub2,
	msvm_mrp_bom_mavm_bom_t1.par_itm_sub3,
	msvm_mrp_bom_mavm_bom_t1.bom_ptn,
	msvm_mrp_bom_mavm_bom_t1.oper_cd,
	msvm_mrp_bom_mavm_bom_t1.oper_seq,
	msvm_mrp_bom_mavm_bom_t1.chd_itm_cd,
	msvm_mrp_bom_mavm_bom_t1.chd_itm_sub1,
	msvm_mrp_bom_mavm_bom_t1.chd_itm_sub2,
	msvm_mrp_bom_mavm_bom_t1.chd_itm_sub3,
	msvm_mrp_bom_mavm_bom_t1.ver_no,
	msvm_mrp_bom_mavm_bom_t1.ph_flg,
	msvm_mrp_bom_mavm_bom_t1.ph_bom_ptn,
	msvm_mrp_bom_mavm_bom_t1.alt_grp_cd,
	CASE
		WHEN msvm_mrp_bom_mavm_bom_t1.alt_grp_cd IS NULL THEN NULL
		ELSE
		CASE msvm_mrp_bom_mavm_bom_t1.alt_itm_flg
			WHEN '1' THEN msvm_mrp_bom_mavm_bom_t1.bom_rownum
			ELSE 0
		END
	END AS alt_grp_seq,
	msvm_mrp_bom_mavm_bom_t1.alt_itm_typ,
	msvm_mrp_bom_mavm_bom_t1.alt_itm_ratio,
	msvm_mrp_bom_mavm_bom_t1.alt_alloc_prio,
	msvm_mrp_bom_mavm_bom_t1.par_inst_qty,
	msvm_mrp_bom_mavm_bom_t1.chd_rqmt_qty,
	msvm_mrp_bom_mavm_bom_t1.fxd_chd_rqmt_qty,
	CAST (msvm_mrp_bom_mavm_bom_t1.sno_typ1 AS VARCHAR(1)) AS sno1_typ,
	msvm_mrp_bom_mavm_bom_t1.min_sno1,
	msvm_mrp_bom_mavm_bom_t1.max_sno1,
	CAST (msvm_mrp_bom_mavm_bom_t1.sno_typ2 AS VARCHAR(1)) AS sno2_typ,
	msvm_mrp_bom_mavm_bom_t1.min_sno2,
	msvm_mrp_bom_mavm_bom_t1.max_sno2,
	CAST (msvm_mrp_bom_mavm_bom_t1.sno_typ3 AS VARCHAR(1)) AS sno3_typ,
	msvm_mrp_bom_mavm_bom_t1.min_sno3,
	msvm_mrp_bom_mavm_bom_t1.max_sno3,
	CAST (msvm_mrp_bom_mavm_bom_t1.sno_typ4 AS VARCHAR(1)) AS sno4_typ,
	msvm_mrp_bom_mavm_bom_t1.min_sno4,
	msvm_mrp_bom_mavm_bom_t1.max_sno4,
	msvm_mrp_bom_mavm_bom_t1.in_offst_typ,
	msvm_mrp_bom_mavm_bom_t1.in_offst,
	msvm_mrp_bom_mavm_bom_t1.inpt_ctl_typ,
	msvm_mrp_bom_mavm_bom_t1.st_dt,
	msvm_mrp_bom_mavm_bom_t1.end_dt,
	msvm_mrp_bom_mavm_bom_t1.wg_cd
FROM mavm_bom msvm_mrp_bom_mavm_bom_t1
WHERE 0=0
AND msvm_mrp_bom_mavm_bom_t1.byprod_flg = '0'
AND msvm_mrp_bom_mavm_bom_t1.inpt_ctl_typ <> fcpa_const$get_const_val('MAC_INPT_CTL_TYP','NO_MRP_INST')
;
