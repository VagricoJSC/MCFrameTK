\encoding UTF-8

COMMENT ON VIEW mavm_cur_mst IS '通貨マスタビュー // Currency master view';


COMMENT ON COLUMN mavm_cur_mst.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mavm_cur_mst.cur_nm IS '通貨名 // #MA.CUR_NM // Currency name';


COMMENT ON COLUMN mavm_cur_mst.amt_dec_place IS '金額小数部有効桁数 // #MA.DEC_PLACE // Amount number of decimal places';


COMMENT ON COLUMN mavm_cur_mst.upri_dec_place IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN mavm_cur_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_cur_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_cur_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_cur_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_cur_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_cur_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_cur_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_cur_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_cur_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_cur_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_cur_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_cur_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_cur_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_cur_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_cur_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_cur_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_cur_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_cur_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_cur_mst.cur_nm_lcl1 IS '通貨名（ロケール１） // #MA.CUR_NM // Currency name (Locale 1)';


COMMENT ON COLUMN mavm_cur_mst.cur_nm_lcl2 IS '通貨名（ロケール２） // #MA.CUR_NM // Currency name (Locale 2)';


COMMENT ON COLUMN mavm_cur_mst.cur_nm_lcl3 IS '通貨名（ロケール３） // #MA.CUR_NM // Currency name (Locale 3)';


COMMENT ON COLUMN mavm_cur_mst.cur_nm_lcl4 IS '通貨名（ロケール４） // #MA.CUR_NM // Currency name (Locale 4)';


COMMENT ON COLUMN mavm_cur_mst.cur_nm_lcl5 IS '通貨名（ロケール５） // #MA.CUR_NM // Currency name (Locale 5)';

