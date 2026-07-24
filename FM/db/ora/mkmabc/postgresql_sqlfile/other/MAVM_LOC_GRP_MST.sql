\encoding UTF-8

CREATE OR REPLACE VIEW mavm_loc_grp_mst(
loc_grp_cd,
loc_grp_nm,
wg_cd,
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
loc_grp_nm_lcl1,
loc_grp_nm_lcl2,
loc_grp_nm_lcl3,
loc_grp_nm_lcl4,
loc_grp_nm_lcl5
)
AS
SELECT
	mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_nm,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.wg_cd,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.memo1,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.memo2,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.memo3,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.del_flg,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.del_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.del_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.del_ts,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.ins_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.ins_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.ins_ts,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.ins_func_id,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_cntr,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_ts,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_func_id,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.upd_srv_req_no,
	mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd,
	--製造場所グループ名（ロケール１）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_nm
		FROM mam_loc_grp_lcl_all mavm_loc_grp_mst_mam_loc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.co_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.lcl_cd = 'ja_JP'
	)	loc_grp_nm_lcl1,
	--製造場所グループ名（ロケール２）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_nm
		FROM mam_loc_grp_lcl_all mavm_loc_grp_mst_mam_loc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.co_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.lcl_cd = 'en_US'
	)	loc_grp_nm_lcl2,
	--製造場所グループ名（ロケール３）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_nm
		FROM mam_loc_grp_lcl_all mavm_loc_grp_mst_mam_loc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.co_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.lcl_cd = 'TBD3'
	)	loc_grp_nm_lcl3,
	--製造場所グループ名（ロケール４）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_nm
		FROM mam_loc_grp_lcl_all mavm_loc_grp_mst_mam_loc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.co_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.lcl_cd = 'TBD4'
	)	loc_grp_nm_lcl4,
	--製造場所グループ名（ロケール５）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_nm
		FROM mam_loc_grp_lcl_all mavm_loc_grp_mst_mam_loc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.co_cd = mavm_loc_grp_mst_mam_loc_grp_all_t1.co_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_all_t.lcl_cd = 'TBD5'
	)	loc_grp_nm_lcl5
	FROM mam_loc_grp_all mavm_loc_grp_mst_mam_loc_grp_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_loc_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_loc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
			AND	mavm_loc_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_loc_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_loc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
			)
		)
	)
UNION ALL
SELECT
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_nm,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.wg_cd,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.memo1,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.memo2,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.memo3,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.del_flg,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.del_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.del_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.del_ts,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.ins_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.ins_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.ins_ts,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.ins_func_id,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_cntr,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_usr_id,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_usr_nm,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_ts,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_func_id,
	mavm_loc_grp_mst_mam_loc_grp_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--製造場所グループ名（ロケール１）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_nm
		FROM mam_loc_grp_lcl_cmn mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	loc_grp_nm_lcl1,
	--製造場所グループ名（ロケール２）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_nm
		FROM mam_loc_grp_lcl_cmn mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.lcl_cd = 'en_US'
	)	loc_grp_nm_lcl2,
	--製造場所グループ名（ロケール３）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_nm
		FROM mam_loc_grp_lcl_cmn mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.lcl_cd = 'TBD3'
	)	loc_grp_nm_lcl3,
	--製造場所グループ名（ロケール４）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_nm
		FROM mam_loc_grp_lcl_cmn mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.lcl_cd = 'TBD4'
	)	loc_grp_nm_lcl4,
	--製造場所グループ名（ロケール５）
	(SELECT mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_nm
		FROM mam_loc_grp_lcl_cmn mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.loc_grp_cd = mavm_loc_grp_mst_mam_loc_grp_cmn_t1.loc_grp_cd
		AND mavm_loc_grp_mst_mam_loc_grp_lcl_cmn_t.lcl_cd = 'TBD5'
	)	loc_grp_nm_lcl5
	FROM mam_loc_grp_cmn mavm_loc_grp_mst_mam_loc_grp_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_loc_grp_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_loc_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_LOC_GRP')
		AND	mavm_loc_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

