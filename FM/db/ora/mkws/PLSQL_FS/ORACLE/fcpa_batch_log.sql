CREATE OR REPLACE PACKAGE FCPA_BATCH_LOG
-- ==============================================================================
-- 機能      バッチログ機能
-- 作成者    A.SHIMAO
-- 作成日付  2016-05-16
-- 改版履歴  2016-05-16 A.SHIMAO 初版作成
--
-- バージョン:6.4.0
-- ==============================================================================
IS
	-- ログ情報引継ぎ状態
	V_INHERIT_FLG NUMBER(1) := 0;
	
	-- ログNo
	V_LOG_NO VARCHAR2(15 CHAR);
	
	-- ログサブキー1
	V_LOG_SUB_KEY1 NUMBER(9);

	-- ログサブキー2
	V_LOG_SUB_KEY2 NUMBER(9);
	
	-- ログサブキー1のデフォルト値
	CONST_LOG_SUB_KEY1 NUMBER(9) := 9999998;

	-- ログサブキー2のデフォルト値
	CONST_LOG_SUB_KEY2 NUMBER(9) := 0;

	-- データ参照制御
	V_DATA_REF_CTL VARCHAR2(50 CHAR);
	
	-- ログメッセージ連番発番
	TYPE LOG_SEQ_ROW IS RECORD (
		SEQ NUMBER(22)
	);
	TYPE LOG_SEQ_LIST IS TABLE OF LOG_SEQ_ROW;

	-- ==============================================================================
	-- 開始ログ出力
	-- ==============================================================================
	PROCEDURE P_START_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	);

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
	);

	-- ==============================================================================
	-- 処理経過ログ出力
	-- ==============================================================================
	PROCEDURE P_PROC_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	);

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
	);

	-- ==============================================================================
	-- データログ出力
	-- ==============================================================================
	PROCEDURE P_DATA_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER,
		O_LOG_NO OUT VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER,
		O_LOG_SUB_KEY2 OUT NUMBER
	);

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
	);

	-- ==============================================================================
	-- 終了ログ出力
	-- ==============================================================================
	PROCEDURE P_END_LOG(
		I_MSGID IN VARCHAR2,
		I_MSG_BINDER IN FCPA_MSG.MSG_BINDER
	);

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
	);

	-- ==============================================================================
	-- 初期処理
	-- ==============================================================================
	PROCEDURE P_INIT(
		I_PROCEDURE_NAME VARCHAR2 DEFAULT NULL
	);

	-- ==============================================================================
	-- ログNo生成
	-- ==============================================================================
	FUNCTION F_MAKE_LOG_NO
	RETURN VARCHAR2;

	-- ==============================================================================
	-- ログNoを取得する
	-- ==============================================================================
	FUNCTION F_GET_LOG_NO
	RETURN VARCHAR2;

	-- ==============================================================================
	-- 引継ぎ情報作成
	-- ==============================================================================
	PROCEDURE P_INHERIT(
		I_LOG_NO VARCHAR2,
		I_LOG_SUB_KEY1 NUMBER,
		I_LOG_SUB_KEY2 NUMBER,
		I_DATA_REF_CTL VARCHAR2
	);

	-- ==============================================================================
	-- 引継ぎ情報解除
	-- ==============================================================================
	PROCEDURE P_RELEASE_INHERIT;

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
	);

	-- ==============================================================================
	-- ログレベルが出力対象であるか判定する
	-- 戻り値
	-- 1：出力対象である。0:出力対象ではない。
	-- ==============================================================================
	FUNCTION F_IS_AVAILABLE(
		I_MSG_LVL IN VARCHAR2
	)
	RETURN NUMBER;

	-- ==============================================================================
	-- メッセージのレベルを数値にします。
	-- ==============================================================================
	FUNCTION F_LVL_TO_NO(
		I_MSG_LVL IN VARCHAR2
	) RETURN NUMBER RESULT_CACHE;

	-- ==============================================================================
	-- ログヘッダをテーブルに書き込む
	-- ==============================================================================
	PROCEDURE P_WRITE_LOG_HEADER(
		I_PROCEDURE_NAME VARCHAR2
	);

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
	);

	-- ==============================================================================
	-- ログサブキー1を採番する
	-- ==============================================================================
	PROCEDURE P_NUMBERING_LOG_SUB_KEY1(
		I_BATCH_LOG_TYP IN VARCHAR2,
		O_LOG_SUB_KEY1 OUT NUMBER
	);

	-- ==============================================================================
	-- ログサブキー2を採番する
	-- ==============================================================================
	PROCEDURE P_NUMBERING_LOG_SUB_KEY2(
		I_BATCH_LOG_TYP IN VARCHAR2,
		O_LOG_SUB_KEY2 OUT NUMBER
	);

	-- ==============================================================================
	-- ログ出力時にログヘッダを更新する
	-- ==============================================================================
	PROCEDURE P_UPDATE_LOG_HEADER(
		I_BATCH_LOG_TYP IN VARCHAR2,
		I_MSGLVL IN VARCHAR2,
		I_LOG_SEQ IN NUMBER
	);

	-- ==============================================================================
	-- ログレベルが警告以上であるか否か判定する
	-- ==============================================================================
	FUNCTION F_IS_WARN_MSGLVL(
		I_MSGLVL IN VARCHAR2
	)
	RETURN NUMBER;

	-- ==============================================================================
	-- ログメッセージ連番を発番する
	-- ==============================================================================
	FUNCTION F_NUMBERING_LOGSEQ(
		I_CNT IN NUMBER
	)
	RETURN LOG_SEQ_LIST PIPELINED;

END;
/
