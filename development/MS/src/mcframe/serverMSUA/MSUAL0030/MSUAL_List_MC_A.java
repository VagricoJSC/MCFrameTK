
package mcframe.serverMSUA.MSUAL0030;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.*;
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
	  * WrkMng:案件管理<p>
	  * 案件管理テーブルから案件管理情報を取得する<br>
・案件管理区分で絞り込む場合は、wrk_mng_typに案件管理区分を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWrkMng(MCRow row) {
		MCList<MST_WRK_MNG_R> rslt = MCList.create(MST_WRK_MNG_R.class);
		MST_WRK_MNG_R dbc = MST_WRK_MNG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWrkMng_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.WrkMng");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.WrkMng").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWrkMng_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.WrkMng");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWrkMng_SubColumns(row, down);
	}
	/** 
	  * WrkMng:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWrkMng_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WrkMngCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WrkMng:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWrkMng_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WrkMng:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWrkMng_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWrkMng_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WrkMngCols.outAll());
	}


	/** 
	  * SloCanRsn:受注取消理由<p>
	  * 見積受注理由から、受注取消フラグがオンのものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloCanRsn(MCRow row) {
		MCList<MST_SLO_RSN_R> rslt = MCList.create(MST_SLO_RSN_R.class);
		MST_SLO_RSN_R dbc = MST_SLO_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloCanRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloCanRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloCanRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloCanRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloCanRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloCanRsn_SubColumns(row, down);
	}
	/** 
	  * SloCanRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloCanRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloCanRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloCanRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloCanRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloCanRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloCanRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloCanRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloCanRsnCols.outAll());
	}


	/** 
	  * QtnRsltRsn:見積結果理由<p>
	  * 見積受注理由テーブルから、見積結果フラグがオンのものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getQtnRsltRsn(MCRow row) {
		MCList<MST_SLO_RSN_R> rslt = MCList.create(MST_SLO_RSN_R.class);
		MST_SLO_RSN_R dbc = MST_SLO_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getQtnRsltRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.QtnRsltRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.QtnRsltRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getQtnRsltRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.QtnRsltRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getQtnRsltRsn_SubColumns(row, down);
	}
	/** 
	  * QtnRsltRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getQtnRsltRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, QtnRsltRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * QtnRsltRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getQtnRsltRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * QtnRsltRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getQtnRsltRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getQtnRsltRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(QtnRsltRsnCols.outAll());
	}


	/** 
	  * QtnTerm:見積条件<p>
	  * 見積受注理由テーブルから、見積条件がオンのものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getQtnTerm(MCRow row) {
		MCList<MST_SLO_RSN_R> rslt = MCList.create(MST_SLO_RSN_R.class);
		MST_SLO_RSN_R dbc = MST_SLO_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getQtnTerm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.QtnTerm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.QtnTerm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getQtnTerm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.QtnTerm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getQtnTerm_SubColumns(row, down);
	}
	/** 
	  * QtnTerm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getQtnTerm_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, QtnTermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * QtnTerm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getQtnTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * QtnTerm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getQtnTerm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getQtnTerm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(QtnTermCols.outAll());
	}


	/** 
	  * QtnSloRsn:見積受注理由<p>
	  * 見積受注理由テーブルから、見積受注理由を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getQtnSloRsn(MCRow row) {
		MCList<MST_SLO_RSN_R> rslt = MCList.create(MST_SLO_RSN_R.class);
		MST_SLO_RSN_R dbc = MST_SLO_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getQtnSloRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.QtnSloRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.QtnSloRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getQtnSloRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.QtnSloRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getQtnSloRsn_SubColumns(row, down);
	}
	/** 
	  * QtnSloRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getQtnSloRsn_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, QtnSloRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * QtnSloRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getQtnSloRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLO_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * QtnSloRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getQtnSloRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getQtnSloRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(QtnSloRsnCols.outAll());
	}


	/** 
	  * SlsBdgGrp:予算分類<p>
	  * 販売予算テーブルから、販売予算の予算分類を取得する<br>
・検索権限で絞り込む場合は、rd_flgに「true」を指定する（無効）<br>
・売上部門が設定されているもののみに絞り込む場合は、dpt_flgに「true」を指定する<br>
・品目体系が設定されているもののみに絞り込む場合は、itm_grp_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsBdgGrp(MCRow row) {
		MCList<MST_SLS_BDG_R> rslt = MCList.create(MST_SLS_BDG_R.class);
		MST_SLS_BDG_R dbc = MST_SLS_BDG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsBdgGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SlsBdgGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SlsBdgGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsBdgGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SlsBdgGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsBdgGrp_SubColumns(row, down);
	}
	/** 
	  * SlsBdgGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsBdgGrp_Set(MCRow row, MCQueryApiBuilder builder, MST_SLS_BDG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsBdgGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsBdgGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsBdgGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLS_BDG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsBdgGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsBdgGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsBdgGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsBdgGrpCols.outAll());
	}


	/** 
	  * WrkSts:案件状況<p>
	  * 案件管理で使用する案件状況を取得する<br>
案件管理区分に「1：案件状況」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWrkSts(MCRow row) {
		MCList<MST_WRK_MNG_R> rslt = MCList.create(MST_WRK_MNG_R.class);
		MST_WRK_MNG_R dbc = MST_WRK_MNG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWrkSts_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.WrkSts");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.WrkSts").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWrkSts_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.WrkSts");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWrkSts_SubColumns(row, down);
	}
	/** 
	  * WrkSts:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWrkSts_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WrkStsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WrkSts:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWrkSts_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WrkSts:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWrkSts_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWrkSts_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WrkStsCols.outAll());
	}


	/** 
	  * SloAcc:受注確度<p>
	  * 案件管理で使用する受注角度を取得する<br>
案件管理区分に「2：受注角度」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloAcc(MCRow row) {
		MCList<MST_WRK_MNG_R> rslt = MCList.create(MST_WRK_MNG_R.class);
		MST_WRK_MNG_R dbc = MST_WRK_MNG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloAcc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloAcc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloAcc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloAcc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloAcc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloAcc_SubColumns(row, down);
	}
	/** 
	  * SloAcc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloAcc_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloAccCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloAcc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloAcc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloAcc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloAcc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloAcc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloAccCols.outAll());
	}


	/** 
	  * ActSts:活動状況<p>
	  * 案件管理で使用する活動状況を取得する<br>
案件管理区分に「3：案件活動状況」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getActSts(MCRow row) {
		MCList<MST_WRK_MNG_R> rslt = MCList.create(MST_WRK_MNG_R.class);
		MST_WRK_MNG_R dbc = MST_WRK_MNG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getActSts_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.ActSts");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.ActSts").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getActSts_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.ActSts");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getActSts_SubColumns(row, down);
	}
	/** 
	  * ActSts:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getActSts_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ActStsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ActSts:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getActSts_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_WRK_MNG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ActSts:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getActSts_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getActSts_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ActStsCols.outAll());
	}


	/** 
	  * SloLoc:受注場所<p>
	  * 受注引当マスタから場所を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloLoc(MCRow row) {
		MCList<MAM_LOC_R> rslt = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloLoc_SubColumns(row, down);
	}
	/** 
	  * SloLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloLocCols.outAll());
	}


	/** 
	  * SloAllocGrp:受注総量引当場所グループ<p>
	  * 受注引当マスタから総量引当場所グループを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloAllocGrp(MCRow row) {
		MCList<MAM_ALLOC_GRP_R> rslt = MCList.create(MAM_ALLOC_GRP_R.class);
		MAM_ALLOC_GRP_R dbc = MAM_ALLOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloAllocGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloAllocGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloAllocGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloAllocGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloAllocGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloAllocGrp_SubColumns(row, down);
	}
	/** 
	  * SloAllocGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloAllocGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloAllocGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloAllocGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloAllocGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloAllocGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloAllocGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloAllocGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloAllocGrpCols.outAll());
	}


	/** 
	  * SloLgGrp:受注物流グループ<p>
	  * 受注引当マスタから物流グループを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloLgGrp(MCRow row) {
		MCList<MAM_LG_GRP_R> rslt = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R dbc = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloLgGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloLgGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloLgGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloLgGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloLgGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloLgGrp_SubColumns(row, down);
	}
	/** 
	  * SloLgGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloLgGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloLgGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloLgGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloLgGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloLgGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloLgGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloLgGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloLgGrpCols.outAll());
	}


	/** 
	  * CstSloStkGd:受注引当可能格付（得意先対応）<p>
	  * 受注引当格付マスタから、受注可能な（格付マスタの受注フラグがオンである）格付を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCstSloStkGd(MCRow row) {
		MCList<MAM_SLO_ALLOC_GD_R> rslt = MCList.create(MAM_SLO_ALLOC_GD_R.class);
		MAM_SLO_ALLOC_GD_R dbc = MAM_SLO_ALLOC_GD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCstSloStkGd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.CstSloStkGd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.CstSloStkGd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCstSloStkGd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.CstSloStkGd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCstSloStkGd_SubColumns(row, down);
	}
	/** 
	  * CstSloStkGd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCstSloStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLO_ALLOC_GD_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CstSloStkGdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CstSloStkGd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCstSloStkGd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLO_ALLOC_GD_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CstSloStkGd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCstSloStkGd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCstSloStkGd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CstSloStkGdCols.outAll());
	}


	/** 
	  * SplnVers:集計別販売計画バージョン<p>
	  * 集計別の月次販売計画のバージョンを取得する<br>
除外バージョンを指定した場合は、それを除いたバージョンを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSplnVers(MCRow row) {
		MCList<MST_SPLN_SUM_VERS_R> rslt = MCList.create(MST_SPLN_SUM_VERS_R.class);
		MST_SPLN_SUM_VERS_R dbc = MST_SPLN_SUM_VERS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSplnVers_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SplnVers");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SplnVers").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSplnVers_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SplnVers");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSplnVers_SubColumns(row, down);
	}
	/** 
	  * SplnVers:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSplnVers_Set(MCRow row, MCQueryApiBuilder builder, MST_SPLN_SUM_VERS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SplnVersCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SplnVers:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSplnVers_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SPLN_SUM_VERS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SplnVers:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSplnVers_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSplnVers_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SplnVersCols.outAll());
	}


	/** 
	  * DmndLoc:需要場所<p>
	  * 受注引当マスタから場所を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDmndLoc(MCRow row) {
		MCList<MAM_LOC_R> rslt = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDmndLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.DmndLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.DmndLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDmndLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.DmndLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDmndLoc_SubColumns(row, down);
	}
	/** 
	  * DmndLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDmndLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DmndLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DmndLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDmndLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DmndLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDmndLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDmndLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DmndLocCols.outAll());
	}


	/** 
	  * SloItmSub1:受注登録品目枝番１<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番１および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloItmSub1(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloItmSub1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloItmSub1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloItmSub1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloItmSub1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloItmSub1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloItmSub1_SubColumns(row, down);
	}
	/** 
	  * SloItmSub1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloItmSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloItmSub1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloItmSub1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloItmSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloItmSub1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloItmSub1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloItmSub1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloItmSub1Cols.outAll());
	}


	/** 
	  * SloItmSub2:受注登録品目枝番２<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番２および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloItmSub2(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloItmSub2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloItmSub2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloItmSub2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloItmSub2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloItmSub2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloItmSub2_SubColumns(row, down);
	}
	/** 
	  * SloItmSub2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloItmSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloItmSub2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloItmSub2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloItmSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloItmSub2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloItmSub2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloItmSub2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloItmSub2Cols.outAll());
	}


	/** 
	  * SloItmSub3:受注登録品目枝番３<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番３および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloItmSub3(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloItmSub3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloItmSub3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloItmSub3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloItmSub3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloItmSub3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloItmSub3_SubColumns(row, down);
	}
	/** 
	  * SloItmSub3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloItmSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloItmSub3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloItmSub3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloItmSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloItmSub3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloItmSub3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloItmSub3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloItmSub3Cols.outAll());
	}


	/** 
	  * WrkNo:案件ＮＯ<p>
	  * 案件テーブルから案件情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWrkNo(MCRow row) {
		MCList<MST_WRK_R> rslt = MCList.create(MST_WRK_R.class);
		MST_WRK_R dbc = MST_WRK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWrkNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.WrkNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.WrkNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWrkNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.WrkNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWrkNo_SubColumns(row, down);
	}
	/** 
	  * WrkNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWrkNo_Set(MCRow row, MCQueryApiBuilder builder, MST_WRK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WrkNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WrkNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWrkNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_WRK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WrkNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWrkNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWrkNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WrkNoCols.outAll());
	}


	/** 
	  * Sno1_WrkNo:手配ＮＯ１＿案件ＮＯ<p>
	  * 案件手配紐付ビューから、取消していないレコードの手配ＮＯと案件ＮＯを取得する<br>
案件手配紐付ビュー：案件情報と案件手配紐付情報とを結合したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSno1_WrkNo(MCRow row) {
		MCList<MSVT_WRK_SNO_R> rslt = MCList.create(MSVT_WRK_SNO_R.class);
		MSVT_WRK_SNO_R dbc = MSVT_WRK_SNO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSno1_WrkNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.Sno1_WrkNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.Sno1_WrkNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSno1_WrkNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.Sno1_WrkNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSno1_WrkNo_SubColumns(row, down);
	}
	/** 
	  * Sno1_WrkNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSno1_WrkNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_WRK_SNO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Sno1_WrkNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Sno1_WrkNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSno1_WrkNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_WRK_SNO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Sno1_WrkNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSno1_WrkNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSno1_WrkNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Sno1_WrkNoCols.outAll());
	}


	/** 
	  * SloNo:受注ＮＯ<p>
	  * 取消していない受注の受注ＮＯを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloNo(MCRow row) {
		MCList<MST_SLO_R> rslt = MCList.create(MST_SLO_R.class);
		MST_SLO_R dbc = MST_SLO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloNo_SubColumns(row, down);
	}
	/** 
	  * SloNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloNo_Set(MCRow row, MCQueryApiBuilder builder, MST_SLO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MST_SLO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloNoCols.outAll());
	}


	/** 
	  * SetItm:品揃<p>
	  * 以下の引数に対応する品揃テーブルから品情揃報を取得する<br>
　代表品目、代表枝番１－３、 代表品目単位
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSetItm(MCRow row) {
		MCList<MAM_SET_ITM_R> rslt = MCList.create(MAM_SET_ITM_R.class);
		MAM_SET_ITM_R dbc = MAM_SET_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSetItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SetItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SetItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSetItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SetItm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSetItm_SubColumns(row, down);
	}
	/** 
	  * SetItm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSetItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SET_ITM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SetItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SetItm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSetItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SET_ITM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SetItm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSetItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSetItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SetItmCols.outAll());
	}


	/** 
	  * SloItm:受注登録品目<p>
	  * 引数の検索区分（品目入力補助検索区分）に対応する、品目および品目情報を、品目マスタから取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloItm(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0030.SloItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0030.SloItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0030.SloItm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloItm_SubColumns(row, down);
	}
	/** 
	  * SloItm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloItm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloItm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloItmCols.outAll());
	}

}
