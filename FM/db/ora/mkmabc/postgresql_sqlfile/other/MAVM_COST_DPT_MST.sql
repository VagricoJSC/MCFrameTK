\encoding UTF-8

CREATE OR REPLACE VIEW mavm_cost_dpt_mst(
dpt_cd,
term,
dpt_nm,
dpt_lvl_cd,
dpt_alc_grp,
dpt_config_typ,
lg_grp_cd,
loc_grp_cd,
wg_cd,
site_cd,
memo1,
memo2,
memo3,
del_flg,
del_usr_id,
del_usr_nm,
del_ts,
ins_usr_id,
ins_usr_nm,
ins_ts,
ins_func_id,
upd_cntr,
upd_usr_id,
upd_usr_nm,
upd_ts,
upd_func_id,
upd_srv_req_no,
co_cd,
dpt_nm_lcl1,
dpt_nm_lcl2,
dpt_nm_lcl3,
dpt_nm_lcl4,
dpt_nm_lcl5
)
AS
SELECT
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_lvl_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_alc_grp,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_config_typ,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.lg_grp_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.loc_grp_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.wg_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.site_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.memo1,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.memo2,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.memo3,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.del_flg,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.del_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.del_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.del_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.ins_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.ins_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.ins_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.ins_func_id,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_cntr,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_func_id,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.upd_srv_req_no,
	mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd,
	--部門名（ロケール１）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_nm
		FROM mam_cost_dpt_lcl_all mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.term = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.co_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.lcl_cd = 'ja_JP'
	)	dpt_nm_lcl1,
	--部門名（ロケール２）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_nm
		FROM mam_cost_dpt_lcl_all mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.term = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.co_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.lcl_cd = 'en_US'
	)	dpt_nm_lcl2,
	--部門名（ロケール３）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_nm
		FROM mam_cost_dpt_lcl_all mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.term = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.co_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.lcl_cd = 'TBD3'
	)	dpt_nm_lcl3,
	--部門名（ロケール４）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_nm
		FROM mam_cost_dpt_lcl_all mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.term = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.co_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.lcl_cd = 'TBD4'
	)	dpt_nm_lcl4,
	--部門名（ロケール５）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_nm
		FROM mam_cost_dpt_lcl_all mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.term = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.co_cd = mavm_cost_dpt_mst_mam_cost_dpt_all_t1.co_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_all_t.lcl_cd = 'TBD5'
	)	dpt_nm_lcl5
	FROM mam_cost_dpt_all mavm_cost_dpt_mst_mam_cost_dpt_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cost_dpt_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cost_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_DPT')
			AND	mavm_cost_dpt_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cost_dpt_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cost_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_DPT')
			)
		)
	)
UNION ALL
SELECT
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_lvl_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_alc_grp,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_config_typ,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.lg_grp_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.loc_grp_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.wg_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.site_cd,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.memo1,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.memo2,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.memo3,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.del_flg,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.del_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.del_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.del_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.ins_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.ins_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.ins_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.ins_func_id,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_cntr,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_usr_id,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_usr_nm,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_ts,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_func_id,
	mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.upd_srv_req_no,
	mavm_cost_dpt_mst_mam_co_all_t2.co_cd,
	--部門名（ロケール１）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_nm
		FROM mam_cost_dpt_lcl_cmn mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.term = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	dpt_nm_lcl1,
	--部門名（ロケール２）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_nm
		FROM mam_cost_dpt_lcl_cmn mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.term = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.lcl_cd = 'en_US'
	)	dpt_nm_lcl2,
	--部門名（ロケール３）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_nm
		FROM mam_cost_dpt_lcl_cmn mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.term = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.lcl_cd = 'TBD3'
	)	dpt_nm_lcl3,
	--部門名（ロケール４）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_nm
		FROM mam_cost_dpt_lcl_cmn mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.term = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.lcl_cd = 'TBD4'
	)	dpt_nm_lcl4,
	--部門名（ロケール５）
	(SELECT mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_nm
		FROM mam_cost_dpt_lcl_cmn mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.dpt_cd = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.dpt_cd
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.term = mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1.term
		AND mavm_cost_dpt_mst_mam_cost_dpt_lcl_cmn_t.lcl_cd = 'TBD5'
	)	dpt_nm_lcl5
	FROM mam_cost_dpt_cmn mavm_cost_dpt_mst_mam_cost_dpt_cmn_t1, mam_co_all mavm_cost_dpt_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_cost_dpt_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_cost_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_COST_DPT')
		AND	mavm_cost_dpt_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

