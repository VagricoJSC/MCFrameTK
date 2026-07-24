
package mcframe.serverMSUA.MSUAL0050;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0050.MSUAC_List.*;
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
	  * PoCrctRsn:発注訂正理由<p>
	  * 発注訂正理由テーブルから発注訂正理由を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPoCrctRsn(MCRow row) {
		MCList<MST_PO_CRCT_RSN_R> rslt = MCList.create(MST_PO_CRCT_RSN_R.class);
		MST_PO_CRCT_RSN_R dbc = MST_PO_CRCT_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPoCrctRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0050.PoCrctRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0050.PoCrctRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPoCrctRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0050.PoCrctRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPoCrctRsn_SubColumns(row, down);
	}
	/** 
	  * PoCrctRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPoCrctRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_PO_CRCT_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PoCrctRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PoCrctRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPoCrctRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_PO_CRCT_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PoCrctRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPoCrctRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPoCrctRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PoCrctRsnCols.outAll());
	}

}
