
package mcframe.serverMSUA.MSUAL0010;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;


//LOGIC_SETTING_IMPORT (START)
import mcframe.serverMS.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
//LOGIC_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MSUAL_List_MC_A extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/** 
	  * SpplByLoc:発注先（場所対応）<p>
	  * 引数の場所に対応する発注先を、場所マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSpplByLoc(MCRow row) {
		MCList<MAM_LOC_R> rslt = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSpplByLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0010.SpplByLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0010.SpplByLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSpplByLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0010.SpplByLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSpplByLoc_SubColumns(row, down);
	}
	/** 
	  * SpplByLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSpplByLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SpplByLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SpplByLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSpplByLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SpplByLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSpplByLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSpplByLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SpplByLocCols.outAll());
	}


	/** 
	  * CstItm:得意先品目<p>
	  * 取引先品目マスタから、得意先品目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCstItm(MCRow row) {
		MCList<MAM_BP_ITM_R> rslt = MCList.create(MAM_BP_ITM_R.class);
		MAM_BP_ITM_R dbc = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCstItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0010.CstItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0010.CstItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCstItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0010.CstItm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCstItm_SubColumns(row, down);
	}
	/** 
	  * CstItm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCstItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CstItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CstItm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCstItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CstItm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCstItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCstItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CstItmCols.outAll());
	}

}
