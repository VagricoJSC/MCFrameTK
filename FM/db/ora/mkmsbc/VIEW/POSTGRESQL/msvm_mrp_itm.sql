SELECT
	msvm_mrp_itm_mavm_itm_wg_t1.itm_cd,
	msvm_mrp_itm_mavm_itm_wg_t1.itm_sub1,
	msvm_mrp_itm_mavm_itm_wg_t1.itm_sub2,
	msvm_mrp_itm_mavm_itm_wg_t1.itm_sub3,
	msvm_mrp_itm_mavm_itm_wg_t1.wg_cd,
	CAST (msvm_mrp_itm_mavm_itm_wg_t1.mrp_proc_typ AS VARCHAR(1)) AS mrp_proc_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.unit_cd,
	msvm_mrp_itm_mavm_itm_wg_t1.dec_place,
	msvm_mrp_itm_mavm_itm_wg_t1.sch_flg,
	msvm_mrp_itm_mavm_itm_wg_t1.rqmt_rstr_qty,
	msvm_mrp_itm_mavm_itm_wg_t1.ship_term_cd,
	msvm_mrp_itm_mavm_itm_wg_t1.lot_mng_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.sublot_mng_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.sno1_mng_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.sno2_mng_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.sno3_mng_typ,
	msvm_mrp_itm_mavm_itm_wg_t1.sno4_mng_typ,
	msvm_mrp_itm_mam_itm_stop_t2.order_stop_dt,
	msvm_mrp_itm_mavm_itm_wg_t1.release_flg
FROM mavm_itm_wg msvm_mrp_itm_mavm_itm_wg_t1
	LEFT OUTER JOIN mam_itm_stop msvm_mrp_itm_mam_itm_stop_t2
		ON (msvm_mrp_itm_mavm_itm_wg_t1.itm_cd = msvm_mrp_itm_mam_itm_stop_t2.itm_cd
			AND msvm_mrp_itm_mavm_itm_wg_t1.itm_sub1 = msvm_mrp_itm_mam_itm_stop_t2.itm_sub1
			AND msvm_mrp_itm_mavm_itm_wg_t1.itm_sub2 = msvm_mrp_itm_mam_itm_stop_t2.itm_sub2
			AND msvm_mrp_itm_mavm_itm_wg_t1.itm_sub3 = msvm_mrp_itm_mam_itm_stop_t2.itm_sub3
			AND msvm_mrp_itm_mam_itm_stop_t2.del_flg = '0'
			)
WHERE 0=0
AND msvm_mrp_itm_mavm_itm_wg_t1.del_flg = '0'
;
