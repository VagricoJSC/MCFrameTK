\encoding UTF-8

CREATE OR REPLACE VIEW mavm_unit_mst(
unit_cd,
unit_nm,
dec_place,
rnd_typ,
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
unit_nm_lcl1,
unit_nm_lcl2,
unit_nm_lcl3,
unit_nm_lcl4,
unit_nm_lcl5
)
AS
SELECT
	mavm_unit_mst_mam_unit_all_t1.unit_cd,
	mavm_unit_mst_mam_unit_all_t1.unit_nm,
	mavm_unit_mst_mam_unit_all_t1.dec_place,
	mavm_unit_mst_mam_unit_all_t1.rnd_typ,
	mavm_unit_mst_mam_unit_all_t1.memo1,
	mavm_unit_mst_mam_unit_all_t1.memo2,
	mavm_unit_mst_mam_unit_all_t1.memo3,
	mavm_unit_mst_mam_unit_all_t1.del_flg,
	mavm_unit_mst_mam_unit_all_t1.del_usr_id,
	mavm_unit_mst_mam_unit_all_t1.del_usr_nm,
	mavm_unit_mst_mam_unit_all_t1.del_ts,
	mavm_unit_mst_mam_unit_all_t1.ins_usr_id,
	mavm_unit_mst_mam_unit_all_t1.ins_usr_nm,
	mavm_unit_mst_mam_unit_all_t1.ins_ts,
	mavm_unit_mst_mam_unit_all_t1.ins_func_id,
	mavm_unit_mst_mam_unit_all_t1.upd_cntr,
	mavm_unit_mst_mam_unit_all_t1.upd_usr_id,
	mavm_unit_mst_mam_unit_all_t1.upd_usr_nm,
	mavm_unit_mst_mam_unit_all_t1.upd_ts,
	mavm_unit_mst_mam_unit_all_t1.upd_func_id,
	mavm_unit_mst_mam_unit_all_t1.upd_srv_req_no,
	mavm_unit_mst_mam_unit_all_t1.co_cd,
	--単位名（ロケール１）
	(SELECT mavm_unit_mst_mam_unit_lcl_all_t.unit_nm
		FROM mam_unit_lcl_all mavm_unit_mst_mam_unit_lcl_all_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_all_t.unit_cd = mavm_unit_mst_mam_unit_all_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.co_cd = mavm_unit_mst_mam_unit_all_t1.co_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.lcl_cd = 'ja_JP'
	)	unit_nm_lcl1,
	--単位名（ロケール２）
	(SELECT mavm_unit_mst_mam_unit_lcl_all_t.unit_nm
		FROM mam_unit_lcl_all mavm_unit_mst_mam_unit_lcl_all_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_all_t.unit_cd = mavm_unit_mst_mam_unit_all_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.co_cd = mavm_unit_mst_mam_unit_all_t1.co_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.lcl_cd = 'en_US'
	)	unit_nm_lcl2,
	--単位名（ロケール３）
	(SELECT mavm_unit_mst_mam_unit_lcl_all_t.unit_nm
		FROM mam_unit_lcl_all mavm_unit_mst_mam_unit_lcl_all_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_all_t.unit_cd = mavm_unit_mst_mam_unit_all_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.co_cd = mavm_unit_mst_mam_unit_all_t1.co_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.lcl_cd = 'TBD3'
	)	unit_nm_lcl3,
	--単位名（ロケール４）
	(SELECT mavm_unit_mst_mam_unit_lcl_all_t.unit_nm
		FROM mam_unit_lcl_all mavm_unit_mst_mam_unit_lcl_all_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_all_t.unit_cd = mavm_unit_mst_mam_unit_all_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.co_cd = mavm_unit_mst_mam_unit_all_t1.co_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.lcl_cd = 'TBD4'
	)	unit_nm_lcl4,
	--単位名（ロケール５）
	(SELECT mavm_unit_mst_mam_unit_lcl_all_t.unit_nm
		FROM mam_unit_lcl_all mavm_unit_mst_mam_unit_lcl_all_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_all_t.unit_cd = mavm_unit_mst_mam_unit_all_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.co_cd = mavm_unit_mst_mam_unit_all_t1.co_cd
		AND mavm_unit_mst_mam_unit_lcl_all_t.lcl_cd = 'TBD5'
	)	unit_nm_lcl5
	FROM mam_unit_all mavm_unit_mst_mam_unit_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_unit_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_unit_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_UNIT')
			AND	mavm_unit_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_unit_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_unit_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_UNIT')
			)
		)
	)
