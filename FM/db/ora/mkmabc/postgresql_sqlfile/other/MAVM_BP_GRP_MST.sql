\encoding UTF-8

CREATE OR REPLACE VIEW mavm_bp_grp_mst(
bp_grp_typ,
bp_grp_cd,
bp_grp_nm,
num_id,
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
bp_grp_nm_lcl1,
bp_grp_nm_lcl2,
bp_grp_nm_lcl3,
bp_grp_nm_lcl4,
bp_grp_nm_lcl5
)
AS
SELECT
	mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_nm,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.num_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.memo1,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.memo2,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.memo3,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.del_flg,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.del_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.del_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.del_ts,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.ins_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.ins_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.ins_ts,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.ins_func_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_cntr,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_ts,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_func_id,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.upd_srv_req_no,
	mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd,
	--取引先分類名（ロケール１）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_nm
		FROM mam_bp_grp_lcl_all mavm_bp_grp_mst_mam_bp_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.co_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.lcl_cd = 'ja_JP'
	)	bp_grp_nm_lcl1,
	--取引先分類名（ロケール２）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_nm
		FROM mam_bp_grp_lcl_all mavm_bp_grp_mst_mam_bp_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.co_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.lcl_cd = 'en_US'
	)	bp_grp_nm_lcl2,
	--取引先分類名（ロケール３）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_nm
		FROM mam_bp_grp_lcl_all mavm_bp_grp_mst_mam_bp_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.co_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.lcl_cd = 'TBD3'
	)	bp_grp_nm_lcl3,
	--取引先分類名（ロケール４）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_nm
		FROM mam_bp_grp_lcl_all mavm_bp_grp_mst_mam_bp_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.co_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.lcl_cd = 'TBD4'
	)	bp_grp_nm_lcl4,
	--取引先分類名（ロケール５）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_nm
		FROM mam_bp_grp_lcl_all mavm_bp_grp_mst_mam_bp_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.co_cd = mavm_bp_grp_mst_mam_bp_grp_all_t1.co_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_all_t.lcl_cd = 'TBD5'
	)	bp_grp_nm_lcl5	
	FROM mam_bp_grp_all mavm_bp_grp_mst_mam_bp_grp_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_bp_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_bp_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
			AND	mavm_bp_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_bp_grp_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_bp_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
			)
		)
	)
UNION ALL
SELECT
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_nm,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.num_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.memo1,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.memo2,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.memo3,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.del_flg,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.del_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.del_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.del_ts,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.ins_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.ins_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.ins_ts,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.ins_func_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_cntr,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_usr_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_usr_nm,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_ts,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_func_id,
	mavm_bp_grp_mst_mam_bp_grp_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--取引先分類名（ロケール１）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_nm
		FROM mam_bp_grp_lcl_cmn mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	bp_grp_nm_lcl1,
	--取引先分類名（ロケール２）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_nm
		FROM mam_bp_grp_lcl_cmn mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.lcl_cd = 'en_US'
	)	bp_grp_nm_lcl2,
	--取引先分類名（ロケール３）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_nm
		FROM mam_bp_grp_lcl_cmn mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.lcl_cd = 'TBD3'
	)	bp_grp_nm_lcl3,
	--取引先分類名（ロケール４）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_nm
		FROM mam_bp_grp_lcl_cmn mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.lcl_cd = 'TBD4'
	)	bp_grp_nm_lcl4,
	--取引先分類名（ロケール５）
	(SELECT mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_nm
		FROM mam_bp_grp_lcl_cmn mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_typ = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_typ
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.bp_grp_cd = mavm_bp_grp_mst_mam_bp_grp_cmn_t1.bp_grp_cd
		AND mavm_bp_grp_mst_mam_bp_grp_lcl_cmn_t.lcl_cd = 'TBD5'
	)	bp_grp_nm_lcl5	
	FROM mam_bp_grp_cmn mavm_bp_grp_mst_mam_bp_grp_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_bp_grp_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_bp_grp_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BP_GRP')
		AND	mavm_bp_grp_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

