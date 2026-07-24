SELECT
	mavm_loc_mst_mam_loc_all_t1.loc_cd,
	mavm_loc_mst_mam_loc_all_t1.loc_nm,
	mavm_loc_mst_mam_loc_all_t1.asst_dpt_cd,
	mavm_loc_mst_mam_loc_all_t1.sls_dpt_cd,
	mavm_loc_mst_mam_loc_all_t1.wg_cd,
	mavm_loc_mst_mam_loc_all_t1.site_cd,
	mavm_loc_mst_mam_loc_all_t1.lg_grp_cd,
	mavm_loc_mst_mam_loc_all_t1.lg_def_flg,
	mavm_loc_mst_mam_loc_all_t1.loc_grp_cd,
	mavm_loc_mst_mam_loc_all_t1.alloc_grp_cd,
	mavm_loc_mst_mam_loc_all_t1.sppl_cd,
	mavm_loc_mst_mam_loc_all_t1.maker_cd,
	mavm_loc_mst_mam_loc_all_t1.pre_outsrc_act_flg,
	mavm_loc_mst_mam_loc_all_t1.ddlv_prov_insp_flg,
	mavm_loc_mst_mam_loc_all_t1.cal_cd,
	mavm_loc_mst_mam_loc_all_t1.loc_mng_typ,
	mavm_loc_mst_mam_loc_all_t1.prnt_lcl_cd,
	mavm_loc_mst_mam_loc_all_t1.cntry_cd,
	mavm_loc_mst_mam_loc_all_t1.num_id,
	mavm_loc_mst_mam_loc_all_t1.stktk_tgt_flg,
	mavm_loc_mst_mam_loc_all_t1.stktk_tor_disp_flg,
	mavm_loc_mst_mam_loc_all_t1.stktk_tor_ex_zero_flg,
	mavm_loc_mst_mam_loc_all_t1.stktk_act_ex_zero_flg,
	mavm_loc_mst_mam_loc_all_t1.stktk_amt_flg,
	mavm_loc_mst_mam_loc_all_t1.str_ln_tgt_flg,
	mavm_loc_mst_mam_loc_all_t1.alloc_lmt_flg,
	mavm_loc_mst_mam_loc_all_t1.gi_pack_xfer_flg,
	mavm_loc_mst_mam_loc_all_t1.gi_vmi_flg,
	mavm_loc_mst_mam_loc_all_t1.rsrc_cd1,
	mavm_loc_mst_mam_loc_all_t1.rsrc_cd2,
	mavm_loc_mst_mam_loc_all_t1.ext_sys_loc_typ,
	mavm_loc_mst_mam_loc_all_t1.loc_alc_grp,
	mavm_loc_mst_mam_loc_all_t1.addr_flg,
	mavm_loc_mst_mam_loc_all_t1.zip_cd,
	mavm_loc_mst_mam_loc_all_t1.addr1,
	mavm_loc_mst_mam_loc_all_t1.addr2,
	mavm_loc_mst_mam_loc_all_t1.addr3,
	mavm_loc_mst_mam_loc_all_t1.addr4,
	mavm_loc_mst_mam_loc_all_t1.tel,
	mavm_loc_mst_mam_loc_all_t1.fax,
	mavm_loc_mst_mam_loc_all_t1.memo1,
	mavm_loc_mst_mam_loc_all_t1.memo2,
	mavm_loc_mst_mam_loc_all_t1.memo3,
	mavm_loc_mst_mam_loc_all_t1.del_flg,
	mavm_loc_mst_mam_loc_all_t1.del_usr_id,
	mavm_loc_mst_mam_loc_all_t1.del_usr_nm,
	mavm_loc_mst_mam_loc_all_t1.del_ts,
	mavm_loc_mst_mam_loc_all_t1.ins_usr_id,
	mavm_loc_mst_mam_loc_all_t1.ins_usr_nm,
	mavm_loc_mst_mam_loc_all_t1.ins_ts,
	mavm_loc_mst_mam_loc_all_t1.ins_func_id,
	mavm_loc_mst_mam_loc_all_t1.upd_cntr,
	mavm_loc_mst_mam_loc_all_t1.upd_usr_id,
	mavm_loc_mst_mam_loc_all_t1.upd_usr_nm,
	mavm_loc_mst_mam_loc_all_t1.upd_ts,
	mavm_loc_mst_mam_loc_all_t1.upd_func_id,
	mavm_loc_mst_mam_loc_all_t1.upd_srv_req_no,
	mavm_loc_mst_mam_loc_all_t1.co_cd,
	--場所名（ロケール１）
	(SELECT mavm_loc_mst_mam_loc_lcl_all_t.loc_nm
		FROM mam_loc_lcl_all mavm_loc_mst_mam_loc_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_all_t.loc_cd = mavm_loc_mst_mam_loc_all_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.co_cd = mavm_loc_mst_mam_loc_all_t1.co_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.lcl_cd = 'ja_JP'
	)	loc_nm_lcl1,
	--場所名（ロケール２）
	(SELECT mavm_loc_mst_mam_loc_lcl_all_t.loc_nm
		FROM mam_loc_lcl_all mavm_loc_mst_mam_loc_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_all_t.loc_cd = mavm_loc_mst_mam_loc_all_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.co_cd = mavm_loc_mst_mam_loc_all_t1.co_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.lcl_cd = 'en_US'
	)	loc_nm_lcl2,
	--場所名（ロケール３）
	(SELECT mavm_loc_mst_mam_loc_lcl_all_t.loc_nm
		FROM mam_loc_lcl_all mavm_loc_mst_mam_loc_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_all_t.loc_cd = mavm_loc_mst_mam_loc_all_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.co_cd = mavm_loc_mst_mam_loc_all_t1.co_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.lcl_cd = 'TBD3'
	)	loc_nm_lcl3,
	--場所名（ロケール４）
	(SELECT mavm_loc_mst_mam_loc_lcl_all_t.loc_nm
		FROM mam_loc_lcl_all mavm_loc_mst_mam_loc_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_all_t.loc_cd = mavm_loc_mst_mam_loc_all_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.co_cd = mavm_loc_mst_mam_loc_all_t1.co_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.lcl_cd = 'TBD4'
	)	loc_nm_lcl4,
	--場所名（ロケール５）
	(SELECT mavm_loc_mst_mam_loc_lcl_all_t.loc_nm
		FROM mam_loc_lcl_all mavm_loc_mst_mam_loc_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_all_t.loc_cd = mavm_loc_mst_mam_loc_all_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.co_cd = mavm_loc_mst_mam_loc_all_t1.co_cd
		AND mavm_loc_mst_mam_loc_lcl_all_t.lcl_cd = 'TBD5'
	)	loc_nm_lcl5
	FROM mam_loc_all mavm_loc_mst_mam_loc_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_loc_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_loc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC')
			AND	mavm_loc_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_loc_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_loc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC')
			)
		)
	)
