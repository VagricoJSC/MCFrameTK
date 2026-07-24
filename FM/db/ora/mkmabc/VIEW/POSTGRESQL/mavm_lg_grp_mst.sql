SELECT
	mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_nm,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.loc_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.wg_cd,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ship_slip_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.pick_list_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ship_inst_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ship_slip_act_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.cal_cd,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.site_co_cd,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.gi_minus_stk_chk_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ship_loc_prio_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.memo1,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.memo2,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.memo3,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.del_flg,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.del_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.del_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.del_ts,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ins_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ins_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ins_ts,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.ins_func_id,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_cntr,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_ts,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_func_id,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.upd_srv_req_no,
	mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd,
	--物流グループ名（ロケール１）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_nm
		FROM mam_lg_grp_lcl_all mavm_lg_grp_mst_mam_lg_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.co_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lcl_cd = 'ja_JP'
	)	lg_grp_nm_lcl1,
	--物流グループ名（ロケール２）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_nm
		FROM mam_lg_grp_lcl_all mavm_lg_grp_mst_mam_lg_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.co_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lcl_cd = 'en_US'
	)	lg_grp_nm_lcl2,
	--物流グループ名（ロケール３）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_nm
		FROM mam_lg_grp_lcl_all mavm_lg_grp_mst_mam_lg_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.co_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lcl_cd = 'TBD3'
	)	lg_grp_nm_lcl3,
	--物流グループ名（ロケール４）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_nm
		FROM mam_lg_grp_lcl_all mavm_lg_grp_mst_mam_lg_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.co_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lcl_cd = 'TBD4'
	)	lg_grp_nm_lcl4,
	--物流グループ名（ロケール５）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_nm
		FROM mam_lg_grp_lcl_all mavm_lg_grp_mst_mam_lg_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.co_cd = mavm_lg_grp_mst_mam_lg_grp_all_t1.co_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_all_t.lcl_cd = 'TBD5'
	)	lg_grp_nm_lcl5
	FROM mam_lg_grp_all mavm_lg_grp_mst_mam_lg_grp_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_lg_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_lg_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LG_GRP')
			AND	mavm_lg_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_lg_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_lg_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LG_GRP')
			)
		)
	)
UNION ALL
SELECT
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_nm,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.loc_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.wg_cd,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ship_slip_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.pick_list_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ship_inst_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ship_slip_act_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.cal_cd,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.site_co_cd,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.gi_minus_stk_chk_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ship_loc_prio_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.memo1,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.memo2,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.memo3,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.del_flg,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.del_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.del_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.del_ts,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ins_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ins_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ins_ts,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.ins_func_id,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_cntr,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_usr_id,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_usr_nm,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_ts,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_func_id,
	mavm_lg_grp_mst_mam_lg_grp_cmn_t1.upd_srv_req_no,
	mavm_lg_grp_mst_mam_co_all_t2.co_cd,
	--物流グループ名（ロケール１）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_nm
		FROM mam_lg_grp_lcl_cmn mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	lg_grp_nm_lcl1,
	--物流グループ名（ロケール２）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_nm
		FROM mam_lg_grp_lcl_cmn mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lcl_cd = 'en_US'
	)	lg_grp_nm_lcl2,
	--物流グループ名（ロケール３）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_nm
		FROM mam_lg_grp_lcl_cmn mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lcl_cd = 'TBD3'
	)	lg_grp_nm_lcl3,
	--物流グループ名（ロケール４）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_nm
		FROM mam_lg_grp_lcl_cmn mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lcl_cd = 'TBD4'
	)	lg_grp_nm_lcl4,
	--物流グループ名（ロケール５）
	(SELECT mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_nm
		FROM mam_lg_grp_lcl_cmn mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lg_grp_cd = mavm_lg_grp_mst_mam_lg_grp_cmn_t1.lg_grp_cd
		AND mavm_lg_grp_mst_mam_lg_grp_lcl_cmn_t.lcl_cd = 'TBD5'
	)	lg_grp_nm_lcl5
	FROM mam_lg_grp_cmn mavm_lg_grp_mst_mam_lg_grp_cmn_t1, mam_co_all mavm_lg_grp_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_lg_grp_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_lg_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LG_GRP')
		AND	mavm_lg_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;
