\encoding UTF-8

COMMENT ON TABLE mst_note_if_all IS '手形情報ＩＦ // Note info. IF';


COMMENT ON COLUMN mst_note_if_all.note_if_no IS '手形情報ＩＦＮＯ // #MA.NOTE_IF_NO // Note info. IF No.';


COMMENT ON COLUMN mst_note_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_note_if_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_note_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_note_if_all.note_rsn_cd IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN mst_note_if_all.dpt_cd IS '受入部門ＣＤ // #MA.DPT_CD // Receiving dept. cd.';


COMMENT ON COLUMN mst_note_if_all.rcst_cd IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN mst_note_if_all.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mst_note_if_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_note_if_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_note_if_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_note_if_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_note_if_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_note_if_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_note_if_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_note_if_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_note_if_all.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mst_note_if_all.note_typ IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN mst_note_if_all.draw_dt IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN mst_note_if_all.due_dt IS '満期日 // #MA.DT // Maturity date';


COMMENT ON COLUMN mst_note_if_all.bank_cd IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN mst_note_if_all.branch_cd IS '銀行支店ＣＤ // #MA.BANK_BRANCH_CD // Bank branch cd.';


COMMENT ON COLUMN mst_note_if_all.drawer_nm IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN mst_note_if_all.endrsr1 IS '裏書人１ // #MA.NOTE_ENDRSR // Endorser 1';


COMMENT ON COLUMN mst_note_if_all.endrsr2 IS '裏書人２ // #MA.NOTE_ENDRSR // Endorser 2';


COMMENT ON COLUMN mst_note_if_all.endrsr3 IS '裏書人３ // #MA.NOTE_ENDRSR // Endorser 3';


COMMENT ON COLUMN mst_note_if_all.endrsr4 IS '裏書人４ // #MA.NOTE_ENDRSR // Endorser 4';


COMMENT ON COLUMN mst_note_if_all.endrsr5 IS '裏書人５ // #MA.NOTE_ENDRSR // Endorser 5';


COMMENT ON COLUMN mst_note_if_all.accptr IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN mst_note_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_note_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_note_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_note_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_note_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_note_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_note_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_note_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_note_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_note_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_note_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_note_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_note_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_note_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_note_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_note_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_note_if_all.a_imp_flg IS '会計ＩＦ取込済ＦＬＧ // #MA.FLG // Accounting IF imported flg.';


COMMENT ON COLUMN mst_note_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_note_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_note_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_note_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_note_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_note_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_note_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_note_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_note_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_note_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