UNION ALL
SELECT
	mavm_loc_mst_mam_loc_cmn_t1.loc_cd,
	mavm_loc_mst_mam_loc_cmn_t1.loc_nm,
	mavm_loc_mst_mam_loc_cmn_t1.asst_dpt_cd,
	mavm_loc_mst_mam_loc_cmn_t1.sls_dpt_cd,
	mavm_loc_mst_mam_loc_cmn_t1.wg_cd,
	mavm_loc_mst_mam_loc_cmn_t1.site_cd,
	mavm_loc_mst_mam_loc_cmn_t1.lg_grp_cd,
	mavm_loc_mst_mam_loc_cmn_t1.lg_def_flg,
	mavm_loc_mst_mam_loc_cmn_t1.loc_grp_cd,
	mavm_loc_mst_mam_loc_cmn_t1.alloc_grp_cd,
	mavm_loc_mst_mam_loc_cmn_t1.sppl_cd,
	mavm_loc_mst_mam_loc_cmn_t1.maker_cd,
	mavm_loc_mst_mam_loc_cmn_t1.pre_outsrc_act_flg,
	mavm_loc_mst_mam_loc_cmn_t1.ddlv_prov_insp_flg,
	mavm_loc_mst_mam_loc_cmn_t1.cal_cd,
	mavm_loc_mst_mam_loc_cmn_t1.loc_mng_typ,
	mavm_loc_mst_mam_loc_cmn_t1.prnt_lcl_cd,
	mavm_loc_mst_mam_loc_cmn_t1.cntry_cd,
	mavm_loc_mst_mam_loc_cmn_t1.num_id,
	mavm_loc_mst_mam_loc_cmn_t1.stktk_tgt_flg,
	mavm_loc_mst_mam_loc_cmn_t1.stktk_tor_disp_flg,
	mavm_loc_mst_mam_loc_cmn_t1.stktk_tor_ex_zero_flg,
	mavm_loc_mst_mam_loc_cmn_t1.stktk_act_ex_zero_flg,
	mavm_loc_mst_mam_loc_cmn_t1.stktk_amt_flg,
	mavm_loc_mst_mam_loc_cmn_t1.str_ln_tgt_flg,
	mavm_loc_mst_mam_loc_cmn_t1.alloc_lmt_flg,
	mavm_loc_mst_mam_loc_cmn_t1.gi_pack_xfer_flg,
	mavm_loc_mst_mam_loc_cmn_t1.gi_vmi_flg,
	mavm_loc_mst_mam_loc_cmn_t1.rsrc_cd1,
	mavm_loc_mst_mam_loc_cmn_t1.rsrc_cd2,
	mavm_loc_mst_mam_loc_cmn_t1.ext_sys_loc_typ,
	mavm_loc_mst_mam_loc_cmn_t1.loc_alc_grp,
	mavm_loc_mst_mam_loc_cmn_t1.addr_flg,
	mavm_loc_mst_mam_loc_cmn_t1.zip_cd,
	mavm_loc_mst_mam_loc_cmn_t1.addr1,
	mavm_loc_mst_mam_loc_cmn_t1.addr2,
	mavm_loc_mst_mam_loc_cmn_t1.addr3,
	mavm_loc_mst_mam_loc_cmn_t1.addr4,
	mavm_loc_mst_mam_loc_cmn_t1.tel,
	mavm_loc_mst_mam_loc_cmn_t1.fax,
	mavm_loc_mst_mam_loc_cmn_t1.memo1,
	mavm_loc_mst_mam_loc_cmn_t1.memo2,
	mavm_loc_mst_mam_loc_cmn_t1.memo3,
	mavm_loc_mst_mam_loc_cmn_t1.del_flg,
	mavm_loc_mst_mam_loc_cmn_t1.del_usr_id,
	mavm_loc_mst_mam_loc_cmn_t1.del_usr_nm,
	mavm_loc_mst_mam_loc_cmn_t1.del_ts,
	mavm_loc_mst_mam_loc_cmn_t1.ins_usr_id,
	mavm_loc_mst_mam_loc_cmn_t1.ins_usr_nm,
	mavm_loc_mst_mam_loc_cmn_t1.ins_ts,
	mavm_loc_mst_mam_loc_cmn_t1.ins_func_id,
	mavm_loc_mst_mam_loc_cmn_t1.upd_cntr,
	mavm_loc_mst_mam_loc_cmn_t1.upd_usr_id,
	mavm_loc_mst_mam_loc_cmn_t1.upd_usr_nm,
	mavm_loc_mst_mam_loc_cmn_t1.upd_ts,
	mavm_loc_mst_mam_loc_cmn_t1.upd_func_id,
	mavm_loc_mst_mam_loc_cmn_t1.upd_srv_req_no,
	mavm_loc_mst_mam_co_all_t2.co_cd,
	--場所名（ロケール１）
	(SELECT mavm_loc_mst_mam_loc_lcl_cmn_t.loc_nm
		FROM mam_loc_lcl_cmn mavm_loc_mst_mam_loc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.loc_cd = mavm_loc_mst_mam_loc_cmn_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	loc_nm_lcl1,
	--場所名（ロケール２）
	(SELECT mavm_loc_mst_mam_loc_lcl_cmn_t.loc_nm
		FROM mam_loc_lcl_cmn mavm_loc_mst_mam_loc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.loc_cd = mavm_loc_mst_mam_loc_cmn_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.lcl_cd = 'en_US'
	)	loc_nm_lcl2,
	--場所名（ロケール３）
	(SELECT mavm_loc_mst_mam_loc_lcl_cmn_t.loc_nm
		FROM mam_loc_lcl_cmn mavm_loc_mst_mam_loc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.loc_cd = mavm_loc_mst_mam_loc_cmn_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.lcl_cd = 'TBD3'
	)	loc_nm_lcl3,
	--場所名（ロケール４）
	(SELECT mavm_loc_mst_mam_loc_lcl_cmn_t.loc_nm
		FROM mam_loc_lcl_cmn mavm_loc_mst_mam_loc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.loc_cd = mavm_loc_mst_mam_loc_cmn_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.lcl_cd = 'TBD4'
	)	loc_nm_lcl4,
	--場所名（ロケール５）
	(SELECT mavm_loc_mst_mam_loc_lcl_cmn_t.loc_nm
		FROM mam_loc_lcl_cmn mavm_loc_mst_mam_loc_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.loc_cd = mavm_loc_mst_mam_loc_cmn_t1.loc_cd
		AND mavm_loc_mst_mam_loc_lcl_cmn_t.lcl_cd = 'TBD5'
	)	loc_nm_lcl5
	FROM mam_loc_cmn mavm_loc_mst_mam_loc_cmn_t1, mam_co_all mavm_loc_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_loc_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_loc_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC')
		AND	mavm_loc_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
