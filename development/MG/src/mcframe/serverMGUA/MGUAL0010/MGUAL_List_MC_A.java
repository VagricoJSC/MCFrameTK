
package mcframe.serverMGUA.MGUAL0010;
import mcframe.commonCore.container.*;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;


//LOGIC_SETTING_IMPORT (START)
import mcframe.serverMG.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
//LOGIC_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MGUAL_List_MC_A extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/** 
	  * CalcMenu:原価計算メニュー<p>
	  * 引数の計算グループに対応する原価メニューのリストを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcMenu(MCRow row) {
		MCList<MAM_CALC_MENU_R> rslt = MCList.create(MAM_CALC_MENU_R.class);
		MAM_CALC_MENU_R dbc = MAM_CALC_MENU_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcMenu_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CalcMenu");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CalcMenu").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcMenu_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CalcMenu");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcMenu_SubColumns(row, down);
	}
	/** 
	  * CalcMenu:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcMenu_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_MENU_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcMenuCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcMenu:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcMenu_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_MENU_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcMenu:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcMenu_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcMenu_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcMenuCols.outAll());
	}


	/** 
	  * ItmOperPtn:原価品目工程パタン<p>
	  * 以下の引数に対応する工程パタンを、原価品目工程情報テーブルから取得する<br>
　期、品目<br>
・原価品目工程情報のワーキンググループで絞り込む場合は、wg_cdにワーキンググループを指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmOperPtn(MCRow row) {
		MCList<MGT_ITM_OPER_R> rslt = MCList.create(MGT_ITM_OPER_R.class);
		MGT_ITM_OPER_R dbc = MGT_ITM_OPER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmOperPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.ItmOperPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.ItmOperPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmOperPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.ItmOperPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmOperPtn_SubColumns(row, down);
	}
	/** 
	  * ItmOperPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmOperPtn_Set(MCRow row, MCQueryApiBuilder builder, MGT_ITM_OPER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmOperPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmOperPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmOperPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGT_ITM_OPER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmOperPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmOperPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmOperPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmOperPtnCols.outAll());
	}


	/** 
	  * BomPtn:原価構成パタン<p>
	  * 原価ＢＯＭ情報テーブルから構成パタンを取得する<br>
・品目に対応する構成パタンを取得する場合は、以下の指定をする<br>
　　親品目の場合：par_itm_flgに「true」を指定し、itm_cdに品目を指定する<br>
　　子品目の場合：chd_itm_flgに「true」を指定し、itm_cdに品目を指定する<br>
　　いずれの場合もitm_sub1－3に枝番１－３を指定できる
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBomPtn(MCRow row) {
		MCList<MGT_BOM_R> rslt = MCList.create(MGT_BOM_R.class);
		MGT_BOM_R dbc = MGT_BOM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBomPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.BomPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.BomPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBomPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.BomPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBomPtn_SubColumns(row, down);
	}
	/** 
	  * BomPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MGT_BOM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BomPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BomPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBomPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGT_BOM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BomPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBomPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBomPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BomPtnCols.outAll());
	}


	/** 
	  * CalcParm:原価計算パラメータ<p>
	  * 原価計算パラメータ情報テーブルから、ログイン中のロケールに対応するパラメータを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcParm(MCRow row) {
		MCList<MGC_PARM_REMARK_R> rslt = MCList.create(MGC_PARM_REMARK_R.class);
		MGC_PARM_REMARK_R dbc = MGC_PARM_REMARK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcParm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CalcParm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CalcParm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcParm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CalcParm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcParm_SubColumns(row, down);
	}
	/** 
	  * CalcParm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcParm_Set(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcParmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcParm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcParm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcParm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcParm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcParm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcParmCols.outAll());
	}


	/** 
	  * BizGrp:原価業務分類<p>
	  * 原価計算パラメータ概要テーブルから、ログイン中のロケールの業務分類を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBizGrp(MCRow row) {
		MCList<MGC_PARM_REMARK_R> rslt = MCList.create(MGC_PARM_REMARK_R.class);
		MGC_PARM_REMARK_R dbc = MGC_PARM_REMARK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBizGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.BizGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.BizGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBizGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.BizGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBizGrp_SubColumns(row, down);
	}
	/** 
	  * BizGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBizGrp_Set(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BizGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BizGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBizGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGC_PARM_REMARK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BizGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBizGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBizGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BizGrpCols.outAll());
	}


	/** 
	  * StkEvalWithUpriSetTypIsNotNull:在庫評価（単価設定）<p>
	  * 在庫評価マスタから、単価設定区分を設定している在庫評価ＣＤを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkEvalWithUpriSetTypIsNotNull(MCRow row) {
		MCList<MAM_STK_EVAL_R> rslt = MCList.create(MAM_STK_EVAL_R.class);
		MAM_STK_EVAL_R dbc = MAM_STK_EVAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkEvalWithUpriSetTypIsNotNull_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.StkEvalWithUpriSetTypIsNotNull");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.StkEvalWithUpriSetTypIsNotNull").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkEvalWithUpriSetTypIsNotNull_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.StkEvalWithUpriSetTypIsNotNull");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkEvalWithUpriSetTypIsNotNull_SubColumns(row, down);
	}
	/** 
	  * StkEvalWithUpriSetTypIsNotNull:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkEvalWithUpriSetTypIsNotNull_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkEvalWithUpriSetTypIsNotNullCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkEvalWithUpriSetTypIsNotNull:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkEvalWithUpriSetTypIsNotNull_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkEvalWithUpriSetTypIsNotNull:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkEvalWithUpriSetTypIsNotNull_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkEvalWithUpriSetTypIsNotNull_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkEvalWithUpriSetTypIsNotNullCols.outAll());
	}


	/** 
	  * StkEvalWithLumpRateFlgOff:在庫評価（一括指定しない）<p>
	  * 在庫評価マスタから、一括指定フラグがオフの在庫評価ＣＤを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkEvalWithLumpRateFlgOff(MCRow row) {
		MCList<MAM_STK_EVAL_R> rslt = MCList.create(MAM_STK_EVAL_R.class);
		MAM_STK_EVAL_R dbc = MAM_STK_EVAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkEvalWithLumpRateFlgOff_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.StkEvalWithLumpRateFlgOff");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.StkEvalWithLumpRateFlgOff").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkEvalWithLumpRateFlgOff_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.StkEvalWithLumpRateFlgOff");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkEvalWithLumpRateFlgOff_SubColumns(row, down);
	}
	/** 
	  * StkEvalWithLumpRateFlgOff:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkEvalWithLumpRateFlgOff_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkEvalWithLumpRateFlgOffCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkEvalWithLumpRateFlgOff:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkEvalWithLumpRateFlgOff_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkEvalWithLumpRateFlgOff:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkEvalWithLumpRateFlgOff_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkEvalWithLumpRateFlgOff_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkEvalWithLumpRateFlgOffCols.outAll());
	}


	/** 
	  * PreAlcRateWithPtn:一次配賦基準<p>
	  * 一次配賦基準マスタと一次配賦パタンマスタから、一次配賦基準に関する情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateWithPtn(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateWithPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.PreAlcRateWithPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.PreAlcRateWithPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateWithPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.PreAlcRateWithPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateWithPtn_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateWithPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateWithPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateWithPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateWithPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateWithPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateWithPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateWithPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateWithPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateWithPtnCols.outAll());
	}


	/** 
	  * CalcArgYm:原価計計算年月<p>
	  * 以下の引数に対応する原価計算設定情報テーブルの対象期間の、先頭年月から末尾年月までの年月を取得する<br>
　計算グループ、計算ＮＯ
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcArgYm(MCRow row) {
		MCList<MGT_ARG_R> rslt = MCList.create(MGT_ARG_R.class);
		MGT_ARG_R dbc = MGT_ARG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcArgYm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CalcArgYm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CalcArgYm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcArgYm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CalcArgYm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcArgYm_SubColumns(row, down);
	}
	/** 
	  * CalcArgYm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcArgYm_Set(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcArgYmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcArgYm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcArgYm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcArgYm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcArgYm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcArgYm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcArgYmCols.outAll());
	}


	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:一次配賦基準（一次配賦基準カテゴリ登録済、一次配賦パタン取得）<p>
	  * 以下の引数に対応する一次配賦基準に関する情報を、一次配賦基準マスタと一次配賦パタンマスタから取得する<br>
　計算カテゴリ、ワーキンググループ、期<br>
・以下の全ての条件に合致する一次配賦基準マスタのみ対象とする場合は、term_flgに「true」を指定する<br>
　　計画月次比率が「false」<br>
　　実績月次比率が「false」<br>
　　計画基準が「false」<br>
・一次配賦基準マスタの月次比率フラグで絞り込む場合は、term_flgに「false」を指定したうえで、以下を指定する<br>
　　計画月次比率を指定する場合：pln_mly_flg_strを指定する<br>
　　実績月次比率を指定する場合：act_mly_flg_strを指定する<br>
　　
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateInPreAlcCtgWithPtn(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateInPreAlcCtgWithPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.PreAlcRateInPreAlcCtgWithPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.PreAlcRateInPreAlcCtgWithPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateInPreAlcCtgWithPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.PreAlcRateInPreAlcCtgWithPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateInPreAlcCtgWithPtn_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateInPreAlcCtgWithPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateInPreAlcCtgWithPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateInPreAlcCtgWithPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateInPreAlcCtgWithPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateInPreAlcCtgWithPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateInPreAlcCtgWithPtnCols.outAll());
	}


	/** 
	  * ItmJnlInRptKeyConf:品目仕訳（原価レポートキー構成登録）<p>
	  * 原価レポートキー構成マスタから、品目仕訳を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmJnlInRptKeyConf(MCRow row) {
		MCList<MAM_ITM_JNL_R> rslt = MCList.create(MAM_ITM_JNL_R.class);
		MAM_ITM_JNL_R dbc = MAM_ITM_JNL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmJnlInRptKeyConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.ItmJnlInRptKeyConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.ItmJnlInRptKeyConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmJnlInRptKeyConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.ItmJnlInRptKeyConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmJnlInRptKeyConf_SubColumns(row, down);
	}
	/** 
	  * ItmJnlInRptKeyConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmJnlInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_JNL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmJnlInRptKeyConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmJnlInRptKeyConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmJnlInRptKeyConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_JNL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmJnlInRptKeyConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmJnlInRptKeyConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmJnlInRptKeyConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmJnlInRptKeyConfCols.outAll());
	}


	/** 
	  * ItmGrpInRptKeyConf:品目分類（原価レポートキー構成登録）<p>
	  * 原価レポートキー構成マスタから、品目分類を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrpInRptKeyConf(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrpInRptKeyConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.ItmGrpInRptKeyConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.ItmGrpInRptKeyConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrpInRptKeyConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.ItmGrpInRptKeyConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrpInRptKeyConf_SubColumns(row, down);
	}
	/** 
	  * ItmGrpInRptKeyConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrpInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrpInRptKeyConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrpInRptKeyConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrpInRptKeyConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrpInRptKeyConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrpInRptKeyConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrpInRptKeyConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrpInRptKeyConfCols.outAll());
	}


	/** 
	  * CostDptInRptKeyConf:原価部門（原価レポートキー構成登録）<p>
	  * 引数で指定した適用年月に対応する原価部門を、原価レポートキー構成マスタから取得する<br>
・適用年月の設定方法は以下の通り<br>
　　適用年月を指定する場合：ymに期を指定する（mode_this_month_flgは無効になる）<br>
　　運用年月を使用する場合：ymを未指定にし、mode_this_month_flgに「true」を指定する<br>
　※ymに「null」を指定した場合は「null」を返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostDptInRptKeyConf(MCRow row) {
		MCList<MAM_COST_DPT_R> rslt = MCList.create(MAM_COST_DPT_R.class);
		MAM_COST_DPT_R dbc = MAM_COST_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostDptInRptKeyConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CostDptInRptKeyConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CostDptInRptKeyConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostDptInRptKeyConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CostDptInRptKeyConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostDptInRptKeyConf_SubColumns(row, down);
	}
	/** 
	  * CostDptInRptKeyConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostDptInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostDptInRptKeyConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostDptInRptKeyConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostDptInRptKeyConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostDptInRptKeyConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostDptInRptKeyConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostDptInRptKeyConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostDptInRptKeyConfCols.outAll());
	}


	/** 
	  * CostCmpPtn:比較パタン（原価計算）<p>
	  * 原価レポート比較マスタから、計算区分に「2：原価計算（在庫対象外）」または「3：原価計算（在庫計算）」が設定されている計算グループマスタに紐づく比較パタンを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostCmpPtn(MCRow row) {
		MCList<MAM_RPT_CMP_R> rslt = MCList.create(MAM_RPT_CMP_R.class);
		MAM_RPT_CMP_R dbc = MAM_RPT_CMP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostCmpPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CostCmpPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CostCmpPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostCmpPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CostCmpPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostCmpPtn_SubColumns(row, down);
	}
	/** 
	  * CostCmpPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostCmpPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostCmpPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostCmpPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostCmpPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostCmpPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostCmpPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostCmpPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostCmpPtnCols.outAll());
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:一次配賦基準（一次配賦期間比率未登録）<p>
	  * 以下の引数に対応する一次配賦基準カテゴリマスタに存在する一次配賦基準のうち、一次配賦期間比率テーブルに存在しないものを取得する<br>
　計算カテゴリ、ワーキンググループ、期
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateWithPtnNotInPreRateTerm(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateWithPtnNotInPreRateTerm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateWithPtnNotInPreRateTerm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateTerm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateWithPtnNotInPreRateTerm_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateWithPtnNotInPreRateTerm_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateWithPtnNotInPreRateTermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateWithPtnNotInPreRateTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateWithPtnNotInPreRateTerm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateWithPtnNotInPreRateTerm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateWithPtnNotInPreRateTermCols.outAll());
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:一次配賦基準（一次配賦月次比率未登録）<p>
	  * 以下の引数に対応する一次配賦基準カテゴリマスタに存在する一次配賦基準のうち、一次配賦月次比率テーブルに存在しないものを取得する<br>
　計算カテゴリ、ワーキンググループ、期
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateWithPtnNotInPreRateMly(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateWithPtnNotInPreRateMly_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateMly");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateMly").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateWithPtnNotInPreRateMly_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.PreAlcRateWithPtnNotInPreRateMly");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateWithPtnNotInPreRateMly_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateWithPtnNotInPreRateMly_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateWithPtnNotInPreRateMlyCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateWithPtnNotInPreRateMly_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateWithPtnNotInPreRateMly_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateWithPtnNotInPreRateMly_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateWithPtnNotInPreRateMlyCols.outAll());
	}


	/** 
	  * CalcNo:原価計算ＮＯ<p>
	  * 引数の計算グループに対応する原価計算ＮＯを、原価計算設定情報テーブルから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcNo(MCRow row) {
		MCList<MGT_ARG_R> rslt = MCList.create(MGT_ARG_R.class);
		MGT_ARG_R dbc = MGT_ARG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MG.MGUAL0010.CalcNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MG.MGUAL0010.CalcNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MG.MGUAL0010.CalcNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcNo_SubColumns(row, down);
	}
	/** 
	  * CalcNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcNo_Set(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MGT_ARG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcNoCols.outAll());
	}

}
