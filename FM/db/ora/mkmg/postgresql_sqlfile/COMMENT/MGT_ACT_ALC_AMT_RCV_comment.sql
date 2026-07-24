\encoding UTF-8

COMMENT ON VIEW mgt_act_alc_amt_rcv IS '配賦費用実績受信ＩＦ // Allocable expenses result import IF';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.data_make_dt IS '送信元レコード作成日時 // #MA.TM // Creation date and time of source record';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.rmrks IS '備考 // #MG.ACT_ALC_AMT_IF_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sub_char1 IS '予備１ // #MG.ACT_ALC_AMT_IF_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sub_char2 IS '予備２ // #MG.ACT_ALC_AMT_IF_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.sub_char3 IS '予備３ // #MG.ACT_ALC_AMT_IF_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_char30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_num1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_num2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_num3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_num4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_num5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_dt1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_dt2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_dt3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_dt4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.if_sub_dt5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_alc_amt_rcv.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

