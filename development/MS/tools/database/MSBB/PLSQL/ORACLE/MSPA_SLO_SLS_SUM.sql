CREATE OR REPLACE PACKAGE MSPA_SLO_SLS_SUM
IS

	G_DPT_LVL_CD			MAPA_META.DPT_LVL_CD%TYPE ;
	G_USE_ACT_XRATE_FLG		MAPA_META.FLG%TYPE ;
	G_SLS_BDG_GRP			MSPA_META.SLS_BDG_GRP%TYPE ;
	G_CL_DAY				MAPA_META.CL_DAY%TYPE ;
	G_CL_MON_BASE			MAPA_META.CL_MON_BASE%TYPE ;
	G_BASE_CUR_CD			MAPA_META.CUR_CD%TYPE ;
	G_XRATE_CD				MAPA_META.XRATE_CD%TYPE ;
	G_GM_STD_UPRI_SEL_TYP	MAPA_META.STD_UPRI_SEL_TYP%TYPE ;
	G_BASE_CUR_AMT_DEC_PLACE	MAPA_META.DEC_PLACE%TYPE ;

	PROCEDURE P_SLS_SUM_DPT_MAIN (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_DPT_LVL_CD		IN MAPA_META.DPT_LVL_CD%TYPE,
		I_USE_ACT_XRATE_FLG	IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP		IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD			IN MAPA_META.XRATE_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より部門別用の売上集計受注ワークを作成するメイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された部門階層の部門ＣＤを、レベル１として、
		売上集計部門階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_LVL_CD
			部門階層ＣＤ
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_DPT_LVL (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_DPT_CD			IN MAPA_META.DPT_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_DPT_CD
			部門ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_DPT_LVL (
		I_LVL				IN NUMBER,
		I_BASE_YM			IN MAPA_META.YM%TYPE,
		I_BASE_DT			IN MAPA_META.DT%TYPE,
		I_CRNT_DPT_CD		IN MAPA_META.DPT_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計部門階層ワークの売上部門ＣＤをもとに、下位階層の
		部門ＣＤを取得し、売上集計部門階層ワークに登録する。
		最下層の部門ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_BASE_YM
			基準月
	<IN>
		I_BASE_DT
			基準日
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/

	PROCEDURE P_INS_SLO_BL_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。部門については、部門変換マスタで最新の部門に変換する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/

	PROCEDURE P_INS_SLS_BDG_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SPLN_SUM_DPT (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから部門をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_SLS_SUM_IG_MAIN (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE,
		I_SLS_ITM_GRP_LVL	IN MAPA_META.INT4%TYPE,
		I_USE_ACT_XRATE_FLG	IN MAPA_META.FLG%TYPE,
		I_SLS_BDG_GRP		IN MSPA_META.SLS_BDG_GRP%TYPE,
		I_XRATE_CD			IN MAPA_META.XRATE_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間より品目体系別用の売上集計受注ワークを作成する
		メイン処理
	<REMARKS>
		呼び出し元の処理にて、画面で指定された品目階層の品目階層ＣＤを、
		レベル１として売上集計品目体系階層ワークに登録しておく必要がある。
	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<IN>
		I_SLS_ITM_GRP_LVL
			品目体系階層
	<IN>
		I_USE_ACT_XRATE_FLG
			実績を売上時レートで換算
	<IN>
		I_SLS_BDG_GRP
			予算分類
	<IN>
		I_XRATE_CD
			為替レートＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_IG_LVL (
		I_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定年月、売上表示期間、部門ＣＤを条件に売上集計部門階層ワークを作成する
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_SLS_ITM_GRP_CD
			品目体系ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_IG_LVL (
		I_LVL					IN NUMBER,
		I_CRNT_SLS_ITM_GRP_CD	IN MAPA_META.SLS_ITM_GRP_CD%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		指定レベルの売上集計品目体系階層ワークの品目体系ＣＤをもとに、下位階層の
		品目体系ＣＤを取得し、売上集計品目体系階層ワークに登録する。
		最下層の品目体系ＣＤまで同じ処理を繰り返し行う。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_LVL
			レベル
	<IN>
		I_CRNT_SLS_ITM_GRP_CD
			指定階層品目体系ＣＤ
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		受注集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLO_BL_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		売上予定テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SLS_BDG_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売予算テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


	PROCEDURE P_INS_SPLN_SUM_ITM_GRP (
		I_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DISP_TERM		IN MAPA_META.INT%TYPE
	) ;
	/**************************************************************************
	<SYNOPSIS>
		販売計画集計テーブルから品目体系をキーとした情報を取得し、売上集計受注ワークに
		登録する。
	<REMARKS>

	<ARGUMENTS>
	<IN>
		I_YM
			指定年月
	<IN>
		I_SLS_DISP_TERM
			売上表示期間
	<HISTORY>
	**************************************************************************/


END MSPA_SLO_SLS_SUM;
/
