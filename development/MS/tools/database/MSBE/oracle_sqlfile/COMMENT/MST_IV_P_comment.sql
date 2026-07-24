
COMMENT ON TABLE MST_IV_P IS 'インボイスヘッダ（改訂履歴） // Invoice header (Rev. history)';


COMMENT ON COLUMN MST_IV_P.IV_MNG_NO IS 'インボイス管理ＮＯ // #MA.IV_MNG_NO // Invoice management No.';


COMMENT ON COLUMN MST_IV_P.IV_REV IS 'インボイス改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN MST_IV_P.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_IV_P.IV_SRC_TYP IS 'インボイス作成元区分 // #MS.IV_SRC_TYP // Invoice creating source type';


COMMENT ON COLUMN MST_IV_P.CMPL_SCHD_DT IS '完了予定日 // #MA.DT // Scheduled completion date';


COMMENT ON COLUMN MST_IV_P.TRD_SCHD_DT IS '取引予定日 // #MA.DT // Scheduled transaction date';


COMMENT ON COLUMN MST_IV_P.CMPL_DT IS '完了日 // #MA.DT // Completion date';


COMMENT ON COLUMN MST_IV_P.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_IV_P.IV_DT IS 'インボイス日付 // #MA.DT // Invoice date';


COMMENT ON COLUMN MST_IV_P.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_IV_P.SHIP_RQST_ID_TYP IS '出荷依頼先識別区分 // #MS.SHIP_RQST_ID_TYP // Shipping requested identification type';


COMMENT ON COLUMN MST_IV_P.SHIP_RQST_ID_CD IS '出荷依頼先識別ＣＤ // #MS.SHIP_RQST_ID_CD // Shipping requested alias cd.';


COMMENT ON COLUMN MST_IV_P.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_IV_P.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_IV_P.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_IV_P.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_IV_P.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_IV_P.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_IV_P.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_IV_P.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_IV_P.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_IV_P.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_IV_P.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_IV_P.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_IV_P.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_IV_P.TDLV_LG_GRP_CD IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_IV_P.DLV_ID_TYP IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_IV_P.DLV_ID_CD IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_IV_P.DLV_ID_NM IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_IV_P.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_IV_P.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_IV_P.DLV_ZIP_CD IS '納品先ＺＩＰ // #MA.ZIP_CD // ZIP (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_IV_P.DLV_CNTRY_CD IS '納品先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN MST_IV_P.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_IV_P.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_IV_P.VSSL_FLGHT IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN MST_IV_P.LOAD_PORT_CD IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN MST_IV_P.ETD_DT IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN MST_IV_P.DSCHRG_PORT_CD IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN MST_IV_P.ETA_DT IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN MST_IV_P.VIA_PORT_CD IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN MST_IV_P.VIA_SCHD_DT IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN MST_IV_P.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MST_IV_P.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_IV_P.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_IV_P.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_IV_P.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_IV_P.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_IV_P.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_IV_P.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MST_IV_P.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_IV_P.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_IV_P.BILL_BASIS_DT IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN MST_IV_P.RCV_SCHD_DT IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN MST_IV_P.TTL_TRD_CUR_AMT IS '取引通貨金額合計 // #MA.MONEY // Amount total (Transaction currency)';


COMMENT ON COLUMN MST_IV_P.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_IV_P.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_IV_P.PTAX_XRATE_INPT_FLG IS '納税為替レート指定FLG // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_IV_P.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_IV_P.TTL_NET_WT IS '純重量合計 // #MA.WT // Net weight total';


COMMENT ON COLUMN MST_IV_P.TTL_GRSS_WT IS '総重量合計 // #MA.WT // Total gross weight';


COMMENT ON COLUMN MST_IV_P.TTL_DIM IS '容積合計 // #MA.DIM // Total volume';


COMMENT ON COLUMN MST_IV_P.IV_RMRKS IS 'インボイス備考 // #MS.IV_RMRKS // Invoice remarks';


