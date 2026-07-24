\encoding UTF-8

CREATE OR REPLACE VIEW mavm_term_mst(
term,
term_end_ym,
term_nm,
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
term_nm_lcl1,
term_nm_lcl2,
term_nm_lcl3,
term_nm_lcl4,
term_nm_lcl5
)
AS
SELECT
	mavm_term_mst_mam_term_all_t1.term,
	mavm_term_mst_mam_term_all_t1.term_end_ym,
	mavm_term_mst_mam_term_all_t1.term_nm,
	mavm_term_mst_mam_term_all_t1.memo1,
	mavm_term_mst_mam_term_all_t1.memo2,
	mavm_term_mst_mam_term_all_t1.memo3,
	mavm_term_mst_mam_term_all_t1.del_flg,
	mavm_term_mst_mam_term_all_t1.del_usr_id,
	mavm_term_mst_mam_term_all_t1.del_usr_nm,
	mavm_term_mst_mam_term_all_t1.del_ts,
	mavm_term_mst_mam_term_all_t1.ins_usr_id,
	mavm_term_mst_mam_term_all_t1.ins_usr_nm,
	mavm_term_mst_mam_term_all_t1.ins_ts,
	mavm_term_mst_mam_term_all_t1.ins_func_id,
	mavm_term_mst_mam_term_all_t1.upd_cntr,
	mavm_term_mst_mam_term_all_t1.upd_usr_id,
	mavm_term_mst_mam_term_all_t1.upd_usr_nm,
	mavm_term_mst_mam_term_all_t1.upd_ts,
	mavm_term_mst_mam_term_all_t1.upd_func_id,
	mavm_term_mst_mam_term_all_t1.upd_srv_req_no,
	mavm_term_mst_mam_term_all_t1.co_cd,
	--期名称（ロケール１）
	(SELECT mavm_term_mst_mam_term_lcl_all_t.term_nm
		FROM mam_term_lcl_all mavm_term_mst_mam_term_lcl_all_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_all_t.term = mavm_term_mst_mam_term_all_t1.term
		AND mavm_term_mst_mam_term_lcl_all_t.co_cd = mavm_term_mst_mam_term_all_t1.co_cd
		AND mavm_term_mst_mam_term_lcl_all_t.lcl_cd = 'ja_JP'
	)	term_nm_lcl1,
	--期名称（ロケール２）
	(SELECT mavm_term_mst_mam_term_lcl_all_t.term_nm
		FROM mam_term_lcl_all mavm_term_mst_mam_term_lcl_all_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_all_t.term = mavm_term_mst_mam_term_all_t1.term
		AND mavm_term_mst_mam_term_lcl_all_t.co_cd = mavm_term_mst_mam_term_all_t1.co_cd
		AND mavm_term_mst_mam_term_lcl_all_t.lcl_cd = 'en_US'
	)	term_nm_lcl2,
	--期名称（ロケール３）
	(SELECT mavm_term_mst_mam_term_lcl_all_t.term_nm
		FROM mam_term_lcl_all mavm_term_mst_mam_term_lcl_all_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_all_t.term = mavm_term_mst_mam_term_all_t1.term
		AND mavm_term_mst_mam_term_lcl_all_t.co_cd = mavm_term_mst_mam_term_all_t1.co_cd
		AND mavm_term_mst_mam_term_lcl_all_t.lcl_cd = 'TBD3'
	)	term_nm_lcl3,
	--期名称（ロケール４）
	(SELECT mavm_term_mst_mam_term_lcl_all_t.term_nm
		FROM mam_term_lcl_all mavm_term_mst_mam_term_lcl_all_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_all_t.term = mavm_term_mst_mam_term_all_t1.term
		AND mavm_term_mst_mam_term_lcl_all_t.co_cd = mavm_term_mst_mam_term_all_t1.co_cd
		AND mavm_term_mst_mam_term_lcl_all_t.lcl_cd = 'TBD4'
	)	term_nm_lcl4,
	--期名称（ロケール５）
	(SELECT mavm_term_mst_mam_term_lcl_all_t.term_nm
		FROM mam_term_lcl_all mavm_term_mst_mam_term_lcl_all_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_all_t.term = mavm_term_mst_mam_term_all_t1.term
		AND mavm_term_mst_mam_term_lcl_all_t.co_cd = mavm_term_mst_mam_term_all_t1.co_cd
		AND mavm_term_mst_mam_term_lcl_all_t.lcl_cd = 'TBD5'
	)	term_nm_lcl5
	FROM mam_term_all mavm_term_mst_mam_term_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_term_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_term_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_TERM')
			AND	mavm_term_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_term_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_term_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_TERM')
			)
		)
	)
