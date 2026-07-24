\encoding UTF-8

COMMENT ON TABLE mst_iv_ship_act_map_all IS 'インボイス出荷実績マップ // Invoice shipping result map';


COMMENT ON COLUMN mst_iv_ship_act_map_all.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ship_act_d_no IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ship_schd_no IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ship_act_fix_flg IS '出荷実績指定ＦＬＧ // #MA.FLG // Shipping result specification flg.';


COMMENT ON COLUMN mst_iv_ship_act_map_all.sub_char1 IS '予備１ // #MS.IV_MAP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_iv_ship_act_map_all.sub_char2 IS '予備２ // #MS.IV_MAP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_iv_ship_act_map_all.sub_char3 IS '予備３ // #MS.IV_MAP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_iv_ship_act_map_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_iv_ship_act_map_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

