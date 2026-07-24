\encoding UTF-8

CREATE OR REPLACE VIEW mavm_cntry_mst(
cntry_cd,
cntry_nm,
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
cntry_nm_lcl1,
cntry_nm_lcl2,
cntry_nm_lcl3,
cntry_nm_lcl4,
cntry_nm_lcl5
)
AS
SELECT
	mavm_cntry_mst_mam_cntry_all_t1.cntry_cd,
	mavm_cntry_mst_mam_cntry_all_t1.cntry_nm,
	mavm_cntry_mst_mam_cntry_all_t1.memo1,
	mavm_cntry_mst_mam_cntry_all_t1.memo2,
	mavm_cntry_mst_mam_cntry_all_t1.memo3,
	mavm_cntry_mst_mam_cntry_all_t1.del_flg,
	mavm_cntry_mst_mam_cntry_all_t1.del_usr_id,
	mavm_cntry_mst_mam_cntry_all_t1.del_usr_nm,
	mavm_cntry_mst_mam_cntry_all_t1.del_ts,
	mavm_cntry_mst_mam_cntry_all_t1.ins_usr_id,
	mavm_cntry_mst_mam_cntry_all_t1.ins_usr_nm,
	mavm_cntry_mst_mam_cntry_all_t1.ins_ts,
	mavm_cntry_mst_mam_cntry_all_t1.ins_func_id,
	mavm_cntry_mst_mam_cntry_all_t1.upd_cntr,
	mavm_cntry_mst_mam_cntry_all_t1.upd_usr_id,
	mavm_cntry_mst_mam_cntry_all_t1.upd_usr_nm,
	mavm_cntry_mst_mam_cntry_all_t1.upd_ts,
	mavm_cntry_mst_mam_cntry_all_t1.upd_func_id,
	mavm_cntry_mst_mam_cntry_all_t1.upd_srv_req_no,
	mavm_cntry_mst_mam_cntry_all_t1.co_cd,
	--国名（ロケール１）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_nm
		FROM mam_cntry_lcl_all mavm_cntry_mst_mam_cntry_lcl_all_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_cd = mavm_cntry_mst_mam_cntry_all_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.co_cd = mavm_cntry_mst_mam_cntry_all_t1.co_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.lcl_cd = 'ja_JP'
	)	cntry_nm_lcl1,
	--国名（ロケール２）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_nm
		FROM mam_cntry_lcl_all mavm_cntry_mst_mam_cntry_lcl_all_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_cd = mavm_cntry_mst_mam_cntry_all_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.co_cd = mavm_cntry_mst_mam_cntry_all_t1.co_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.lcl_cd = 'en_US'
	)	cntry_nm_lcl2,
	--国名（ロケール３）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_nm
		FROM mam_cntry_lcl_all mavm_cntry_mst_mam_cntry_lcl_all_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_cd = mavm_cntry_mst_mam_cntry_all_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.co_cd = mavm_cntry_mst_mam_cntry_all_t1.co_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.lcl_cd = 'TBD3'
	)	cntry_nm_lcl3,
	--国名（ロケール４）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_nm
		FROM mam_cntry_lcl_all mavm_cntry_mst_mam_cntry_lcl_all_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_cd = mavm_cntry_mst_mam_cntry_all_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.co_cd = mavm_cntry_mst_mam_cntry_all_t1.co_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.lcl_cd = 'TBD4'
	)	cntry_nm_lcl4,
	--国名（ロケール５）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_nm
		FROM mam_cntry_lcl_all mavm_cntry_mst_mam_cntry_lcl_all_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.cntry_cd = mavm_cntry_mst_mam_cntry_all_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.co_cd = mavm_cntry_mst_mam_cntry_all_t1.co_cd
		AND mavm_cntry_mst_mam_cntry_lcl_all_t.lcl_cd = 'TBD5'
	)	cntry_nm_lcl5
	FROM mam_cntry_all mavm_cntry_mst_mam_cntry_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cntry_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cntry_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
			AND	mavm_cntry_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cntry_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cntry_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
			)
		)
	)
UNION ALL
SELECT
	mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd,
	mavm_cntry_mst_mam_cntry_cmn_t1.cntry_nm,
	mavm_cntry_mst_mam_cntry_cmn_t1.memo1,
	mavm_cntry_mst_mam_cntry_cmn_t1.memo2,
	mavm_cntry_mst_mam_cntry_cmn_t1.memo3,
	mavm_cntry_mst_mam_cntry_cmn_t1.del_flg,
	mavm_cntry_mst_mam_cntry_cmn_t1.del_usr_id,
	mavm_cntry_mst_mam_cntry_cmn_t1.del_usr_nm,
	mavm_cntry_mst_mam_cntry_cmn_t1.del_ts,
	mavm_cntry_mst_mam_cntry_cmn_t1.ins_usr_id,
	mavm_cntry_mst_mam_cntry_cmn_t1.ins_usr_nm,
	mavm_cntry_mst_mam_cntry_cmn_t1.ins_ts,
	mavm_cntry_mst_mam_cntry_cmn_t1.ins_func_id,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_cntr,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_usr_id,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_usr_nm,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_ts,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_func_id,
	mavm_cntry_mst_mam_cntry_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--国名（ロケール１）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_nm
		FROM mam_cntry_lcl_cmn mavm_cntry_mst_mam_cntry_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_cd = mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	cntry_nm_lcl1,
	--国名（ロケール２）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_nm
		FROM mam_cntry_lcl_cmn mavm_cntry_mst_mam_cntry_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_cd = mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.lcl_cd = 'en_US'
	)	cntry_nm_lcl2,
	--国名（ロケール３）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_nm
		FROM mam_cntry_lcl_cmn mavm_cntry_mst_mam_cntry_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_cd = mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.lcl_cd = 'TBD3'
	)	cntry_nm_lcl3,
	--国名（ロケール４）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_nm
		FROM mam_cntry_lcl_cmn mavm_cntry_mst_mam_cntry_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_cd = mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.lcl_cd = 'TBD4'
	)	cntry_nm_lcl4,
	--国名（ロケール５）
	(SELECT mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_nm
		FROM mam_cntry_lcl_cmn mavm_cntry_mst_mam_cntry_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.cntry_cd = mavm_cntry_mst_mam_cntry_cmn_t1.cntry_cd
		AND mavm_cntry_mst_mam_cntry_lcl_cmn_t.lcl_cd = 'TBD5'
	)	cntry_nm_lcl5
	FROM mam_cntry_cmn mavm_cntry_mst_mam_cntry_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_cntry_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_cntry_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CNTRY')
		AND	mavm_cntry_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

