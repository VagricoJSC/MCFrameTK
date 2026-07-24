CREATE OR REPLACE PACKAGE MAPA_NUM

/**************************************************************************
<SYNOPSIS>
		アプリ共通発番ロジック
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

	G_SEQ_PREFIX	CONSTANT VARCHAR2(12) := 'MAS_ORA_SEQ_' ;
	MONTH_INDX_M	CONSTANT VARCHAR2(12) := '123456789ABC' ;
	MONTH_INDX_MA	CONSTANT VARCHAR2(12) := 'ABCDEFGHIJKL' ;

-- 発番用レコード型の宣言 (テーブル・ファンクションの行の型) 
TYPE SEQ_ROW IS RECORD (
	SEQ NUMBER(22)
);
-- 発番用レコード型のコレクションの型
TYPE SEQ_LIST IS TABLE OF SEQ_ROW ;

FUNCTION F_GET_SEQ_LIST (
	I_ORA_SEQ_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
	I_CNT		IN NUMBER
)
RETURN SEQ_LIST PIPELINED;
/**************************************************************************
<SYNOPSIS>
	指定されたオラクルシーケンスを指定された数分発番する
<REMARKS>
	テーブル・ファンクション
<ARGUMENTS>
<IN>	I_ORA_SEQ_NM
		オラクルシーケンス名
<IN>	I_CNT
		シーケンスを発番する数
<RETURNVALUE>
		発番した番号（数値）のコレクション
<HISTORY>
**************************************************************************/


FUNCTION F_GET_NEW_ORA_SEQ_NM
RETURN VARCHAR2 ;
/**************************************************************************
<SYNOPSIS>
	オラクルシーケンスに使う名称を新規作成する
<REMARKS>
<ARGUMENTS>
<RETURN VALUE>
	オラクルシーケンス名
<HISTORY>
**************************************************************************/


PROCEDURE P_GET(
	I_BIZ_TYP	IN MAPA_META.NUM_BIZ_TYP%TYPE,
	I_REC_NUM_ARG	IN MAW_NUM_ARG%ROWTYPE,
	O_RET		OUT MAPA_META.NUMBERING%TYPE
);
/**************************************************************************
<SYNOPSIS>
	発番マスタの設定に従った番号（文字列）を取得する。
<REMARKS>

<ARGUMENTS>
<IN>	I_BIZ_TYP
		発番業務区分
<IN>	I_REC_NUM_ARG
		発番用引数
<OUT>	O_RET
		発番結果
<HISTORY>
**************************************************************************/

PROCEDURE P_GET_BY_PTN(
	I_BIZ_TYP	IN MAPA_META.NUM_BIZ_TYP%TYPE,
	I_PTN_CD	IN MAPA_META.NUM_PTN_CD%TYPE ,
	I_REC_NUM_ARG	IN MAW_NUM_ARG%ROWTYPE ,
	O_RET		OUT MAPA_META.NUMBERING%TYPE
);
/**************************************************************************
<SYNOPSIS>
	発番パタンに対応した、発番マスタの設定に従った番号（文字列）を取得する。
<REMARKS>
	アプリ設計上、発番パタンを使わない場合は、P_GETを使用してください。
<ARGUMENTS>
<IN>	I_BIZ_TYP
		発番業務区分
<IN>	I_PTN_CD
		発番パタンＣＤ
<IN>	I_REC_NUM_ARG
		発番用引数
<OUT>	O_RET
		発番結果
<HISTORY>
**************************************************************************/

PROCEDURE P_SET_BY_PTN(
	I_BIZ_TYP	IN MAPA_META.NUM_BIZ_TYP%TYPE
);
/**************************************************************************
<SYNOPSIS>
	発番パタンＣＤに対応した発番パタンマスタの設定に従った番号（文字列）を取得する。
	一括発番用。
<REMARKS>
	ワークテーブル（MAW_NUM_ARG）を参照してpeg_no順に発番し、
	発番した番号をnew_noに格納する。
<ARGUMENTS>
<IN>	I_BIZ_TYP
		発番業務区分
<HISTORY>
**************************************************************************/

FUNCTION F_GET_SEQ(
	I_ORA_SEQ_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
)RETURN NUMBER;
/**************************************************************************
<SYNOPSIS>
	指定されたオラクルシーケンスのNEXTVALを返します。
<REMARKS>
	NUMBERING系の発番処理とは異なり、直接シーケンスの値を返す処理。
	よって、NUMBERING系の処理とは、この処理は共有しない。
	シーケンスが無かったら作るなどのカスタマイズを入れる事ができる。
<ARGUMENTS>
<IN>	I_ORA_SEQ_NM
		オラクルシーケンス名
<RETURNVALUE>
	発番した番号（数値）
<HISTORY>
**************************************************************************/

PROCEDURE P_DEL_NUM_PTN (
	I_CO_CD	IN MAPA_META.CO_CD%TYPE
);
/**************************************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
<REMARKS>
<ARGUMENTS>
<IN>	I_CO_CD
		会社ＣＤ
<HISTORY>
**************************************************************************/

PROCEDURE P_INIT_NUM_PTN (
	I_CO_CD	IN MAPA_META.CO_CD%TYPE
);
/**************************************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLに引数の会社ＣＤの初期データを作成する。
<REMARKS>
<ARGUMENTS>
<IN>	I_CO_CD
		会社ＣＤ
<HISTORY>
**************************************************************************/
PROCEDURE P_INS_NUM_PTN (
	I_CO_CD	IN	MAPA_META.CO_CD%TYPE
) ;
/*********************************************************
<SYNOPSIS>
	MAM_NUM_PTN_ALL、MAM_NUM_PTN_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
<ARGUMENTS>
<ITEM>	I_CO_CD
		会社ＣＤ
<HISTORY>
**********************************************************/

END MAPA_NUM;
/
