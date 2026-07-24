SET SQLBLANKLINES ON

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
show errors;


CREATE OR REPLACE PACKAGE BODY FCPA_MSG
-- ==============================================================================
-- 機能      メッセージ機能
-- 作成者    A.SHIMAO
-- 作成日付  2016-05-16
-- 改版履歴  2016-05-16 A.SHIMAO 初版作成
--
-- バージョン:6.4.0
-- ==============================================================================
IS
	-- ==============================================================================
	-- メッセージIDのレベルを取得する
	-- ==============================================================================
	FUNCTION F_GET_MESSAGE_LEVEL(
		I_MSGID IN VARCHAR2
	)
	RETURN VARCHAR2
	IS
		W_RET VARCHAR2(1 CHAR);
	BEGIN
		SELECT LVL INTO W_RET FROM FCT_MSG WHERE MSGID = I_MSGID AND LOC_CD IS NULL;
		RETURN W_RET;
	END;

	-- ==============================================================================
	-- メッセージIDの文言を取得する
	-- ==============================================================================
	FUNCTION F_GET_MESSAGE(
		I_MSGID IN VARCHAR2
	)
	RETURN VARCHAR2
	IS
		W_RET VARCHAR2(1000 CHAR);
		W_LCL VARCHAR2(20 CHAR);
	BEGIN
		-- ロケールの解釈
		W_LCL := FCPA_CONTEXT.F_GET_LOCALE;
		IF W_LCL = 'ja_JP' OR W_LCL IS NULL THEN
			SELECT MSG INTO W_RET FROM FCT_MSG WHERE MSGID = I_MSGID AND LOC_CD IS NULL;
		ELSE
			BEGIN
				SELECT MSG INTO W_RET FROM FCT_MSG WHERE MSGID = I_MSGID AND LOC_CD = W_LCL;
			EXCEPTION
				WHEN NO_DATA_FOUND THEN
					BEGIN
						SELECT MSG INTO W_RET FROM FCT_MSG WHERE MSGID = I_MSGID AND LOC_CD IS NULL;
					EXCEPTION
						WHEN NO_DATA_FOUND THEN
							W_RET := 'MESSAGE NOT FOUND. MESSSAGEID=' || I_MSGID;
					END;
			END;
		END IF;
		RETURN W_RET;
	END;

	-- ===============================================================================
	-- 書式文字列内のプレースフォルダ({n})のある場所へ
	-- 与えられた引数(PL/SQL表)の値を埋め込む
	-- ===============================================================================
	PROCEDURE P_INLAY (
		I_MSGID IN VARCHAR2,
		I_BIND IN MSG_BINDER,    --引数の値が格納されているPL/SQL表
		O_MSG OUT VARCHAR2       --埋め込み後の文字列
	) IS
		CPOS   PLS_INTEGER NOT NULL DEFAULT 1;
		NPOS   PLS_INTEGER;
		BKEY   VARCHAR2(10 CHAR);
		BUF    VARCHAR2(32767 CHAR) DEFAULT NULL;
		BUF_S  VARCHAR2(32767 CHAR);
	BEGIN
		IF I_BIND IS NOT NULL THEN
			/* {n} のある場所へ引数で与えられた文字列を順番に埋め込む */
			BUF := F_GET_MESSAGE(I_MSGID);
			BUF := REPLACE(BUF, '\n', CHR(13) || CHR(10));
			FOR IDX IN I_BIND.FIRST .. I_BIND.LAST LOOP
				BKEY := '{' || IDX || '}';
				NPOS := INSTR(BUF, BKEY ,1);
				IF NPOS > 0 THEN
					BUF_S := NULL;
					CPOS := 1;
					WHILE NPOS > 0 LOOP
						BUF_S := BUF_S || SUBSTRC(BUF, CPOS, NPOS - CPOS) || I_BIND(IDX);
						CPOS := NPOS + LENGTH(BKEY);
						NPOS := INSTR(BUF, BKEY ,CPOS);
					END LOOP;
					BUF_S := BUF_S || SUBSTRC(BUF, CPOS, LENGTH(BUF) + 1 - CPOS);
					BUF := BUF_S;
				END IF;
			END LOOP;
			-- メッセージを最大長でトリム
			IF LENGTHB(BUF) > 1000 THEN
				BUF := SUBSTRC(BUF, 1, 1000 - 3) || '...';
			END IF;
			O_MSG := BUF;
		ELSE
			O_MSG := F_GET_MESSAGE(I_MSGID);
			O_MSG := REPLACE(O_MSG, '\n', CHR(13) || CHR(10));
		END IF;
	END;

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
	) IS
	BEGIN
		P_INLAY (
			I_MSGID,
			MSG_BINDER(
			I_01, I_02, I_03, I_04, I_05, I_06, I_07, I_08, I_09, I_10,
			I_11, I_12, I_13, I_14, I_15, I_16, I_17, I_18, I_19, I_20,
			I_21, I_22, I_23, I_24, I_25, I_26, I_27, I_28, I_29, I_30,
			I_31, I_32, I_33, I_34, I_35, I_36, I_37, I_38, I_39, I_40),
			O_MSG
		);
	END;

END;


/
show errors;


DELETE FROM FCT_PATCHVERSION WHERE PRODUCT_ID = 'JAVA-FS' AND MODULE_ID = 'FS' AND VERSION = 'FC7032#016' AND BRANCH = '0';

INSERT INTO FCT_PATCHVERSION VALUES ('JAVA-FS', 'FS','FC7032#016', '0', SYSTIMESTAMP);

commit;