UNION ALL
SELECT
	mavm_unit_mst_mam_unit_cmn_t1.unit_cd,
	mavm_unit_mst_mam_unit_cmn_t1.unit_nm,
	mavm_unit_mst_mam_unit_cmn_t1.dec_place,
	mavm_unit_mst_mam_unit_cmn_t1.rnd_typ,
	mavm_unit_mst_mam_unit_cmn_t1.memo1,
	mavm_unit_mst_mam_unit_cmn_t1.memo2,
	mavm_unit_mst_mam_unit_cmn_t1.memo3,
	mavm_unit_mst_mam_unit_cmn_t1.del_flg,
	mavm_unit_mst_mam_unit_cmn_t1.del_usr_id,
	mavm_unit_mst_mam_unit_cmn_t1.del_usr_nm,
	mavm_unit_mst_mam_unit_cmn_t1.del_ts,
	mavm_unit_mst_mam_unit_cmn_t1.ins_usr_id,
	mavm_unit_mst_mam_unit_cmn_t1.ins_usr_nm,
	mavm_unit_mst_mam_unit_cmn_t1.ins_ts,
	mavm_unit_mst_mam_unit_cmn_t1.ins_func_id,
	mavm_unit_mst_mam_unit_cmn_t1.upd_cntr,
	mavm_unit_mst_mam_unit_cmn_t1.upd_usr_id,
	mavm_unit_mst_mam_unit_cmn_t1.upd_usr_nm,
	mavm_unit_mst_mam_unit_cmn_t1.upd_ts,
	mavm_unit_mst_mam_unit_cmn_t1.upd_func_id,
	mavm_unit_mst_mam_unit_cmn_t1.upd_srv_req_no,
	mavm_unit_mst_mam_co_all_t2.co_cd,
	--単位名（ロケール１）
	(SELECT mavm_unit_mst_mam_unit_lcl_cmn_t.unit_nm
		FROM mam_unit_lcl_cmn mavm_unit_mst_mam_unit_lcl_cmn_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_cmn_t.unit_cd = mavm_unit_mst_mam_unit_cmn_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	unit_nm_lcl1,
	--単位名（ロケール２）
	(SELECT mavm_unit_mst_mam_unit_lcl_cmn_t.unit_nm
		FROM mam_unit_lcl_cmn mavm_unit_mst_mam_unit_lcl_cmn_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_cmn_t.unit_cd = mavm_unit_mst_mam_unit_cmn_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_cmn_t.lcl_cd = 'en_US'
	)	unit_nm_lcl2,
	--単位名（ロケール３）
	(SELECT mavm_unit_mst_mam_unit_lcl_cmn_t.unit_nm
		FROM mam_unit_lcl_cmn mavm_unit_mst_mam_unit_lcl_cmn_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_cmn_t.unit_cd = mavm_unit_mst_mam_unit_cmn_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_cmn_t.lcl_cd = 'TBD3'
	)	unit_nm_lcl3,
	--単位名（ロケール４）
	(SELECT mavm_unit_mst_mam_unit_lcl_cmn_t.unit_nm
		FROM mam_unit_lcl_cmn mavm_unit_mst_mam_unit_lcl_cmn_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_cmn_t.unit_cd = mavm_unit_mst_mam_unit_cmn_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_cmn_t.lcl_cd = 'TBD4'
	)	unit_nm_lcl4,
	--単位名（ロケール５）
	(SELECT mavm_unit_mst_mam_unit_lcl_cmn_t.unit_nm
		FROM mam_unit_lcl_cmn mavm_unit_mst_mam_unit_lcl_cmn_t
		WHERE 0 = 0
		AND	mavm_unit_mst_mam_unit_lcl_cmn_t.unit_cd = mavm_unit_mst_mam_unit_cmn_t1.unit_cd
		AND mavm_unit_mst_mam_unit_lcl_cmn_t.lcl_cd = 'TBD5'
	)	unit_nm_lcl5
	FROM mam_unit_cmn mavm_unit_mst_mam_unit_cmn_t1, mam_co_all mavm_unit_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_unit_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_unit_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_UNIT')
		AND	mavm_unit_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

