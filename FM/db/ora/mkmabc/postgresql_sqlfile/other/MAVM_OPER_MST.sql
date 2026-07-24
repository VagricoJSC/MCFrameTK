\encoding UTF-8

CREATE OR REPLACE VIEW mavm_oper_mst(
oper_cd,
oper_nm,
oper_alc_grp,
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
oper_nm_lcl1,
oper_nm_lcl2,
oper_nm_lcl3,
oper_nm_lcl4,
oper_nm_lcl5
)
AS
SELECT
	mavm_oper_mst_mam_oper_all_t1.oper_cd,
	mavm_oper_mst_mam_oper_all_t1.oper_nm,
	mavm_oper_mst_mam_oper_all_t1.oper_alc_grp,
	mavm_oper_mst_mam_oper_all_t1.memo1,
	mavm_oper_mst_mam_oper_all_t1.memo2,
	mavm_oper_mst_mam_oper_all_t1.memo3,
	mavm_oper_mst_mam_oper_all_t1.del_flg,
	mavm_oper_mst_mam_oper_all_t1.del_usr_id,
	mavm_oper_mst_mam_oper_all_t1.del_usr_nm,
	mavm_oper_mst_mam_oper_all_t1.del_ts,
	mavm_oper_mst_mam_oper_all_t1.ins_usr_id,
	mavm_oper_mst_mam_oper_all_t1.ins_usr_nm,
	mavm_oper_mst_mam_oper_all_t1.ins_ts,
	mavm_oper_mst_mam_oper_all_t1.ins_func_id,
	mavm_oper_mst_mam_oper_all_t1.upd_cntr,
	mavm_oper_mst_mam_oper_all_t1.upd_usr_id,
	mavm_oper_mst_mam_oper_all_t1.upd_usr_nm,
	mavm_oper_mst_mam_oper_all_t1.upd_ts,
	mavm_oper_mst_mam_oper_all_t1.upd_func_id,
	mavm_oper_mst_mam_oper_all_t1.upd_srv_req_no,
	mavm_oper_mst_mam_oper_all_t1.co_cd,
	--工程名（ロケール１）
	(SELECT mavm_oper_mst_mam_oper_lcl_all_t.oper_nm
		FROM mam_oper_lcl_all mavm_oper_mst_mam_oper_lcl_all_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_all_t.oper_cd = mavm_oper_mst_mam_oper_all_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.co_cd = mavm_oper_mst_mam_oper_all_t1.co_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.lcl_cd = 'ja_JP'
	)	oper_nm_lcl1,
	--工程名（ロケール２）
	(SELECT mavm_oper_mst_mam_oper_lcl_all_t.oper_nm
		FROM mam_oper_lcl_all mavm_oper_mst_mam_oper_lcl_all_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_all_t.oper_cd = mavm_oper_mst_mam_oper_all_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.co_cd = mavm_oper_mst_mam_oper_all_t1.co_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.lcl_cd = 'en_US'
	)	oper_nm_lcl2,
	--工程名（ロケール３）
	(SELECT mavm_oper_mst_mam_oper_lcl_all_t.oper_nm
		FROM mam_oper_lcl_all mavm_oper_mst_mam_oper_lcl_all_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_all_t.oper_cd = mavm_oper_mst_mam_oper_all_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.co_cd = mavm_oper_mst_mam_oper_all_t1.co_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.lcl_cd = 'TBD3'
	)	oper_nm_lcl3,
	--工程名（ロケール４）
	(SELECT mavm_oper_mst_mam_oper_lcl_all_t.oper_nm
		FROM mam_oper_lcl_all mavm_oper_mst_mam_oper_lcl_all_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_all_t.oper_cd = mavm_oper_mst_mam_oper_all_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.co_cd = mavm_oper_mst_mam_oper_all_t1.co_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.lcl_cd = 'TBD4'
	)	oper_nm_lcl4,
	--工程名（ロケール５）
	(SELECT mavm_oper_mst_mam_oper_lcl_all_t.oper_nm
		FROM mam_oper_lcl_all mavm_oper_mst_mam_oper_lcl_all_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_all_t.oper_cd = mavm_oper_mst_mam_oper_all_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.co_cd = mavm_oper_mst_mam_oper_all_t1.co_cd
		AND mavm_oper_mst_mam_oper_lcl_all_t.lcl_cd = 'TBD5'
	)	oper_nm_lcl5
	FROM mam_oper_all mavm_oper_mst_mam_oper_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_oper_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_oper_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_OPER')
			AND	mavm_oper_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')

			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_oper_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_oper_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_OPER')
			)
		)
	)
