
package mcframe.serverMSUA.MSUAL0070;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;
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
	  * SublotNo:サブロットＮＯ<p>
	  * 以下の引数に対応するロット管理情報を取得する<br>
　品目、枝番１－３、ロットＮＯ<br>
存在チェックの用途では使用できない
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSublotNo(MCRow row) {
		MCList<MSVT_LOT_LIST_R> rslt = MCList.create(MSVT_LOT_LIST_R.class);
		MSVT_LOT_LIST_R dbc = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSublotNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0070.SublotNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0070.SublotNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSublotNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0070.SublotNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSublotNo_SubColumns(row, down);
	}
	/** 
	  * SublotNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSublotNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SublotNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SublotNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSublotNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SublotNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSublotNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSublotNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SublotNoCols.outAll());
	}


	/** 
	  * LotNo:ロットＮＯ<p>
	  * ロット・サブロットリストビューからロット管理情報を取得する<br>
ロット・サブロットリストビュー：以下のすべての条件に合致する品目の場合でも、ロット管理情報を取得できるビュー<br>
・ロットＮＯ管理区分が「1：ロット管理しない」<br>
・サブロットＮＯ管理区分が「4：在庫のみサブロット管理する」
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLotNo(MCRow row) {
		MCList<MSVT_LOT_LIST_R> rslt = MCList.create(MSVT_LOT_LIST_R.class);
		MSVT_LOT_LIST_R dbc = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLotNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0070.LotNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0070.LotNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLotNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0070.LotNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLotNo_SubColumns(row, down);
	}
	/** 
	  * LotNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLotNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LotNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LotNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLotNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_LOT_LIST_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LotNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLotNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLotNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LotNoCols.outAll());
	}

}
