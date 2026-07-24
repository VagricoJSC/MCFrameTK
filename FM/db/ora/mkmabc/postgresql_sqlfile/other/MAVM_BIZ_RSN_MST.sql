\encoding UTF-8

CREATE OR REPLACE VIEW mavm_biz_rsn_mst(
biz_rsn_cd,
biz_rsn_nm,
ac_rsn_cd,
purc_flg,
purc_sort_seq,
purc_rtn_flg,
purc_rtn_sort_seq,
xpns_purc_flg,
slo_xpns_purc_flg,
purc_dscnt_flg,
purc_dscnt_loc_mng_typ,
purc_dscnt_sort_seq,
sls_flg,
sls_sort_seq,
sls_rtn_flg,
sls_rtn_sort_seq,
sls_acxfr_flg,
sls_dscnt_flg,
sls_dscnt_sort_seq,
acxfr_gr_flg,
acxfr_gr_sort_seq,
acxfr_gi_flg,
acxfr_gi_sort_seq,
inpt_acxfr_sort_seq,
disp_flg,
disp_sort_seq,
stk_xfr_flg,
stk_xfr_sort_seq,
xfr_flg,
xfr_sort_seq,
yield_flg,
yield_typ,
yield_sort_seq,
not_stk_flg,
loss_flg,
fxd_loss_flg,
not_lot_trace_flg,
inpt_flg,
inpt_sort_seq,
dfct_flg,
dfct_sort_seq,
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
biz_rsn_nm_lcl1,
biz_rsn_nm_lcl2,
biz_rsn_nm_lcl3,
biz_rsn_nm_lcl4,
biz_rsn_nm_lcl5
)
AS
SELECT
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.ac_rsn_cd,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_rtn_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_rtn_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.xpns_purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.slo_xpns_purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_dscnt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_dscnt_loc_mng_typ,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.purc_dscnt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_rtn_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_rtn_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_acxfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_dscnt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.sls_dscnt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.acxfr_gr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.acxfr_gr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.acxfr_gi_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.acxfr_gi_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.inpt_acxfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.disp_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.disp_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.stk_xfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.stk_xfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.xfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.xfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.yield_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.yield_typ,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.yield_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.not_stk_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.loss_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.fxd_loss_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.not_lot_trace_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.inpt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.inpt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.dfct_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.dfct_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.memo1,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.memo2,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.memo3,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.del_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.del_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.del_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.del_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.ins_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.ins_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.ins_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.ins_func_id,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_cntr,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_func_id,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.upd_srv_req_no,
	mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd,
	--業務理由名（ロケール１）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_all mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.co_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.lcl_cd = 'ja_JP'
	)	biz_rsn_nm_lcl1,
	--業務理由名（ロケール２）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_all mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.co_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.lcl_cd = 'en_US'
	)	biz_rsn_nm_lcl2,
	--業務理由名（ロケール３）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_all mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.co_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.lcl_cd = 'TBD3'
	)	biz_rsn_nm_lcl3,
	--業務理由名（ロケール４）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_all mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.co_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.lcl_cd = 'TBD4'
	)	biz_rsn_nm_lcl4,
	--業務理由名（ロケール５）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_all mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.co_cd = mavm_biz_rsn_mst_mam_biz_rsn_all_t1.co_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_all_t.lcl_cd = 'TBD5'
	)	biz_rsn_nm_lcl5
	FROM mam_biz_rsn_all mavm_biz_rsn_mst_mam_biz_rsn_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_biz_rsn_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_biz_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BIZ_RSN')
			AND	mavm_biz_rsn_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_biz_rsn_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_biz_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BIZ_RSN')
			)
		)
	)
UNION ALL
SELECT
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.ac_rsn_cd,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_rtn_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_rtn_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.xpns_purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.slo_xpns_purc_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_dscnt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_dscnt_loc_mng_typ,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.purc_dscnt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_rtn_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_rtn_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_acxfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_dscnt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.sls_dscnt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.acxfr_gr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.acxfr_gr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.acxfr_gi_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.acxfr_gi_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.inpt_acxfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.disp_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.disp_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.stk_xfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.stk_xfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.xfr_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.xfr_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.yield_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.yield_typ,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.yield_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.not_stk_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.loss_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.fxd_loss_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.not_lot_trace_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.inpt_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.inpt_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.dfct_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.dfct_sort_seq,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.memo1,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.memo2,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.memo3,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.del_flg,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.del_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.del_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.del_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.ins_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.ins_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.ins_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.ins_func_id,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_cntr,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_usr_id,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_usr_nm,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_ts,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_func_id,
	mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.upd_srv_req_no,
	mavm_biz_rsn_mst_mam_co_all_t2.co_cd,
	--業務理由名（ロケール１）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_cmn mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	biz_rsn_nm_lcl1,
	--業務理由名（ロケール２）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_cmn mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.lcl_cd = 'en_US'
	)	biz_rsn_nm_lcl2,
	--業務理由名（ロケール３）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_cmn mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.lcl_cd = 'TBD3'
	)	biz_rsn_nm_lcl3,
	--業務理由名（ロケール４）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_cmn mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.lcl_cd = 'TBD4'
	)	biz_rsn_nm_lcl4,
	--業務理由名（ロケール５）
	(SELECT mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_nm
		FROM mam_biz_rsn_lcl_cmn mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.biz_rsn_cd = mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1.biz_rsn_cd
		AND mavm_biz_rsn_mst_mam_biz_rsn_lcl_cmn_t.lcl_cd = 'TBD5'
	)	biz_rsn_nm_lcl5
	FROM mam_biz_rsn_cmn mavm_biz_rsn_mst_mam_biz_rsn_cmn_t1, mam_co_all mavm_biz_rsn_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_biz_rsn_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_biz_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_BIZ_RSN')
		AND	mavm_biz_rsn_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