UNION ALL
SELECT
	mavm_oper_mst_mam_oper_cmn_t1.oper_cd,
	mavm_oper_mst_mam_oper_cmn_t1.oper_nm,
	mavm_oper_mst_mam_oper_cmn_t1.oper_alc_grp,
	mavm_oper_mst_mam_oper_cmn_t1.memo1,
	mavm_oper_mst_mam_oper_cmn_t1.memo2,
	mavm_oper_mst_mam_oper_cmn_t1.memo3,
	mavm_oper_mst_mam_oper_cmn_t1.del_flg,
	mavm_oper_mst_mam_oper_cmn_t1.del_usr_id,
	mavm_oper_mst_mam_oper_cmn_t1.del_usr_nm,
	mavm_oper_mst_mam_oper_cmn_t1.del_ts,
	mavm_oper_mst_mam_oper_cmn_t1.ins_usr_id,
	mavm_oper_mst_mam_oper_cmn_t1.ins_usr_nm,
	mavm_oper_mst_mam_oper_cmn_t1.ins_ts,
	mavm_oper_mst_mam_oper_cmn_t1.ins_func_id,
	mavm_oper_mst_mam_oper_cmn_t1.upd_cntr,
	mavm_oper_mst_mam_oper_cmn_t1.upd_usr_id,
	mavm_oper_mst_mam_oper_cmn_t1.upd_usr_nm,
	mavm_oper_mst_mam_oper_cmn_t1.upd_ts,
	mavm_oper_mst_mam_oper_cmn_t1.upd_func_id,
	mavm_oper_mst_mam_oper_cmn_t1.upd_srv_req_no,
	mavm_oper_mst_mam_co_all_t2.co_cd,
	--工程名（ロケール１）
	(SELECT mavm_oper_mst_mam_oper_lcl_cmn_t.oper_nm
		FROM mam_oper_lcl_cmn mavm_oper_mst_mam_oper_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.oper_cd = mavm_oper_mst_mam_oper_cmn_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	oper_nm_lcl1,
	--工程名（ロケール２）
	(SELECT mavm_oper_mst_mam_oper_lcl_cmn_t.oper_nm
		FROM mam_oper_lcl_cmn mavm_oper_mst_mam_oper_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.oper_cd = mavm_oper_mst_mam_oper_cmn_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.lcl_cd = 'en_US'
	)	oper_nm_lcl2,
	--工程名（ロケール３）
	(SELECT mavm_oper_mst_mam_oper_lcl_cmn_t.oper_nm
		FROM mam_oper_lcl_cmn mavm_oper_mst_mam_oper_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.oper_cd = mavm_oper_mst_mam_oper_cmn_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.lcl_cd = 'TBD3'
	)	oper_nm_lcl3,
	--工程名（ロケール４）
	(SELECT mavm_oper_mst_mam_oper_lcl_cmn_t.oper_nm
		FROM mam_oper_lcl_cmn mavm_oper_mst_mam_oper_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.oper_cd = mavm_oper_mst_mam_oper_cmn_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.lcl_cd = 'TBD4'
	)	oper_nm_lcl4,
	--工程名（ロケール５）
	(SELECT mavm_oper_mst_mam_oper_lcl_cmn_t.oper_nm
		FROM mam_oper_lcl_cmn mavm_oper_mst_mam_oper_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.oper_cd = mavm_oper_mst_mam_oper_cmn_t1.oper_cd
		AND mavm_oper_mst_mam_oper_lcl_cmn_t.lcl_cd = 'TBD5'
	)	oper_nm_lcl5
	FROM mam_oper_cmn mavm_oper_mst_mam_oper_cmn_t1, mam_co_all mavm_oper_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_oper_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_oper_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_OPER')
		AND	mavm_oper_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

