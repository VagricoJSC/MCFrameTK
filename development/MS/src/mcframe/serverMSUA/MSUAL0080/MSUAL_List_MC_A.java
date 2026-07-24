
package mcframe.serverMSUA.MSUAL0080;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0080.MSUAC_List.*;
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
	  * SttlRcv:決済方法（入金）<p>
	  * 決済方法マスタから、債権決済区分が入金に関連するもの（「1：現金」または「2：振込」または「3：手形」）の決済方法情報を取得する<br>
・振込人名を取得する場合は、rcst_cdに入金先を指定する<br>
・振込人名に加え、複数の入金登録区分に対応する決済方法情報を取得する場合は、rcv_reg_typ1－3に入金登録区分を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSttlRcv(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSttlRcv_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0080.SttlRcv");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0080.SttlRcv").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSttlRcv_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0080.SttlRcv");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSttlRcv_SubColumns(row, down);
	}
	/** 
	  * SttlRcv:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSttlRcv_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SttlRcvCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SttlRcv:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSttlRcv_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SttlRcv:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSttlRcv_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSttlRcv_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SttlRcvCols.outAll());
	}


	/** 
	  * Bcst_BillClDay:請求先請求締日<p>
	  * 引数の請求先に対応する請求締日１－５を、取引先マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBcst_BillClDay(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBcst_BillClDay_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0080.Bcst_BillClDay");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0080.Bcst_BillClDay").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBcst_BillClDay_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0080.Bcst_BillClDay");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBcst_BillClDay_SubColumns(row, down);
	}
	/** 
	  * Bcst_BillClDay:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBcst_BillClDay_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Bcst_BillClDayCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Bcst_BillClDay:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBcst_BillClDay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Bcst_BillClDay:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBcst_BillClDay_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBcst_BillClDay_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Bcst_BillClDayCols.outAll());
	}

}
