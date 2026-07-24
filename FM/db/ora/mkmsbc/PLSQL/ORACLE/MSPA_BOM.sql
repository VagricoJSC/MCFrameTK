CREATE OR REPLACE PACKAGE MSPA_BOM
/*********************************************************
<SYNOPSIS>
		構成関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_BOM_EXP ;
	/*********************************************************
	<SYNOPSIS>
		オーダ展開結果を一時表（MSW_BOM_EX_RSLT）に格納する
	<REMARKS>
		事前に展開元オーダ情報をＢＯＭ展開情報ワーク（MSW_BOM_EX）に作成する必要がある
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/ 

	PROCEDURE P_BOM_EXP_NO_RECURSIVE ;
	/*********************************************************
	<SYNOPSIS>
		オーダ展開結果を一時表（MSW_BOM_EX_RSLT）に格納する
		ファントム品の展開処理をP_EX_PHで行うのではなく、カーソルFORループにて展開する
	<REMARKS>
		事前に展開元オーダ情報をＢＯＭ展開情報ワーク（MSW_BOM_EX）に作成する必要がある
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/ 

END  MSPA_BOM;
/
