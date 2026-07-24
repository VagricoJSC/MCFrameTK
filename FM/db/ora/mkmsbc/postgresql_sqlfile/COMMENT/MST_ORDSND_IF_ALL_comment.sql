\encoding UTF-8

COMMENT ON TABLE mst_ordsnd_if_all IS 'オーダ送信ＩＦ // Order export IF';


COMMENT ON COLUMN mst_ordsnd_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_ordsnd_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_ordsnd_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_ordsnd_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_ordsnd_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.ext_itm_ord_no IS '外部品目オーダＮＯ // #MA.EXT_ITM_ORD_NO // External item order No.';


COMMENT ON COLUMN mst_ordsnd_if_all.ext_oper_ord_no IS '外部工程オーダＮＯ // #MA.EXT_OPER_ORD_NO // External operation order No.';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_typ IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN mst_ordsnd_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.ITM_CD // IF item cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_ordsnd_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_ordsnd_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_ordsnd_if_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ordsnd_if_all.if_strg_loc_cd IS 'ＩＦ格納場所ＣＤ // #MA.LOC_CD // IF storage location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.strg_loc_nm IS '格納場所名 // #MA.LOC_NM // Storage location name';


COMMENT ON COLUMN mst_ordsnd_if_all.if_mfg_loc_cd IS 'ＩＦ製造場所ＣＤ // #MA.LOC_CD // IF mfg. location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.mfg_loc_nm IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN mst_ordsnd_if_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_ordsnd_if_all.inst_qty IS '指図予定数量 // #MA.QTY // Order scheduled qty.';


COMMENT ON COLUMN mst_ordsnd_if_all.yield_schd_qty IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN mst_ordsnd_if_all.po_schd_dt IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN mst_ordsnd_if_all.mfg_st_schd_dt IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN mst_ordsnd_if_all.mfg_end_schd_dt IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN mst_ordsnd_if_all.strg_schd_dt IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN mst_ordsnd_if_all.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_ordsnd_if_all.insp_st_schd_dt IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN mst_ordsnd_if_all.insp_end_schd_dt IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN mst_ordsnd_if_all.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN mst_ordsnd_if_all.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_ordsnd_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ordsnd_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ordsnd_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ordsnd_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ordsnd_if_all.inst_po_cnt_rmrks IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_intr_rmrks IS '品目オーダ内部備考 // #MS.IORD_INTR_RMRKS // Item order internal remarks';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_sub_char1 IS '品目オーダ予備１ // #MS.IORD_SUB_CHAR1 // Item order spare 1';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_sub_char2 IS '品目オーダ予備２ // #MS.IORD_SUB_CHAR2 // Item order spare 2';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_sub_char3 IS '品目オーダ予備３ // #MS.IORD_SUB_CHAR3 // Item order spare 3';


COMMENT ON COLUMN mst_ordsnd_if_all.st_schd_tm IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN mst_ordsnd_if_all.end_schd_tm IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_schd_qty IS '工程指図予定数量 // #MA.QTY // Operation order scheduled qty.';


COMMENT ON COLUMN mst_ordsnd_if_all.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mst_ordsnd_if_all.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.OPER_CD // IF operation cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_nm IS '工程名 // #MA.OPER_NM // Operation name';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_ordsnd_if_all.if_loc_cd IS 'ＩＦ場所ＣＤ // #MA.LOC_CD // IF location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_ordsnd_if_all.loc_nm IS '場所名 // #MA.LOC_NM // Location name';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_rsrc IS '工程資源 // #MA.OPER_RSRC // Operation resources';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_intr_rmrks IS '工程オーダ内部備考 // #MS.OORDER_INTR_RMRKS // Operation order internal remarks';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_sub_char1 IS '工程オーダ予備１ // #MS.OORDER_SUB_CHAR1 // Operation order spare 1';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_sub_char2 IS '工程オーダ予備２ // #MS.OORDER_SUB_CHAR2 // Operation order spare 2';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_sub_char3 IS '工程オーダ予備３ // #MS.OORDER_SUB_CHAR3 // Operation order spare 3';


COMMENT ON COLUMN mst_ordsnd_if_all.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_ordsnd_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_ordsnd_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_ordsnd_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_ordsnd_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_ordsnd_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ordsnd_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ordsnd_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ordsnd_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ordsnd_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mst_ordsnd_if_all.itm_ord_sts_typ IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN mst_ordsnd_if_all.oper_ord_sts_typ IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';

