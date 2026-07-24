
COMMENT ON TABLE MST_NOTE_IF_ALL IS '手形情報ＩＦ // Note info. IF';


COMMENT ON COLUMN MST_NOTE_IF_ALL.NOTE_IF_NO IS '手形情報ＩＦＮＯ // #MA.NOTE_IF_NO // Note info. IF No.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_NOTE_IF_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_NOTE_IF_ALL.NOTE_RSN_CD IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.DPT_CD IS '受入部門ＣＤ // #MA.DPT_CD // Receiving dept. cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.FOREIGN_FLG IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_NOTE_IF_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_NOTE_IF_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_NOTE_IF_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_NOTE_IF_ALL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_NOTE_IF_ALL.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MST_NOTE_IF_ALL.NOTE_TYP IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN MST_NOTE_IF_ALL.DRAW_DT IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN MST_NOTE_IF_ALL.DUE_DT IS '満期日 // #MA.DT // Maturity date';


COMMENT ON COLUMN MST_NOTE_IF_ALL.BANK_CD IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.BRANCH_CD IS '銀行支店ＣＤ // #MA.BANK_BRANCH_CD // Bank branch cd.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.DRAWER_NM IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ENDRSR1 IS '裏書人１ // #MA.NOTE_ENDRSR // Endorser 1';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ENDRSR2 IS '裏書人２ // #MA.NOTE_ENDRSR // Endorser 2';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ENDRSR3 IS '裏書人３ // #MA.NOTE_ENDRSR // Endorser 3';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ENDRSR4 IS '裏書人４ // #MA.NOTE_ENDRSR // Endorser 4';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ENDRSR5 IS '裏書人５ // #MA.NOTE_ENDRSR // Endorser 5';


COMMENT ON COLUMN MST_NOTE_IF_ALL.ACCPTR IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_NOTE_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_NOTE_IF_ALL.A_IMP_FLG IS '会計ＩＦ取込済ＦＬＧ // #MA.FLG // Accounting IF imported flg.';


COMMENT ON COLUMN MST_NOTE_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_NOTE_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_NOTE_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_NOTE_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_NOTE_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

