\encoding UTF-8

CREATE OR REPLACE VIEW mavm_area_mst(
area_cd,
area_nm,
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
area_nm_lcl1,
area_nm_lcl2,
area_nm_lcl3,
area_nm_lcl4,
area_nm_lcl5
)
AS
SELECT
	mavm_area_mst_mam_area_all_t1.area_cd,
	mavm_area_mst_mam_area_all_t1.area_nm,
	mavm_area_mst_mam_area_all_t1.memo1,
	mavm_area_mst_mam_area_all_t1.memo2,
	mavm_area_mst_mam_area_all_t1.memo3,
	mavm_area_mst_mam_area_all_t1.del_flg,
	mavm_area_mst_mam_area_all_t1.del_usr_id,
	mavm_area_mst_mam_area_all_t1.del_usr_nm,
	mavm_area_mst_mam_area_all_t1.del_ts,
	mavm_area_mst_mam_area_all_t1.ins_usr_id,
	mavm_area_mst_mam_area_all_t1.ins_usr_nm,
	mavm_area_mst_mam_area_all_t1.ins_ts,
	mavm_area_mst_mam_area_all_t1.ins_func_id,
	mavm_area_mst_mam_area_all_t1.upd_cntr,
	mavm_area_mst_mam_area_all_t1.upd_usr_id,
	mavm_area_mst_mam_area_all_t1.upd_usr_nm,
	mavm_area_mst_mam_area_all_t1.upd_ts,
	mavm_area_mst_mam_area_all_t1.upd_func_id,
	mavm_area_mst_mam_area_all_t1.upd_srv_req_no,
	mavm_area_mst_mam_area_all_t1.co_cd,
	--地域名（ロケール１）
	(SELECT mavm_area_mst_mam_area_lcl_all_t.area_nm
		FROM mam_area_lcl_all mavm_area_mst_mam_area_lcl_all_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_all_t.area_cd = mavm_area_mst_mam_area_all_t1.area_cd
		AND	mavm_area_mst_mam_area_lcl_all_t.co_cd = mavm_area_mst_mam_area_all_t1.co_cd
		AND mavm_area_mst_mam_area_lcl_all_t.lcl_cd = 'ja_JP'
	)	area_nm_lcl1,
	--地域名（ロケール２）
	(SELECT mavm_area_mst_mam_area_lcl_all_t.area_nm
		FROM mam_area_lcl_all mavm_area_mst_mam_area_lcl_all_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_all_t.area_cd = mavm_area_mst_mam_area_all_t1.area_cd
		AND	mavm_area_mst_mam_area_lcl_all_t.co_cd = mavm_area_mst_mam_area_all_t1.co_cd
		AND mavm_area_mst_mam_area_lcl_all_t.lcl_cd = 'en_US'
	)	area_nm_lcl2,
	--地域名（ロケール３）
	(SELECT mavm_area_mst_mam_area_lcl_all_t.area_nm
		FROM mam_area_lcl_all mavm_area_mst_mam_area_lcl_all_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_all_t.area_cd = mavm_area_mst_mam_area_all_t1.area_cd
		AND	mavm_area_mst_mam_area_lcl_all_t.co_cd = mavm_area_mst_mam_area_all_t1.co_cd
		AND mavm_area_mst_mam_area_lcl_all_t.lcl_cd = 'TBD3'
	)	area_nm_lcl3,
	--地域名（ロケール４）
	(SELECT mavm_area_mst_mam_area_lcl_all_t.area_nm
		FROM mam_area_lcl_all mavm_area_mst_mam_area_lcl_all_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_all_t.area_cd = mavm_area_mst_mam_area_all_t1.area_cd
		AND	mavm_area_mst_mam_area_lcl_all_t.co_cd = mavm_area_mst_mam_area_all_t1.co_cd
		AND mavm_area_mst_mam_area_lcl_all_t.lcl_cd = 'TBD4'
	)	area_nm_lcl4,
	--地域名（ロケール５）
	(SELECT mavm_area_mst_mam_area_lcl_all_t.area_nm
		FROM mam_area_lcl_all mavm_area_mst_mam_area_lcl_all_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_all_t.area_cd = mavm_area_mst_mam_area_all_t1.area_cd
		AND	mavm_area_mst_mam_area_lcl_all_t.co_cd = mavm_area_mst_mam_area_all_t1.co_cd
		AND mavm_area_mst_mam_area_lcl_all_t.lcl_cd = 'TBD5'
	)	area_nm_lcl5
	FROM mam_area_all mavm_area_mst_mam_area_all_t1
	WHERE 0=0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_area_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_area_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
			AND	mavm_area_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_area_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_area_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
			)
		)
	)
