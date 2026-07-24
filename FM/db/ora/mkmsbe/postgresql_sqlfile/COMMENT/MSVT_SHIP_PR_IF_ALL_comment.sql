\encoding UTF-8

COMMENT ON VIEW msvt_ship_pr_if_all IS '出荷進捗送信ＩＦビュー // Shipping progress export IF view';


COMMENT ON COLUMN msvt_ship_pr_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_ship_pr_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN msvt_ship_pr_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dpt_st_dt IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN msvt_ship_pr_if_all.data_upd_ts IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN msvt_ship_pr_if_all.bi_not_send_flg IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_pr_no IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN msvt_ship_pr_if_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.rqst_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.rqst_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_rqst_tm IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.prms_dt IS '納期回答日 // #MA.DT // order promising date';


COMMENT ON COLUMN msvt_ship_pr_if_all.prms_dlv_dt IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_inst_rcpt_dt IS '納入指示受領日 // #MA.DT // Delivery order received date';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_inst_prms_dt IS '納入指示回答日 // #MA.DT // Delivery order replied date';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_schd_tm IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_schd_tm IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_tm IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_tm IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.sls_dt IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.prms_qty IS '納期回答数量 // #MA.QTY // Order promising qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_inst_rcpt_qty IS '納入指示受領数量 // #MA.QTY // Delivery order received qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_inst_prms_qty IS '納入指示回答数量 // #MA.QTY // Delivery order replied qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.re_ship_schd_qty IS '再出荷予定数量 // #MA.QTY // Scheduled re-shipping qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_inst_qty IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_act_qty IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.iv_schd_qty IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.iv_act_qty IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.sls_qty IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_qty IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_ret_qty IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_schd_abort_qty IS '出荷予定打切数量 // #MA.QTY // Cancelled remaining shipping schedule qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.sls_schd_abort_qty IS '売上予定打切数量 // #MA.QTY // Cancelled remaining sales schedule qty.';


COMMENT ON COLUMN msvt_ship_pr_if_all.act_dlv_lt IS '納品ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN msvt_ship_pr_if_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN msvt_ship_pr_if_all.sls_sts_typ IS '販売状況区分 // #MS.SLS_STS_TYP // Sales status type';


COMMENT ON COLUMN msvt_ship_pr_if_all.prms_dlv_dt_overdue_flg IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_rqst_dt_overdue_flg IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_cmpl_flg IS '出荷完了ＦＬＧ // #MA.FLG // Shipping completion flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.sls_cmpl_flg IS '売上完了ＦＬＧ // #MA.FLG // Sales completed flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.dlv_cmpl_flg IS '納品完了ＦＬＧ // #MA.FLG // Delivery completion flg.';


COMMENT ON COLUMN msvt_ship_pr_if_all.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN msvt_ship_pr_if_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.slo_dt IS '受注日 // #MA.DT // Sales order date';


COMMENT ON COLUMN msvt_ship_pr_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_ship_pr_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_ship_pr_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN msvt_ship_pr_if_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN msvt_ship_pr_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN msvt_ship_pr_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_ship_pr_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_ship_pr_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_ship_pr_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_ship_pr_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_ship_pr_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_ship_pr_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

