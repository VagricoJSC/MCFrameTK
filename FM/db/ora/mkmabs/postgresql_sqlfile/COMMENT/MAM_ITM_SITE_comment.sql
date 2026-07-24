\encoding UTF-8

COMMENT ON VIEW mam_itm_site IS '品目マスタ（工場・物流倉庫） // Item master (Factory/Distribution warehouse)';


COMMENT ON COLUMN mam_itm_site.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_site.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_site.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_site.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_site.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mam_itm_site.ntfy_nm IS '届出名 // #MA.NTFY_NM // Notification name';


COMMENT ON COLUMN mam_itm_site.plnt_aprv_flg IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN mam_itm_site.plnt_aprv_role_cd IS '工場出荷承認役割ＣＤ // #MA.APRV_ROLE_CD // Factory release approval role cd.';


COMMENT ON COLUMN mam_itm_site.insp_aprv_flg IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN mam_itm_site.insp_aprv_role_cd IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN mam_itm_site.mfg_aprv_flg IS '製造承認対象ＦＬＧ // #MA.FLG // For mfg. approval flg.';


COMMENT ON COLUMN mam_itm_site.mfg_aprv_role_cd IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN mam_itm_site.xfr_lot_flg IS '移送入荷時ロットＮＯ振替ＦＬＧ // #MA.FLG // Lot No. transfer flg. at transport receipt';


COMMENT ON COLUMN mam_itm_site.so_prmt_insp_flg IS '検査中ロット出荷許可ＦＬＧ // #MA.FLG // Allow inspecting lot shipment flg.';


COMMENT ON COLUMN mam_itm_site.in_prmt_insp_flg IS '検査中ロット使用許可ＦＬＧ // #MA.FLG // Allow inspecting lot use flg.';


COMMENT ON COLUMN mam_itm_site.num_id IS '発番ＩＤ // #MA.NUM_ID // Numbering ID';


COMMENT ON COLUMN mam_itm_site.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_site.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_site.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_site.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_site.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_site.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_site.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_site.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_site.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_site.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_site.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_site.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_site.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_site.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_site.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_site.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_site.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

