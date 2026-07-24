\encoding UTF-8

COMMENT ON VIEW mavm_alc_ac_mst IS '配賦科目マスタビュー // Allocation account master view';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm IS '配賦科目名 // #MA.ALC_AC_NM // Allocation account name';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mavm_alc_ac_mst.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_grp_cd1 IS '配賦科目グループ１ // #MA.ALC_AC_GRP_CD // Allocation account group 1';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_grp_cd2 IS '配賦科目グループ２ // #MA.ALC_AC_GRP_CD // Allocation account group 2';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_grp_cd3 IS '配賦科目グループ３ // #MA.ALC_AC_GRP_CD // Allocation account group 3';


COMMENT ON COLUMN mavm_alc_ac_mst.co_alc_ac_cd IS '繰越配賦科目ＣＤ // #MA.ALC_AC_CD // Carry-over allocation account cd.';


COMMENT ON COLUMN mavm_alc_ac_mst.not_itm_alc_ac_flg IS '品目配賦仕訳対象外ＦＬＧ // #MA.FLG // Not for item allocation journal flg.';


COMMENT ON COLUMN mavm_alc_ac_mst.not_alc_rate_ac_flg IS '配賦率仕訳対象外ＦＬＧ // #MA.FLG // Not for allocation rate journal flg.';


COMMENT ON COLUMN mavm_alc_ac_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_alc_ac_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_alc_ac_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_alc_ac_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_alc_ac_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_alc_ac_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_alc_ac_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_alc_ac_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_alc_ac_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_alc_ac_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_alc_ac_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_alc_ac_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_alc_ac_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm_lcl1 IS '配賦科目名（ロケール１） // #MA.ALC_AC_NM // Allocation account name (Locale 1)';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm_lcl2 IS '配賦科目名（ロケール２） // #MA.ALC_AC_NM // Allocation account name (Locale 2)';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm_lcl3 IS '配賦科目名（ロケール３） // #MA.ALC_AC_NM // Allocation account name (Locale 3)';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm_lcl4 IS '配賦科目名（ロケール４） // #MA.ALC_AC_NM // Allocation account name (Locale 4)';


COMMENT ON COLUMN mavm_alc_ac_mst.alc_ac_nm_lcl5 IS '配賦科目名（ロケール５） // #MA.ALC_AC_NM // Allocation account name (Locale 5)';

