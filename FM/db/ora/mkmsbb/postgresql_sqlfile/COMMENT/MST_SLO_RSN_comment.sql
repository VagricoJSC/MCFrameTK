\encoding UTF-8

COMMENT ON VIEW mst_slo_rsn IS '見積受注理由 // Quotation sales order reason';


COMMENT ON COLUMN mst_slo_rsn.slo_rsn_cd IS '見積受注理由ＣＤ // #MS.SLO_RSN_CD // Quotation sales order reason cd.';


COMMENT ON COLUMN mst_slo_rsn.slo_rsn_nm IS '見積受注理由名 // #MS.SLO_RSN_NM // Quotation sales order reason name';


COMMENT ON COLUMN mst_slo_rsn.qtn_term_flg IS '見積条件ＦＬＧ // #MA.FLG // Quotation terms flg.';


COMMENT ON COLUMN mst_slo_rsn.qtn_term_sort_seq IS '見積条件ソート順 // #MA.INT // Quotation terms sort order';


COMMENT ON COLUMN mst_slo_rsn.qtn_rslt_flg IS '見積結果ＦＬＧ // #MA.FLG // Quotation result flg.';


COMMENT ON COLUMN mst_slo_rsn.qtn_rslt_sort_seq IS '見積結果ソート順 // #MA.INT // Quotation result sort order';


COMMENT ON COLUMN mst_slo_rsn.slo_can_flg IS '受注取消ＦＬＧ // #MA.FLG // Sales order cancel flg.';


COMMENT ON COLUMN mst_slo_rsn.slo_can_sort_seq IS '受注取消ソート順 // #MA.INT // Sales order cancel sort order';


COMMENT ON COLUMN mst_slo_rsn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mst_slo_rsn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mst_slo_rsn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mst_slo_rsn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mst_slo_rsn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mst_slo_rsn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mst_slo_rsn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mst_slo_rsn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_rsn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_rsn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_rsn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_rsn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_rsn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_rsn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_rsn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_rsn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_rsn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

