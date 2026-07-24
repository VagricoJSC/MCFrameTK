
package mcframe.serverMBUA.MBUAL0010;
import mcframe.commonCore.container.*;
import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;


//LOGIC_SETTING_IMPORT (START)
import mcframe.serverMB.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
//LOGIC_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MBUAL_List_MC_A extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/** 
	  * JnlGrpNo:仕訳グループＮＯ<p>
	  * 自動仕訳履歴テーブルから仕訳グループＮＯを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getJnlGrpNo(MCRow row) {
		MCList<MBT_JNL_HISTORY_R> rslt = MCList.create(MBT_JNL_HISTORY_R.class);
		MBT_JNL_HISTORY_R dbc = MBT_JNL_HISTORY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getJnlGrpNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MB.MBUAL0010.JnlGrpNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MB.MBUAL0010.JnlGrpNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getJnlGrpNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MB.MBUAL0010.JnlGrpNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getJnlGrpNo_SubColumns(row, down);
	}
	/** 
	  * JnlGrpNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getJnlGrpNo_Set(MCRow row, MCQueryApiBuilder builder, MBT_JNL_HISTORY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, JnlGrpNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * JnlGrpNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getJnlGrpNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MBT_JNL_HISTORY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * JnlGrpNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getJnlGrpNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getJnlGrpNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(JnlGrpNoCols.outAll());
	}


	/** 
	  * BizDatID:業務データＩＤ<p>
	  * 業務データダウンロード管理テーブルから業務データＩＤを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBizDatID(MCRow row) {
		MCList<MBT_BIZ_DAT_DL_R> rslt = MCList.create(MBT_BIZ_DAT_DL_R.class);
		MBT_BIZ_DAT_DL_R dbc = MBT_BIZ_DAT_DL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBizDatID_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MB.MBUAL0010.BizDatID");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MB.MBUAL0010.BizDatID").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBizDatID_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MB.MBUAL0010.BizDatID");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBizDatID_SubColumns(row, down);
	}
	/** 
	  * BizDatID:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBizDatID_Set(MCRow row, MCQueryApiBuilder builder, MBT_BIZ_DAT_DL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BizDatIDCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BizDatID:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBizDatID_AfterSelect(MCRow row, MCQueryApiBuilder builder, MBT_BIZ_DAT_DL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BizDatID:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBizDatID_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBizDatID_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BizDatIDCols.outAll());
	}


	/** 
	  * BulkImpCtg:まとめ登録テーブルカテゴリ<p>
	  * まとめ登録テーブルカテゴリテーブルからテーブルカテゴリの情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBulkImpCtg(MCRow row) {
		MCList<MBC_BULK_IMP_CTG_R> rslt = MCList.create(MBC_BULK_IMP_CTG_R.class);
		MBC_BULK_IMP_CTG_R dbc = MBC_BULK_IMP_CTG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBulkImpCtg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MB.MBUAL0010.BulkImpCtg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MB.MBUAL0010.BulkImpCtg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBulkImpCtg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MB.MBUAL0010.BulkImpCtg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBulkImpCtg_SubColumns(row, down);
	}
	/** 
	  * BulkImpCtg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBulkImpCtg_Set(MCRow row, MCQueryApiBuilder builder, MBC_BULK_IMP_CTG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BulkImpCtgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BulkImpCtg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBulkImpCtg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MBC_BULK_IMP_CTG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BulkImpCtg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBulkImpCtg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBulkImpCtg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BulkImpCtgCols.outAll());
	}


	/** 
	  * BulkImpCtl:まとめ登録テーブルＩＤ<p>
	  * まとめ登録実行管理テーブルからテーブルＩＤの情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBulkImpCtl(MCRow row) {
		MCList<MBC_BULK_IMP_CTL_R> rslt = MCList.create(MBC_BULK_IMP_CTL_R.class);
		MBC_BULK_IMP_CTL_R dbc = MBC_BULK_IMP_CTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBulkImpCtl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MB.MBUAL0010.BulkImpCtl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MB.MBUAL0010.BulkImpCtl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBulkImpCtl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MB.MBUAL0010.BulkImpCtl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBulkImpCtl_SubColumns(row, down);
	}
	/** 
	  * BulkImpCtl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBulkImpCtl_Set(MCRow row, MCQueryApiBuilder builder, MBC_BULK_IMP_CTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BulkImpCtlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BulkImpCtl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBulkImpCtl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MBC_BULK_IMP_CTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BulkImpCtl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBulkImpCtl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBulkImpCtl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BulkImpCtlCols.outAll());
	}

}
