\encoding UTF-8

COMMENT ON VIEW mam_aprv IS '承認情報マスタ // Approval info. master';


COMMENT ON COLUMN mam_aprv.aprv_func_typ IS '承認機能区分 // #MA.APRV_FUNC_TYP // Approval function type';


COMMENT ON COLUMN mam_aprv.aprv_row_num IS '承認行番号 // #MA.APRV_ROW_NUM // Approver row number';


COMMENT ON COLUMN mam_aprv.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_aprv.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_aprv.prio IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN mam_aprv.aprv_rt_ptn IS '承認ルートパタン // #MA.APRV_RT_PTN // Approval route pattern';


COMMENT ON COLUMN mam_aprv.aprv_upd_flg IS '更新可能ＦＬＧ // #MA.FLG // Updatable flg.';


COMMENT ON COLUMN mam_aprv.aprv_del_flg IS '取消可能ＦＬＧ // #MA.FLG // Cancelable flg.';


COMMENT ON COLUMN mam_aprv.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_aprv.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_aprv.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_aprv.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_aprv.itm_grp_typ IS '品目分類区分 // #MA.ITM_GRP_TYP // Item classification type';


COMMENT ON COLUMN mam_aprv.itm_grp_cd IS '品目分類ＣＤ // #MA.ITM_GRP_CD // Item classification cd.';


COMMENT ON COLUMN mam_aprv.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mam_aprv.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_aprv.bp_grp_typ IS '取引先分類区分 // #MA.BP_GRP_TYP // BP classification type';


COMMENT ON COLUMN mam_aprv.bp_grp_cd IS '取引先分類ＣＤ // #MA.BP_GRP_CD // BP classification cd.';


COMMENT ON COLUMN mam_aprv.cur_cd1 IS '通貨ＣＤ１ // #MA.CUR_CD // Currency cd. 1';


COMMENT ON COLUMN mam_aprv.val_min1 IS '金額１下限値 // #MA.MONEY // Amount 1 lower limit';


COMMENT ON COLUMN mam_aprv.val_max1 IS '金額１上限値 // #MA.MONEY // Amount 1 Upper limit';


COMMENT ON COLUMN mam_aprv.bind_cond1 IS '結合条件区分１ // #MA.BIND_COND_TYP // Join criteria type 1';


COMMENT ON COLUMN mam_aprv.cur_cd2 IS '通貨ＣＤ２ // #MA.CUR_CD // Currency cd. 2';


COMMENT ON COLUMN mam_aprv.val_min2 IS '金額２下限値 // #MA.MONEY // Amount 2 lower limit';


COMMENT ON COLUMN mam_aprv.val_max2 IS '金額２上限値 // #MA.MONEY // Amount 2 Upper limit';


COMMENT ON COLUMN mam_aprv.bind_cond2 IS '結合条件区分２ // #MA.BIND_COND_TYP // Join criteria type 2';


COMMENT ON COLUMN mam_aprv.cur_cd3 IS '通貨ＣＤ３ // #MA.CUR_CD // Currency cd. 3';


COMMENT ON COLUMN mam_aprv.val_min3 IS '金額３下限値 // #MA.MONEY // Amount 3 lower limit';


COMMENT ON COLUMN mam_aprv.val_max3 IS '金額３上限値 // #MA.MONEY // Amount 3 Upper limit';


COMMENT ON COLUMN mam_aprv.ext_key1 IS '拡張項目１ // #MA.APRV_EXT_KEY1 // Extended column 1';


COMMENT ON COLUMN mam_aprv.ext_key2 IS '拡張項目２ // #MA.APRV_EXT_KEY2 // Extended column 2';


COMMENT ON COLUMN mam_aprv.ext_key3 IS '拡張項目３ // #MA.APRV_EXT_KEY3 // Extended column 3';


COMMENT ON COLUMN mam_aprv.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_aprv.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_aprv.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_aprv.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_aprv.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_aprv.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_aprv.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_aprv.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_aprv.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_aprv.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_aprv.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_aprv.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_aprv.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_aprv.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_aprv.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_aprv.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_aprv.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