UNION ALL
SELECT
	mavm_area_mst_mam_area_cmn_t1.area_cd,
	mavm_area_mst_mam_area_cmn_t1.area_nm,
	mavm_area_mst_mam_area_cmn_t1.memo1,
	mavm_area_mst_mam_area_cmn_t1.memo2,
	mavm_area_mst_mam_area_cmn_t1.memo3,
	mavm_area_mst_mam_area_cmn_t1.del_flg,
	mavm_area_mst_mam_area_cmn_t1.del_usr_id,
	mavm_area_mst_mam_area_cmn_t1.del_usr_nm,
	mavm_area_mst_mam_area_cmn_t1.del_ts,
	mavm_area_mst_mam_area_cmn_t1.ins_usr_id,
	mavm_area_mst_mam_area_cmn_t1.ins_usr_nm,
	mavm_area_mst_mam_area_cmn_t1.ins_ts,
	mavm_area_mst_mam_area_cmn_t1.ins_func_id,
	mavm_area_mst_mam_area_cmn_t1.upd_cntr,
	mavm_area_mst_mam_area_cmn_t1.upd_usr_id,
	mavm_area_mst_mam_area_cmn_t1.upd_usr_nm,
	mavm_area_mst_mam_area_cmn_t1.upd_ts,
	mavm_area_mst_mam_area_cmn_t1.upd_func_id,
	mavm_area_mst_mam_area_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--地域名（ロケール１）
	(SELECT mavm_area_mst_mam_area_lcl_cmn_t.area_nm
		FROM mam_area_lcl_cmn mavm_area_mst_mam_area_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_cmn_t.area_cd = mavm_area_mst_mam_area_cmn_t1.area_cd
		AND mavm_area_mst_mam_area_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	area_nm_lcl1,
	--地域名（ロケール２）
	(SELECT mavm_area_mst_mam_area_lcl_cmn_t.area_nm
		FROM mam_area_lcl_cmn mavm_area_mst_mam_area_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_cmn_t.area_cd = mavm_area_mst_mam_area_cmn_t1.area_cd
		AND mavm_area_mst_mam_area_lcl_cmn_t.lcl_cd = 'en_US'
	)	area_nm_lcl2,
	--地域名（ロケール３）
	(SELECT mavm_area_mst_mam_area_lcl_cmn_t.area_nm
		FROM mam_area_lcl_cmn mavm_area_mst_mam_area_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_cmn_t.area_cd = mavm_area_mst_mam_area_cmn_t1.area_cd
		AND mavm_area_mst_mam_area_lcl_cmn_t.lcl_cd = 'TBD3'
	)	area_nm_lcl3,
	--地域名（ロケール４）
	(SELECT mavm_area_mst_mam_area_lcl_cmn_t.area_nm
		FROM mam_area_lcl_cmn mavm_area_mst_mam_area_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_cmn_t.area_cd = mavm_area_mst_mam_area_cmn_t1.area_cd
		AND mavm_area_mst_mam_area_lcl_cmn_t.lcl_cd = 'TBD4'
	)	area_nm_lcl4,
	--地域名（ロケール５）
	(SELECT mavm_area_mst_mam_area_lcl_cmn_t.area_nm
		FROM mam_area_lcl_cmn mavm_area_mst_mam_area_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_area_mst_mam_area_lcl_cmn_t.area_cd = mavm_area_mst_mam_area_cmn_t1.area_cd
		AND mavm_area_mst_mam_area_lcl_cmn_t.lcl_cd = 'TBD5'
	)	area_nm_lcl5
	FROM mam_area_cmn mavm_area_mst_mam_area_cmn_t1
	WHERE 0=0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_area_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_area_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AREA')
		AND	mavm_area_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

