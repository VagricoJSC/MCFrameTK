CREATE OR REPLACE PACKAGE BODY FCPA_BATCH_LOG
-- ==============================================================================
-- 機能      バッチログ機能
-- 作成者    A.SHIMAO
-- 作成日付  2016-05-16
-- 改版履歴  2016-05-16 A.SHIMAO 初版作成
--
-- バージョン:6.4.0
-- ==============================================================================
IS
	-- ==============================================================================
	-- 開始ログ出力
	-- ==============================================================================
	PROCEDURE P_START_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	)
	IS
		W_LOG_NO VARCHAR2(15 CHAR);
		W_LOG_SUB_KEY1 NUMBER(9);
		W_LOG_SUB_KEY2 NUMBER(9);
	BEGIN
		P_LOG(
			FSC_BATCH_LOG_TYP.START_LOG,
			I_MSGID,
			I_MSG_BINDER,
			W_LOG_NO,
			W_LOG_SUB_KEY1,
			W_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- 開始ログ出力
	-- ==============================================================================
	PROCEDURE P_START_LOG(
		I_MSGID IN VARCHAR2,
		I_01 IN VARCHAR2 DEFAULT NULL,
		I_02 IN VARCHAR2 DEFAULT NULL,
		I_03 IN VARCHAR2 DEFAULT NULL,
		I_04 IN VARCHAR2 DEFAULT NULL,
		I_05 IN VARCHAR2 DEFAULT NULL,
		I_06 IN VARCHAR2 DEFAULT NULL,
		I_07 IN VARCHAR2 DEFAULT NULL,
		I_08 IN VARCHAR2 DEFAULT NULL,
		I_09 IN VARCHAR2 DEFAULT NULL,
		I_10 IN VARCHAR2 DEFAULT NULL,
		I_11 IN VARCHAR2 DEFAULT NULL,
		I_12 IN VARCHAR2 DEFAULT NULL,
		I_13 IN VARCHAR2 DEFAULT NULL,
		I_14 IN VARCHAR2 DEFAULT NULL,
		I_15 IN VARCHAR2 DEFAULT NULL,
		I_16 IN VARCHAR2 DEFAULT NULL,
		I_17 IN VARCHAR2 DEFAULT NULL,
		I_18 IN VARCHAR2 DEFAULT NULL,
		I_19 IN VARCHAR2 DEFAULT NULL,
		I_20 IN VARCHAR2 DEFAULT NULL,
		I_21 IN VARCHAR2 DEFAULT NULL,
		I_22 IN VARCHAR2 DEFAULT NULL,
		I_23 IN VARCHAR2 DEFAULT NULL,
		I_24 IN VARCHAR2 DEFAULT NULL,
		I_25 IN VARCHAR2 DEFAULT NULL,
		I_26 IN VARCHAR2 DEFAULT NULL,
		I_27 IN VARCHAR2 DEFAULT NULL,
		I_28 IN VARCHAR2 DEFAULT NULL,
		I_29 IN VARCHAR2 DEFAULT NULL,
		I_30 IN VARCHAR2 DEFAULT NULL,
		I_31 IN VARCHAR2 DEFAULT NULL,
		I_32 IN VARCHAR2 DEFAULT NULL,
		I_33 IN VARCHAR2 DEFAULT NULL,
		I_34 IN VARCHAR2 DEFAULT NULL,
		I_35 IN VARCHAR2 DEFAULT NULL,
		I_36 IN VARCHAR2 DEFAULT NULL,
		I_37 IN VARCHAR2 DEFAULT NULL,
		I_38 IN VARCHAR2 DEFAULT NULL,
		I_39 IN VARCHAR2 DEFAULT NULL,
		I_40 IN VARCHAR2 DEFAULT NULL
	)
	IS
	BEGIN
		P_START_LOG(
			I_MSGID,
			FCPA_MSG.MSG_BINDER(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
		);
	END;

	-- ==============================================================================
	-- 処理経過ログ出力
	-- ==============================================================================
	PROCEDURE P_PROC_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	)
	IS
		W_LOG_NO VARCHAR2(15 CHAR);
		W_LOG_SUB_KEY1 NUMBER(9);
		W_LOG_SUB_KEY2 NUMBER(9);
	BEGIN
		P_LOG(
			FSC_BATCH_LOG_TYP.PROC_LOG,
			I_MSGID,
			I_MSG_BINDER,
			W_LOG_NO,
			W_LOG_SUB_KEY1,
			W_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- 処理経過ログ出力
	-- ==============================================================================
	PROCEDURE P_PROC_LOG(
		I_MSGID IN VARCHAR2,
		I_01 IN VARCHAR2 DEFAULT NULL,
		I_02 IN VARCHAR2 DEFAULT NULL,
		I_03 IN VARCHAR2 DEFAULT NULL,
		I_04 IN VARCHAR2 DEFAULT NULL,
		I_05 IN VARCHAR2 DEFAULT NULL,
		I_06 IN VARCHAR2 DEFAULT NULL,
		I_07 IN VARCHAR2 DEFAULT NULL,
		I_08 IN VARCHAR2 DEFAULT NULL,
		I_09 IN VARCHAR2 DEFAULT NULL,
		I_10 IN VARCHAR2 DEFAULT NULL,
		I_11 IN VARCHAR2 DEFAULT NULL,
		I_12 IN VARCHAR2 DEFAULT NULL,
		I_13 IN VARCHAR2 DEFAULT NULL,
		I_14 IN VARCHAR2 DEFAULT NULL,
		I_15 IN VARCHAR2 DEFAULT NULL,
		I_16 IN VARCHAR2 DEFAULT NULL,
		I_17 IN VARCHAR2 DEFAULT NULL,
		I_18 IN VARCHAR2 DEFAULT NULL,
		I_19 IN VARCHAR2 DEFAULT NULL,
		I_20 IN VARCHAR2 DEFAULT NULL,
		I_21 IN VARCHAR2 DEFAULT NULL,
		I_22 IN VARCHAR2 DEFAULT NULL,
		I_23 IN VARCHAR2 DEFAULT NULL,
		I_24 IN VARCHAR2 DEFAULT NULL,
		I_25 IN VARCHAR2 DEFAULT NULL,
		I_26 IN VARCHAR2 DEFAULT NULL,
		I_27 IN VARCHAR2 DEFAULT NULL,
		I_28 IN VARCHAR2 DEFAULT NULL,
		I_29 IN VARCHAR2 DEFAULT NULL,
		I_30 IN VARCHAR2 DEFAULT NULL,
		I_31 IN VARCHAR2 DEFAULT NULL,
		I_32 IN VARCHAR2 DEFAULT NULL,
		I_33 IN VARCHAR2 DEFAULT NULL,
		I_34 IN VARCHAR2 DEFAULT NULL,
		I_35 IN VARCHAR2 DEFAULT NULL,
		I_36 IN VARCHAR2 DEFAULT NULL,
		I_37 IN VARCHAR2 DEFAULT NULL,
		I_38 IN VARCHAR2 DEFAULT NULL,
		I_39 IN VARCHAR2 DEFAULT NULL,
		I_40 IN VARCHAR2 DEFAULT NULL
	)
	IS
	BEGIN
		P_PROC_LOG(
			I_MSGID,
			FCPA_MSG.MSG_BINDER(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
		);
	END;

	-- ==============================================================================
	-- データログ出力
	-- ==============================================================================
	PROCEDURE P_DATA_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER,
		O_LOG_NO OUT VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER,
		O_LOG_SUB_KEY2 OUT NUMBER
	)
	IS
	BEGIN
		P_LOG(
			FSC_BATCH_LOG_TYP.DATA_LOG,
			I_MSGID,
			I_MSG_BINDER,
			O_LOG_NO,
			O_LOG_SUB_KEY1,
			O_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- データログ出力
	-- ==============================================================================
	PROCEDURE P_DATA_LOG(
		I_MSGID IN VARCHAR2,
		O_LOG_NO OUT VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER,
		O_LOG_SUB_KEY2 OUT NUMBER,
		I_01 IN VARCHAR2 DEFAULT NULL,
		I_02 IN VARCHAR2 DEFAULT NULL,
		I_03 IN VARCHAR2 DEFAULT NULL,
		I_04 IN VARCHAR2 DEFAULT NULL,
		I_05 IN VARCHAR2 DEFAULT NULL,
		I_06 IN VARCHAR2 DEFAULT NULL,
		I_07 IN VARCHAR2 DEFAULT NULL,
		I_08 IN VARCHAR2 DEFAULT NULL,
		I_09 IN VARCHAR2 DEFAULT NULL,
		I_10 IN VARCHAR2 DEFAULT NULL,
		I_11 IN VARCHAR2 DEFAULT NULL,
		I_12 IN VARCHAR2 DEFAULT NULL,
		I_13 IN VARCHAR2 DEFAULT NULL,
		I_14 IN VARCHAR2 DEFAULT NULL,
		I_15 IN VARCHAR2 DEFAULT NULL,
		I_16 IN VARCHAR2 DEFAULT NULL,
		I_17 IN VARCHAR2 DEFAULT NULL,
		I_18 IN VARCHAR2 DEFAULT NULL,
		I_19 IN VARCHAR2 DEFAULT NULL,
		I_20 IN VARCHAR2 DEFAULT NULL,
		I_21 IN VARCHAR2 DEFAULT NULL,
		I_22 IN VARCHAR2 DEFAULT NULL,
		I_23 IN VARCHAR2 DEFAULT NULL,
		I_24 IN VARCHAR2 DEFAULT NULL,
		I_25 IN VARCHAR2 DEFAULT NULL,
		I_26 IN VARCHAR2 DEFAULT NULL,
		I_27 IN VARCHAR2 DEFAULT NULL,
		I_28 IN VARCHAR2 DEFAULT NULL,
		I_29 IN VARCHAR2 DEFAULT NULL,
		I_30 IN VARCHAR2 DEFAULT NULL,
		I_31 IN VARCHAR2 DEFAULT NULL,
		I_32 IN VARCHAR2 DEFAULT NULL,
		I_33 IN VARCHAR2 DEFAULT NULL,
		I_34 IN VARCHAR2 DEFAULT NULL,
		I_35 IN VARCHAR2 DEFAULT NULL,
		I_36 IN VARCHAR2 DEFAULT NULL,
		I_37 IN VARCHAR2 DEFAULT NULL,
		I_38 IN VARCHAR2 DEFAULT NULL,
		I_39 IN VARCHAR2 DEFAULT NULL,
		I_40 IN VARCHAR2 DEFAULT NULL
	)
	IS
	BEGIN
		P_DATA_LOG(
			I_MSGID,
			FCPA_MSG.MSG_BINDER(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40),
			O_LOG_NO,
			O_LOG_SUB_KEY1,
			O_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- 終了ログ出力
	-- ==============================================================================
	PROCEDURE P_END_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	)
	IS
		W_LOG_NO VARCHAR2(15 CHAR);
		W_LOG_SUB_KEY1 NUMBER(9);
		W_LOG_SUB_KEY2 NUMBER(9);
	BEGIN
		P_LOG(
			FSC_BATCH_LOG_TYP.END_LOG,
			I_MSGID,
			I_MSG_BINDER,
			W_LOG_NO,
			W_LOG_SUB_KEY1,
			W_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- 終了ログ出力
	-- ==============================================================================
	PROCEDURE P_END_LOG(
		I_MSGID IN VARCHAR2,
		I_01 IN VARCHAR2 DEFAULT NULL,
		I_02 IN VARCHAR2 DEFAULT NULL,
		I_03 IN VARCHAR2 DEFAULT NULL,
		I_04 IN VARCHAR2 DEFAULT NULL,
		I_05 IN VARCHAR2 DEFAULT NULL,
		I_06 IN VARCHAR2 DEFAULT NULL,
		I_07 IN VARCHAR2 DEFAULT NULL,
		I_08 IN VARCHAR2 DEFAULT NULL,
		I_09 IN VARCHAR2 DEFAULT NULL,
		I_10 IN VARCHAR2 DEFAULT NULL,
		I_11 IN VARCHAR2 DEFAULT NULL,
		I_12 IN VARCHAR2 DEFAULT NULL,
		I_13 IN VARCHAR2 DEFAULT NULL,
		I_14 IN VARCHAR2 DEFAULT NULL,
		I_15 IN VARCHAR2 DEFAULT NULL,
		I_16 IN VARCHAR2 DEFAULT NULL,
		I_17 IN VARCHAR2 DEFAULT NULL,
		I_18 IN VARCHAR2 DEFAULT NULL,
		I_19 IN VARCHAR2 DEFAULT NULL,
		I_20 IN VARCHAR2 DEFAULT NULL,
		I_21 IN VARCHAR2 DEFAULT NULL,
		I_22 IN VARCHAR2 DEFAULT NULL,
		I_23 IN VARCHAR2 DEFAULT NULL,
		I_24 IN VARCHAR2 DEFAULT NULL,
		I_25 IN VARCHAR2 DEFAULT NULL,
		I_26 IN VARCHAR2 DEFAULT NULL,
		I_27 IN VARCHAR2 DEFAULT NULL,
		I_28 IN VARCHAR2 DEFAULT NULL,
		I_29 IN VARCHAR2 DEFAULT NULL,
		I_30 IN VARCHAR2 DEFAULT NULL,
		I_31 IN VARCHAR2 DEFAULT NULL,
		I_32 IN VARCHAR2 DEFAULT NULL,
		I_33 IN VARCHAR2 DEFAULT NULL,
		I_34 IN VARCHAR2 DEFAULT NULL,
		I_35 IN VARCHAR2 DEFAULT NULL,
		I_36 IN VARCHAR2 DEFAULT NULL,
		I_37 IN VARCHAR2 DEFAULT NULL,
		I_38 IN VARCHAR2 DEFAULT NULL,
		I_39 IN VARCHAR2 DEFAULT NULL,
		I_40 IN VARCHAR2 DEFAULT NULL
	)
	IS
	BEGIN
		P_END_LOG(
			I_MSGID,
			FCPA_MSG.MSG_BINDER(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40)
		);
	END;

	-- ==============================================================================
	-- 初期処理
	-- ==============================================================================
	PROCEDURE P_INIT(
		I_PROCEDURE_NAME VARCHAR2 DEFAULT NULL
	)
	IS
	BEGIN
		-- 引継ぎ情報の取得・ログNoの採番
		IF V_INHERIT_FLG = 0 THEN
			V_LOG_NO := F_MAKE_LOG_NO;
			V_LOG_SUB_KEY1 := CONST_LOG_SUB_KEY1;
			V_LOG_SUB_KEY2 := CONST_LOG_SUB_KEY2;
			V_DATA_REF_CTL := NULL;
			P_WRITE_LOG_HEADER(I_PROCEDURE_NAME);
		END IF;
	END;

	-- ==============================================================================
	-- ログNo生成
	-- ==============================================================================
	FUNCTION F_MAKE_LOG_NO
	RETURN VARCHAR2
	IS
		W_LOGNO VARCHAR2(15 CHAR);
	BEGIN
		W_LOGNO := TO_CHAR(FCS_BATCH_LOGNO.nextVal, 'FM000000000000000');
		RETURN W_LOGNO;
	END;

	-- ==============================================================================
	-- ログNoを取得する
	-- ==============================================================================
	FUNCTION F_GET_LOG_NO
	RETURN VARCHAR2
	IS
	BEGIN
		RETURN V_LOG_NO;
	END;

	-- ==============================================================================
	-- 引継ぎ情報作成
	-- 予めJavaから実行することでJavaからログNoの情報を引き継ぐ。
	-- ==============================================================================
	PROCEDURE P_INHERIT(
		I_LOG_NO VARCHAR2,
		I_LOG_SUB_KEY1 NUMBER,
		I_LOG_SUB_KEY2 NUMBER,
		I_DATA_REF_CTL VARCHAR2
	)
	IS
	BEGIN
		V_LOG_NO := I_LOG_NO;
		V_LOG_SUB_KEY1 := I_LOG_SUB_KEY1;
		V_LOG_SUB_KEY2 := I_LOG_SUB_KEY2;
		V_DATA_REF_CTL := I_DATA_REF_CTL;
		V_INHERIT_FLG := 1;
		
	END;

	-- ==============================================================================
	-- 引継ぎ情報解除
	-- ==============================================================================
	PROCEDURE P_RELEASE_INHERIT
	IS
	BEGIN
		V_INHERIT_FLG := 0;
		V_LOG_NO := NULL;
		V_DATA_REF_CTL := NULL;
	END;

	-- ==============================================================================
	-- ログを書き込む
	-- ==============================================================================
	PROCEDURE P_LOG(
		I_BATCH_LOG_TYP IN VARCHAR2,
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER,
		O_LOG_NO OUT VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER,
		O_LOG_SUB_KEY2 OUT NUMBER
	)
	IS
		W_LOG_LVL VARCHAR2(1 CHAR);
	BEGIN
		W_LOG_LVL := FCPA_MSG.F_GET_MESSAGE_LEVEL(I_MSGID);
		IF F_IS_AVAILABLE(W_LOG_LVL) = 0 THEN
			RETURN;
		END IF;
		
		IF FSC_BATCH_LOG_TYP.CONTAINS(I_BATCH_LOG_TYP) = '0' THEN
			RETURN;
		END IF;
		
		P_WRITE_LOG_MSG(
			I_BATCH_LOG_TYP,
			I_MSGID,
			W_LOG_LVL,
			I_MSG_BINDER,
			O_LOG_NO,
			O_LOG_SUB_KEY1,
			O_LOG_SUB_KEY2
		);
	END;

	-- ==============================================================================
	-- ログレベルが出力対象であるか判定する
	-- 戻り値
	-- 1：出力対象である。0:出力対象ではない。
	-- ==============================================================================
	FUNCTION F_IS_AVAILABLE(
		I_MSG_LVL IN VARCHAR2
	)
	RETURN NUMBER
	IS
		W_LOG_LVL_S VARCHAR2(1 CHAR);
		W_LOG_LVL NUMBER(1);
		W_MSG_LVL NUMBER(1);
		W_RET NUMBER(1);
	BEGIN
		-- 有効ログレベルの取得（システム設定）
		W_LOG_LVL_S := FCPA_CONST.F_GETSTRVAL_CACHE('LOG', 'LVL', 'D');
		W_LOG_LVL := F_LVL_TO_NO(W_LOG_LVL_S);

		W_MSG_LVL := F_LVL_TO_NO(I_MSG_LVL);
		IF W_LOG_LVL > W_MSG_LVL THEN
			W_RET := 0;
		ELSE
			W_RET := 1;
		END IF;
		RETURN W_RET;
	END;

	-- ==============================================================================
	-- メッセージのレベルを数値にします。
	-- ==============================================================================
	FUNCTION F_LVL_TO_NO(
		I_MSG_LVL IN VARCHAR2
	) RETURN NUMBER RESULT_CACHE
	IS
	BEGIN
		RETURN TRANSLATE(I_MSG_LVL, 'TDIWPEF', '1234567');
	END;

	-- ==============================================================================
	-- ログヘッダをテーブルに書き込む
	-- ==============================================================================
	PROCEDURE P_WRITE_LOG_HEADER(
		I_PROCEDURE_NAME VARCHAR2
	)
	IS
		PRAGMA AUTONOMOUS_TRANSACTION;
	BEGIN
		INSERT INTO FCT_BATCH_LOG_H_ALL(
			BATCH_LOG_NO,
			CO_CD,
			REQ_NO,
			DATA_REF_CTL,
			START_TS,
			LAST_TS,
			LOGIN_SEQ,
			EMSG_SEQ,
			EXT_ATTR1,
			EXT_ATTR2,
			EXT_ATTR3,
			USR_CD,
			GP_BATCH_GRP_CD,
			CALL_MODULE_ID,
			CALL_LOGIC_ID,
			CALL_OPERATION_ID,
			CALL_PG_ID,
			CALL_CLT_ID,
			CALL_PLSQL_ID,
			LCL_CD,
			END_FLG,
			WARN_FLG,
			RMRKS1,
			RMRKS2,
			RMRKS3,
			RMRKS4,
			RMRKS5,
			RMRKS6,
			RMRKS7,
			RMRKS8,
			RMRKS9,
			RMRKS10
		)
		VALUES(
			V_LOG_NO,
			FCPA_CONTEXT.F_GET_CO_CD,
			FCPA_CONTEXT.F_GET_PROCESSID,
			V_DATA_REF_CTL,
			FCPA_DATE_UTIL.F_MCSYSTIMESTAMP_CO(FCPA_CONTEXT.F_GET_CO_CD),
			FCPA_DATE_UTIL.F_MCSYSTIMESTAMP_CO(FCPA_CONTEXT.F_GET_CO_CD),
			FCPA_CONTEXT.F_GET_LOGIN_SEQ,
			0, -- ヘッダ作成時の終了ログ連番はデフォルト値で登録しておく
			FCPA_CONTEXT.F_GET_EXT_ATTR1,
			FCPA_CONTEXT.F_GET_EXT_ATTR2,
			FCPA_CONTEXT.F_GET_EXT_ATTR3,
			FCPA_CONTEXT.F_GET_USERID,
			FCPA_CONTEXT.F_GET_GP_BATCH_GRP_CD,
			NULL, -- モジュールIDもCONTEXTに持たせてよかろう。。。
			NULL, -- Javaから引き継がないということはロジックIDは未設定になる。
			NULL, -- Javaから引き継がないということはオペレーションIDは未設定になる。
			NULL, -- Javaから引き継がないということは呼出元プログラムＩＤは未設定になる。
			NULL, -- Javaから引き継がないということは呼出元クライアントは未設定になる。
			I_PROCEDURE_NAME,
			FCPA_CONTEXT.F_GET_LOCALE,
			0,
			0,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL,
			NULL
		);

		COMMIT;
	END;

	-- ==============================================================================
	-- ログメッセージをテーブルに書き込む
	-- ==============================================================================
	PROCEDURE P_WRITE_LOG_MSG(
		I_BATCH_LOG_TYP IN VARCHAR2,
		I_MSGID IN VARCHAR2,
		I_MSGLVL IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER,
		O_LOG_NO OUT VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER,
		O_LOG_SUB_KEY2 OUT NUMBER
	)
	IS
		PRAGMA AUTONOMOUS_TRANSACTION;
		W_MSG VARCHAR2(1000 CHAR);
		W_MSG_BINDER FCPA_MSG.MSG_BINDER;
		W_SEQ NUMBER(22);
		I BINARY_INTEGER := 1;
	BEGIN
		-- 変数初期化
		O_LOG_NO := V_LOG_NO;
		P_NUMBERING_LOG_SUB_KEY1(I_BATCH_LOG_TYP, O_LOG_SUB_KEY1);
		P_NUMBERING_LOG_SUB_KEY2(I_BATCH_LOG_TYP, O_LOG_SUB_KEY2);
		W_SEQ := FCS_BATCH_LOGSEQ.nextVal;
		
		-- ログヘッダの更新
		P_UPDATE_LOG_HEADER(I_BATCH_LOG_TYP, I_MSGLVL, W_SEQ);
		
		-- メッセージ文言
		FCPA_MSG.P_INLAY(I_MSGID, I_MSG_BINDER, W_MSG);

		-- メッセージ埋め込み文字列の初期化
		W_MSG_BINDER := FCPA_MSG.MSG_BINDER(
			NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
			NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
			NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
			NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL
		);
		FOR I IN 1..I_MSG_BINDER.COUNT LOOP
			W_MSG_BINDER(I) := I_MSG_BINDER(I);
		END LOOP;
		
		-- ログ出力
		INSERT INTO FCT_BATCH_LOG_MSG_ALL(
			BATCH_LOG_NO,
			SEQ,
			CO_CD,
			LOG_SUB_KEY1,
			LOG_SUB_KEY2,
			BATCH_LOG_TYP,
			MSG_ID,
			MSG_LVL,
			MSG_TXT,
			LOG_TS,
			PRM01,
			PRM02,
			PRM03,
			PRM04,
			PRM05,
			PRM06,
			PRM07,
			PRM08,
			PRM09,
			PRM10,
			PRM11,
			PRM12,
			PRM13,
			PRM14,
			PRM15,
			PRM16,
			PRM17,
			PRM18,
			PRM19,
			PRM20,
			PRM21,
			PRM22,
			PRM23,
			PRM24,
			PRM25,
			PRM26,
			PRM27,
			PRM28,
			PRM29,
			PRM30,
			PRM31,
			PRM32,
			PRM33,
			PRM34,
			PRM35,
			PRM36,
			PRM37,
			PRM38,
			PRM39,
			PRM40
		)
		VALUES(
			O_LOG_NO,
			W_SEQ,
			FCPA_CONTEXT.F_GET_CO_CD,
			O_LOG_SUB_KEY1,
			O_LOG_SUB_KEY2,
			I_BATCH_LOG_TYP,
			I_MSGID,
			I_MSGLVL,
			W_MSG,
			FCPA_DATE_UTIL.F_MCSYSTIMESTAMP_CO(FCPA_CONTEXT.F_GET_CO_CD),
			W_MSG_BINDER(1),
			W_MSG_BINDER(2),
			W_MSG_BINDER(3),
			W_MSG_BINDER(4),
			W_MSG_BINDER(5),
			W_MSG_BINDER(6),
			W_MSG_BINDER(7),
			W_MSG_BINDER(8),
			W_MSG_BINDER(9),
			W_MSG_BINDER(10),
			W_MSG_BINDER(11),
			W_MSG_BINDER(12),
			W_MSG_BINDER(13),
			W_MSG_BINDER(14),
			W_MSG_BINDER(15),
			W_MSG_BINDER(16),
			W_MSG_BINDER(17),
			W_MSG_BINDER(18),
			W_MSG_BINDER(19),
			W_MSG_BINDER(20),
			W_MSG_BINDER(21),
			W_MSG_BINDER(22),
			W_MSG_BINDER(23),
			W_MSG_BINDER(24),
			W_MSG_BINDER(25),
			W_MSG_BINDER(26),
			W_MSG_BINDER(27),
			W_MSG_BINDER(28),
			W_MSG_BINDER(29),
			W_MSG_BINDER(30),
			W_MSG_BINDER(31),
			W_MSG_BINDER(32),
			W_MSG_BINDER(33),
			W_MSG_BINDER(34),
			W_MSG_BINDER(35),
			W_MSG_BINDER(36),
			W_MSG_BINDER(37),
			W_MSG_BINDER(38),
			W_MSG_BINDER(39),
			W_MSG_BINDER(40)
		);
		
		COMMIT;
	END;

	-- ==============================================================================
	-- ログサブキー1を採番する
	-- ==============================================================================
	PROCEDURE P_NUMBERING_LOG_SUB_KEY1(
		I_BATCH_LOG_TYP IN VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER
	)
	IS
	BEGIN
		IF FSC_BATCH_LOG_TYP.IS_DATA_LOG(I_BATCH_LOG_TYP) = '1' THEN
			O_LOG_SUB_KEY1 := V_LOG_SUB_KEY1;
		ELSE
			O_LOG_SUB_KEY1 := -100;
		END IF;
	END;

	-- ==============================================================================
	-- ログサブキー2を採番する
	-- ==============================================================================
	PROCEDURE P_NUMBERING_LOG_SUB_KEY2(
		I_BATCH_LOG_TYP IN VARCHAR2,
		O_LOG_SUB_KEY2 OUT NUMBER
	)
	IS
	BEGIN
		IF FSC_BATCH_LOG_TYP.IS_DATA_LOG(I_BATCH_LOG_TYP) = '1' THEN
			V_LOG_SUB_KEY2 := V_LOG_SUB_KEY2 + 1;
			O_LOG_SUB_KEY2 := V_LOG_SUB_KEY2;
		ELSE
			O_LOG_SUB_KEY2 := -100;
		END IF;
	END;

	-- ==============================================================================
	-- ログ出力時にログヘッダを更新する
	-- ==============================================================================
	PROCEDURE P_UPDATE_LOG_HEADER(
		I_BATCH_LOG_TYP IN VARCHAR2,
		I_MSGLVL IN VARCHAR2,
		I_LOG_SEQ IN NUMBER
	)
	IS
	BEGIN
		IF FSC_BATCH_LOG_TYP.IS_END_LOG(I_BATCH_LOG_TYP) = '1' THEN
			UPDATE
				FCT_BATCH_LOG_H_ALL
			SET
				EMSG_SEQ = I_LOG_SEQ,
				END_FLG = '1'
			WHERE
				BATCH_LOG_NO = V_LOG_NO AND
				CO_CD = FCPA_CONTEXT.F_GET_CO_CD
			;	
		END IF;
		
		IF F_IS_WARN_MSGLVL(I_MSGLVL) = 1 THEN
			UPDATE
				FCT_BATCH_LOG_H_ALL
			SET
				WARN_FLG = '1'
			WHERE
				BATCH_LOG_NO = V_LOG_NO AND
				CO_CD = FCPA_CONTEXT.F_GET_CO_CD
			;	
		END IF;

		UPDATE
			FCT_BATCH_LOG_H_ALL
		SET
			LAST_TS = FCPA_DATE_UTIL.F_MCSYSTIMESTAMP_CO(FCPA_CONTEXT.F_GET_CO_CD)
		WHERE
			BATCH_LOG_NO = V_LOG_NO AND
			CO_CD = FCPA_CONTEXT.F_GET_CO_CD
		;	
	END;

	-- ==============================================================================
	-- ログレベルが警告以上であるか否か判定する
	-- ==============================================================================
	FUNCTION F_IS_WARN_MSGLVL(
		I_MSGLVL IN VARCHAR2
	)
	RETURN NUMBER
	IS
		W_RET NUMBER := 0;
	BEGIN
		IF F_LVL_TO_NO(I_MSGLVL) >= 4 THEN
			W_RET := 1;
		END IF;
		RETURN W_RET;
	END;

	-- ==============================================================================
	-- ログメッセージ連番を発番する
	-- ==============================================================================
	FUNCTION F_NUMBERING_LOGSEQ(
		I_CNT IN NUMBER
	)
	RETURN LOG_SEQ_LIST PIPELINED
	IS
		W_REC LOG_SEQ_ROW;
		I NUMBER;
	BEGIN
		FOR I IN 1..I_CNT LOOP
			W_REC.SEQ := FCS_BATCH_LOGSEQ.nextVal;
			PIPE ROW(W_REC);
		END LOOP;
	END;

END;
/
