\encoding UTF-8

COMMENT ON VIEW mst_slo IS '受注ヘッダ // Sales order header';


COMMENT ON COLUMN mst_slo.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_slo.slo_rev IS '受注改訂番号 // #MA.SLIP_REV // Sales order rev. number';


COMMENT ON COLUMN mst_slo.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_slo.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_slo.slo_dt IS '受注日 // #MA.DT // Sales order date';


COMMENT ON COLUMN mst_slo.slo_typ IS '受注区分 // #MS.SLO_TYP // Sales order type';


COMMENT ON COLUMN mst_slo.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_slo.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_slo.cst_po_rev IS '得意先注文改訂番号 // #MA.SLIP_REV // Customer order rev. number';


COMMENT ON COLUMN mst_slo.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_slo.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_slo.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_slo.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_slo.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_slo.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_slo.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_slo.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_slo.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_slo.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_slo.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_slo.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_slo.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_slo.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_slo.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_slo.trnspt_cd IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN mst_slo.vssl_flght IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN mst_slo.load_port_cd IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN mst_slo.etd_dt IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN mst_slo.dschrg_port_cd IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN mst_slo.eta_dt IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN mst_slo.via_port_cd IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN mst_slo.via_schd_dt IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN mst_slo.assort_typ IS '品揃区分 // #MS.SHIP_ASSORT_TYP // Assortment type';


COMMENT ON COLUMN mst_slo.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mst_slo.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_slo.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_slo.rcpt_dt IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_slo.rcpt_usr_cd IS '受付担当者ＣＤ // #MA.USR_CD // Receiving PIC cd.';


COMMENT ON COLUMN mst_slo.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_slo.intr_rmrks IS '内部備考 // #MS.SLO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_slo.cst_po_rmrks IS '得意先注文備考 // #MS.CST_PO_RMRKS // Customer order remarks';


COMMENT ON COLUMN mst_slo.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_slo.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_slo.adv_ship_ctrl_typ IS '前受金出荷制御区分 // #MS.ADV_SHIP_CTRL_TYP // Advance received control shipping type';


COMMENT ON COLUMN mst_slo.adv_bill_amt IS '前受金請求額 // #MA.MONEY // Advance received billing amount';


COMMENT ON COLUMN mst_slo.adv_rcv_amt IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN mst_slo.sub_char1 IS '予備１ // #MS.SLO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_slo.sub_char2 IS '予備２ // #MS.SLO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_slo.sub_char3 IS '予備３ // #MS.SLO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_slo.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_slo.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mst_slo.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mst_slo.edi_flg IS 'ＥＤＩ ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_slo.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_slo.can_rsn_cd IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN mst_slo.can_rmrks IS '取消備考 // #MS.SLO_CAN_RMRKS // Cancel remarks';


COMMENT ON COLUMN mst_slo.cred_upd_amt IS '与信更新金額 // #MA.MONEY // Credit update amount';


COMMENT ON COLUMN mst_slo.edi_sub_char1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN mst_slo.edi_sub_char2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN mst_slo.edi_sub_char3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN mst_slo.edi_sub_char4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN mst_slo.edi_sub_char5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN mst_slo.edi_sub_num1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN mst_slo.edi_sub_dt1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN mst_slo.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_slo.sls_dt IS '売上日 // #MA.DT // ';


COMMENT ON COLUMN mst_slo.slo_aprv_dt IS '受注日 // #MA.DT // ';


COMMENT ON COLUMN mst_slo.aprv_dt IS '更新日 // #MA.DT // ';


COMMENT ON COLUMN mst_slo.ship_prnt_no_cst_nm_flg IS '出荷帳票得意先名印字しないＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mst_slo.src_wrk_no IS '元案件ＮＯ // #MA.WRK_NO // ';


COMMENT ON COLUMN mst_slo.zoho_sls_schd_no IS 'ＺＯＨＯ販売予定ＮＯ // #MA.ZOHO_SLS_SCHD_NO // ';


COMMENT ON COLUMN mst_slo.slo_last_sls_flg IS '受注出荷最終売上 // #MA.FLG // ';


