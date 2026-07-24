\encoding UTF-8

COMMENT ON TABLE mbt_aprv_all IS '承認情報ヘッダ // Approval info. header';


COMMENT ON COLUMN mbt_aprv_all.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mbt_aprv_all.aprv_no_seq IS '承認ＮＯ連番 // #MA.APRV_NO_SEQ // Approval sequence number';


COMMENT ON COLUMN mbt_aprv_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_aprv_all.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mbt_aprv_all.last_aprv_usr_cd IS '最終承認者ＣＤ // #MA.USR_CD // Final approver cd.';


COMMENT ON COLUMN mbt_aprv_all.last_aprv_tm IS '最終承認日時 // #MA.TM // Final approver date and time';


COMMENT ON COLUMN mbt_aprv_all.next_opr_flg IS '次処理済ＦＬＧ // #MA.FLG // Next process completed flg.';


COMMENT ON COLUMN mbt_aprv_all.ins_dt IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN mbt_aprv_all.biz_usr_cd IS '業務担当者ＣＤ // #MA.USR_CD // Business PIC cd.';


COMMENT ON COLUMN mbt_aprv_all.src_ins_usr_cd IS '登録担当者ＣＤ // #MA.USR_CD // Entry PIC cd.';


COMMENT ON COLUMN mbt_aprv_all.master_dt IS '承認マスタ適用日 // #MA.DT // Approval master application date';


COMMENT ON COLUMN mbt_aprv_all.aprv_func_typ IS '承認機能区分 // #MA.APRV_FUNC_TYP // Approval function type';


COMMENT ON COLUMN mbt_aprv_all.aprv_rt_ptn IS '承認ルートパタン // #MA.APRV_RT_PTN // Approval route pattern';


COMMENT ON COLUMN mbt_aprv_all.aprv_row_num IS '承認行番号 // #MA.APRV_ROW_NUM // Approver row number';


COMMENT ON COLUMN mbt_aprv_all.src_itm_cd IS '承認作成元品目ＣＤ // #MA.ITM_CD // Approval creating source item cd.';


COMMENT ON COLUMN mbt_aprv_all.src_itm_sub1 IS '承認作成元枝番１ // #MA.ITM_SUB1 // Approval creating source branch No. 1';


COMMENT ON COLUMN mbt_aprv_all.src_itm_sub2 IS '承認作成元枝番２ // #MA.ITM_SUB2 // Approval creating source branch No. 2';


COMMENT ON COLUMN mbt_aprv_all.src_itm_sub3 IS '承認作成元枝番３ // #MA.ITM_SUB3 // Approval creating source branch No. 3';


COMMENT ON COLUMN mbt_aprv_all.src_dpt_cd IS '承認作成元部門ＣＤ // #MA.DPT_CD // Approval creating source dept. cd.';


COMMENT ON COLUMN mbt_aprv_all.src_bp_cd IS '承認作成元取引先ＣＤ // #MA.BP_CD // Approval creating source customer cd.';


COMMENT ON COLUMN mbt_aprv_all.src_cur_cd1 IS '承認作成元通貨ＣＤ１ // #MA.CUR_CD // Approval creating source base currency cd. 1';


COMMENT ON COLUMN mbt_aprv_all.src_amt1 IS '承認作成元金額１ // #MA.MONEY // Approval creating source amount 1';


COMMENT ON COLUMN mbt_aprv_all.src_cur_cd2 IS '承認作成元通貨ＣＤ２ // #MA.CUR_CD // Approval creating source base currency cd. 2';


COMMENT ON COLUMN mbt_aprv_all.src_amt2 IS '承認作成元金額２ // #MA.MONEY // Approval creating source amount 2';


COMMENT ON COLUMN mbt_aprv_all.src_cur_cd3 IS '承認作成元通貨ＣＤ３ // #MA.CUR_CD // Approval creating source base currency cd. 3';


COMMENT ON COLUMN mbt_aprv_all.src_amt3 IS '承認作成元金額３ // #MA.MONEY // Approval created-from amount 3';


COMMENT ON COLUMN mbt_aprv_all.src_ext_key1 IS '承認作成元拡張項目１ // #MA.APRV_EXT_KEY1 // Approval creating source extended column 1';


COMMENT ON COLUMN mbt_aprv_all.src_ext_key2 IS '承認作成元拡張項目２ // #MA.APRV_EXT_KEY2 // Approval creating source extended column 2';


COMMENT ON COLUMN mbt_aprv_all.src_ext_key3 IS '承認作成元拡張項目３ // #MA.APRV_EXT_KEY3 // Approval created-from expanded column 3';


COMMENT ON COLUMN mbt_aprv_all.aprv_src_no1 IS '承認作成元ＮＯ１ // #MA.APRV_SRC_NO // Approval creating source No. 1';


COMMENT ON COLUMN mbt_aprv_all.aprv_src_no2 IS '承認作成元ＮＯ２ // #MA.APRV_SRC_NO // Approval creating source No. 2';


COMMENT ON COLUMN mbt_aprv_all.aprv_upd_flg IS '更新可能ＦＬＧ // #MA.FLG // Updatable flg.';


COMMENT ON COLUMN mbt_aprv_all.aprv_can_flg IS '取消可能ＦＬＧ // #MA.FLG // Cancelable flg.';


COMMENT ON COLUMN mbt_aprv_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mbt_aprv_all.sub_char1 IS '予備１ // #MA.APRV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mbt_aprv_all.sub_char2 IS '予備２ // #MA.APRV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mbt_aprv_all.sub_char3 IS '予備３ // #MA.APRV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mbt_aprv_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_aprv_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_aprv_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_aprv_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_aprv_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_aprv_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_aprv_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_aprv_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_aprv_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_aprv_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

