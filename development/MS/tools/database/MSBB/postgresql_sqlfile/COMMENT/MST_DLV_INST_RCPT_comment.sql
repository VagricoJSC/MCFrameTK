\encoding UTF-8

COMMENT ON VIEW mst_dlv_inst_rcpt IS '納入指示受領 // Delivery order received';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_inst_rcpt_no IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_inst_rcpt_rev IS '納入指示受領改訂番号 // #MA.SLIP_REV // Delivery order received rev. number';


COMMENT ON COLUMN mst_dlv_inst_rcpt.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_dlv_inst_rcpt.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.cst_dlv_inst_no IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.cst_dlv_inst_rev IS '得意先納入指示改訂番号 // #MA.SLIP_REV // Customer delivery order rev. number';


COMMENT ON COLUMN mst_dlv_inst_rcpt.cst_dlv_inst_d_no IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.cst_dlv_inst_rmrks IS '得意先納入指示備考 // #MS.CST_DLV_INST_RMRKS // Customer delivery order remarks';


COMMENT ON COLUMN mst_dlv_inst_rcpt.cst_dlv_inst_d_rmrks IS '得意先納入指示明細備考 // #MS.CST_DLV_INST_D_RMRKS // Customer delivery order details remarks';


COMMENT ON COLUMN mst_dlv_inst_rcpt.intr_rmrks IS '内部備考 // #MS.DLV_INST_RCPT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_dlv_inst_rcpt.edi_flg IS 'ＥＤＩ ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_lg_grp_cd IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_dlv_inst_rcpt.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_dlv_inst_rcpt.tdlv_lg_grp_cd IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.dlv_day_week_typ IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN mst_dlv_inst_rcpt.sub_char1 IS '予備１ // #MS.DLV_INST_RCPT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dlv_inst_rcpt.sub_char2 IS '予備２ // #MS.DLV_INST_RCPT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dlv_inst_rcpt.sub_char3 IS '予備３ // #MS.DLV_INST_RCPT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dlv_inst_rcpt.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_dlv_inst_rcpt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dlv_inst_rcpt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dlv_inst_rcpt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dlv_inst_rcpt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dlv_inst_rcpt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