COMMENT ON COLUMN mst_slo.prod_itm_cd IS '製品ＣＤ // #MA.ITM_CD // ';


COMMENT ON COLUMN mst_slo.prod_itm_sub1 IS '製品枝番１ // #MA.ITM_SUB1 // ';


COMMENT ON COLUMN mst_slo.prod_itm_sub2 IS '製品枝番２ // #MA.ITM_SUB2 // ';


COMMENT ON COLUMN mst_slo.prod_itm_sub3 IS '製品枝番３ // #MA.ITM_SUB3 // ';


COMMENT ON COLUMN mst_slo.prod_itm_nm IS '製品名 // #MA.ITM_NM // ';


COMMENT ON COLUMN mst_slo.surv_line_qty IS '測線数 // #MA.SURV_LINE_QTY // ';


COMMENT ON COLUMN mst_slo.diameter IS '口径 // #MA.DIAMETER // ';


COMMENT ON COLUMN mst_slo.match_key IS '照合ＫＥＹ // #MA.MATCH_KEY // ';


COMMENT ON COLUMN mst_slo.rcpt_no IS '受付番号 // #MA.RCPT_NO // ';


COMMENT ON COLUMN mst_slo.appl_doc_no IS '申請書番号 // #MA.APPL_DOC_NO // ';


COMMENT ON COLUMN mst_slo.dlv_draw_no IS '納入図番号 // #MA.DLV_DRAW_NO // ';


COMMENT ON COLUMN mst_slo.slo_num_typ IS '注番区分 // #MA.SLO_NUM_TYP // ';


COMMENT ON COLUMN mst_slo.slo_num IS '注文番号 // #MA.SLO_NUM // ';


COMMENT ON COLUMN mst_slo.hdr_qty IS '数量（ヘッダ） // #MA.QTY // ';


COMMENT ON COLUMN mst_slo.hdr_amt IS '金額（ヘッダ） // #MA.MONEY // ';


COMMENT ON COLUMN mst_slo.paint_clr IS '塗色 // #MA.PAINT_CLR // ';


COMMENT ON COLUMN mst_slo.sales_cond IS '売上条件区分 // #MA.SALES_COND // ';


COMMENT ON COLUMN mst_slo.ship_sp_instr_typ IS '出荷特別指示区分 // #MA.SHIP_SP_INSTR_TYP // ';


COMMENT ON COLUMN mst_slo.spec_dlv_note_typ IS '指定納品書区分 // #MA.SPEC_DLV_NOTE_TYP // ';


COMMENT ON COLUMN mst_slo.ord_dlv_dt IS '注文書納期 // #MA.DT // ';


COMMENT ON COLUMN mst_slo.mrkt_cd IS '市場ＣＤ // #MA.MRKT_CD // ';


COMMENT ON COLUMN mst_slo.cntry_sign IS '国別符号 // #MA.CNTRY_SIGN // ';


COMMENT ON COLUMN mst_slo.ves_natl IS '船籍 // #MA.VES_NATL // ';


COMMENT ON COLUMN mst_slo.shipyard_cd IS '造船所 // #MA.SHIPYARD_CD // ';


COMMENT ON COLUMN mst_slo.ves_no IS '船番 // #MA.VES_NO // ';


COMMENT ON COLUMN mst_slo.ves_nm IS '船名 // #MA.VES_NM // ';


COMMENT ON COLUMN mst_slo.tonnage IS '屯数 // #MA.TONNAGE // ';


COMMENT ON COLUMN mst_slo.ves_typ IS '船種 // #MA.VES_TYP // ';


COMMENT ON COLUMN mst_slo.insp_std IS '検査規格 // #MA.INSP_STD // ';


COMMENT ON COLUMN mst_slo.royalty_trg_amt IS 'ロイヤリティ対象金額 // #MA.MONEY // ';


COMMENT ON COLUMN mst_slo.royalty_psppl IS 'ロイヤリティ支払先 // #MA.ROYALTY_PSPPL // ';


COMMENT ON COLUMN mst_slo.ins_loc_1 IS '設置場所1 // #MA.INS_LOC_CD // ';


COMMENT ON COLUMN mst_slo.ins_loc_2 IS '設置場所2 // #MA.INS_LOC_CD // ';


