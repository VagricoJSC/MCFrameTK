\encoding UTF-8

COMMENT ON VIEW mbt_attachment IS '添付ファイル情報 // Attachement file info.';


COMMENT ON COLUMN mbt_attachment.data_no IS '帳票管理ＮＯ // #MA.IT_DAT_NO // Report management No.';


COMMENT ON COLUMN mbt_attachment.edition IS '版 // #MA.SLIP_REV // Version';


COMMENT ON COLUMN mbt_attachment.biz_typ IS '業務区分 // #MA.BIZ_TYP // Business type';


COMMENT ON COLUMN mbt_attachment.report_id IS '帳票ＩＤ // #MA.REPORT_ID // Report ID';


COMMENT ON COLUMN mbt_attachment.biz_key1 IS '業務キー１ // #MA.BIZ_KEY // Business key 1';


COMMENT ON COLUMN mbt_attachment.biz_key2 IS '業務キー２ // #MA.BIZ_KEY // Business key 2';


COMMENT ON COLUMN mbt_attachment.biz_key3 IS '業務キー３ // #MA.BIZ_KEY // Business key 3';


COMMENT ON COLUMN mbt_attachment.biz_key4 IS '業務キー４ // #MA.BIZ_KEY // Business key 4';


COMMENT ON COLUMN mbt_attachment.biz_key5 IS '業務キー５ // #MA.BIZ_KEY // Business key 5';


COMMENT ON COLUMN mbt_attachment.biz_key6 IS '業務キー６ // #MA.BIZ_KEY // Business key 6';


COMMENT ON COLUMN mbt_attachment.biz_key7 IS '業務キー７ // #MA.BIZ_KEY // Business key 7';


COMMENT ON COLUMN mbt_attachment.biz_key8 IS '業務キー８ // #MA.BIZ_KEY // Business key 8';


COMMENT ON COLUMN mbt_attachment.biz_key9 IS '業務キー９ // #MA.BIZ_KEY // Business key 9';


COMMENT ON COLUMN mbt_attachment.biz_key10 IS '業務キー１０ // #MA.BIZ_KEY // Business key 10';


COMMENT ON COLUMN mbt_attachment.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mbt_attachment.dt IS '取引年月日 // #MA.DT // Transaction date';


COMMENT ON COLUMN mbt_attachment.cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_attachment.amt IS '取引金額 // #MA.MONEY // Transaction amount';


COMMENT ON COLUMN mbt_attachment.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mbt_attachment.rmrks1 IS '備考１ // #MA.ATTACHMENT_RMRKS // Remarks 1';


COMMENT ON COLUMN mbt_attachment.rmrks2 IS '備考２ // #MA.ATTACHMENT_RMRKS // Remarks 2';


COMMENT ON COLUMN mbt_attachment.rmrks3 IS '備考３ // #MA.ATTACHMENT_RMRKS // Remarks 3';


COMMENT ON COLUMN mbt_attachment.rmrks4 IS '備考４ // #MA.ATTACHMENT_RMRKS // Remarks 4';


COMMENT ON COLUMN mbt_attachment.rmrks5 IS '備考５ // #MA.ATTACHMENT_RMRKS // Remarks 5';


COMMENT ON COLUMN mbt_attachment.rpt_attr1 IS '帳票属性１ // #MA.ATTACHMENT_RPT_ATTR1 // Report attribute 1';


COMMENT ON COLUMN mbt_attachment.rpt_attr2 IS '帳票属性２ // #MA.ATTACHMENT_RPT_ATTR2 // Report attribute 2';


COMMENT ON COLUMN mbt_attachment.rpt_attr3 IS '帳票属性３ // #MA.ATTACHMENT_RPT_ATTR3 // Report attribute 3';


COMMENT ON COLUMN mbt_attachment.rpt_attr4 IS '帳票属性４ // #MA.ATTACHMENT_RPT_ATTR4 // Report attribute 4';


