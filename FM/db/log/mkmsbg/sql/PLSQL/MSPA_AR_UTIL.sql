SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MSPA_AR_UTIL
/*********************************************************
<Synopsis>
		請求、売掛ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS


	FUNCTION F_GET_LAST_BILL_MNG_NO(
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.BILL_MNG_NO%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最終請求管理ＮＯを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_CD
			案件ＣＤ
	<ReturnValue>
			請求ＩＤ
	**********************************************************/

	FUNCTION F_GET_MAX_CL_DAY(
		I_BCST_CD 		IN MAPA_META.BP_CD%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先の最大（月で最後）の締日を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<ReturnValue>
			最大の締日
	**********************************************************/

	FUNCTION F_GET_SCHD_BILL_DT(
		I_BCST_CD				IN MAPA_META.BP_CD%TYPE,
		I_BILL_BASE_DT			IN MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN MAPA_META.CRRYOVR_TIMES%TYPE,
		I_GET_NOT_BILL_DAY_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日に対応した請求予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASE_DT
			請求予定日算出の基準日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_GET_NOT_BILL_DAY_FLG
			'0':取得した請求予定日をそのまま返す
			'1':取得した請求予定日が過去日であった場合、
			未来の直近の請求予定日を再取得して返す
	<ReturnValue>
			請求予定日
	**********************************************************/

	FUNCTION F_GET_AR_NOT_APPL_BAL (
		I_ACST_CD		IN MAPA_META.BP_CD%TYPE,
		I_IV_NO			IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO		IN MAPA_META.WRK_NO%TYPE,
		I_DPT_CD		IN MAPA_META.DPT_CD%TYPE,
		I_AR_TYP		IN MAPA_META.AR_TYP%TYPE,
		I_AR_CL_YM		IN MAPA_META.YM%TYPE,
		I_MON			IN NUMBER,
		I_BEF_FLG		IN MAPA_META.FLG%TYPE
	)RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			指定した月の売掛金消込残高を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ACST_CD
			売掛先ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_NO
			案件ＮＯ
	<IN>	I_DPT_CD
			債権部門ＣＤ
	<IN>	I_AR_TYP
			債権区分
	<IN>	I_AR_CL_YM
			売掛締年月
	<IN>	I_MON
			締月の翌月 - 指定月の売掛金残高を求める（Oは当月）
	<IN>	I_BEF_FLG
			TRUEの場合、指定月以前の売掛金残高合計を求める
	<RETURNVALUE>
			売掛金消込残高
	**********************************************************/

	FUNCTION F_GET_BILL_CL_DAY (
		I_BILL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_TYP		IN	MAPA_META.BILL_CL_TYP%TYPE,
		I_BILL_EACH_SLS_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求締日取得ファンクション
	<REMARKS>
			請求年月を加工して請求締日を取得する
	<ARGUMENTS>
		<IN>	I_BILL_YM
				請求年月
		<IN>	I_BILL_CL_TYP
				請求締区分
		<IN>	I_BILL_EACH_SLS_FLG
				都度請求フラグ
	<RETURNVALUE>
			BILL_CL_
			請求予定日
	**********************************************************/

--	FUNCTION F_GET_MAX_RCV_DAY (
--		I_BCST_CD		IN MAPA_META.BP_CD%TYPE
--	) RETURN MAPA_META.RCV_DAY%TYPE;
--	/*********************************************************
--	<SYNOPSIS>
--			請求先の最大の締日に対応した入金日を取得する
--	<REMARKS>
--	<ARGUMENTS>
--	<IN>	I_BCST_CD
--			請求先ＣＤ
--	<ReturnValue>
--			最大の締日に対応した入金日
--	**********************************************************/

	FUNCTION F_GET_LAST_BILL_REC (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MST_BILL%ROWTYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求レコードを取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_GET_LAST_BILL_AMT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求額を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_GET_LAST_BILL_CL_DT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求締年月日を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_COMBINE_DT(
		I_BASEDATE	IN	MAPA_META.DT%TYPE,
		I_DAY		IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付算出処理
	<REMARKS>
			基準となる日付に対して入金サイトの加算や日にち指定を行い、
			入金予定日や締日を算出する
	<ARGUMENTS>
	<IN>	I_BASEDATE
			基準日付
	<IN>	I_DAY
			指定の日付('DD'、0:締日なし/99:末日)
	<RETURNVALUE>	算出した日付
	**********************************************************/

	FUNCTION F_GET_BILL_CL_FLG(
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_DT			IN	MAPA_META.DT%TYPE
	)RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_DT
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BILL_CL_FLG (
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_DAY			IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_YM
			請求締年月
	<IN>	I_BILL_CL_DAY
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_RCV_SCHD_DT(
		I_BILL_MNG_NO	IN MAPA_META.BILL_MNG_NO%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			入金予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_MNG_NO
			請求管理ＮＯ
	<RETURNVALUE>
			入金予定日
	**********************************************************/

	FUNCTION F_GET_BCST_DPT (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD		IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを返却
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BCST_DPT_NE (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD		IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを返却
			取得できない場合、Exceptionが発生した場合はNULLを返却
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_MAX_RCV_DAY (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.RCV_DAY%TYPE;
	/*********************************************************
		<SYNOPSIS>
			請求先の最大の締日に対応した入金予定日を取得する
			複数の入金方法が設定されている場合は、
			その中の最大の入金サイトを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<ReturnValue>
			入金予定日
	**********************************************************/

	FUNCTION F_GET_MAX_RCV_CRRYOVR_MONS (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先の最大の締日に対応した入金サイトを取得する
			複数の入金方法が設定されている場合は、
			その中の最大の入金サイトを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<RETURNVALUE>
			最大の入金サイト
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CRRYOVR_MONS_TYP (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS_TYP%TYPE;
	/*********************************************************
	<SYNOPSIS>
			入金予定制御マスタからサイト区分を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<RETURNVALUE>
			サイト区分
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ORG_BILL_D_NO (
		I_BILL_D_NO		IN MAPA_META.BILL_D_NO%TYPE
	) RETURN MAPA_META.BILL_D_NO%TYPE;
	/*********************************************************
	<SYNOPSIS>
			オリジナルの請求明細ＮＯを取得して返却する
			引数の請求明細ＮＯがオリジナルの場合、
			引数の請求明細ＮＯをそのまま返却する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_D_NO
			請求明細ＮＯ
	<RETURNVALUE>
			オリジナルの請求明細ＮＯ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AC_YM_NE (
		I_AC_DT		IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			引数の計上日が本来属する計上年月を取得する
			計上年月が締まっていてもエラーにならない
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_AC_DT
			計上日
	<RETURNVALUE>
			計上年月
	<HISTORY>
	**********************************************************/
	
	FUNCTION F_GET_AMT_DISP_PM (
		I_TRD_PTN_TYP	IN	MAPA_META.TRD_PTN_TYP%TYPE,
		I_DSCNT_ITM_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目を加味した結果を取得します。
	<REMARKS>
	<IN>	I_TRD_PTN_TYP
			取引区分
	<IN>	I_DSCNT_ITM_FLG
			値引品フラグ
	<RETURNVALUE>
		1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	<HISTORY>
	**********************************************************/

END MSPA_AR_UTIL;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MSPA_AR_UTIL
/*********************************************************
<Synopsis>
		請求、売掛ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS


	TYPE TYP_CL_DAY_LIST IS TABLE OF MAPA_META.CL_DAY%TYPE INDEX BY BINARY_INTEGER;


	FUNCTION F_GET_LAST_BILL_MNG_NO(
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.BILL_MNG_NO%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			最終請求管理ＮＯを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_CD
			案件ＣＤ
	<ReturnValue>
			請求ＩＤ
	**********************************************************/
	L_LAST_BILL_MNG_NO MAPA_META.BILL_MNG_NO%TYPE;
	BEGIN
		SELECT
			MAX(BILL_MNG_NO)
		INTO
			L_LAST_BILL_MNG_NO
	FROM
		MST_BILL T1
	WHERE 0 = 0
		AND T1.BCST_CD = I_BCST_CD
		AND T1.BILL_DPT_CD = I_BILL_DPT_CD
		AND T1.IV_NO = I_IV_NO
		AND T1.TRD_CUR_CD = I_CUR_CD
		AND (T1.WRK_NO = I_WRK_NO OR T1.WRK_NO IS NULL AND I_WRK_NO IS NULL)
		AND MSC_BILL_CL_STS_TYP.NOT_BILL != T1.BILL_CL_STS_TYP
		;

		IF L_LAST_BILL_MNG_NO IS NULL THEN
			SELECT
				MIN(BILL_MNG_NO)
			INTO
				L_LAST_BILL_MNG_NO
			FROM
				MST_BILL T1
			WHERE 0 = 0
				AND T1.BCST_CD = I_BCST_CD
				AND T1.BILL_DPT_CD = I_BILL_DPT_CD
				AND T1.IV_NO = I_IV_NO
				AND T1.TRD_CUR_CD = I_CUR_CD
				AND (T1.WRK_NO = I_WRK_NO OR T1.WRK_NO IS NULL AND I_WRK_NO IS NULL)
				AND MSC_BILL_CL_STS_TYP.NOT_BILL = T1.BILL_CL_STS_TYP
				;
		END IF;

		RETURN L_LAST_BILL_MNG_NO;

	END F_GET_LAST_BILL_MNG_NO;

	
	FUNCTION F_GET_CL_DAY_LIST(
		I_BCST_CD 		IN MAPA_META.BP_CD%TYPE
	) RETURN TYP_CL_DAY_LIST
	IS
	/*********************************************************
	<SYNOPSIS>
			請求先の締日のリストを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<ReturnValue>
			締日のリスト
	**********************************************************/
		L_CL_DAY_LIST	TYP_CL_DAY_LIST;
		L_CNT			NUMBER(1);

		CURSOR CUR_CL_DAY IS
			SELECT DISTINCT BILL_CL_DAY FROM
			(
				SELECT BILL_CL_DAY1 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY1 > 0
				UNION ALL
				SELECT BILL_CL_DAY2 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY2 > 0
				UNION ALL
				SELECT BILL_CL_DAY3 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY3 > 0
				UNION ALL
				SELECT BILL_CL_DAY4 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY4 > 0
				UNION ALL
				SELECT BILL_CL_DAY5 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY5 > 0
			)
			ORDER BY BILL_CL_DAY
			;
	BEGIN

		L_CNT := 1;
		FOR REC_CL_DAY IN CUR_CL_DAY LOOP
			L_CL_DAY_LIST(L_CNT) := REC_CL_DAY.BILL_CL_DAY;
			L_CNT := L_CNT + 1;
		END LOOP;

		RETURN L_CL_DAY_LIST;

	EXCEPTION
		WHEN OTHERS THEN
			IF CUR_CL_DAY%ISOPEN THEN
				CLOSE CUR_CL_DAY;
			END IF;

	END F_GET_CL_DAY_LIST;
	
	FUNCTION F_GET_MAX_CL_DAY(
		I_BCST_CD 		IN MAPA_META.BP_CD%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			請求先の最大（月で最後）の締日を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<ReturnValue>
			最大の締日
	**********************************************************/
		L_MAX_CL_DAY	MAPA_META.CL_DAY%TYPE;
	BEGIN

		SELECT MAX(BILL_CL_DAY) INTO L_MAX_CL_DAY FROM
			(
				SELECT BILL_CL_DAY1 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY1 > 0
				UNION ALL
				SELECT BILL_CL_DAY2 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY2 > 0
				UNION ALL
				SELECT BILL_CL_DAY3 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY3 > 0
				UNION ALL
				SELECT BILL_CL_DAY4 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY4 > 0
				UNION ALL
				SELECT BILL_CL_DAY5 BILL_CL_DAY FROM MAM_BP WHERE BP_CD = I_BCST_CD AND BILL_CL_DAY5 > 0
			);

		RETURN L_MAX_CL_DAY;

	END F_GET_MAX_CL_DAY;

	FUNCTION F_GET_SCHD_BILL_DT(
		I_BCST_CD				IN MAPA_META.BP_CD%TYPE,
		I_BILL_BASE_DT			IN MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN MAPA_META.CRRYOVR_TIMES%TYPE,
		I_GET_NOT_BILL_DAY_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DT%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日に対応した請求予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASE_DT
			請求予定日算出の基準日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_GET_NOT_BILL_DAY_FLG
			'0':取得した請求予定日をそのまま返す
			'1':取得した請求予定日が過去日であった場合、
			未来の直近の請求予定日を再取得して返す
	<ReturnValue>
			請求予定日
	**********************************************************/
		L_BILL_CL_DAY	MAPA_META.CL_DAY%TYPE;
		L_BILL_CL_TYP	MAPA_META.BILL_CL_TYP%TYPE;
		L_BILL_DT		MAPA_META.DT%TYPE;
		L_SYS_DT		MAPA_META.DT%TYPE;
		L_BASE_DT		MAPA_META.DT%TYPE;
		L_CL_DAY_LIST	TYP_CL_DAY_LIST;
		L_LIST_CNT		NUMBER(1);
		L_CRRYOVR_CNT	NUMBER(3);

	BEGIN

		-- 引数チェック
		IF I_BILL_BASE_DT IS NULL THEN
			RETURN NULL;
		END IF;

		-- 基準情報の設定
		L_SYS_DT := FCPA_DATE_UTIL.F_GET_TODAY;
		L_BASE_DT := I_BILL_BASE_DT;

		-- 請求予定日基本情報の取得
		SELECT BILL_CL_TYP INTO L_BILL_CL_TYP FROM MAM_BP WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- マニュアル選択請求の場合はNULLを返す
		IF (MAC_BILL_CL_TYP.IS_SEL(L_BILL_CL_TYP) = '1') THEN
			RETURN NULL;
		END IF;

		-- 締日のリストを取得
		L_CL_DAY_LIST := F_GET_CL_DAY_LIST(I_BCST_CD);

		IF L_CL_DAY_LIST.COUNT = 0 THEN
			RETURN NULL;
		END IF;

		-- 締日ごとの処理
		L_LIST_CNT := 1;
		L_CRRYOVR_CNT := NVL(I_BILL_CRRYOVR_TIMES, 0) + 1;
		WHILE TRUE LOOP

			-- リストのサイズを超えたら翌月の１日を基準としてリストの最初から処理
			IF L_CL_DAY_LIST.COUNT < L_LIST_CNT THEN
				L_LIST_CNT := 1;
				L_BASE_DT := ADD_MONTHS(TRUNC(L_BASE_DT, 'MM'), 1);
			END IF;

			L_BILL_CL_DAY := L_CL_DAY_LIST(L_LIST_CNT);

			-- 請求締日が月末の場合、無条件で月末が請求日
			IF (TO_CHAR(LAST_DAY(L_BASE_DT), 'DD') <= L_BILL_CL_DAY) THEN
				L_BILL_DT := LAST_DAY(L_BASE_DT);
				L_CRRYOVR_CNT := L_CRRYOVR_CNT - 1;
			-- 基準日が締まっていない場合、基準日の月の請求締日が請求日
			ELSIF (TO_CHAR(L_BASE_DT, 'DD') <= L_BILL_CL_DAY) THEN
				L_BILL_DT := TO_DATE(TO_CHAR(L_BASE_DT, 'YYYYMM') || LPAD(L_BILL_CL_DAY, 2, '0'), 'YYYYMMDD');
				L_CRRYOVR_CNT := L_CRRYOVR_CNT - 1;
			END IF;

			-- 請求サイトがゼロとなった場合はEXITする
			EXIT WHEN L_CRRYOVR_CNT = 0;

			L_LIST_CNT := L_LIST_CNT + 1;

		END LOOP;

		-- 求まった請求日が過去の場合、運用日付を基準として次回の請求日を求める
		-- （運用日付を基準日として自分自身を呼び出す）
		IF (I_GET_NOT_BILL_DAY_FLG = '1' AND L_BILL_DT < L_SYS_DT) THEN
			L_BASE_DT := L_SYS_DT;
			L_BILL_DT := F_GET_SCHD_BILL_DT(I_BCST_CD, L_BASE_DT, 0, I_GET_NOT_BILL_DAY_FLG);
		END IF;

		RETURN L_BILL_DT;

	END F_GET_SCHD_BILL_DT;

	FUNCTION F_GET_AR_NOT_APPL_BAL (
		I_ACST_CD		IN MAPA_META.BP_CD%TYPE,
		I_IV_NO			IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO		IN MAPA_META.WRK_NO%TYPE,
		I_DPT_CD		IN MAPA_META.DPT_CD%TYPE,
		I_AR_TYP		IN MAPA_META.AR_TYP%TYPE,
		I_AR_CL_YM		IN MAPA_META.YM%TYPE,
		I_MON			IN NUMBER,
		I_BEF_FLG		IN MAPA_META.FLG%TYPE
	)RETURN MAPA_META.MONEY%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			指定した月の売掛金消込残高を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ACST_CD
			売掛先ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_NO
			案件ＮＯ
	<IN>	I_DPT_CD
			債権部門ＣＤ
	<IN>	I_AR_TYP
			債権区分
	<IN>	I_AR_CL_YM
			売掛締年月
	<IN>	I_MON
			締月の翌月 - 指定月の売掛金残高を求める（Oは当月）
	<IN>	I_BEF_FLG
			TRUEの場合、指定月以前の売掛金残高合計を求める
	<RETURNVALUE>
			売掛金消込残高
	**********************************************************/

		L_TGT_MON			MAPA_META.YM%TYPE;
		L_AR_NOT_APPL_BAL	MAPA_META.MONEY%TYPE;
		L_AR_CL_YM			MAPA_META.YM%TYPE;
	BEGIN

		-- 売掛締年月を取得
		L_AR_CL_YM := I_AR_CL_YM;

		-- 対象月の算出
		L_TGT_MON := ADD_MONTHS(L_AR_CL_YM, I_MON * (-1) + 1);

		-- 指定月以前ＦＬＧがTRUEの場合
		IF (I_BEF_FLG = '1') THEN
			SELECT
				NVL(SUM(TA1.AR_NOT_APPL_BAL), 0)
			INTO
				L_AR_NOT_APPL_BAL
			FROM
				MST_MLY_AR_BAL TA1
			WHERE
				0 = 0
				AND	TA1.ACST_CD = I_ACST_CD
				AND	TA1.IV_NO = I_IV_NO
				AND	TA1.TRD_CUR_CD = I_CUR_CD
				AND	(TA1.WRK_NO = I_WRK_NO OR TA1.WRK_NO IS NULL AND I_WRK_NO IS NULL)
				AND	TA1.AR_DPT_CD = I_DPT_CD
				AND TA1.AR_TYP = I_AR_TYP
				AND	TA1.AC_YM <= L_TGT_MON;
		-- 指定月以前ＦＬＧがFALSEの場合
		ELSIF (I_BEF_FLG = '0') THEN
			SELECT
				NVL(SUM(TA1.AR_NOT_APPL_BAL), 0)
			INTO
				L_AR_NOT_APPL_BAL
			FROM
				MST_MLY_AR_BAL TA1
			WHERE	0 = 0
				AND	TA1.ACST_CD = I_ACST_CD
				AND	IV_NO = I_IV_NO
				AND	TA1.TRD_CUR_CD = I_CUR_CD
				AND	(TA1.WRK_NO = I_WRK_NO OR TA1.WRK_NO IS NULL AND I_WRK_NO IS NULL)
				AND	TA1.AR_DPT_CD = I_DPT_CD
				AND TA1.AR_TYP = I_AR_TYP
				AND	TA1.AC_YM = L_TGT_MON;
		END IF;

		RETURN L_AR_NOT_APPL_BAL;

	END F_GET_AR_NOT_APPL_BAL;


	FUNCTION F_GET_BILL_CL_DAY (
		I_BILL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_TYP		IN	MAPA_META.BILL_CL_TYP%TYPE,
		I_BILL_EACH_SLS_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求締日取得ファンクション
	<REMARKS>
			請求年月を加工して請求締日を取得する
	<ARGUMENTS>
		<IN>	I_BILL_YM
				請求年月
		<IN>	I_BILL_CL_TYP
				請求締区分
		<IN>	I_BILL_EACH_SLS_FLG
				都度請求フラグ
	<RETURNVALUE>
			BILL_CL_
			請求予定日
	**********************************************************/
	IS
	BEGIN

		IF (I_BILL_EACH_SLS_FLG = '1') THEN
			RETURN NULL;
		END IF;

		IF (MAC_BILL_CL_TYP.IS_BATCH(I_BILL_CL_TYP) = '1'
			OR MAC_BILL_CL_TYP.IS_MANUAL(I_BILL_CL_TYP) = '1') THEN

			RETURN TO_CHAR(I_BILL_YM, 'DD');
		ELSE
			RETURN NULL;
		END IF;

	END F_GET_BILL_CL_DAY;


	FUNCTION F_GET_LAST_BILL_REC (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MST_BILL%ROWTYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求レコードを取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/
		L_LAST_BILL MST_BILL%ROWTYPE;
	BEGIN
		SELECT
			T1.*
		INTO
			L_LAST_BILL
		FROM
			MST_BILL T1,
			(SELECT
				MAX(BILL_MNG_NO) BILL_MNG_NO
			FROM
				MST_BILL
			WHERE	0 = 0
				AND BCST_CD = I_BCST_CD
				AND BILL_DPT_CD = I_BILL_DPT_CD
				AND IV_NO = I_IV_NO
				AND TRD_CUR_CD = I_CUR_CD
				AND (WRK_NO = I_WRK_NO OR WRK_NO IS NULL AND I_WRK_NO IS NULL)
					AND (MSC_BILL_CL_STS_TYP.CL_SCRN = BILL_CL_STS_TYP
						OR MSC_BILL_CL_STS_TYP.CL_BATCH = BILL_CL_STS_TYP
						)
			) V
		WHERE	0 = 0
			AND V.BILL_MNG_NO = T1.BILL_MNG_NO
			;
			RETURN L_LAST_BILL;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			--無い場合はNULLで返す
			L_LAST_BILL := NULL;
			RETURN L_LAST_BILL;
	END F_GET_LAST_BILL_REC;


	FUNCTION F_GET_LAST_BILL_AMT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.MONEY%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求額を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/
		L_LAST_BILL_AMT MAPA_META.MONEY%TYPE;
		L_LAST_BILL MST_BILL%ROWTYPE;
	BEGIN
		L_LAST_BILL := F_GET_LAST_BILL_REC(I_BCST_CD, I_BILL_DPT_CD, I_IV_NO, I_CUR_CD, I_WRK_NO);
		IF L_LAST_BILL.BILL_AMT IS NULL THEN
			L_LAST_BILL_AMT := NULL;
		ELSE
			--該当のレコードの今回請求額を前回請求額として返す
			L_LAST_BILL_AMT := L_LAST_BILL.BILL_AMT;
		END IF;
		RETURN L_LAST_BILL_AMT;
	END F_GET_LAST_BILL_AMT;


	FUNCTION F_GET_LAST_BILL_CL_DT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.DT%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求締年月日を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/
		L_LAST_BILL_CL_DT MAPA_META.DT%TYPE;
	BEGIN
		SELECT
			T1.BILL_CL_DT
		INTO
			L_LAST_BILL_CL_DT
		FROM
			MST_BILL T1,
			(SELECT
				MAX(BILL_MNG_NO) BILL_MNG_NO
			FROM
				MST_BILL
			WHERE	0 = 0
				AND BCST_CD = I_BCST_CD
				AND IV_NO = I_IV_NO
				AND BILL_DPT_CD = I_BILL_DPT_CD
				AND TRD_CUR_CD = I_CUR_CD
				AND (WRK_NO = I_WRK_NO OR WRK_NO IS NULL AND I_WRK_NO IS NULL)
					AND (MSC_BILL_CL_STS_TYP.CL_SCRN = BILL_CL_STS_TYP
						OR MSC_BILL_CL_STS_TYP.CL_BATCH = BILL_CL_STS_TYP
						)
			) V
		WHERE	0 = 0
			AND V.BILL_MNG_NO = T1.BILL_MNG_NO
			;
		RETURN L_LAST_BILL_CL_DT;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			L_LAST_BILL_CL_DT := NULL;
			RETURN L_LAST_BILL_CL_DT;
	END F_GET_LAST_BILL_CL_DT;


	FUNCTION F_COMBINE_DT(
		I_BASEDATE	IN	MAPA_META.DT%TYPE,
		I_DAY		IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.DT%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			日付算出処理
	<REMARKS>
			基準となる日付に対して入金サイトの加算や日にち指定を行い、
			入金予定日や締日を算出する
	<ARGUMENTS>
	<IN>	I_BASEDATE
			基準日付
	<IN>	I_DAY
			指定の日付('DD'、0:締日なし/99:末日)
	<RETURNVALUE>	算出した日付
	**********************************************************/
		L_DATE	  MAPA_META.DT%TYPE;		-- 戻り値
	BEGIN
		----------------------------------------------------------
		-- 指定の日にち = 0 の場合、NULL を返す
		----------------------------------------------------------
		IF I_BASEDATE IS NULL OR I_DAY IS NULL OR I_DAY = 0 THEN
			RETURN NULL;
		END IF;
		L_DATE := I_BASEDATE;
		----------------------------------------------------------
		-- 月の最大日指定ではない場合
		----------------------------------------------------------
		IF I_DAY != 99 THEN
			-- 月の最大日が基準日付より大きい場合
			IF TO_NUMBER(TO_CHAR(LAST_DAY(L_DATE),'DD')) > I_DAY THEN
				-- (例) L_DATE = 2002/05/01 + (15 - 1) = 2002/05/15
				L_DATE := MAPA_DT.F_TO_YM(L_DATE) + (I_DAY - 1);
			ELSE
			-- 月の最大日が基準日付以下の場合
				L_DATE := LAST_DAY(L_DATE);
			END IF;
		----------------------------------------------------------
		-- 月の最大日指定の場合
		----------------------------------------------------------
		ELSE
			L_DATE := LAST_DAY(L_DATE);
		END IF;
		RETURN L_DATE;
	END F_COMBINE_DT;


	FUNCTION F_GET_BILL_CL_FLG(
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_DT			IN	MAPA_META.DT%TYPE
	)RETURN MAPA_META.FLG%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_DT
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/
		L_BASE_DT		MAPA_META.DT%TYPE;		-- 発行判定基準日
	BEGIN
		--請求起算日がNULLの場合は必ず締対象とする。
		--（消費税差額調整の請求起算日はNULLなので、バッチでの対象選択と、
		--画面でのデフォルトから外れてしまうため）
		IF I_BILL_BASIS_DT IS NULL THEN
			RETURN '1';
		END IF;
		IF I_BILL_CRRYOVR_TIMES = 0 THEN
			L_BASE_DT := I_BILL_BASIS_DT;
		ELSE
			L_BASE_DT := F_GET_SCHD_BILL_DT(I_BCST_CD, I_BILL_BASIS_DT, I_BILL_CRRYOVR_TIMES, '0');
		END IF;

		IF L_BASE_DT <= I_BILL_CL_DT THEN
			RETURN '1';
		END IF;

		RETURN '0';
	END F_GET_BILL_CL_FLG;


	FUNCTION F_GET_BILL_CL_FLG (
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_DAY			IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.FLG%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_YM
			請求締年月
	<IN>	I_BILL_CL_DAY
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/
		L_CL_DT MAPA_META.DT%TYPE;
	BEGIN
		L_CL_DT := F_COMBINE_DT(I_BILL_CL_YM, I_BILL_CL_DAY);
		RETURN F_GET_BILL_CL_FLG(I_BCST_CD, I_BILL_BASIS_DT, I_BILL_CRRYOVR_TIMES, L_CL_DT);
	END F_GET_BILL_CL_FLG;


	FUNCTION F_GET_RCV_SCHD_DT(
		I_BILL_MNG_NO	IN MAPA_META.BILL_MNG_NO%TYPE
			) RETURN MAPA_META.DT%TYPE
	IS
	/*********************************************************
	<SYNOPSIS>
			入金予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_MNG_NO
			請求管理ＮＯ
	<RETURNVALUE>
			入金予定日
	**********************************************************/
	L_RCV_SCHD_DT MAPA_META.DT%TYPE;
	L_CNT_TL		NUMBER(3);
	L_CNT_FT		NUMBER(3);
	L_SYS_DT		MAPA_META.DT%TYPE;

	BEGIN

		-- 引数チェック
		IF I_BILL_MNG_NO IS NULL THEN
			RETURN NULL;
		END IF;


		L_SYS_DT := FCPA_DATE_UTIL.F_GET_TODAY;


		SELECT
			COUNT(T1.RCV_SCHD_DT)
		INTO
			L_CNT_TL
		FROM
			MST_RCV_SCHD T1
		WHERE 0 = 0
		AND T1.BILL_MNG_NO = I_BILL_MNG_NO
		;

		IF L_CNT_TL = 0 THEN
			RETURN NULL
			;
		ELSIF L_CNT_TL = 1 THEN
			SELECT
				T1.RCV_SCHD_DT
			INTO
				L_RCV_SCHD_DT
			FROM
				MST_RCV_SCHD T1
			WHERE 0 = 0
				AND T1.BILL_MNG_NO = I_BILL_MNG_NO
			;
		ELSIF L_CNT_TL > 0 THEN
			SELECT
				COUNT(T1.RCV_SCHD_DT)
			INTO
				L_CNT_FT
			FROM
				MST_RCV_SCHD T1
			WHERE 0 = 0
				AND T1.BILL_MNG_NO = I_BILL_MNG_NO
				AND T1.RCV_SCHD_DT > L_SYS_DT
			;
			IF L_CNT_FT > 0 THEN 
				SELECT
					MIN(T1.RCV_SCHD_DT)
				INTO
					L_RCV_SCHD_DT
				FROM
					MST_RCV_SCHD T1
				WHERE 0 = 0
					AND T1.BILL_MNG_NO = I_BILL_MNG_NO
					AND T1.RCV_SCHD_DT > L_SYS_DT
				;
			ELSE 
				SELECT
					MAX(T1.RCV_SCHD_DT)
				INTO
					L_RCV_SCHD_DT
				FROM
					MST_RCV_SCHD T1
				WHERE 0 = 0
					AND T1.BILL_MNG_NO = I_BILL_MNG_NO
				;
			END IF;
		END IF;

		RETURN L_RCV_SCHD_DT;

	END F_GET_RCV_SCHD_DT;


	FUNCTION F_GET_BCST_DPT (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを取得して返却する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/
	IS
		L_BILL_DPT_TYP	MAPA_META.BILL_DPT_TYP%TYPE;
		L_BASE_DT		MAPA_META.DT%TYPE;
	BEGIN
		
		L_BASE_DT := I_BASE_DT;
		
		SELECT
			BILL_DPT_TYP
		INTO
			L_BILL_DPT_TYP
		FROM
			MAM_BP
		WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- 「1：売上部門」
		IF MAC_BILL_DPT_TYP.IS_SLS(L_BILL_DPT_TYP) = '1' THEN
			RETURN I_SLS_DPT_CD;
		-- 「2：債権部門」
		ELSIF MAC_BILL_DPT_TYP.IS_AR(L_BILL_DPT_TYP) = '1' THEN
			RETURN I_AR_DPT_CD;
		-- 「3：請求部門」
		ELSE
			RETURN MAPA_BP.F_GET_BCST_DPT_CD(I_BCST_CD, L_BASE_DT) ;
		END IF;
	END F_GET_BCST_DPT;


	FUNCTION F_GET_BCST_DPT_NE (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを取得して返却する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/
	IS
		L_BILL_DPT_TYP	MAPA_META.BILL_DPT_TYP%TYPE;
		L_BASE_DT		MAPA_META.DT%TYPE;
	BEGIN
		
		L_BASE_DT := I_BASE_DT;
		
		SELECT
			BILL_DPT_TYP
		INTO
			L_BILL_DPT_TYP
		FROM
			MAM_BP
		WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- 「1：売上部門」
		IF MAC_BILL_DPT_TYP.IS_SLS(L_BILL_DPT_TYP) = '1' THEN
			RETURN I_SLS_DPT_CD;
		-- 「2：債権部門」
		ELSIF MAC_BILL_DPT_TYP.IS_AR(L_BILL_DPT_TYP) = '1' THEN
			RETURN I_AR_DPT_CD;
		-- 「3：請求部門」
		ELSE
			RETURN MAPA_BP.F_GET_BCST_DPT_CD_NE(I_BCST_CD, L_BASE_DT) ;
		END IF;
	
	END F_GET_BCST_DPT_NE;

	FUNCTION F_GET_MAX_RCV_CRRYOVR_MONS (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求先の最大の締日に対応した入金サイトを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<ReturnValue>
			最大の締日に対応した入金サイト
	**********************************************************/
	IS

		-- 入金サイト１取得用
		CURSOR RCV_CRRYOVR_MONS1 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_CRRYOVR_MONS1
			FROM
			(
			SELECT RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS1 DESC, STTL_CD ;

		-- 入金サイト２取得用
		CURSOR RCV_CRRYOVR_MONS2 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_CRRYOVR_MONS2
			FROM
			(
			SELECT RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS2 DESC, STTL_CD ;

		-- 入金サイト３取得用
		CURSOR RCV_CRRYOVR_MONS3 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_CRRYOVR_MONS3
			FROM
			(
			SELECT RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS3 DESC, STTL_CD ;

		-- 入金サイト４取得用
		CURSOR RCV_CRRYOVR_MONS4 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_CRRYOVR_MONS4
			FROM
			(
			SELECT RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS4 DESC, STTL_CD ;

		-- 入金サイト５取得用
		CURSOR RCV_CRRYOVR_MONS5 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_CRRYOVR_MONS5
			FROM
			(
			SELECT RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS5 DESC, STTL_CD ;

		L_REC_BCST		MAM_BP%ROWTYPE ;
		L_MAX_CL_DAY		MAPA_META.CL_DAY%TYPE ;
		L_MAX_CRRYOVR_MONS	MAPA_META.CRRYOVR_MONS%TYPE ;

	BEGIN

		-- 入金予定日基本情報の取得
		SELECT * INTO L_REC_BCST FROM MAM_BP WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- 最大の締日を取得
		L_MAX_CL_DAY := F_GET_MAX_CL_DAY(I_BCST_CD);

		L_MAX_CRRYOVR_MONS := NULL;

		-- 締日の指定が無い場合は固定で入金サイト１を設定する
		IF L_MAX_CL_DAY IS NULL THEN
			FOR x IN RCV_CRRYOVR_MONS1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
				L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS1;
				EXIT;
			END LOOP;
		ELSE
			IF (L_REC_BCST.BILL_CL_DAY1 = L_MAX_CL_DAY) THEN
				-- 入金サイト１
				FOR x IN RCV_CRRYOVR_MONS1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS1;
					EXIT;
				END LOOP;

			ELSIF (L_REC_BCST.BILL_CL_DAY2 = L_MAX_CL_DAY) THEN
				-- 入金サイト２
				FOR x IN RCV_CRRYOVR_MONS2(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS2;
					EXIT;
				END LOOP;

			ELSIF (L_REC_BCST.BILL_CL_DAY3 = L_MAX_CL_DAY) THEN
				-- 入金サイト３
				FOR x IN RCV_CRRYOVR_MONS3(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS3;
					EXIT;
				END LOOP;

			ELSIF (L_REC_BCST.BILL_CL_DAY4 = L_MAX_CL_DAY) THEN
				-- 入金サイト４
				FOR x IN RCV_CRRYOVR_MONS4(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS4;
					EXIT;
				END LOOP;

			ELSIF (L_REC_BCST.BILL_CL_DAY5 = L_MAX_CL_DAY) THEN
				-- 入金サイト５
				FOR x IN RCV_CRRYOVR_MONS5(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_CRRYOVR_MONS := x.RCV_CRRYOVR_MONS5;
					EXIT;
				END LOOP;
			END IF;
		END IF;

		RETURN L_MAX_CRRYOVR_MONS;
	END F_GET_MAX_RCV_CRRYOVR_MONS;

	FUNCTION F_GET_MAX_RCV_DAY (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.RCV_DAY%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求先の最大の締日に対応した入金日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<ReturnValue>
			最大の締日に対応した入金日
	**********************************************************/
	IS
		-- 入金予定日１取得用
		CURSOR RCV_DAY1 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_DAY1
			FROM
			(
			SELECT RCV_DAY1, RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY1, RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY1, RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY1, RCV_CRRYOVR_MONS1, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS1 DESC, STTL_CD ;

		-- 入金予定日２取得用
		CURSOR RCV_DAY2 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_DAY2
			FROM
			(
			SELECT RCV_DAY2, RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY2, RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY2, RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY2, RCV_CRRYOVR_MONS2, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS2 DESC, STTL_CD ;

		-- 入金予定日３取得用
		CURSOR RCV_DAY3 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_DAY3
			FROM
			(
			SELECT RCV_DAY3, RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY3, RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY3, RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY3, RCV_CRRYOVR_MONS3, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS3 DESC ,STTL_CD ;

		-- 入金予定日４取得用
		CURSOR RCV_DAY4 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_DAY4
			FROM
			(
			SELECT RCV_DAY4, RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY4, RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY4, RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY4, RCV_CRRYOVR_MONS4, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS4 DESC, STTL_CD ;

		-- 入金予定日５取得用
		CURSOR RCV_DAY5 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.RCV_DAY5
			FROM
			(
			SELECT RCV_DAY5, RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY5, RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY5, RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT RCV_DAY5, RCV_CRRYOVR_MONS5, CRRYOVR_MONS_TYP, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS5 DESC, STTL_CD ;

		L_REC_BCST		MAM_BP%ROWTYPE;
		L_MAX_CL_DAY	MAPA_META.CL_DAY%TYPE;
		L_MAX_RCV_DAY	MAPA_META.RCV_DAY%TYPE;
	BEGIN

		-- 入金予定日基本情報の取得
		SELECT * INTO L_REC_BCST FROM MAM_BP WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- 最大の締日を取得
		L_MAX_CL_DAY := F_GET_MAX_CL_DAY(I_BCST_CD);

		L_MAX_RCV_DAY := NULL;

		-- 締日の指定が無い場合は固定で入金予定日１を設定する
		IF L_MAX_CL_DAY IS NULL THEN
			FOR x IN RCV_DAY1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
				L_MAX_RCV_DAY := x.RCV_DAY1;
				EXIT;
			END LOOP;

		-- 請求締日に対応した入金予定日を設定する
		ELSE

			IF (L_REC_BCST.BILL_CL_DAY1 = L_MAX_CL_DAY) THEN
				-- 入金予定日１
				FOR x IN RCV_DAY1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_RCV_DAY := x.RCV_DAY1;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY2 = L_MAX_CL_DAY) THEN
				-- 入金予定日２
				FOR x IN RCV_DAY2(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_RCV_DAY := x.RCV_DAY2;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY3 = L_MAX_CL_DAY) THEN
				-- 入金予定日３
				FOR x IN RCV_DAY3(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_RCV_DAY := x.RCV_DAY3;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY4 = L_MAX_CL_DAY) THEN
				-- 入金予定日４
				FOR x IN RCV_DAY4(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_RCV_DAY := x.RCV_DAY4;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY5 = L_MAX_CL_DAY) THEN
				-- 入金予定日５
				FOR x IN RCV_DAY5(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_MAX_RCV_DAY := x.RCV_DAY5;
					EXIT;
				END LOOP;
			END IF;
		END IF;

		RETURN L_MAX_RCV_DAY;

	END F_GET_MAX_RCV_DAY;


	FUNCTION F_GET_CRRYOVR_MONS_TYP (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS_TYP%TYPE
	/*********************************************************
	<SYNOPSIS>
			請求先のサイト区分を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<ReturnValue>
			請求先のサイト区分
	**********************************************************/
	IS

		-- サイト区分取得用１
		CURSOR CRRYOVR_MONS_TYP1 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.CRRYOVR_MONS_TYP
			FROM
			(
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS1, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS1, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS1, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS1, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS1 DESC, STTL_CD;

		-- サイト区分取得用２
		CURSOR CRRYOVR_MONS_TYP2 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.CRRYOVR_MONS_TYP
			FROM
			(
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS2, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS2, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS2, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS2, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS2 DESC, STTL_CD;

		-- サイト区分取得用３
		CURSOR CRRYOVR_MONS_TYP3 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.CRRYOVR_MONS_TYP
			FROM
			(
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS3, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS3, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS3, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS3, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS3 DESC, STTL_CD;

		-- サイト区分取得用４
		CURSOR CRRYOVR_MONS_TYP4 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.CRRYOVR_MONS_TYP
			FROM
			(
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS4, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS4, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS4, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS4, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS4 DESC, STTL_CD;

		-- サイト区分取得用５
		CURSOR CRRYOVR_MONS_TYP5 (
			I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
			I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
			I_WG_CD		IN MAPA_META.WG_CD%TYPE,
			I_AMT		IN MAPA_META.MONEY%TYPE
		)
		IS
			SELECT p.CRRYOVR_MONS_TYP
			FROM
			(
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS5, STTL_CD, 1 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS5, STTL_CD, 2 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = I_BCST_CD
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = I_BCST_CD
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS5, STTL_CD, 3 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MAX(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND MIN_AMT <= I_AMT
				   AND DEL_FLG = '0')
			UNION ALL
			SELECT CRRYOVR_MONS_TYP, RCV_CRRYOVR_MONS5, STTL_CD, 4 PRIO
			  FROM MAM_RCV_SCHD_CTL
			 WHERE 0=0
			   AND BCST_CD = MAC_STR.NULL_VAL
			   AND CUR_CD = I_CUR_CD
			   AND WG_CD = I_WG_CD
			   AND DEL_FLG = '0'
			   AND MIN_AMT = (
				SELECT MIN(MIN_AMT)
				  FROM MAM_RCV_SCHD_CTL
				 WHERE 0=0
				   AND BCST_CD = MAC_STR.NULL_VAL
				   AND CUR_CD = I_CUR_CD
				   AND WG_CD = I_WG_CD
				   AND DEL_FLG = '0')
			) p
			WHERE 0=0
			ORDER BY p.PRIO, p.CRRYOVR_MONS_TYP, p.RCV_CRRYOVR_MONS5 DESC, STTL_CD;

		L_REC_BCST		MAM_BP%ROWTYPE;
		L_MAX_CL_DAY		MAPA_META.CL_DAY%TYPE;
		L_CRRYOVR_MONS_TYP	MAPA_META.CRRYOVR_MONS_TYP%TYPE;
	BEGIN

		-- 入金予定日基本情報の取得
		SELECT * INTO L_REC_BCST FROM MAM_BP WHERE 0 = 0
			AND BP_CD = I_BCST_CD
			;

		-- 最大の締日を取得
		L_MAX_CL_DAY := F_GET_MAX_CL_DAY(I_BCST_CD);

		L_CRRYOVR_MONS_TYP := NULL;

		-- 締日の指定が無い場合は入金サイト１が最大のサイト区分を設定する
		IF L_MAX_CL_DAY IS NULL THEN
			FOR x IN CRRYOVR_MONS_TYP1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
				L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
				EXIT;
			END LOOP;

		-- 請求締日に対応したサイト区分を設定する
		ELSE

			IF (L_REC_BCST.BILL_CL_DAY1 = L_MAX_CL_DAY) THEN
				-- 入金サイト１が最大のサイト区分
				FOR x IN CRRYOVR_MONS_TYP1(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY2 = L_MAX_CL_DAY) THEN
				-- 入金サイト２が最大のサイト区分
				FOR x IN CRRYOVR_MONS_TYP2(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY3 = L_MAX_CL_DAY) THEN
				-- 入金サイト３が最大のサイト区分
				FOR x IN CRRYOVR_MONS_TYP3(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY4 = L_MAX_CL_DAY) THEN
				-- 入金サイト４が最大のサイト区分
				FOR x IN CRRYOVR_MONS_TYP4(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
					EXIT;
				END LOOP;
			ELSIF (L_REC_BCST.BILL_CL_DAY5 = L_MAX_CL_DAY) THEN
				-- 入金サイト５が最大のサイト区分
				FOR x IN CRRYOVR_MONS_TYP5(I_BCST_CD, I_CUR_CD, I_WG_CD, I_AMT) LOOP
					L_CRRYOVR_MONS_TYP := x.CRRYOVR_MONS_TYP;
					EXIT;
				END LOOP;
			END IF;
		END IF;

		RETURN L_CRRYOVR_MONS_TYP;

	END F_GET_CRRYOVR_MONS_TYP;

	FUNCTION F_GET_ORG_BILL_D_NO (
		I_BILL_D_NO	IN MAPA_META.BILL_D_NO%TYPE
	) RETURN MAPA_META.BILL_D_NO%TYPE
	/*********************************************************
	<SYNOPSIS>
			引数の請求明細ＮＯをもとにオリジナルの
			請求明細ＮＯを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_D_NO
				請求明細ＮＯ
	<ReturnValue>
			オリジナルの請求明細ＮＯ
	**********************************************************/
	IS
		L_SRC_BILL_D_NO		MAPA_META.BILL_D_NO%TYPE;
		L_BILL_D_NO			MAPA_META.BILL_D_NO%TYPE;
	BEGIN
		L_BILL_D_NO := I_BILL_D_NO;

		LOOP
			-- 繰越元請求明細ＮＯが設定されていない請求明細を探す
			BEGIN
				SELECT CRRYOVR_SRC_BILL_D_NO
				INTO L_SRC_BILL_D_NO
				FROM MST_BILL_D
				WHERE BILL_D_NO = L_BILL_D_NO;
			EXCEPTION
			WHEN NO_DATA_FOUND THEN
				L_SRC_BILL_D_NO := NULL;
			END;

			IF L_SRC_BILL_D_NO IS NULL THEN
				EXIT ;
			ELSE
				L_BILL_D_NO := L_SRC_BILL_D_NO;
			END IF;
		END LOOP;

		RETURN L_BILL_D_NO;

	END F_GET_ORG_BILL_D_NO;

	FUNCTION F_GET_AC_YM (
		I_AC_DT			IN	MAPA_META.DT%TYPE,
		I_CL_DAY		IN	MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE		IN	MAPA_META.CL_MON_BASE%TYPE
	) RETURN MAPA_META.YM%TYPE
	/*********************************************************
	<SYNOPSIS>
			計上年月を取得する
	<REMARKS>
	<IN>	I_AC_DT
			計上日
	<IN>	I_CL_DAY
			締日
	<IN>	I_CL_MON_BASE
			締月度基準
	<RETURNVALUE>
			計上年月
	<HISTORY>
	**********************************************************/
	IS
		L_ACT_YM		MAPA_META.YM%TYPE;
		L_TMP_YM		MAPA_META.YM%TYPE;
	BEGIN

		-- 1. 締月度基準を考慮しないで仮の締年月を求める

		-- 締日よりも後の日付の場合は翌月
		IF LPAD(I_CL_DAY, 2, '0') < TO_CHAR(I_AC_DT, 'DD') THEN
			L_TMP_YM := ADD_MONTHS(TRUNC(I_AC_DT, 'MM'), 1);
		-- 締日よりも以前の日付の場合は当月
		ELSE
			L_TMP_YM := TRUNC(I_AC_DT, 'MM');
		END IF;

		-- 2. 求めた締年月を締月度基準を加味した実際の締年月に変換する
		L_ACT_YM := ADD_MONTHS(L_TMP_YM, I_CL_MON_BASE);

		RETURN L_ACT_YM;

	END F_GET_AC_YM;

	FUNCTION F_GET_AC_YM_NE (
		I_AC_DT		IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.YM%TYPE
	/*********************************************************
	<SYNOPSIS>
			引数の計上日が本来属する計上年月を取得する
			計上年月が締まっていてもエラーにならない
	<REMARKS>
	<IN>	I_AC_DT
			計上日
	<RETURNVALUE>
			計上年月
	<HISTORY>
	**********************************************************/
	IS
		L_REC_CO		MAM_CO%ROWTYPE;
	BEGIN

		-- 自社情報の取得
		L_REC_CO := MAPA_CO.F_GET_CO_REC;

		-- 計上日が属する計上年月の取得
		RETURN F_GET_AC_YM(I_AC_DT, L_REC_CO.AC_CL_DAY, L_REC_CO.AC_CL_MON_BASE);

	END F_GET_AC_YM_NE;
	
	FUNCTION F_GET_AMT_DISP_PM (
		I_TRD_PTN_TYP	IN	MAPA_META.TRD_PTN_TYP%TYPE,
		I_DSCNT_ITM_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN NUMBER
	/*********************************************************
	<SYNOPSIS>
			MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目を加味した結果を取得します。
	<REMARKS>
	<IN>	I_TRD_PTN_TYP
			取引区分
	<IN>	I_DSCNT_ITM_FLG
			値引品フラグ
	<RETURNVALUE>
			1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	<HISTORY>
	**********************************************************/
	IS
		L_PM		NUMBER(3);
	BEGIN

		L_PM := MAC_TRD_PTN_TYP.AMT_DISP_PM(I_TRD_PTN_TYP);

		IF (I_DSCNT_ITM_FLG = '1' AND 
		(MAC_TRD_PTN_TYP.SLS = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.SLS_CNSGN = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.SLS_RTN = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PURC = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PURC_VMI = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PURC_XPNS = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PURC_RTN = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PURC_RTN_XPNS = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.SHIP = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.SHIP_RTN = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PROV = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.PROV_RTN = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.ARR = I_TRD_PTN_TYP
		 OR MAC_TRD_PTN_TYP.ARR_RTN = I_TRD_PTN_TYP) ) THEN
			L_PM := L_PM * (-1);
		END IF;

		RETURN L_PM;

	END F_GET_AMT_DISP_PM;

END MSPA_AR_UTIL;

/
show errors;