UNION ALL
SELECT
	mavm_term_mst_mam_term_cmn_t1.term,
	mavm_term_mst_mam_term_cmn_t1.term_end_ym,
	mavm_term_mst_mam_term_cmn_t1.term_nm,
	mavm_term_mst_mam_term_cmn_t1.memo1,
	mavm_term_mst_mam_term_cmn_t1.memo2,
	mavm_term_mst_mam_term_cmn_t1.memo3,
	mavm_term_mst_mam_term_cmn_t1.del_flg,
	mavm_term_mst_mam_term_cmn_t1.del_usr_id,
	mavm_term_mst_mam_term_cmn_t1.del_usr_nm,
	mavm_term_mst_mam_term_cmn_t1.del_ts,
	mavm_term_mst_mam_term_cmn_t1.ins_usr_id,
	mavm_term_mst_mam_term_cmn_t1.ins_usr_nm,
	mavm_term_mst_mam_term_cmn_t1.ins_ts,
	mavm_term_mst_mam_term_cmn_t1.ins_func_id,
	mavm_term_mst_mam_term_cmn_t1.upd_cntr,
	mavm_term_mst_mam_term_cmn_t1.upd_usr_id,
	mavm_term_mst_mam_term_cmn_t1.upd_usr_nm,
	mavm_term_mst_mam_term_cmn_t1.upd_ts,
	mavm_term_mst_mam_term_cmn_t1.upd_func_id,
	mavm_term_mst_mam_term_cmn_t1.upd_srv_req_no,
	mavm_term_mst_mam_co_all_t2.co_cd,
	--期名称（ロケール１）
	(SELECT mavm_term_mst_mam_term_lcl_cmn_t.term_nm
		FROM mam_term_lcl_cmn mavm_term_mst_mam_term_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_cmn_t.term = mavm_term_mst_mam_term_cmn_t1.term
		AND mavm_term_mst_mam_term_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	term_nm_lcl1,
	--期名称（ロケール２）
	(SELECT mavm_term_mst_mam_term_lcl_cmn_t.term_nm
		FROM mam_term_lcl_cmn mavm_term_mst_mam_term_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_cmn_t.term = mavm_term_mst_mam_term_cmn_t1.term
		AND mavm_term_mst_mam_term_lcl_cmn_t.lcl_cd = 'en_US'
	)	term_nm_lcl2,
	--期名称（ロケール３）
	(SELECT mavm_term_mst_mam_term_lcl_cmn_t.term_nm
		FROM mam_term_lcl_cmn mavm_term_mst_mam_term_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_cmn_t.term = mavm_term_mst_mam_term_cmn_t1.term
		AND mavm_term_mst_mam_term_lcl_cmn_t.lcl_cd = 'TBD3'
	)	term_nm_lcl3,
	--期名称（ロケール４）
	(SELECT mavm_term_mst_mam_term_lcl_cmn_t.term_nm
		FROM mam_term_lcl_cmn mavm_term_mst_mam_term_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_cmn_t.term = mavm_term_mst_mam_term_cmn_t1.term
		AND mavm_term_mst_mam_term_lcl_cmn_t.lcl_cd = 'TBD4'
	)	term_nm_lcl4,
	--期名称（ロケール５）
	(SELECT mavm_term_mst_mam_term_lcl_cmn_t.term_nm
		FROM mam_term_lcl_cmn mavm_term_mst_mam_term_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_term_mst_mam_term_lcl_cmn_t.term = mavm_term_mst_mam_term_cmn_t1.term
		AND mavm_term_mst_mam_term_lcl_cmn_t.lcl_cd = 'TBD5'
	)	term_nm_lcl5
	FROM mam_term_cmn mavm_term_mst_mam_term_cmn_t1, mam_co_all mavm_term_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_term_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_term_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_TERM')
		AND	mavm_term_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