COMMENT ON COLUMN MST_IV_P.PL_RMRKS IS 'パッキングリスト備考 // #MS.PL_RMRKS // Packing list remarks';


COMMENT ON COLUMN MST_IV_P.CASE_MRK1 IS 'ケースマーク１ // #MS.CASE_MRK // Case mark 1';


COMMENT ON COLUMN MST_IV_P.CASE_MRK2 IS 'ケースマーク２ // #MS.CASE_MRK // Case mark 2';


COMMENT ON COLUMN MST_IV_P.CASE_MRK3 IS 'ケースマーク３ // #MS.CASE_MRK // Case mark 3';


COMMENT ON COLUMN MST_IV_P.CASE_MRK4 IS 'ケースマーク４ // #MS.CASE_MRK // Case mark 4';


COMMENT ON COLUMN MST_IV_P.CASE_MRK5 IS 'ケースマーク５ // #MS.CASE_MRK // Case mark 5';


COMMENT ON COLUMN MST_IV_P.CASE_MRK6 IS 'ケースマーク６ // #MS.CASE_MRK // Case mark 6';


COMMENT ON COLUMN MST_IV_P.LC_NO IS 'Ｌ／ＣＮＯ // #MA.LC_NO // L/C No.';


COMMENT ON COLUMN MST_IV_P.LC_DT IS 'Ｌ／Ｃ日付 // #MA.DT // L/C Date';


COMMENT ON COLUMN MST_IV_P.LC_RMRKS IS 'Ｌ／Ｃ備考 // #MS.LC_RMRKS // L/C remarks';


COMMENT ON COLUMN MST_IV_P.BL_NO IS 'Ｂ／ＬＮＯ // #MA.BL_NO // B/L No.';


COMMENT ON COLUMN MST_IV_P.BL_DT IS 'Ｂ／Ｌ日付 // #MA.DT // B/L date';


COMMENT ON COLUMN MST_IV_P.BL_RMRKS IS 'Ｂ／Ｌ備考 // #MS.BL_RMRKS // B/L remarks';


COMMENT ON COLUMN MST_IV_P.SHIP_FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MST_IV_P.PL_REG_FLG IS 'パッキングリスト登録ＦＬＧ // #MA.FLG // Packing list entry flg.';


COMMENT ON COLUMN MST_IV_P.PL_SKIP_FLG IS 'パッキングリスト省略ＦＬＧ // #MA.FLG // Packing list omission flg.';


COMMENT ON COLUMN MST_IV_P.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_IV_P.NON_CMPL_FLG IS '完了対象外ＦＬＧ // #MA.FLG // Not to complete flg.';


COMMENT ON COLUMN MST_IV_P.IV_SHIP_FLG IS 'インボイス単位出荷ＦＬＧ // #MA.FLG // Shipping invoice unit flg.';


COMMENT ON COLUMN MST_IV_P.IV_PRNT_FLG IS 'インボイス発行済ＦＬＧ // #MA.FLG // Invoice issued flg.';


COMMENT ON COLUMN MST_IV_P.PL_PRNT_FLG IS 'パッキングリスト発行済ＦＬＧ // #MA.FLG // Packing list issued flg.';


COMMENT ON COLUMN MST_IV_P.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_IV_P.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_IV_P.PRE_RCPT_IV_FLG IS '受領インボイス仮登録ＦＬＧ // #MA.FLG // Purchase invoice temporary entry flg.';


COMMENT ON COLUMN MST_IV_P.INTR_RMRKS IS '内部備考 // #MS.IV_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_IV_P.SUB_CHAR1 IS '予備１ // #MS.IV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_IV_P.SUB_CHAR2 IS '予備２ // #MS.IV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_IV_P.SUB_CHAR3 IS '予備３ // #MS.IV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_IV_P.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_IV_P.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_IV_P.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_IV_P.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_IV_P.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_IV_P.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_IV_P.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_IV_P.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_IV_P.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_IV_P.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

