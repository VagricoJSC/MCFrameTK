
package mcframe.serverMSUA.MSUAL0090;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0090.MSUAC_List.*;
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
	  * Bsppl_PaySchdClDay:支払予定管理先支払締日<p>
	  * 引数の支払予定管理先に対応する支払締日１－５を、取引先マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBsppl_PaySchdClDay(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBsppl_PaySchdClDay_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0090.Bsppl_PaySchdClDay");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0090.Bsppl_PaySchdClDay").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBsppl_PaySchdClDay_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0090.Bsppl_PaySchdClDay");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBsppl_PaySchdClDay_SubColumns(row, down);
	}
	/** 
	  * Bsppl_PaySchdClDay:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBsppl_PaySchdClDay_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Bsppl_PaySchdClDayCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Bsppl_PaySchdClDay:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBsppl_PaySchdClDay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Bsppl_PaySchdClDay:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBsppl_PaySchdClDay_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBsppl_PaySchdClDay_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Bsppl_PaySchdClDayCols.outAll());
	}


	/** 
	  * AdvPay:前渡金<p>
	  * 前渡金実績テーブルと支払手形テーブルから、前渡金情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAdvPay(MCRow row) {
		MCList<MST_ADV_PAY_ACT_R> rslt = MCList.create(MST_ADV_PAY_ACT_R.class);
		MST_ADV_PAY_ACT_R dbc = MST_ADV_PAY_ACT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAdvPay_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0090.AdvPay");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0090.AdvPay").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAdvPay_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0090.AdvPay");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAdvPay_SubColumns(row, down);
	}
	/** 
	  * AdvPay:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAdvPay_Set(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AdvPayCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AdvPay:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAdvPay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_ADV_PAY_ACT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AdvPay:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAdvPay_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAdvPay_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AdvPayCols.outAll());
	}

}
