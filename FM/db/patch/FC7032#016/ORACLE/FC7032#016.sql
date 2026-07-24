CREATE OR REPLACE PACKAGE FCPA_MSG
-- ==============================================================================
-- 機能      メッセージ機能
-- 作成者    A.SHIMAO
-- 作成日付  2016-05-16
-- 改版履歴  2016-05-16 A.SHIMAO 初版作成
--
-- バージョン:6.4.0
-- ==============================================================================
IS
	--バインド変数の格納先
	TYPE MSG_BINDER IS TABLE OF VARCHAR2(1000);

	-- ==============================================================================
	-- メッセージIDのレベルを取得する
	-- ==============================================================================
	FUNCTION F_GET_MESSAGE_LEVEL(
		I_MSGID IN VARCHAR2
	)
	RETURN VARCHAR2;

	-- ===============================================================================
	-- 書式文字列内のプレースフォルダ({n})のある場所へ
	-- 与えられた引数(PL/SQL表)の値を埋め込む
	-- ===============================================================================
	PROCEDURE P_INLAY (
		I_MSGID IN VARCHAR2,
		I_BIND IN MSG_BINDER,    --引数の値が格納されているPL/SQL表
		O_MSG OUT VARCHAR2       --埋め込み後の文字列
	);

	-- ==============================================================================
	-- 書式文字列のプレースフォルダに引数で与えた文字列を埋め込んだ
	-- メッセージ文字列を出力変数へ代入
	-- ==============================================================================
	PROCEDURE P_SPRINTF (
		O_MSG OUT VARCHAR2,
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

END;
/

