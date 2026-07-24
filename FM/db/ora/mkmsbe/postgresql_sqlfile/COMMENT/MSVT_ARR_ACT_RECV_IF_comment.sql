\encoding UTF-8

COMMENT ON VIEW msvt_arr_act_recv_if IS '入荷実績受信ＩＦビュー // Receipt result import IF view';


COMMENT ON COLUMN msvt_arr_act_recv_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_arr_act_recv_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN msvt_arr_act_recv_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN msvt_arr_act_recv_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN msvt_arr_act_recv_if.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN msvt_arr_act_recv_if.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.iv_flg IS 'インボイスＦＬＧ // #MA.FLG // Invoice flg.';


COMMENT ON COLUMN msvt_arr_act_recv_if.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_schd_no IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.prms_rcpt_d_no IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.dlv_inst_no IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.rcpt_iv_d_no IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.ext_arr_act_no IS '外部入荷実績ＮＯ // #MA.EXT_ARR_ACT_NO // External receipt result No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_tm IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_dpt_cd IS '入荷部門ＣＤ // #MA.DPT_CD // Receipt dept. cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_usr_cd IS '入荷担当者ＣＤ // #MA.USR_CD // Receipt PIC cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_lg_grp_cd IS '入荷物流グループＣＤ // #MA.LG_GRP_CD // Receipt distribution group cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_loc_cd IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.arr_str_ln_cd IS '入荷棚・ラインＣＤ // #MA.STR_LN_CD // Receipt rack/line cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_arr_act_recv_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_arr_act_recv_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_arr_act_recv_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN msvt_arr_act_recv_if.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN msvt_arr_act_recv_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN msvt_arr_act_recv_if.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.bp_dlv_slip_no IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.bp_dlv_slip_rev IS '業者納品書改訂番号 // #MA.SLIP_REV // Vendor delivery note rev. number';


COMMENT ON COLUMN msvt_arr_act_recv_if.bp_dlv_slip_d_no IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.ship_fr_valid_dt IS '出荷元期限 // #MA.DT // Shipping point deadline';


COMMENT ON COLUMN msvt_arr_act_recv_if.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN msvt_arr_act_recv_if.intr_rmrks IS '内部備考 // #MS.ARR_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN msvt_arr_act_recv_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN msvt_arr_act_recv_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_arr_act_recv_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_arr_act_recv_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_arr_act_recv_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_arr_act_recv_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_arr_act_recv_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_arr_act_recv_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_arr_act_recv_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

