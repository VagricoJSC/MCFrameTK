\encoding UTF-8

COMMENT ON VIEW mam_biz_rsn IS '業務理由マスタ // Business reason master';


COMMENT ON COLUMN mam_biz_rsn.biz_rsn_cd IS '業務理由ＣＤ // #MA.BIZ_RSN_CD // Business reason cd.';


COMMENT ON COLUMN mam_biz_rsn.biz_rsn_nm IS '業務理由名 // #MA.BIZ_RSN_NM // Business reason name';


COMMENT ON COLUMN mam_biz_rsn.base_biz_rsn_nm IS '業務理由名（ベース） // #MA.BIZ_RSN_NM // Business reason name(Base)';


COMMENT ON COLUMN mam_biz_rsn.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_biz_rsn.purc_flg IS '仕入ＦＬＧ // #MA.FLG // Purchase flg.';


COMMENT ON COLUMN mam_biz_rsn.purc_sort_seq IS '仕入ソート順 // #MA.INT // Purchase sort order';


COMMENT ON COLUMN mam_biz_rsn.purc_rtn_flg IS '仕入返品ＦＬＧ // #MA.FLG // Purchase return flg.';


COMMENT ON COLUMN mam_biz_rsn.purc_rtn_sort_seq IS '仕入返品ソート順 // #MA.INT // Purchase return sort order';


COMMENT ON COLUMN mam_biz_rsn.xpns_purc_flg IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN mam_biz_rsn.slo_xpns_purc_flg IS '受注紐付経費購買ＦＬＧ // #MA.FLG // Expense purchase (pegged to sales order) flg.';


COMMENT ON COLUMN mam_biz_rsn.purc_dscnt_flg IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN mam_biz_rsn.purc_dscnt_loc_mng_typ IS '仕入調整管轄区分 // #MA.LOC_MNG_TYP // Purchase adjustment controlling site type';


COMMENT ON COLUMN mam_biz_rsn.purc_dscnt_sort_seq IS '仕入調整ソート順 // #MA.INT // Purchase adjustment sort order';


COMMENT ON COLUMN mam_biz_rsn.sls_flg IS '売上ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mam_biz_rsn.sls_sort_seq IS '売上ソート順 // #MA.INT // Sales sort order';


COMMENT ON COLUMN mam_biz_rsn.sls_rtn_flg IS '売上返品ＦＬＧ // #MA.FLG // Sales return flg.';


COMMENT ON COLUMN mam_biz_rsn.sls_rtn_sort_seq IS '売上返品ソート順 // #MA.INT // Sales return sort order';


COMMENT ON COLUMN mam_biz_rsn.sls_acxfr_flg IS '販売他勘定ＦＬＧ // #MA.FLG // Sales other accounting flg.';


COMMENT ON COLUMN mam_biz_rsn.sls_dscnt_flg IS '売上調整ＦＬＧ // #MA.FLG // Sales adjustment flg.';


COMMENT ON COLUMN mam_biz_rsn.sls_dscnt_sort_seq IS '売上調整ソート順 // #MA.INT // Sales adjustment sort order';


COMMENT ON COLUMN mam_biz_rsn.acxfr_gr_flg IS '他勘定入庫ＦＬＧ // #MA.FLG // Other accounting GR flg.';


COMMENT ON COLUMN mam_biz_rsn.acxfr_gr_sort_seq IS '他勘定入庫ソート順 // #MA.INT // Other accounting GR sort order';


COMMENT ON COLUMN mam_biz_rsn.acxfr_gi_flg IS '他勘定出庫ＦＬＧ // #MA.FLG // Other accounting GI flg.';


COMMENT ON COLUMN mam_biz_rsn.acxfr_gi_sort_seq IS '他勘定出庫ソート順 // #MA.INT // Other accounting GI sort order';


COMMENT ON COLUMN mam_biz_rsn.inpt_acxfr_sort_seq IS '投入他勘定ソート順 // #MA.INT // Input other accounting sort order';


COMMENT ON COLUMN mam_biz_rsn.disp_flg IS '廃棄ＦＬＧ // #MA.FLG // Disposal flg.';


COMMENT ON COLUMN mam_biz_rsn.disp_sort_seq IS '廃棄ソート順 // #MA.INT // Disposal sort order';


COMMENT ON COLUMN mam_biz_rsn.stk_xfr_flg IS '在庫振替ＦＬＧ // #MA.FLG // Inventory transfer flg.';


COMMENT ON COLUMN mam_biz_rsn.stk_xfr_sort_seq IS '在庫振替ソート順 // #MA.INT // Inventory transfer sort order';


COMMENT ON COLUMN mam_biz_rsn.xfr_flg IS '移送ＦＬＧ // #MA.FLG // Transport flg.';


COMMENT ON COLUMN mam_biz_rsn.xfr_sort_seq IS '移送ソート順 // #MA.INT // Transport sort order';


COMMENT ON COLUMN mam_biz_rsn.yield_flg IS '出来高ＦＬＧ // #MA.FLG // Output flg.';


COMMENT ON COLUMN mam_biz_rsn.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mam_biz_rsn.yield_sort_seq IS '出来高ソート順 // #MA.INT // Output sort order';


COMMENT ON COLUMN mam_biz_rsn.not_stk_flg IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN mam_biz_rsn.loss_flg IS 'ロスＦＬＧ // #MA.FLG // Loss flg.';


COMMENT ON COLUMN mam_biz_rsn.fxd_loss_flg IS '固定ロスＦＬＧ // #MA.FLG // Constant loss flg.';


COMMENT ON COLUMN mam_biz_rsn.not_lot_trace_flg IS 'ロットトレース対象外ＦＬＧ // #MA.FLG // Not for lot trace flg.';


COMMENT ON COLUMN mam_biz_rsn.inpt_flg IS '投入ＦＬＧ // #MA.FLG // Input flg.';


COMMENT ON COLUMN mam_biz_rsn.inpt_sort_seq IS '投入ソート順 // #MA.INT // Input sort order';


COMMENT ON COLUMN mam_biz_rsn.dfct_flg IS '検査不良ＦＬＧ // #MA.FLG // Inspection defective flg.';


COMMENT ON COLUMN mam_biz_rsn.dfct_sort_seq IS '検査不良ソート順 // #MA.INT // Inspection defective sort order';


COMMENT ON COLUMN mam_biz_rsn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_biz_rsn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_biz_rsn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_biz_rsn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_biz_rsn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_biz_rsn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_biz_rsn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_biz_rsn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_biz_rsn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_biz_rsn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_biz_rsn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_biz_rsn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_biz_rsn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_biz_rsn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_biz_rsn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_biz_rsn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_biz_rsn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