COMMENT ON COLUMN mst_slo.sfi_no IS 'SFI番号 // #MA.SFI_NO // ';


COMMENT ON COLUMN mst_slo.ps_sal_aft_dt IS '装備後売上日 // #MA.DT // ';


COMMENT ON COLUMN mst_slo.wit_insp_typ IS '立会検査有無区分 // #MA.WIT_INSP_TYP // ';


COMMENT ON COLUMN mst_slo.equip_typ IS '装備要否区分 // #MA.EQUIP_TYP // ';


COMMENT ON COLUMN mst_slo.spec_doc_typ IS '仕様書区分 // #MA.SPEC_DOC_TYP // ';


COMMENT ON COLUMN mst_slo.model_jp_en_typ IS '型式和英区分 // #MA.MODEL_JP_EN_TYP // ';


COMMENT ON COLUMN mst_slo.insp_rep_typ IS '検査成績書（検査成績書区分） // #MA.INSP_REP_TYP // ';


COMMENT ON COLUMN mst_slo.insp_rep_qty IS '検査成績書（検査成績書部数） // #MA.INSP_REP_QTY // ';


COMMENT ON COLUMN mst_slo.cons_draw_typ IS '協議図（協議図区分） // #MA.CONS_DRAW_TYP // ';


COMMENT ON COLUMN mst_slo.cons_draw_qty IS '協議図（協議図部数） // #MA.CONS_DRAW_QTY // ';


COMMENT ON COLUMN mst_slo.const_draw_typ IS '工事図（工事図区分） // #MA.CONST_DRAW_TYP // ';


COMMENT ON COLUMN mst_slo.const_draw_qty IS '工事図（工事図部数） // #MA.CONST_DRAW_QTY // ';


COMMENT ON COLUMN mst_slo.comp_draw_typ IS '完成図（完成図区分） // #MA.COMP_DRAW_TYP // ';


COMMENT ON COLUMN mst_slo.comp_draw_qty IS '完成図（完成図部数） // #MA.COMP_DRAW_QTY // ';


COMMENT ON COLUMN mst_slo.inst_manual_typ IS '取扱説明書（取扱説明書区分） // #MA.INST_MANUAL_TYP // ';


COMMENT ON COLUMN mst_slo.inst_manual_qty IS '取扱説明書（取扱説明書部数） // #MA.INST_MANUAL_QTY // ';


COMMENT ON COLUMN mst_slo.aprv_draw_typ IS '承認図（承認図区分） // #MA.APRV_DRAW_TYP // ';


COMMENT ON COLUMN mst_slo.aprv_draw_qty IS '承認図（承認図部数） // #MA.APRV_DRAW_QTY // ';


COMMENT ON COLUMN mst_slo.slo_cng_rsn IS '受注変更理由 // #MA.SLO_CNG_RSN // ';


COMMENT ON COLUMN mst_slo.frc_rsn_cd IS '無償理由ＣＤ // #MA.FRC_RSN_CD // ';


COMMENT ON COLUMN mst_slo.main_draw_no IS '代表図番 // #MA.MAIN_DRAW_NO // ';


COMMENT ON COLUMN mst_slo.slo_cmnt_1 IS 'コメント１ // #MA.MST_MEMO1 // ';


COMMENT ON COLUMN mst_slo.slo_cmnt_2 IS 'コメント２ // #MA.MST_MEMO2 // ';


COMMENT ON COLUMN mst_slo.slo_cmnt_3 IS 'コメント３ // #MA.MST_MEMO3 // ';


COMMENT ON COLUMN mst_slo.slo_cmnt_4 IS 'コメント４ // #MA.MST_MEMO4 // ';


COMMENT ON COLUMN mst_slo.slo_cmnt_5 IS 'コメント５ // #MA.MST_MEMO5 // ';


COMMENT ON COLUMN mst_slo.src_ship_flg IS '元出荷基準ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mst_slo.jip_slo_typ IS '受注種別 // #MA.JIP_SLO_TYP // ';


COMMENT ON COLUMN mst_slo.jip_cst_cd IS '客先コード // #MA.CST_CD // ';

