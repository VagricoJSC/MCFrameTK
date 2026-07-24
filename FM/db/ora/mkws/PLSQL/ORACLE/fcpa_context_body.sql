CREATE OR REPLACE PACKAGE BODY FCPA_CONTEXT
-- ==============================================================================
-- 機能      アプリケーションコンテキストに情報を格納するための機能
-- 作成者    H.KATAYAMA
-- 作成日付  2008-04-10
-- 改版履歴  2007-07-27 H.KATAYAMA 初版作成
--           2007-11-06 H.KATAYAMA F_GET_LANGUAGEを追加
--           2008-01-29 H.KATAYAMA 各SETTERを追加
--           2008-04-10 H.KUBO 定数を返すファンクションを追加。それに伴い定数名を変更
--           2008-04-10 H.KATAYAMA FCT_LOGINのARC_CD、CLT_IDを追加
--           2008-04-15 H.KATAYAMA FCT_LOGINに該当レコードが無い場合はエラーとする
--           2008-07-02 H.KATAYAMA DBのコンテキストは使用しない。
--           2008-07-28 H.KATAYAMA LOCALEを追加
--           2011-05-24 H.KATAYAMA CALL_PG_IDを使用
--           2013-06-12 H.KATAYAMA GET_CONTEXT_ALL、SET_CONTEXT_ALLを追加
--           2013-06-21 H.KATAYAMA SET_CONTEXT_USER の処理を変更
--           2014-01-24 H.KATAYAMA 初期化処理を追加
--           2014-01-24 R.NOJIMA F_GET_OS_USERの処理を追加
--           2014-10-24 Y.TAKAIWA SET_CONTEXT_USERのオーバーロードを追加
--           2015-09-28 S.SUZUKI F_GET_CO_CDを追加
--           2016-02-10 Y.TAKAIWA F_GET_DEF_LOCALE_CDを追加
--           2016-05-30 S.SUZUKI SET_CONTEXT_USERのオーバーロードを削除
--           2016-07-12 S.SUZUKI GP_BATCH_GRP_CDを追加
----
-- バージョン:6.3.1
-- ==============================================================================
IS

	-- ===============================================================================
	-- ＤＢコネクションのプロセスＩＤを取得するためのキー値
	-- ===============================================================================
	FUNCTION PROCESS_ID_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_PROCESS_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザＩＤを取得するためのキー値
	-- ===============================================================================
	FUNCTION USER_ID_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_USER_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザ名を取得するためのキー値
	-- ===============================================================================
	FUNCTION USER_NM_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_USER_NM;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのログインシーケンスを取得するためのキー値
	-- ===============================================================================
	FUNCTION LOGIN_SEQ_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_LOGIN_SEQ;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの会社ＣＤを取得するためのキー値
	-- ===============================================================================
	FUNCTION CO_CD_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_CO_CD;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性１を取得するためのキー値
	-- ===============================================================================
	FUNCTION EXT_ATTR1_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_EXT_ATTR1;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性２を取得するためのキー値
	-- ===============================================================================
	FUNCTION EXT_ATTR2_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_EXT_ATTR2;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性３を取得するためのキー値
	-- ===============================================================================
	FUNCTION EXT_ATTR3_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_EXT_ATTR3;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアクションＩＤを取得するためのキー値
	-- ===============================================================================
	FUNCTION ACTION_ID_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_ACTION_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの言語情報を取得するためのキー値
	-- ===============================================================================
	FUNCTION LANGUAGE_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_LANGUAGE;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアーキテクチャCDを取得するためのキー値
	-- ===============================================================================
	FUNCTION ARC_CD_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_ARC_CD;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのクライアントIDを取得するためのキー値
	-- ===============================================================================
	FUNCTION CLT_ID_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_CLT_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのロケールを取得するためのキー値
	-- ===============================================================================
	FUNCTION LOCALE_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_LOCALE;
	END;


	-- ===============================================================================
	-- 呼び出し元プログラムＩＤを取得するためのキー値
	-- ===============================================================================
	FUNCTION C_CALL_PG_ID_KEY
	RETURN VARCHAR2 IS
	BEGIN
		RETURN C_CALL_PG_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのプロセスＩＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_PROCESSID
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_PROCESS_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのプロセスＩＤを設定する
	-- ===============================================================================
	PROCEDURE SET_PROCESSID(
		I$PROSESSID IN VARCHAR2
	) IS
	BEGIN
		V_PROCESS_ID := I$PROSESSID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザＩＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_USERID
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_USER_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザＩＤを設定する
	-- ===============================================================================
	PROCEDURE SET_USERID(
		I$USER_ID IN VARCHAR2
	) IS
	BEGIN
		V_USER_ID := I$USER_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザ名を取得する
	-- ===============================================================================
	FUNCTION F_GET_USERNM
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_USER_NM;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのユーザ名を設定する
	-- ===============================================================================
	PROCEDURE SET_USERNM(
		I$USER_NM IN VARCHAR2
	) IS
	BEGIN
		V_USER_NM := I$USER_NM;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのログインシーケンスを取得する
	-- ===============================================================================
	FUNCTION F_GET_LOGIN_SEQ
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_LOGIN_SEQ;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのログインシーケンスを設定する
	-- ===============================================================================
	PROCEDURE SET_LOGIN_SEQ(
		I$SEQ IN VARCHAR2
	) IS
	BEGIN
		V_LOGIN_SEQ := I$SEQ;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアクションＩＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_ACTION_ID
	RETURN VARCHAR2 IS
	BEGIN
		RETURN NVL(V_ACTION_ID, 0);
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアクションＩＤを設定する
	-- ===============================================================================
	PROCEDURE SET_ACTION_ID(
		I$ACTION_ID IN VARCHAR2
	) IS
	BEGIN
		V_ACTION_ID := I$ACTION_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの会社ＣＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_CO_CD
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_CO_CD;
	END;

  -- ===============================================================================
	-- ＤＢコネクションの会社ＣＤの標準ロケールを取得する
	-- ===============================================================================
	FUNCTION F_GET_DEF_LOCALE_CD
	RETURN VARCHAR2 IS
	BEGIN
		IF V_DEF_LOCALE_CD IS NULL THEN
			IF F_GET_CO_CD IS NULL THEN
				V_DEF_LOCALE_CD := FCPA_CONST.F_GETSTRVAL('LCL', 'AdminLclCd', 'ja_JP');
			ELSE
				SELECT DEF_LOCALE_CD INTO V_DEF_LOCALE_CD
				FROM FCM_CO_ALL
				WHERE CO_CD = F_GET_CO_CD;
			END IF;
		END IF;
		RETURN V_DEF_LOCALE_CD;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの会社ＣＤを設定する
	-- ===============================================================================
	PROCEDURE SET_CO_CD(
		I$CO_CD IN VARCHAR2
	) IS
	BEGIN
		V_CO_CD := I$CO_CD;
		V_DEF_LOCALE_CD := NULL;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性１を取得する
	-- ===============================================================================
	FUNCTION F_GET_EXT_ATTR1
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_EXT_ATTR1;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性１を設定する
	-- ===============================================================================
	PROCEDURE SET_EXT_ATTR1(
		I$ATTR1 IN VARCHAR2
	) IS
	BEGIN
		V_EXT_ATTR1 := I$ATTR1;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性２を取得する
	-- ===============================================================================
	FUNCTION F_GET_EXT_ATTR2
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_EXT_ATTR2;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性２を設定する
	-- ===============================================================================
	PROCEDURE SET_EXT_ATTR2(
		I$ATTR2 IN VARCHAR2
	) IS
	BEGIN
		V_EXT_ATTR2 := I$ATTR2;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性３を取得する
	-- ===============================================================================
	FUNCTION F_GET_EXT_ATTR3
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_EXT_ATTR3;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの属性３を設定する
	-- ===============================================================================
	PROCEDURE SET_EXT_ATTR3(
		I$ATTR3 IN VARCHAR2
	) IS
	BEGIN
		V_EXT_ATTR3 := I$ATTR3;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの言語情報を取得する
	-- ===============================================================================
	FUNCTION F_GET_LANGUAGE
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_LANGUAGE;
	END;

	-- ===============================================================================
	-- ＤＢコネクションの言語情報を設定する
	-- ===============================================================================
	PROCEDURE SET_LANGUAGE(
		I$LANG IN VARCHAR2
	) IS
	BEGIN
		V_LANGUAGE := I$LANG;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアーキテクチャCDを取得する
	-- ===============================================================================
	FUNCTION F_GET_ARC_CD
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_ARC_CD;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのアーキテクチャCDを設定する
	-- ===============================================================================
	PROCEDURE SET_ARC_CD(
		I$ARC_CD IN VARCHAR2
	) IS
	BEGIN
		V_ARC_CD := I$ARC_CD;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのクライアントIDを取得する
	-- ===============================================================================
	FUNCTION F_GET_CLT_ID
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_CLT_ID;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのクライアントIDを設定する
	-- ===============================================================================
	PROCEDURE SET_CLT_ID(
		I$CLT_ID IN VARCHAR2
	) IS
	BEGIN
		V_CLT_ID := I$CLT_ID;
	END;


	-- ===============================================================================
	-- ＤＢコネクションのロケールを取得する
	-- ===============================================================================
	FUNCTION F_GET_LOCALE
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_LOCALE;
	END;

	-- ===============================================================================
	-- ＤＢコネクションのロケールを設定する
	-- ===============================================================================
	PROCEDURE SET_LOCALE(
		I$LOCALE IN VARCHAR2
	) IS
	BEGIN
		V_LOCALE := I$LOCALE;
	END;


	-- ===============================================================================
	-- 呼び出し元プログラムＩＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_CALL_PG_ID
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_CALL_PG_ID;
	END;

	-- ===============================================================================
	-- 呼び出し元プログラムＩＤを設定する
	-- ===============================================================================
	PROCEDURE SET_CALL_PG_ID(
		I$CALL_PG_ID IN VARCHAR2
	) IS
	BEGIN
		V_CALL_PG_ID := I$CALL_PG_ID;
	END;

	-- ===============================================================================
	-- 汎用バッチ処理グループＣＤを取得する
	-- ===============================================================================
	FUNCTION F_GET_GP_BATCH_GRP_CD
	RETURN VARCHAR2 IS
	BEGIN
		RETURN V_GP_BATCH_GRP_CD;
	END;

	-- ===============================================================================
	-- 汎用バッチ処理グループＣＤを設定する
	-- ===============================================================================
	PROCEDURE SET_GP_BATCH_GRP_CD(
		I$GP_BATCH_GRP_CD IN VARCHAR2
	) IS
	BEGIN
		V_GP_BATCH_GRP_CD := I$GP_BATCH_GRP_CD;
	END;




	-- ===============================================================================
	-- MCFRAME標準のネームスペースへの属性設定
	-- ===============================================================================
	PROCEDURE SET_CONTEXT (
		P$ATTRIBUTE  IN VARCHAR2, --属性名称
		P$AVALUE  IN VARCHAR2     --値
	)IS
	BEGIN
		IF P$ATTRIBUTE = C_PROCESS_ID THEN
			FCPA_CONTEXT.SET_PROCESSID(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_USER_ID THEN
			FCPA_CONTEXT.SET_USERID(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_USER_NM THEN
			FCPA_CONTEXT.SET_USERNM(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_LOGIN_SEQ THEN
			FCPA_CONTEXT.SET_LOGIN_SEQ(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_CO_CD THEN
			FCPA_CONTEXT.SET_CO_CD(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR1 THEN
			FCPA_CONTEXT.SET_EXT_ATTR1(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR2 THEN
			FCPA_CONTEXT.SET_EXT_ATTR2(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR3 THEN
			FCPA_CONTEXT.SET_EXT_ATTR3(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_ACTION_ID THEN
			FCPA_CONTEXT.SET_ACTION_ID(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_LANGUAGE THEN
			FCPA_CONTEXT.SET_LANGUAGE(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_ARC_CD THEN
			FCPA_CONTEXT.SET_ARC_CD(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_CLT_ID THEN
			FCPA_CONTEXT.SET_CLT_ID(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_LOCALE THEN
			FCPA_CONTEXT.SET_LOCALE(P$AVALUE);
		ELSIF P$ATTRIBUTE = C_CALL_PG_ID THEN
			FCPA_CONTEXT.SET_CALL_PG_ID(P$AVALUE);
		END IF;
	END SET_CONTEXT;


	-- ===============================================================================
	-- MCFRAME標準のネームスペースへの属性取得
	-- ===============================================================================
	FUNCTION GET_CONTEXT(
		P$ATTRIBUTE  IN VARCHAR2  --属性名称
	) RETURN VARCHAR2 IS
	BEGIN
		IF P$ATTRIBUTE = C_PROCESS_ID THEN
			RETURN FCPA_CONTEXT.F_GET_PROCESSID;
		ELSIF P$ATTRIBUTE = C_USER_ID THEN
			RETURN FCPA_CONTEXT.F_GET_USERID;
		ELSIF P$ATTRIBUTE = C_USER_NM THEN
			RETURN FCPA_CONTEXT.F_GET_USERNM;
		ELSIF P$ATTRIBUTE = C_LOGIN_SEQ THEN
			RETURN FCPA_CONTEXT.F_GET_LOGIN_SEQ;
		ELSIF P$ATTRIBUTE = C_CO_CD THEN
			RETURN FCPA_CONTEXT.F_GET_CO_CD;
		ELSIF P$ATTRIBUTE = C_EXT_ATTR1 THEN
			RETURN FCPA_CONTEXT.F_GET_EXT_ATTR1;
		ELSIF P$ATTRIBUTE = C_EXT_ATTR2 THEN
			RETURN FCPA_CONTEXT.F_GET_EXT_ATTR2;
		ELSIF P$ATTRIBUTE = C_EXT_ATTR3 THEN
			RETURN FCPA_CONTEXT.F_GET_EXT_ATTR3;
		ELSIF P$ATTRIBUTE = C_ACTION_ID THEN
			RETURN FCPA_CONTEXT.F_GET_ACTION_ID;
		ELSIF P$ATTRIBUTE = C_LANGUAGE THEN
			RETURN FCPA_CONTEXT.F_GET_LANGUAGE;
		ELSIF P$ATTRIBUTE = C_ARC_CD THEN
			RETURN FCPA_CONTEXT.F_GET_ARC_CD;
		ELSIF P$ATTRIBUTE = C_CLT_ID THEN
			RETURN FCPA_CONTEXT.F_GET_CLT_ID;
		ELSIF P$ATTRIBUTE = C_LOCALE THEN
			RETURN FCPA_CONTEXT.F_GET_LOCALE;
		ELSIF P$ATTRIBUTE = C_CALL_PG_ID THEN
			RETURN FCPA_CONTEXT.F_GET_CALL_PG_ID;
		END IF;
		RETURN NULL;
	END GET_CONTEXT;

	-- ===============================================================================
	-- すべての属性取得
	-- ===============================================================================
	PROCEDURE GET_CONTEXT_ALL(
		O$PROCESSID   OUT VARCHAR2,
		O$USERID      OUT VARCHAR2,
		O$USERNM      OUT VARCHAR2,
		O$LOGIN_SEQ   OUT VARCHAR2,
		O$CO_CD       OUT VARCHAR2,
		O$EXT_ATTR1   OUT VARCHAR2,
		O$EXT_ATTR2   OUT VARCHAR2,
		O$EXT_ATTR3   OUT VARCHAR2,
		O$ACTION_ID   OUT VARCHAR2,
		O$LANGUAGE    OUT VARCHAR2,
		O$ARC_CD      OUT VARCHAR2,
		O$CLT_ID      OUT VARCHAR2,
		O$LOCALE      OUT VARCHAR2,
		O$CALL_PG_ID  OUT VARCHAR2
	) IS
	BEGIN
		O$PROCESSID := FCPA_CONTEXT.F_GET_PROCESSID;
		O$USERID := FCPA_CONTEXT.F_GET_USERID;
		O$USERNM := FCPA_CONTEXT.F_GET_USERNM;
		O$LOGIN_SEQ := FCPA_CONTEXT.F_GET_LOGIN_SEQ;
		O$CO_CD := FCPA_CONTEXT.F_GET_CO_CD;
		O$EXT_ATTR1 := FCPA_CONTEXT.F_GET_EXT_ATTR1;
		O$EXT_ATTR2 := FCPA_CONTEXT.F_GET_EXT_ATTR2;
		O$EXT_ATTR3 := FCPA_CONTEXT.F_GET_EXT_ATTR3;
		O$ACTION_ID := FCPA_CONTEXT.F_GET_ACTION_ID;
		O$LANGUAGE := FCPA_CONTEXT.F_GET_LANGUAGE;
		O$ARC_CD := FCPA_CONTEXT.F_GET_ARC_CD;
		O$CLT_ID := FCPA_CONTEXT.F_GET_CLT_ID;
		O$LOCALE := FCPA_CONTEXT.F_GET_LOCALE;
		O$CALL_PG_ID := FCPA_CONTEXT.F_GET_CALL_PG_ID;
	END GET_CONTEXT_ALL;

	-- ===============================================================================
	-- すべての属性設定
	-- ===============================================================================
	PROCEDURE SET_CONTEXT_ALL(
		I$PROCESSID   IN VARCHAR2,
		I$USERID      IN VARCHAR2,
		I$USERNM      IN VARCHAR2,
		I$LOGIN_SEQ   IN VARCHAR2,
		I$CO_CD       IN VARCHAR2,
		I$EXT_ATTR1   IN VARCHAR2,
		I$EXT_ATTR2   IN VARCHAR2,
		I$EXT_ATTR3   IN VARCHAR2,
		I$ACTION_ID   IN VARCHAR2,
		I$LANGUAGE    IN VARCHAR2,
		I$ARC_CD      IN VARCHAR2,
		I$CLT_ID      IN VARCHAR2,
		I$LOCALE      IN VARCHAR2,
		I$CALL_PG_ID  IN VARCHAR2,
		I$GP_BATCH_GRP_CD  IN VARCHAR2
	) IS
	BEGIN
		FCPA_CONTEXT.SET_PROCESSID(I$PROCESSID);
		FCPA_CONTEXT.SET_USERID(I$USERID);
		FCPA_CONTEXT.SET_USERNM(I$USERNM);
		FCPA_CONTEXT.SET_LOGIN_SEQ(I$LOGIN_SEQ);
		FCPA_CONTEXT.SET_CO_CD(I$CO_CD);
		FCPA_CONTEXT.SET_EXT_ATTR1(I$EXT_ATTR1);
		FCPA_CONTEXT.SET_EXT_ATTR2(I$EXT_ATTR2);
		FCPA_CONTEXT.SET_EXT_ATTR3(I$EXT_ATTR3);
		FCPA_CONTEXT.SET_ACTION_ID(I$ACTION_ID);
		FCPA_CONTEXT.SET_LANGUAGE(I$LANGUAGE);
		FCPA_CONTEXT.SET_ARC_CD(I$ARC_CD);
		FCPA_CONTEXT.SET_CLT_ID(I$CLT_ID);
		FCPA_CONTEXT.SET_LOCALE(I$LOCALE);
		FCPA_CONTEXT.SET_CALL_PG_ID(I$CALL_PG_ID);
		FCPA_CONTEXT.SET_GP_BATCH_GRP_CD(I$GP_BATCH_GRP_CD);
	END SET_CONTEXT_ALL;


	-- ===============================================================================
	-- MCFRAME標準のネームスペースへの属性クリア
	-- ===============================================================================
	PROCEDURE CLEAR_CONTEXT(
		P$ATTRIBUTE  IN VARCHAR2 --属性名称
	)IS
	BEGIN
		IF P$ATTRIBUTE = C_PROCESS_ID THEN
			FCPA_CONTEXT.SET_PROCESSID(null);
		ELSIF P$ATTRIBUTE = C_USER_ID THEN
			FCPA_CONTEXT.SET_USERID(null);
		ELSIF P$ATTRIBUTE = C_USER_NM THEN
			FCPA_CONTEXT.SET_USERNM(null);
		ELSIF P$ATTRIBUTE = C_LOGIN_SEQ THEN
			FCPA_CONTEXT.SET_LOGIN_SEQ(null);
		ELSIF P$ATTRIBUTE = C_CO_CD THEN
			FCPA_CONTEXT.SET_CO_CD(null);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR1 THEN
			FCPA_CONTEXT.SET_EXT_ATTR1(null);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR2 THEN
			FCPA_CONTEXT.SET_EXT_ATTR2(null);
		ELSIF P$ATTRIBUTE = C_EXT_ATTR3 THEN
			FCPA_CONTEXT.SET_EXT_ATTR3(null);
		ELSIF P$ATTRIBUTE = C_ACTION_ID THEN
			FCPA_CONTEXT.SET_ACTION_ID(null);
		ELSIF P$ATTRIBUTE = C_LANGUAGE THEN
			FCPA_CONTEXT.SET_LANGUAGE(null);
		ELSIF P$ATTRIBUTE = C_ARC_CD THEN
			FCPA_CONTEXT.SET_ARC_CD(null);
		ELSIF P$ATTRIBUTE = C_CLT_ID THEN
			FCPA_CONTEXT.SET_CLT_ID(null);
		ELSIF P$ATTRIBUTE = C_LOCALE THEN
			FCPA_CONTEXT.SET_LOCALE(null);
		ELSIF P$ATTRIBUTE = C_CALL_PG_ID THEN
			FCPA_CONTEXT.SET_CALL_PG_ID(null);
		END IF;
	END;


	-- ===============================================================================
	-- すべてのアプリケーションコンテキストの削除
	-- ===============================================================================
	PROCEDURE CLEAR_ALL_CONTEXT
	IS
	BEGIN
		FCPA_CONTEXT.SET_PROCESSID(null);
		FCPA_CONTEXT.SET_USERID(null);
		FCPA_CONTEXT.SET_USERNM(null);
		FCPA_CONTEXT.SET_LOGIN_SEQ(null);
		FCPA_CONTEXT.SET_ACTION_ID(null);
		FCPA_CONTEXT.SET_CO_CD(null);
		FCPA_CONTEXT.SET_EXT_ATTR1(null);
		FCPA_CONTEXT.SET_EXT_ATTR2(null);
		FCPA_CONTEXT.SET_EXT_ATTR3(null);
		FCPA_CONTEXT.SET_LANGUAGE(null);
		FCPA_CONTEXT.SET_ARC_CD(null);
		FCPA_CONTEXT.SET_CLT_ID(null);
		FCPA_CONTEXT.SET_LOCALE(null);
		FCPA_CONTEXT.SET_CALL_PG_ID(null);
		FCPA_CONTEXT.SET_GP_BATCH_GRP_CD(null);
	END;



	-- ===============================================================================
	-- ユーザ情報をアプリケーションコンテキストに設定します。
	-- 戻り値(O$RETURNCD)：0=正常
	--                     1=S_LOGINに情報がない
	--                     9=異常終了
	-- ===============================================================================
	PROCEDURE SET_CONTEXT_USER(
		I$PROSESSID   IN  VARCHAR2,
		I$USER_ID     IN  VARCHAR2,
		I$USER_NM     IN  VARCHAR2,
		I$SEQ         IN  VARCHAR2,
		I$ACTION_ID   IN  VARCHAR2,
		I$LOCALE      IN  VARCHAR2,
		I$CALL_ID     IN  VARCHAR2,
		O$RETURNCD    OUT VARCHAR2,
		O$MSG         OUT VARCHAR2,
		I$CO_CD       IN VARCHAR2,
		I$EXT_ATTR1   IN VARCHAR2,
		I$EXT_ATTR2   IN VARCHAR2,
		I$EXT_ATTR3   IN VARCHAR2,
		O$LANGUAGE    OUT VARCHAR2,
		O$CLT_ID      OUT VARCHAR2
	)IS
		LOGINR FCT_LOGIN%ROWTYPE;
	BEGIN
		BEGIN
			SELECT * INTO LOGINR FROM FCT_LOGIN
			WHERE USER_ID = I$USER_ID AND LOGIN_SEQ = I$SEQ;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				O$RETURNCD := '1';
				RETURN;

			WHEN OTHERS THEN
				O$RETURNCD := '9';
				O$MSG := SQLERRM;
				RETURN;
		END;

		BEGIN
			FCPA_CONTEXT.SET_PROCESSID(I$PROSESSID);
			FCPA_CONTEXT.SET_USERID(LOGINR.USER_ID);
			FCPA_CONTEXT.SET_USERNM(I$USER_NM);
			FCPA_CONTEXT.SET_LOGIN_SEQ(I$SEQ);
			FCPA_CONTEXT.SET_ACTION_ID(I$ACTION_ID);
			FCPA_CONTEXT.SET_CO_CD(I$CO_CD);
			FCPA_CONTEXT.SET_EXT_ATTR1(I$EXT_ATTR1);
			FCPA_CONTEXT.SET_EXT_ATTR2(I$EXT_ATTR2);
			FCPA_CONTEXT.SET_EXT_ATTR3(I$EXT_ATTR3);
			FCPA_CONTEXT.SET_ARC_CD(LOGINR.ARC_CD);
			FCPA_CONTEXT.SET_CLT_ID(LOGINR.CLT_ID);
			FCPA_CONTEXT.SET_LOCALE(I$LOCALE);
			FCPA_CONTEXT.SET_LANGUAGE(I$LOCALE); --ロケールと同じ内容を設定
			FCPA_CONTEXT.SET_CALL_PG_ID(I$CALL_ID);
		EXCEPTION
			WHEN OTHERS THEN
				O$RETURNCD := '9';
				O$MSG := SQLERRM;
				RETURN;
		END;
		O$RETURNCD := '0';
		O$MSG := '';
		O$LANGUAGE := FCPA_CONTEXT.F_GET_LANGUAGE;
		O$CLT_ID := FCPA_CONTEXT.F_GET_CLT_ID;
	END ;

	-- ===============================================================================
	-- ユーザ情報をアプリケーションコンテキストに設定します。
	-- ===============================================================================
	PROCEDURE SET_CONTEXT_USER(
		I$CO_CD       IN VARCHAR2,
		I$EXT_ATTR1   IN VARCHAR2,
		I$EXT_ATTR2   IN VARCHAR2,
		I$EXT_ATTR3   IN VARCHAR2
	)IS
	BEGIN
		FCPA_CONTEXT.SET_CO_CD(I$CO_CD);
		FCPA_CONTEXT.SET_EXT_ATTR1(I$EXT_ATTR1);
		FCPA_CONTEXT.SET_EXT_ATTR2(I$EXT_ATTR2);
		FCPA_CONTEXT.SET_EXT_ATTR3(I$EXT_ATTR3);
	END ;

	-- ===============================================================================
	-- CO_VIEW参照のための情報をアプリケーションコンテキストに設定します。
	-- ===============================================================================
	PROCEDURE SET_CONTEXT_COVIEW(
		I$CO_CD       IN VARCHAR2,
		I$LOCALE      IN VARCHAR2
	)IS
	BEGIN
		FCPA_CONTEXT.SET_CO_CD(I$CO_CD);
		FCPA_CONTEXT.SET_LOCALE(I$LOCALE);
	END ;

	-- ===============================================================================
	-- 接続中のOSユーザを返す
	-- ===============================================================================
	FUNCTION F_GET_OS_USR
	RETURN VARCHAR2
	IS
	BEGIN
		V_OS_USR := '?' || SUBSTR(SYS_CONTEXT('USERENV', 'OS_USER'),
					INSTR(SYS_CONTEXT('USERENV', 'OS_USER'), '\') + 1, 500 - 1);
		RETURN V_OS_USR;
	END F_GET_OS_USR;

END;
/

