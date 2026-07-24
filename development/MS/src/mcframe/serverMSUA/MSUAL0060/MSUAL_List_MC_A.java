
package mcframe.serverMSUA.MSUAL0060;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
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
	  * InToId:納品先<p>
	  * 納入先識別ビューから納入先情報を取得する<br>
納入先識別ビュー：取引先マスタや場所マスタから、納入先となりうる納品先や場所を抽出したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getInToId(MCRow row) {
		MCList<MSVM_IN_TO_ID_R> rslt = MCList.create(MSVM_IN_TO_ID_R.class);
		MSVM_IN_TO_ID_R dbc = MSVM_IN_TO_ID_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getInToId_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0060.InToId");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0060.InToId").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getInToId_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0060.InToId");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getInToId_SubColumns(row, down);
	}
	/** 
	  * InToId:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getInToId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, InToIdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * InToId:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getInToId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * InToId:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getInToId_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getInToId_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(InToIdCols.outAll());
	}


	/** 
	  * StkBp:在庫取引先<p>
	  * 引数の在庫識別区分に応じた取引先情報を、取引先マスタから取得する<br>
在庫識別区分に対応する取引先入力補助検索区分を使用して取得する<br>
・得意先を取得する場合は、stk_id_typに以下のいずれかの在庫識別区分を指定する<br>
　　「2：返品検収前」<br>
　　「3：預り」<br>
・発注先を取得する場合は、stk_id_typに以下のいずれかの在庫識別区分を指定する<br>
　　「4：VMI」<br>
　　「5：仕入検収前」<br>
　　「6：検収不良」<br>
　　「7：無償受給」<br>
　　「8：有償支給」<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を設定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkBp(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkBp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0060.StkBp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0060.StkBp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkBp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0060.StkBp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkBp_SubColumns(row, down);
	}
	/** 
	  * StkBp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkBp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkBpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkBp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkBp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkBp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkBp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkBp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkBpCols.outAll());
	}


	/** 
	  * ShipToId:送付先<p>
	  * 送付先識別ビューから送付先情報を取得する<br>
送付先識別ビュー：取引先マスタや場所マスタから、送付先となりうる納品先、配送先、場所を抽出したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipToId(MCRow row) {
		MCList<MSVM_SHIP_TO_ID_R> rslt = MCList.create(MSVM_SHIP_TO_ID_R.class);
		MSVM_SHIP_TO_ID_R dbc = MSVM_SHIP_TO_ID_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipToId_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0060.ShipToId");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0060.ShipToId").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipToId_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0060.ShipToId");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipToId_SubColumns(row, down);
	}
	/** 
	  * ShipToId:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipToId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipToIdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipToId:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipToId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipToId:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipToId_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipToId_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipToIdCols.outAll());
	}


	/** 
	  * DlvId:納品先<p>
	  * 納品先識別ビューから納品先情報を取得する<br>
納品先識別ビュー：取引先マスタや場所マスタから、納品先となりうる納品先や場所を抽出したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDlvId(MCRow row) {
		MCList<MSVM_DLV_ID_R> rslt = MCList.create(MSVM_DLV_ID_R.class);
		MSVM_DLV_ID_R dbc = MSVM_DLV_ID_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDlvId_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0060.DlvId");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0060.DlvId").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDlvId_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0060.DlvId");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDlvId_SubColumns(row, down);
	}
	/** 
	  * DlvId:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDlvId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DlvIdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DlvId:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDlvId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DlvId:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDlvId_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDlvId_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DlvIdCols.outAll());
	}


	/** 
	  * ShipRqstId:出荷依頼先<p>
	  * 出荷依頼先識別ビューから出荷依頼先情報を取得する<br>
出荷依頼先識別ビュー：取引先マスタや場所マスタから、出荷依頼先となりうる得意先、発注先、場所を抽出したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipRqstId(MCRow row) {
		MCList<MSVM_SHIP_RQST_ID_R> rslt = MCList.create(MSVM_SHIP_RQST_ID_R.class);
		MSVM_SHIP_RQST_ID_R dbc = MSVM_SHIP_RQST_ID_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipRqstId_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0060.ShipRqstId");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0060.ShipRqstId").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipRqstId_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0060.ShipRqstId");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipRqstId_SubColumns(row, down);
	}
	/** 
	  * ShipRqstId:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipRqstId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipRqstIdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipRqstId:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipRqstId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipRqstId:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipRqstId_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipRqstId_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipRqstIdCols.outAll());
	}

}
