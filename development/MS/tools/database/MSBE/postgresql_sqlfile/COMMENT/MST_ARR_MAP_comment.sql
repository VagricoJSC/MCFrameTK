\encoding UTF-8

COMMENT ON VIEW mst_arr_map IS '入荷マップ // Receipt map';


COMMENT ON COLUMN mst_arr_map.arr_act_no IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN mst_arr_map.ship_act_d_no IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN mst_arr_map.iv_ship_act_d_no IS 'インボイス出荷実績明細ＮＯ // #MA.IV_SHIP_ACT_D_NO // Shipping invoice result details No.';


COMMENT ON COLUMN mst_arr_map.arr_qty IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN mst_arr_map.sub_char1 IS '予備１ // #MS.ARR_MAP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_arr_map.sub_char2 IS '予備２ // #MS.ARR_MAP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_arr_map.sub_char3 IS '予備３ // #MS.ARR_MAP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_arr_map.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_arr_map.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_arr_map.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_arr_map.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_arr_map.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_arr_map.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_arr_map.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_arr_map.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_arr_map.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_arr_map.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

