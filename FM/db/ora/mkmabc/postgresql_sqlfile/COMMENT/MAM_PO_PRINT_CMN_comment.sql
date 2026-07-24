\encoding UTF-8

COMMENT ON TABLE mam_po_print_cmn IS '注文書表示マスタ_（共通）_ // Display PO sheet master_(Common)_';


COMMENT ON COLUMN mam_po_print_cmn.po_print_cd IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN mam_po_print_cmn.po_print_nm IS '注文書表示名 // #MA.PO_PRINT_NM // Display PO sheet name';


COMMENT ON COLUMN mam_po_print_cmn.txt_new_off IS 'テキスト（新規：仮単価なし） // #MA.PO_PRINT_TXT // Text (New: without temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.txt_mod_off IS 'テキスト（訂正：仮単価なし） // #MA.PO_PRINT_TXT // Text (Correct: without temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.txt_del_off IS 'テキスト（取消：仮単価なし） // #MA.PO_PRINT_TXT // Text (Cancel: without temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.txt_new_on IS 'テキスト（新規：仮単価あり） // #MA.PO_PRINT_TXT // Text (New: with temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.txt_mod_on IS 'テキスト（訂正：仮単価あり） // #MA.PO_PRINT_TXT // Text (Correct: with temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.txt_del_on IS 'テキスト（取消：仮単価あり） // #MA.PO_PRINT_TXT // Text (Cancel: with temporary unit price)';


COMMENT ON COLUMN mam_po_print_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_po_print_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_po_print_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_po_print_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_po_print_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_po_print_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_po_print_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_po_print_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_po_print_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_po_print_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_po_print_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_po_print_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_po_print_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_po_print_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_po_print_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_po_print_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_po_print_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