COMMENT ON COLUMN mbt_attachment.rpt_attr5 IS '帳票属性５ // #MA.ATTACHMENT_RPT_ATTR5 // Report attribute 5';


COMMENT ON COLUMN mbt_attachment.rpt_attr6 IS '帳票属性６ // #MA.ATTACHMENT_RPT_ATTR6 // Report attribute 6';


COMMENT ON COLUMN mbt_attachment.rpt_attr7 IS '帳票属性７ // #MA.ATTACHMENT_RPT_ATTR7 // Report attribute 7';


COMMENT ON COLUMN mbt_attachment.rpt_attr8 IS '帳票属性８ // #MA.ATTACHMENT_RPT_ATTR8 // Report attribute 8';


COMMENT ON COLUMN mbt_attachment.rpt_attr9 IS '帳票属性９ // #MA.ATTACHMENT_RPT_ATTR9 // Report attribute 9';


COMMENT ON COLUMN mbt_attachment.rpt_attr10 IS '帳票属性１０ // #MA.ATTACHMENT_RPT_ATTR10 // Report attribute 10';


COMMENT ON COLUMN mbt_attachment.rpt_attr11 IS '帳票属性１１ // #MA.ATTACHMENT_RPT_ATTR11 // Report attribute 11';


COMMENT ON COLUMN mbt_attachment.rpt_attr12 IS '帳票属性１２ // #MA.ATTACHMENT_RPT_ATTR12 // Report attribute 12';


COMMENT ON COLUMN mbt_attachment.rpt_attr13 IS '帳票属性１３ // #MA.ATTACHMENT_RPT_ATTR13 // Report attribute 13';


COMMENT ON COLUMN mbt_attachment.rpt_attr14 IS '帳票属性１４ // #MA.ATTACHMENT_RPT_ATTR14 // Report attribute 14';


COMMENT ON COLUMN mbt_attachment.rpt_attr15 IS '帳票属性１５ // #MA.ATTACHMENT_RPT_ATTR15 // Report attribute 15';


COMMENT ON COLUMN mbt_attachment.rpt_attr16 IS '帳票属性１６ // #MA.ATTACHMENT_RPT_ATTR16 // Report attribute 16';


COMMENT ON COLUMN mbt_attachment.rpt_attr17 IS '帳票属性１７ // #MA.ATTACHMENT_RPT_ATTR17 // Report attribute 17';


COMMENT ON COLUMN mbt_attachment.rpt_attr18 IS '帳票属性１８ // #MA.ATTACHMENT_RPT_ATTR18 // Report attribute 18';


COMMENT ON COLUMN mbt_attachment.rpt_attr19 IS '帳票属性１９ // #MA.ATTACHMENT_RPT_ATTR19 // Report attribute 19';


COMMENT ON COLUMN mbt_attachment.rpt_attr20 IS '帳票属性２０ // #MA.ATTACHMENT_RPT_ATTR20 // Report attribute 20';


COMMENT ON COLUMN mbt_attachment.file_path IS 'ファイルパス // #MA.FILE_PATH // File path';


COMMENT ON COLUMN mbt_attachment.file_nm IS 'ファイル名 // #MA.FILE_NM // File name';


COMMENT ON COLUMN mbt_attachment.archive_flg IS '保存済ＦＬＧ // #MA.FLG // Saved flg.';


COMMENT ON COLUMN mbt_attachment.doc_id IS 'ドキュメントＩＤ // #MA.DOC_ID // Document ID';


COMMENT ON COLUMN mbt_attachment.file_bin IS 'ファイル // #MA.BIN // File';


COMMENT ON COLUMN mbt_attachment.msg_queue_id IS 'メッセージキューＩＤ // #MA.MSG_QUEUE_ID // Message queue ID';


COMMENT ON COLUMN mbt_attachment.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_attachment.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_attachment.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_attachment.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_attachment.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_attachment.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_attachment.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_attachment.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_attachment.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_attachment.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

